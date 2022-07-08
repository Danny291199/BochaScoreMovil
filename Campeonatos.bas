B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=11
@EndOfDesignText@
Sub Class_Globals
	Private apiUrl 	As String = "https://brochascore.herokuapp.com/campeonatos"
	Private api		As HttpJob
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	api.Initialize("", Me)
End Sub


'' C-rud
	Public Sub Create(Nombre As String,Estado As Int,Fecha_Inicio As String,Imagen As String,Delete_Status As Int ) As ResumableSub
	
	'' geberar el JSON
	Dim jsonGen As JSONGenerator
	jsonGen.Initialize( CreateMap ( _
		"nombre" : Nombre, _
		"estado" : Estado, _
		"fecha_inicio" : Fecha_Inicio, _
		"imagen" : Imagen, _
		"delete_status" : Delete_Status _
	))
	
	Dim jsonTxt As String = jsonGen.ToString
	Log(jsonTxt)
	'' invocar el metodo POST de la API
	api.PostString( apiUrl, jsonTxt)
	api.GetRequest.SetContentType("application/json")
	
	'' esperar por la respuesta de la API
	Wait For (api) JobDone( response As HttpJob )
	
	Dim datos As Campeonato
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
Public Sub Read_One( Id As String) As ResumableSub
	'' invocar el metodo GET de la API
	api.Download( apiUrl & "/" & Id)
	
	'' respuesta de la API
	Wait For (api) JobDone( response As HttpJob)
	Dim datos As Campeonato
	If response.Success Then
		datos = DeserializarUno( response.GetString )
	Else
		datos.Initialize
	End If
	
	Return datos
End Sub

'' cr-U-d
public Sub Update( Id As Int, Nombre As String,Estado As Int,Fecha_Inicio As String,Imagen As String,Delete_Status As Int) As ResumableSub
	'' generar el json
	Dim jsonGen As JSONGenerator
	jsonGen.Initialize( CreateMap ( _
		"id" : Id, _
		"nombre" : Nombre, _
		"estado" : Estado, _
		"fecha_inicio" : Fecha_Inicio, _
		"imagen" : Imagen, _
		"delete_status" : Delete_Status _
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
Public Sub Delete(Id As String) As ResumableSub
	'' invocar el metodo DELETE de la API
	Log(Id)
	api.Delete(apiUrl & "/" & Id)
	
	'' respuesta de la API
	Wait For (api) JobDone( respuesta As HttpJob)
	If respuesta.Success Then
		Return 0
	Else
		Return respuesta.Response.StatusCode
	End If
End Sub

Private Sub MapToCampeonato( datos As Map ) As Campeonato
	Dim camp As Campeonato
	camp.Initialize
	
	
	camp.Nombre              = datos.Get("nombre")
	camp.Estado 		     = datos.Get("estado")
	camp.Fecha_Inicio        = datos.Get("fecha_inicio")
	camp.Imagen       		 = datos.Get("imagen")
	camp.Delete_Status       = datos.Get("delete_status")
	
	Return camp
End Sub

Private Sub DeserializarUno( jsonTxt As String) As Campeonato
	Dim jsonParser As JSONParser
	jsonParser.Initialize(jsonTxt)
	
	Dim datos As Map = jsonParser.NextObject
	Log(datos)
	Return MapToCampeonato(datos)
End Sub


Private Sub DeserializarLista( jsonTxt As String) As List
	Dim list 		As List
	Dim jsonParser	As JSONParser
	
	list.Initialize
	jsonParser.Initialize( jsonTxt )
	
	Dim datos As List = jsonParser.NextArray
	For Each item As Map In datos
		list.Add( MapToCampeonato( item ))
	Next
	
	Return list
End Sub
