package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class login_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public msg As String";
login._msg = RemoteObject.createImmutable("");__ref.setField("_msg",login._msg);
 //BA.debugLineNum = 3;BA.debugLine="Public UserName As String";
login._username = RemoteObject.createImmutable("");__ref.setField("_username",login._username);
 //BA.debugLineNum = 4;BA.debugLine="Public Nombre As String";
login._nombre = RemoteObject.createImmutable("");__ref.setField("_nombre",login._nombre);
 //BA.debugLineNum = 5;BA.debugLine="Public Apellido As String";
login._apellido = RemoteObject.createImmutable("");__ref.setField("_apellido",login._apellido);
 //BA.debugLineNum = 6;BA.debugLine="Public CampeonatoId As String";
login._campeonatoid = RemoteObject.createImmutable("");__ref.setField("_campeonatoid",login._campeonatoid);
 //BA.debugLineNum = 7;BA.debugLine="Public Codigo As String";
login._codigo = RemoteObject.createImmutable("");__ref.setField("_codigo",login._codigo);
 //BA.debugLineNum = 8;BA.debugLine="Public Rol As String";
login._rol = RemoteObject.createImmutable("");__ref.setField("_rol",login._rol);
 //BA.debugLineNum = 9;BA.debugLine="Public Token As String";
login._token = RemoteObject.createImmutable("");__ref.setField("_token",login._token);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (login) ","login",10,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "login","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(4096);
 BA.debugLineNum = 15;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}