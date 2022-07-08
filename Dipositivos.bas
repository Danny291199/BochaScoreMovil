B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=11
@EndOfDesignText@
Sub Class_Globals
	Private apiUrl 	As String = "https://dispositivose.herokuapp.com/dispositivos"
	Private api		As HttpJob
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	api.Initialize("", Me)
End Sub


'' C-rud
Public Sub Create( codigo As String, nombre As String,descripcion As String,precio As Double) As ResumableSub
	
	'' geberar el JSON
	Dim jsonGen As JSONGenerator
	jsonGen.Initialize( CreateMap ( _
		"codigo" : codigo, _
		"nombre" : nombre, _
		"descripcion" : descripcion, _
		"precio" : precio _
	))
	
	Dim jsonTxt As String = jsonGen.ToString
	Log(jsonTxt)
	'' invocar el metodo POST de la API
	api.PostString( apiUrl, jsonTxt)
	api.GetRequest.SetContentType("application/json")
	
	'' esperar por la respuesta de la API
	Wait For (api) JobDone( response As HttpJob )
	
	Dim datos As Dispositivo
	If response.Success Then
		Log(response.GetString)
		datos = DeserializarUno( response.GetString )
	Else
		datos.Initialize
	End If
	
	Return datos
End Sub

'' c-R-ud
Public Sub Read_All() As ResumableSub
	
	'' invocar el metodo GET de la API
	api.Download(apiUrl)
	
	'' esperar la respuesta de la API
	Wait For (api) JobDone( response As HttpJob)
	
	Dim datos As List
	If response.Success Then
		datos = DeserializarLista( response.GetString )
	Else
		datos.Initialize
	End If
	
	Return datos
End Sub

'' c-R-ud
Public Sub Read_One( codigo As String) As ResumableSub
	'' invocar el metodo GET de la API
	api.Download( apiUrl & "/" & codigo)
	
	'' respuesta de la API
	Wait For (api) JobDone( response As HttpJob)
	Dim datos As Dispositivo
	If response.Success Then
		datos = DeserializarUno( response.GetString )
	Else
		datos.Initialize
	End If
	
	Return datos
End Sub

'' cr-U-d
public Sub Update( codigo As String, nombre As String,descripcion As String,precio As Double) As ResumableSub
	'' generar el json
	Dim jsonGen As JSONGenerator
	jsonGen.Initialize( CreateMap ( _
		"codigo" : codigo, _
		"nombre" : nombre, _
		"descripcion" : descripcion, _
		"precio" : precio _
	))
	
	Dim jsonTxt As String = jsonGen.ToString
	
	'' invocar metodo PUT de la API
	api.PutString( apiUrl, jsonTxt)
	api.GetRequest.SetContentType("application/json")
	
	'' respuesta desde la API
	Wait For (api) JobDone( response As HttpJob)
	If response.Success Then
		Return 0
	Else
		Return response.Response.StatusCode
	End If
End Sub

'' cru-D
Public Sub Delete(codigo As String) As ResumableSub
	'' invocar el metodo DELETE de la API
	Log(codigo)
	api.Delete(apiUrl & "/" & codigo)
	
	'' respuesta de la API
	Wait For (api) JobDone( respuesta As HttpJob)
	If respuesta.Success Then
		Return 0
	Else
		Return respuesta.Response.StatusCode
	End If
End Sub

Private Sub MapToDispositivo( datos As Map ) As Dispositivo
	Dim dis As Dispositivo
	dis.Initialize
	
	dis.Codigo			= datos.Get("codigo")
	dis.Nombre          = datos.Get("nombre")
	dis.Descripcion 	= datos.Get("descripcion")
	dis.Precio          = datos.Get("precio")
	
	Return dis
End Sub

Private Sub DeserializarUno( jsonTxt As String) As Dispositivo
	Dim jsonParser As JSONParser
	jsonParser.Initialize(jsonTxt)
	
	Dim datos As Map = jsonParser.NextObject
	Log(datos)
	Return MapToDispositivo(datos)
End Sub


Private Sub DeserializarLista( jsonTxt As String) As List
	Dim list 		As List
	Dim jsonParser	As JSONParser
	
	list.Initialize
	jsonParser.Initialize( jsonTxt )
	
	Dim datos As List = jsonParser.NextArray
	For Each item As Map In datos
		list.Add( MapToDispositivo( item ))
	Next
	
	Return list
End Sub
