package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class inicio_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public Username 		    As String";
inicio._username = RemoteObject.createImmutable("");__ref.setField("_username",inicio._username);
 //BA.debugLineNum = 3;BA.debugLine="Public Contrasenia	    As String";
inicio._contrasenia = RemoteObject.createImmutable("");__ref.setField("_contrasenia",inicio._contrasenia);
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (inicio) ","inicio",4,__ref.getField(false, "ba"),__ref,7);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "inicio","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 7;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(64);
 BA.debugLineNum = 9;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}