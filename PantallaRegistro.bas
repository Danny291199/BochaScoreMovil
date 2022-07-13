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

	Private txtNombre As EditText
	Private txtImagen As EditText
	Private txtFechaCreacion As EditText
	Private txtDeleteStatus As EditText
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("PantallaRegistro")
	equi.Initialize
	
	txtNombre.SingleLine=False
	txtImagen.SingleLine=False
	txtFechaCreacion.SingleLine=False
	txtDeleteStatus.SingleLine=False
	Dim cd As ColorDrawable
	cd.Initialize2(Colors.Transparent, 10dip,1dip,Colors.RGB(11,59,89))
	txtNombre.Background=cd
	txtImagen.Background=cd
	txtFechaCreacion.Background=cd
	txtDeleteStatus.Background=cd
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub btnEntrar_Click

	
	Wait For (equi.CreateEquipo(txtNombre.Text,txtImagen.Text,txtFechaCreacion.Text)) Complete( resultado As Equipo )
	Log(resultado.Id)
	If resultado.Id <> 0  Then
		idEquipo = resultado.Id
		token = resultado.Token
		StartActivity(CampeonatosEquipos)
		Activity.Finish
	Else
		xui.MsgboxAsync("Error al registrar", "ERROR")
	End If
	

End Sub