B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=11.5
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Private xui As XUI
	Private camp_equi As CampEquipos
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private txtNomCamp As Label
	

	Private ImgCamp As ImageView
	Private lstEquipos As ListView
	Private btnAgregar As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	
	Activity.LoadLayout("listaEquiposbyCampeonatos")
	Dim Job As HttpJob
	Job.Initialize("Job",Me)
	lstEquipos.SingleLineLayout.Label.TextColor=Colors.Black
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
		For Each equip As Equipo In respuestalista
			lstEquipos.AddSingleLine(equip.Nombre)
		Next
	End If
	
End Sub

Sub Activity_Resume
	lstEquipos.Clear
	Dim Job As HttpJob
	Job.Initialize("Job",Me)
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
			lstEquipos.AddSingleLine(equip.Nombre)
		Next
	End If
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub btnAgregar_Click
	StartActivity(PantallaRegistro)
End Sub
