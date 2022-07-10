package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class equipo_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public Id 		    As Int";
equipo._id = RemoteObject.createImmutable(0);__ref.setField("_id",equipo._id);
 //BA.debugLineNum = 3;BA.debugLine="Public Nombre 		As String";
equipo._nombre = RemoteObject.createImmutable("");__ref.setField("_nombre",equipo._nombre);
 //BA.debugLineNum = 4;BA.debugLine="Public Imagen As String";
equipo._imagen = RemoteObject.createImmutable("");__ref.setField("_imagen",equipo._imagen);
 //BA.debugLineNum = 5;BA.debugLine="Public Fecha_Creacion As String";
equipo._fecha_creacion = RemoteObject.createImmutable("");__ref.setField("_fecha_creacion",equipo._fecha_creacion);
 //BA.debugLineNum = 6;BA.debugLine="Public Delete_Status As Int";
equipo._delete_status = RemoteObject.createImmutable(0);__ref.setField("_delete_status",equipo._delete_status);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (equipo) ","equipo",8,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "equipo","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(512);
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}