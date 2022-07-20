B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=11.5
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Private xui As XUI
	Private equi As CampEquipos
	Dim CC As ContentChooser
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	
	Private txtNombreActualizar As EditText
	Private btnActualizar As Button
	Private txtFecha_CreacionActualizar As EditText
	
	
	Private imageTeam As ImageView
	Private dirName As String = ""
	Private dirNameOriginal As String = ""
	Private bucket As String = "gs://bochascore.appspot.com"
	Private fileNameUpload As String
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("PantallaActualizar")
	equi.Initialize
	Dim Job As HttpJob
	Job.Initialize("Job",Me)
	CC.Initialize("CC")
	
	Wait For (equi.Read_One_Equipos(CampeonatosEquipos.equipId)) Complete ( respuesta As Equipo)
	If respuesta.Id <> 0 Then
		If respuesta.Imagen <> "" Then
			dirNameOriginal = respuesta.Imagen
			dirName = respuesta.Imagen
			Job.Download(respuesta.Imagen)
			Wait For (Job) JobDone (Job As HttpJob)
			If Job.Success = True Then
				imageTeam.Bitmap = Job.GetBitmap
			End If
		Else
			imageTeam.Bitmap = LoadBitmap(File.DirAssets,"equipo_default.png")
		End If
		
		txtNombreActualizar.Text = respuesta.Nombre
		txtFecha_CreacionActualizar.Text = respuesta.Fecha_Creacion
	Else
		xui.MsgboxAsync("REGISTRO NO ENCONTRADO !!", "ERROR")
		txtNombreActualizar.Text = ""
		txtFecha_CreacionActualizar.Text = ""
	End If
	
	txtNombreActualizar.SingleLine=False
	txtFecha_CreacionActualizar.SingleLine=False
	
	Dim cd As ColorDrawable
	cd.Initialize2(Colors.Transparent, 10dip,1dip,Colors.RGB(11,59,89))
	txtNombreActualizar.Background=cd
	txtFecha_CreacionActualizar.Background=cd
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub




Private Sub btnActualizar_Click	
	Msgbox2Async("Desea Actualizar", "Title", "Yes", "Cancel", "No", Null, False)
	Wait For Msgbox_Result (Result As Int)
	If Result = DialogResponse.POSITIVE Then
		If dirName <> dirNameOriginal Then
			Dim storage As FirebaseStorage = CreateFirebaseStorage
			storage.UploadFile(dirName,fileNameUpload,"/"&GetFileNameFromContentResult(fileNameUpload))
			Wait For (storage) Storage_UploadCompleted (ServerPath As String, Success As Boolean)
			ToastMessageShow("Imagen subida correctamente", True)
			If Not(Success) Then Log(LastException)
			Wait For (GetDownloadUrl(ServerPath)) Complete (Url As String)
		Else
			Dim Url As String = dirNameOriginal
		End If
		Wait For (equi.Update(CampeonatosEquipos.equipId,txtNombreActualizar.Text,Url,txtFecha_CreacionActualizar.Text )) Complete( res As Int)
		If res = 0 Then
			xui.MsgboxAsync("REGISTRO ACTUALIZADO !!", "OK")
			StartActivity(CampeonatosEquipos)
		Else
			xui.MsgboxAsync("REGISTRO NO SE PUDO ACTUALIZAR !!", "ERROR")
		End If
	End If
End Sub

Private Sub btnEliminar_Click
	Msgbox2Async("Delete?", "Title", "Yes", "Cancel", "No", Null, False)
	Wait For Msgbox_Result (Result As Int)
	If Result = DialogResponse.POSITIVE Then
		Wait For (equi.Delete( CampeonatosEquipos.equipId )) Complete ( respuesta As Int)
		If respuesta = 0 Then
			xui.MsgboxAsync("REGISTRO BORRADO !!", "OK")
			StartActivity(CampeonatosEquipos)
		Else
			xui.MsgboxAsync("REGISTRO NO SE PUDO BORRAR !!", "ERROR")
		End If
	End If
End Sub

Private Sub btnVerJugadores_Click
'	StartActivity(PantallaListaJugadores)
End Sub



Private Sub btnUploadImage_Click
	CC.Show("image/*", "Choose image")
End Sub

Sub CC_Result (Success As Boolean, Dir As String, fileName As String)
	If Success Then
		dirName = Dir
		fileNameUpload = fileName
		imageTeam.Bitmap = LoadBitmap(Dir,fileName)
	Else
		ToastMessageShow("Error al escoger la imagen",True)
	End If
	
End Sub


Sub GetFileNameFromContentResult(UriString As String) As String
	If UriString.StartsWith("/") Then 'If the user used a file manager to choose file
		Return UriString.SubString2(UriString.LastIndexOf("/")+3,UriString.Length)
	else if UriString.StartsWith("content:") Then
		If UriString.IndexOf("%3A") > -1 Then
			Return UriString.SubString2(UriString.LastIndexOf("%3A")+3,UriString.Length)
		Else if UriString.IndexOf("/") > -1 Then
			Return UriString.SubString2(UriString.LastIndexOf("/")+3,UriString.Length)
		Else
			Return UriString
		End If
	Else
		Return UriString
	End If
End Sub


Sub GetDownloadUrl(ServerPath As String) As ResumableSub
	Dim fs As JavaObject = CreateFirebaseStorage
	fs = fs.GetField("fs")
	Dim ref As JavaObject = fs.RunMethod("getReferenceFromUrl", Array(bucket & ServerPath))
	Dim task As JavaObject = ref.RunMethod("getDownloadUrl", Null)
	Do While task.RunMethod("isComplete", Null) = False
		Sleep(100)
	Loop
	If task.RunMethod("isSuccessful", Null) Then
		Dim s As String = task.RunMethod("getResult", Null)
		Return s
	Else
		Log("Error")
		Return ""
	End If
End Sub

Sub CreateFirebaseStorage As FirebaseStorage
	Dim storage As FirebaseStorage
	storage.Initialize("storage", bucket)
	Return storage
End Sub
