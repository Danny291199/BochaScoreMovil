package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class campeonato_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public Id 		    As Int";
campeonato._id = RemoteObject.createImmutable(0);__ref.setField("_id",campeonato._id);
 //BA.debugLineNum = 3;BA.debugLine="Public Nombre 		As String";
campeonato._nombre = RemoteObject.createImmutable("");__ref.setField("_nombre",campeonato._nombre);
 //BA.debugLineNum = 4;BA.debugLine="Public Estado	    As Int";
campeonato._estado = RemoteObject.createImmutable(0);__ref.setField("_estado",campeonato._estado);
 //BA.debugLineNum = 5;BA.debugLine="Public Fecha_Inicio As String";
campeonato._fecha_inicio = RemoteObject.createImmutable("");__ref.setField("_fecha_inicio",campeonato._fecha_inicio);
 //BA.debugLineNum = 6;BA.debugLine="Public Imagen As String";
campeonato._imagen = RemoteObject.createImmutable("");__ref.setField("_imagen",campeonato._imagen);
 //BA.debugLineNum = 7;BA.debugLine="Public Delete_Status As Int";
campeonato._delete_status = RemoteObject.createImmutable(0);__ref.setField("_delete_status",campeonato._delete_status);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (campeonato) ","campeonato",3,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "campeonato","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(2048);
 BA.debugLineNum = 14;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}