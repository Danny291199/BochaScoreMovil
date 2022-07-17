B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=11.5
@EndOfDesignText@
Sub Class_Globals
	Private apiUrl 	As String = "https://brochascore.herokuapp.com/campeonatos"
	Private apiUrlEquipos As String = "https://brochascore.herokuapp.com/equiposCampeonato"
	Private apiUrlEquipos2 As String = "https://brochascore.herokuapp.com/equipos"
	Private api		As HttpJob
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	api.Initialize("", Me)
	
End Sub

Public Sub CreateEquipo(Nombre As String,Imagen As String,Fecha_Creacion As String) As ResumableSub
	
	'' geberar el JSON
	Dim jsonGen As JSONGenerator
	jsonGen.Initialize( CreateMap ( _
		"nombre" : Nombre, _
		"imagen" : Imagen, _
		"campeonatoId" : Main.idCampeonato, _
		"fecha_creacion" : Fecha_Creacion, _
		"delete_status" : 0 _
	))
	
	Dim jsonTxt As String = jsonGen.ToString
	Log(jsonTxt)
	Log(jsonTxt)
	'' invocar el metodo POST de la API
	api.PostString( apiUrlEquipos2, jsonTxt)
	api.GetRequest.SetContentType("application/json")
	api.GetRequest.SetHeader("access-token",Main.token)
	
	'' esperar por la respuesta de la API
	Wait For (api) JobDone( response As HttpJob )
	
	Dim datos As Equipo
	If response.Success Then
		datos = DeserializarUnoEquipo( response.GetString )
	Else
		datos.Initialize
	End If
	
	Return datos
End Sub

public Sub Update( Id As Int,Nombre As String,Imagen As String,Fecha_Creacion As String) As ResumableSub
	'' generar el json
	Dim jsonGen As JSONGenerator
	jsonGen.Initialize( CreateMap ( _
		"id" : Id, _
		"nombre" : Nombre, _
		"imagen" : Imagen, _
		"fecha_creacion" : Fecha_Creacion, _
		"delete_status" : 0 _
	))
	
	Dim jsonTxt As String = jsonGen.ToString
	
	'' invocar metodo PUT de la API
	api.PutString( apiUrlEquipos2, jsonTxt)
	api.GetRequest.SetContentType("application/json")
	api.GetRequest.SetContentType("application/json")
	api.GetRequest.SetHeader("access-token",Main.token)
	
	'' respuesta desde la API
	Wait For (api) JobDone( response As HttpJob)
	If response.Success Then
		Return 0
	Else
		Return response.Response.StatusCode
	End If
End Sub


Public Sub Read_One( Id As String) As ResumableSub

	api.Download( apiUrl & "/" & Id)
	api.GetRequest.SetHeader("access-token", Main.token)
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

Public Sub Read_One_Equipos( Id As String) As ResumableSub

	api.Download( apiUrlEquipos2 & "/" & Id)
	api.GetRequest.SetHeader("access-token", Main.token)
	'' respuesta de la API
	Wait For (api) JobDone( response As HttpJob)
	Dim datos As Equipo
	If response.Success Then
		datos = DeserializarUnoEquipo( response.GetString )
	Else
		datos.Initialize
	End If
	
	Return datos
End Sub

Public Sub Read_All_Equipos_By_Campeonato(Id As String) As ResumableSub
	
	'' invocar el metodo GET de la API
	api.Download( apiUrlEquipos & "/" & Id)
	api.GetRequest.SetHeader("access-token", Main.token)
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

Private Sub MapToCampeonato( datos As Map ) As Campeonato
	Dim camp As Campeonato
	camp.Initialize
	
	
	camp.Nombre              = datos.Get("nombre")
	camp.Imagen              = datos.Get("imagen")
	Return camp
End Sub

Private Sub MapToEquipos( datos As Map ) As Equipo
	Dim eq As Equipo
	
	eq.Initialize

	eq.Id                  = datos.Get("id")
	eq.Nombre              = datos.Get("nombre")
	eq.Imagen              = datos.Get("imagen")
	eq.Fecha_Creacion      = datos.Get("fecha_creacion")
	
	
	Return eq
End Sub

Private Sub DeserializarUno( jsonTxt As String) As Campeonato
	Dim jsonParser As JSONParser
	jsonParser.Initialize(jsonTxt)
	
	Dim datos As Map = jsonParser.NextObject
	Log(datos)
	Return MapToCampeonato(datos)
End Sub

Private Sub DeserializarUnoEquipo( jsonTxt As String) As Equipo
	Dim jsonParser As JSONParser
	jsonParser.Initialize(jsonTxt)
	
	Dim datos As Map = jsonParser.NextObject
	Log(datos)
	Return MapToEquipos(datos)
End Sub

Private Sub DeserializarLista( jsonTxt As String) As List
	Dim list 		As List
	Dim jsonParser	As JSONParser
	
	list.Initialize
	Log(jsonTxt)
	jsonParser.Initialize( jsonTxt )

	Dim datos As List = jsonParser.NextArray
	For Each item As Map In datos
		list.Add( MapToEquipos( item ))
	Next
	
	Return list
End Sub
