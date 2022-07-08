B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=11
@EndOfDesignText@
Sub Class_Globals
	Private apiUrl 	As String = "https://empresaapi2022.azurewebsites.net/api/departamentos/"
	Private api		As HttpJob
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	api.Initialize("", Me)
End Sub


'' C-rud
Public Sub Create( descripcion As String, ciudadId As Int) As ResumableSub
	
	'' geberar el JSON
	Dim jsonGen As JSONGenerator
	jsonGen.Initialize( CreateMap ( _
		"descripcion" : descripcion, _
		"ciudadId" : ciudadId _
	))
	
	Dim jsonTxt As String = jsonGen.ToString
	
	'' invocar el metodo POST de la API
	api.PostString( apiUrl, jsonTxt)
	api.GetRequest.SetContentType("application/json")
	
	'' esperar por la respuesta de la API
	Wait For (api) JobDone( response As HttpJob )

	Dim datos As Departamento
	If response.Success Then
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
Public Sub Read_One( id As Int) As ResumableSub
	'' invocar el metodo GET de la API
	api.Download( apiUrl & id)
	
	'' respuesta de la API
	Wait For (api) JobDone( response As HttpJob)
	Dim datos As Departamento
	If response.Success Then
		datos = DeserializarUno( response.GetString )
	Else
		datos.Initialize
	End If
	
	Return datos
End Sub

'' cr-U-d
public Sub Update( id As Int, descripcion As String, ciudadId As Int) As ResumableSub
	'' generar el json
	Dim jsonGen As JSONGenerator
	jsonGen.Initialize( CreateMap ( _
		"id" : id, _
		"descripcion" : descripcion, _
		"ciudadId" : ciudadId _
	))
	
	Dim jsonTxt As String = jsonGen.ToString
	
	'' invocar metodo PUT de la API
	api.PutString( apiUrl & id, jsonTxt)
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
Public Sub Delete(id As Int) As ResumableSub
	'' invocar el metodo DELETE de la API
	api.Delete(apiUrl & id)
	api.GetRequest.SetContentType("application/json")
	
	'' respuesta de la API
	Wait For (api) JobDone( respuesta As HttpJob)
	If respuesta.Success Then
		Return 0
	Else
		Return respuesta.Response.StatusCode
	End If
End Sub

Private Sub MapToDepartamento( datos As Map ) As Departamento
	Dim dep As Departamento
	dep.Initialize
	
	dep.Id 			= datos.Get("id")
	dep.Descripcion = datos.Get("descripcion")
	dep.CiudadId 	= datos.Get("ciudadId")
	
	Return dep
End Sub

Private Sub DeserializarUno( jsonTxt As String) As Departamento
	Dim jsonParser As JSONParser
	jsonParser.Initialize(jsonTxt)
	
	Dim datos As Map = jsonParser.NextObject
	Return MapToDepartamento(datos)
End Sub

Private Sub DeserializarLista( jsonTxt As String) As List
	Dim list 		As List
	Dim jsonParser	As JSONParser
	
	list.Initialize
	jsonParser.Initialize( jsonTxt )
	
	Dim datos As List = jsonParser.NextArray
	For Each item As Map In datos
		list.Add( MapToDepartamento( item ))
	Next
	
	Return list
End Sub
