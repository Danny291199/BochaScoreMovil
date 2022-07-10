B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=11.5
@EndOfDesignText@
Sub Class_Globals
	Private apiUrl 	As String = "https://brochascore.herokuapp.com/campeonatos"
	Private api		As HttpJob
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	api.Initialize("", Me)
End Sub

Public Sub Create(Username As String,Contrasenia As String) As ResumableSub
	
	'' geberar el JSON
	Dim jsonGen As JSONGenerator
	jsonGen.Initialize( CreateMap ( _
		"username" : Username, _
		"contrasenia" : Contrasenia _
	))
	
	Dim jsonTxt As String = jsonGen.ToString
	Log(jsonTxt)
	'' invocar el metodo POST de la API
	api.PostString( apiUrl, jsonTxt)
	api.GetRequest.SetContentType("application/json")
	
	'' esperar por la respuesta de la API
	Wait For (api) JobDone( response As HttpJob )
	
	Dim datos As inicio
	If response.Success Then
		Log(response.GetString)
		datos = DeserializarUno( response.GetString )
	Else
		datos.Initialize
	End If
	
	Return datos
End Sub

Public Sub Read_One( Id As String) As ResumableSub
	'' invocar el metodo GET de la API
	api.Download( apiUrl & "/" & Id)
	api.GetRequest.SetHeader("access-token","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjaGVjayI6dHJ1ZSwiaWF0IjoxNjU3MzgxNzM3LCJleHAiOjE2NTc1NTQ1Mzd9.-3a8wuthLwDFZhOD7kZQn8kxX8u84GBDTvfwKSYnu3w")
	'' respuesta de la API
	Wait For (api) JobDone( response As HttpJob)
	Dim datos As inicio
	If response.Success Then
		datos = DeserializarUno( response.GetString )
	Else
		datos.Initialize
	End If
	
	Return datos
End Sub

Private Sub MapToInicio( datos As Map ) As inicio
	Dim ini As inicio
	ini.Initialize
	ini.Username              = datos.Get("username")
	ini.Contrasenia		     = datos.Get("contrasenia")
	Return ini
End Sub

Private Sub DeserializarUno( jsonTxt As String) As inicio
	Dim jsonParser As JSONParser
	jsonParser.Initialize(jsonTxt)
	
	Dim datos As Map = jsonParser.NextObject
	Log(datos)
	Return MapToInicio(datos)
End Sub




