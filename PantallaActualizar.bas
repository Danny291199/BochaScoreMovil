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
	Private equi As CampEquipos
	Dim idEquipo As String
	Dim token As String
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private txtIdEquipo As EditText
	Private txtNombreActualizar As EditText
	Private txtImagenActualizar As EditText
	Private txtFechaCreacionActualizar As EditText
	Private btnActualizar As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("PantallaActualizar")
	equi.Initialize
	
	
	Wait For (equi.Read_One_Equipos(CampeonatosEquipos.equipId)) Complete ( respuesta As Equipo)
	If respuesta.Id <> 0 Then
		
		
		txtNombreActualizar.Text = respuesta.Nombre
		txtImagenActualizar.Text = respuesta.Imagen
		txtFechaCreacionActualizar.Text = respuesta.Fecha_Creacion.
		
	Else
		xui.MsgboxAsync("REGISTRO NO ENCONTRADO !!", "ERROR")
		txtNombreActualizar.Text = ""
		txtImagenActualizar.Text = ""
		txtFechaCreacionActualizar.Text = ""
	End If
	
	txtNombreActualizar.SingleLine=False
	txtImagenActualizar.SingleLine=False
	txtFechaCreacionActualizar.SingleLine=False
	
	Dim cd As ColorDrawable
	cd.Initialize2(Colors.Transparent, 10dip,1dip,Colors.RGB(11,59,89))
	txtNombreActualizar.Background=cd
	txtImagenActualizar.Background=cd
	txtFechaCreacionActualizar.Background=cd
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub




Private Sub btnActualizar_Click
	
	Wait For (equi.Update( txtIdEquipo.Text,txtNombreActualizar.Text,txtImagenActualizar.Text,txtFechaCreacionActualizar.Text )) Complete( res As Int)
	If res = 0 Then
		xui.MsgboxAsync("REGISTRO ACTUALIZADO !!", "OK")
		Dim resp As Equipo
		resp.Initialize
		idEquipo = resp.Id
		token = resp.Token
		StartActivity(CampeonatosEquipos)
		Activity.Finish
	Else
		xui.MsgboxAsync("REGISTRO NO SE PUDO ACTUALIZAR !!", "ERROR")
	End If
	
End Sub

Private Sub btnBuscar_Click
	
End Sub