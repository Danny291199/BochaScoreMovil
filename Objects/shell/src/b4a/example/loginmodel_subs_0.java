package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class loginmodel_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private apiUrl 	As String = \"https://brochascore.";
loginmodel._apiurl = BA.ObjectToString("https://brochascore.herokuapp.com/login");__ref.setField("_apiurl",loginmodel._apiurl);
 //BA.debugLineNum = 3;BA.debugLine="Private api		As HttpJob";
loginmodel._api = RemoteObject.createNew ("b4a.example.httpjob");__ref.setField("_api",loginmodel._api);
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _deserializaruno(RemoteObject __ref,RemoteObject _jsontxt) throws Exception{
try {
		Debug.PushSubsStack("DeserializarUno (loginmodel) ","loginmodel",9,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("deserializaruno")) { return __ref.runUserSub(false, "loginmodel","deserializaruno", __ref, _jsontxt);}
RemoteObject _jsonparser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _datos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("jsonTxt", _jsontxt);
 BA.debugLineNum = 57;BA.debugLine="Private Sub DeserializarUno( jsonTxt As String) As";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="Dim jsonParser As JSONParser";
Debug.ShouldStop(33554432);
_jsonparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jsonParser", _jsonparser);
 BA.debugLineNum = 59;BA.debugLine="jsonParser.Initialize(jsonTxt)";
Debug.ShouldStop(67108864);
_jsonparser.runVoidMethod ("Initialize",(Object)(_jsontxt));
 BA.debugLineNum = 61;BA.debugLine="Dim datos As Map = jsonParser.NextObject";
Debug.ShouldStop(268435456);
_datos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_datos = _jsonparser.runMethod(false,"NextObject");Debug.locals.put("datos", _datos);Debug.locals.put("datos", _datos);
 BA.debugLineNum = 62;BA.debugLine="Return MapToLogin(datos)";
Debug.ShouldStop(536870912);
if (true) return __ref.runClassMethod (b4a.example.loginmodel.class, "_maptologin" /*RemoteObject*/ ,(Object)(_datos));
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (loginmodel) ","loginmodel",9,__ref.getField(false, "ba"),__ref,7);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "loginmodel","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 7;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(64);
 BA.debugLineNum = 8;BA.debugLine="api.Initialize(\"\", Me)";
Debug.ShouldStop(128);
__ref.getField(false,"_api" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
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
public static RemoteObject  _login_post(RemoteObject __ref,RemoteObject _username,RemoteObject _password) throws Exception{
try {
		Debug.PushSubsStack("Login_Post (loginmodel) ","loginmodel",9,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("login_post")) { return __ref.runUserSub(false, "loginmodel","login_post", __ref, _username, _password);}
ResumableSub_Login_Post rsub = new ResumableSub_Login_Post(null,__ref,_username,_password);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Login_Post extends BA.ResumableSub {
public ResumableSub_Login_Post(b4a.example.loginmodel parent,RemoteObject __ref,RemoteObject _username,RemoteObject _password) {
this.parent = parent;
this.__ref = __ref;
this._username = _username;
this._password = _password;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.loginmodel parent;
RemoteObject _username;
RemoteObject _password;
RemoteObject _jsongen = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _jsontxt = RemoteObject.createImmutable("");
RemoteObject _response = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _datos = RemoteObject.declareNull("b4a.example.login");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Login_Post (loginmodel) ","loginmodel",9,__ref.getField(false, "ba"),__ref,12);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("userName", _username);
Debug.locals.put("password", _password);
 BA.debugLineNum = 14;BA.debugLine="Dim jsonGen As JSONGenerator";
Debug.ShouldStop(8192);
_jsongen = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("jsonGen", _jsongen);
 BA.debugLineNum = 16;BA.debugLine="jsonGen.Initialize( CreateMap ( _ 		\"userName\" :";
Debug.ShouldStop(32768);
_jsongen.runVoidMethod ("Initialize",(Object)(parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("userName")),(_username),RemoteObject.createImmutable(("contrasenia")),(_password),RemoteObject.createImmutable(("rolCodigo")),(RemoteObject.createImmutable("AC"))}))));
 BA.debugLineNum = 22;BA.debugLine="Dim jsonTxt As String = jsonGen.ToString";
Debug.ShouldStop(2097152);
_jsontxt = _jsongen.runMethod(true,"ToString");Debug.locals.put("jsonTxt", _jsontxt);Debug.locals.put("jsonTxt", _jsontxt);
 BA.debugLineNum = 23;BA.debugLine="api.PostString(apiUrl,jsonTxt)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_api" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_apiurl" /*RemoteObject*/ )),(Object)(_jsontxt));
 BA.debugLineNum = 24;BA.debugLine="api.GetRequest.SetContentType(\"application/json\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_api" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 27;BA.debugLine="Wait For (api) JobDone( response As HttpJob )";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "loginmodel", "login_post"), (__ref.getField(false,"_api" /*RemoteObject*/ )));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_response = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("response", _response);
;
 BA.debugLineNum = 28;BA.debugLine="Dim datos As Login";
Debug.ShouldStop(134217728);
_datos = RemoteObject.createNew ("b4a.example.login");Debug.locals.put("datos", _datos);
 BA.debugLineNum = 29;BA.debugLine="If response.Success Then";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//if
this.state = 6;
if (_response.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 30;BA.debugLine="Log(response.GetString)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","67143442",_response.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 31;BA.debugLine="datos = DeserializarUno( response.GetString )";
Debug.ShouldStop(1073741824);
_datos = __ref.runClassMethod (b4a.example.loginmodel.class, "_deserializaruno" /*RemoteObject*/ ,(Object)(_response.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("datos", _datos);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 33;BA.debugLine="datos.Initialize";
Debug.ShouldStop(1);
_datos.runClassMethod (b4a.example.login.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 34;BA.debugLine="datos.CampeonatoId = \"\"";
Debug.ShouldStop(2);
_datos.setField ("_campeonatoid" /*RemoteObject*/ ,BA.ObjectToString(""));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 37;BA.debugLine="Return datos";
Debug.ShouldStop(16);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_datos));return;};
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _jobdone(RemoteObject __ref,RemoteObject _response) throws Exception{
}
public static RemoteObject  _maptologin(RemoteObject __ref,RemoteObject _datos) throws Exception{
try {
		Debug.PushSubsStack("MapToLogin (loginmodel) ","loginmodel",9,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("maptologin")) { return __ref.runUserSub(false, "loginmodel","maptologin", __ref, _datos);}
RemoteObject _logi = RemoteObject.declareNull("b4a.example.login");
Debug.locals.put("datos", _datos);
 BA.debugLineNum = 41;BA.debugLine="Private Sub MapToLogin( datos As Map ) As Login";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="Dim logi As Login";
Debug.ShouldStop(512);
_logi = RemoteObject.createNew ("b4a.example.login");Debug.locals.put("logi", _logi);
 BA.debugLineNum = 43;BA.debugLine="logi.Initialize";
Debug.ShouldStop(1024);
_logi.runClassMethod (b4a.example.login.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 45;BA.debugLine="logi.msg              = datos.Get(\"msg\")";
Debug.ShouldStop(4096);
_logi.setField ("_msg" /*RemoteObject*/ ,BA.ObjectToString(_datos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msg"))))));
 BA.debugLineNum = 46;BA.debugLine="logi.UserName         = datos.Get(\"userName\")";
Debug.ShouldStop(8192);
_logi.setField ("_username" /*RemoteObject*/ ,BA.ObjectToString(_datos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("userName"))))));
 BA.debugLineNum = 47;BA.debugLine="logi.Nombre           = datos.Get(\"nombre\")";
Debug.ShouldStop(16384);
_logi.setField ("_nombre" /*RemoteObject*/ ,BA.ObjectToString(_datos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nombre"))))));
 BA.debugLineNum = 48;BA.debugLine="logi.Apellido         = datos.Get(\"apellido\")";
Debug.ShouldStop(32768);
_logi.setField ("_apellido" /*RemoteObject*/ ,BA.ObjectToString(_datos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("apellido"))))));
 BA.debugLineNum = 49;BA.debugLine="logi.CampeonatoId     = datos.Get(\"campeonatoId\")";
Debug.ShouldStop(65536);
_logi.setField ("_campeonatoid" /*RemoteObject*/ ,BA.ObjectToString(_datos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("campeonatoId"))))));
 BA.debugLineNum = 50;BA.debugLine="logi.Codigo           = datos.Get(\"codigo\")";
Debug.ShouldStop(131072);
_logi.setField ("_codigo" /*RemoteObject*/ ,BA.ObjectToString(_datos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("codigo"))))));
 BA.debugLineNum = 51;BA.debugLine="logi.Rol              = datos.Get(\"rol\")";
Debug.ShouldStop(262144);
_logi.setField ("_rol" /*RemoteObject*/ ,BA.ObjectToString(_datos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("rol"))))));
 BA.debugLineNum = 52;BA.debugLine="logi.Token            = datos.Get(\"token\")";
Debug.ShouldStop(524288);
_logi.setField ("_token" /*RemoteObject*/ ,BA.ObjectToString(_datos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("token"))))));
 BA.debugLineNum = 54;BA.debugLine="Return logi";
Debug.ShouldStop(2097152);
if (true) return _logi;
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}