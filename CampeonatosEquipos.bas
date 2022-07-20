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
	Private camp_equi As CampEquipos
	Dim equipId As Int
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private txtNomCamp As Label
	

	Private ImgCamp As ImageView
	Private btnAgregar As Button
	Private xclv As CustomListView
	Private txtNomEquipos As Label
	Private imgEquipo As ImageView
	Private listEquipos As List
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	
	Activity.LoadLayout("listaEquiposbyCampeonatos")
	Activity.Title = "Equipos"
	Dim Job As HttpJob
	Job.Initialize("Job",Me)
	listEquipos.Initialize
	'btnAgregar.Color = Colors.RGB(10,10,10)
	
	camp_equi.Initialize
	Wait For (camp_equi.Read_One(Main.idCampeonato)) Complete ( respuesta As Campeonato)
	Job.Download(respuesta.Imagen)
	txtNomCamp.Text = respuesta.Nombre
	Wait For (Job) JobDone (Job As HttpJob)
	If Job.Success = True Then
		ImgCamp.Bitmap = Job.GetBitmap
	End If
	
	
	
	
	Wait For (camp_equi.Read_All_Equipos_By_Campeonato(Main.idCampeonato)) Complete ( respuestalista As List)
	If respuestalista.Size > 0 Then
		Dim xui As XUI
		For Each equip As Equipo In respuestalista
			Dim p As B4XView = xui.CreatePanel("")
			p.SetLayoutAnimated(100,0,0,100%x,40dip)
			p.LoadLayout("item")
			txtNomEquipos.Text=equip.Nombre
			If equip.Imagen <> "" Then
				Job.Download(equip.Imagen)
				Wait For (Job) JobDone (Job As HttpJob)
				If Job.Success = True Then
					imgEquipo.Bitmap = Job.GetBitmap
				End If
			Else
				imgEquipo.Bitmap = LoadBitmap(File.DirAssets,"equipo_default.png")
			End If
		
			xclv.Add(p,"")
		Next
	End If
	
End Sub

Sub Activity_Resume
    xclv.Clear
	Dim Job As HttpJob
	Job.Initialize("Job",Me)
	listEquipos.Initialize
	
	Wait For (camp_equi.Read_One(Main.idCampeonato)) Complete ( respuesta As Campeonato)
	Job.Download(respuesta.Imagen)
	txtNomCamp.Text = respuesta.Nombre
	Wait For (Job) JobDone (Job As HttpJob)
	If Job.Success = True Then
		ImgCamp.Bitmap = Job.GetBitmap
	End If
	
	Wait For (camp_equi.Read_All_Equipos_By_Campeonato(Main.idCampeonato)) Complete ( respuestalista As List)
	If respuestalista.Size > 0 Then
		For Each equip As Equipo In respuestalista
			listEquipos.Add(equip)
			Dim p As B4XView = xui.CreatePanel("")
			p.SetLayoutAnimated(100,0,0,100%x,100dip)
			p.LoadLayout("item")
			txtNomEquipos.Text=equip.Nombre
			If equip.Imagen <> "" Then
				Job.Download(equip.Imagen)
				Wait For (Job) JobDone (Job As HttpJob)
				If Job.Success = True Then
					imgEquipo.Bitmap = Job.GetBitmap
				End If
			Else
				imgEquipo.Bitmap = LoadBitmap(File.DirAssets,"equipo_default.png")
			End If
			xclv.Add(p,"")
		Next
	End If
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Private Sub btnAgregar_Click
	StartActivity(PantallaRegistro)
End Sub


Private Sub btnActualizar_Click
	
End Sub


Private Sub xclv_ItemClick (Index As Int, Value As Object)
	
	Dim equip As Equipo = listEquipos.Get(Index)
	Log(equip.Id)
	equipId= equip.Id
	StartActivity(PantallaActualizar)
End Sub