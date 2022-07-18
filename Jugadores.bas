B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=11.5
@EndOfDesignText@
Sub Class_Globals
	Private apiUrl 	As String = "https://brochascore.herokuapp.com/jugadoresEquipo"
	Private api		As HttpJob
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	api.Initialize("", Me)
	
End Sub


Public Sub Read_All_Jugadores_By_Equipo(Id As String) As ResumableSub
	
	'' invocar el metodo GET de la API
	api.Download( apiUrl & "/" & Id)
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


Private Sub MapToJugador( datos As Map ) As Jugador
	Dim jug As Jugador
	
	jug.Initialize

	jug.Id                  = datos.Get("id")
	jug.Dorsal              = datos.Get("dorsal")
	jug.Nombre              = datos.Get("nombre")
	jug.Apellido            = datos.Get("apellido")
	jug.Peso                = datos.Get("peso")
	jug.Altura              = datos.Get("altura")
	jug.Fecha_Nacimiento    = datos.Get("fecha_nacimiento")
	jug.Posicion            = datos.Get("posicion")
	jug.Imagen              = datos.Get("imagen")
     
	Return jug
End Sub


Private Sub DeserializarLista( jsonTxt As String) As List
	Dim list 		As List
	Dim jsonParser	As JSONParser
	
	list.Initialize
	Log(jsonTxt)
	jsonParser.Initialize( jsonTxt )

	Dim datos As List = jsonParser.NextArray
	For Each item As Map In datos
		list.Add( MapToJugador( item ))
	Next
	
	Return list
End Sub
