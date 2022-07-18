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
	Private juga As Jugadores
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private ImgEquip As ImageView
	Private txtNomEquip As Label
	Private imgJugador As ImageView
	Private txtNomJugador As Label
	Private xclv As CustomListView
	Private listJugadores As List
	Private txtApellJugador As Label
	Private txtDorsalJugador As Label
	Private txtPosJugador As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")

	Activity.LoadLayout("PantallaListaJugadores")
	Dim Job As HttpJob
	Job.Initialize("Job",Me)
	listJugadores.Initialize
	
	'btnAgregar.Color = Colors.RGB(10,10,10)
	
	camp_equi.Initialize
	juga.Initialize
	Wait For (camp_equi.Read_One_Equipos(CampeonatosEquipos.equipId)) Complete ( respuesta As Equipo)
	Job.Download(respuesta.Imagen)
	txtNomEquip.Text = respuesta.Nombre
	Wait For (Job) JobDone (Job As HttpJob)
	If Job.Success = True Then
		ImgEquip.Bitmap = Job.GetBitmap
	End If
	
	Wait For (juga.Read_All_Jugadores_By_Equipo(CampeonatosEquipos.equipId)) Complete ( respuestalista As List)
	If respuestalista.Size > 0 Then
		Dim xui As XUI
		For Each jugad As Jugador In respuestalista
			listJugadores.Add(jugad)
			Dim p As B4XView = xui.CreatePanel("")
			p.Color=Colors.Transparent
			p.SetLayoutAnimated(100,0,0,100%x,100dip)
			p.LoadLayout("item2")
			txtNomJugador.Text=jugad.Nombre
			txtApellJugador.Text=jugad.Apellido
			txtDorsalJugador.Text=jugad.Dorsal
			txtPosJugador.Text=jugad.Posicion
			Job.Download(jugad.Imagen)
			Wait For (Job) JobDone (Job As HttpJob)
			If Job.Success = True Then
				imgJugador.Bitmap = Job.GetBitmap
			End If
			xclv.Add(p,"")
		Next
	End If
	
End Sub

Sub Activity_Resume
	xclv.Clear
	Dim Job As HttpJob
	Job.Initialize("Job",Me)
	listJugadores.Initialize
	
	'btnAgregar.Color = Colors.RGB(10,10,10)
	
	camp_equi.Initialize
	juga.Initialize
	Wait For (camp_equi.Read_One_Equipos(CampeonatosEquipos.equipId)) Complete ( respuesta As Equipo)
	Job.Download(respuesta.Imagen)
	txtNomEquip.Text = respuesta.Nombre
	Wait For (Job) JobDone (Job As HttpJob)
	If Job.Success = True Then
		ImgEquip.Bitmap = Job.GetBitmap
	End If
	
	Wait For (juga.Read_All_Jugadores_By_Equipo(CampeonatosEquipos.equipId)) Complete ( respuestalista As List)
	If respuestalista.Size > 0 Then
		Dim xui As XUI
		For Each jugad As Jugador In respuestalista
			listJugadores.Add(juga)
			Dim p As B4XView = xui.CreatePanel("")
			p.Color=Colors.Transparent
			p.SetLayoutAnimated(100,0,0,100%x,100dip)
			p.LoadLayout("item2")
			txtNomJugador.Text=jugad.Nombre
			txtApellJugador.Text=jugad.Apellido
			txtDorsalJugador.Text=jugad.Dorsal
			txtPosJugador.Text=jugad.Posicion
			Job.Download(jugad.Imagen)
			Wait For (Job) JobDone (Job As HttpJob)
			If Job.Success = True Then
				imgJugador.Bitmap = Job.GetBitmap
			End If
			xclv.Add(p,"")
		Next
	End If
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub btnAgregar_Click
	
End Sub