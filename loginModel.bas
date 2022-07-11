B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=11.5
@EndOfDesignText@
Sub Class_Globals
	Private apiUrl 	As String = "https://brochascore.herokuapp.com/login"
	Private api		As HttpJob
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	api.Initialize("", Me)
End Sub


Public Sub Login_Post( userName As String, password As String ) As ResumableSub
	
	Dim jsonGen As JSONGenerator
	
	jsonGen.Initialize( CreateMap ( _
		"userName" : userName, _
		"contrasenia" : password, _
		"rolCodigo": "AC" _
	))
	
	Dim jsonTxt As String = jsonGen.ToString
	api.PostString(apiUrl,jsonTxt)
	api.GetRequest.SetContentType("application/json")
	
	'' esperar por la respuesta de la API
	Wait For (api) JobDone( response As HttpJob )
	Dim datos As Login
	If response.Success Then
		Log(response.GetString)
		datos = DeserializarUno( response.GetString )
	Else
		datos.Initialize
		datos.CampeonatoId = ""
	End If

	Return datos
End Sub


Private Sub MapToLogin( datos As Map ) As Login
	Dim logi As Login
	logi.Initialize
	
	logi.msg              = datos.Get("msg")
	logi.UserName         = datos.Get("userName")
	logi.Nombre           = datos.Get("nombre")
	logi.Apellido         = datos.Get("apellido")
	logi.CampeonatoId     = datos.Get("campeonatoId")
	logi.Codigo           = datos.Get("codigo")
	logi.Rol              = datos.Get("rol")
	logi.Token            = datos.Get("token")
	
	Return logi
End Sub

Private Sub DeserializarUno( jsonTxt As String) As Login
	Dim jsonParser As JSONParser
	jsonParser.Initialize(jsonTxt)
	
	Dim datos As Map = jsonParser.NextObject
	Return MapToLogin(datos)
End Sub