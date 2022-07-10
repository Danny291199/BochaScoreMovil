package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class inicios_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private apiUrl 	As String = \"https://brochascore.";
inicios._apiurl = BA.ObjectToString("https://brochascore.herokuapp.com/campeonatos");__ref.setField("_apiurl",inicios._apiurl);
 //BA.debugLineNum = 3;BA.debugLine="Private api		As HttpJob";
inicios._api = RemoteObject.createNew ("b4a.example.httpjob");__ref.setField("_api",inicios._api);
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _create(RemoteObject __ref,RemoteObject _username,RemoteObject _contrasenia) throws Exception{
try {
		Debug.PushSubsStack("Create (inicios) ","inicios",5,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("create")) { return __ref.runUserSub(false, "inicios","create", __ref, _username, _contrasenia);}
ResumableSub_Create rsub = new ResumableSub_Create(null,__ref,_username,_contrasenia);
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
public static class ResumableSub_Create extends BA.ResumableSub {
public ResumableSub_Create(b4a.example.inicios parent,RemoteObject __ref,RemoteObject _username,RemoteObject _contrasenia) {
this.parent = parent;
this.__ref = __ref;
this._username = _username;
this._contrasenia = _contrasenia;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.inicios parent;
RemoteObject _username;
RemoteObject _contrasenia;
RemoteObject _jsongen = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _jsontxt = RemoteObject.createImmutable("");
RemoteObject _response = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _datos = RemoteObject.declareNull("b4a.example.inicio");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Create (inicios) ","inicios",5,__ref.getField(false, "ba"),__ref,11);
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
Debug.locals.put("Username", _username);
Debug.locals.put("Contrasenia", _contrasenia);
 BA.debugLineNum = 14;BA.debugLine="Dim jsonGen As JSONGenerator";
Debug.ShouldStop(8192);
_jsongen = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("jsonGen", _jsongen);
 BA.debugLineNum = 15;BA.debugLine="jsonGen.Initialize( CreateMap ( _ 		\"username\" :";
Debug.ShouldStop(16384);
_jsongen.runVoidMethod ("Initialize",(Object)(parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("username")),(_username),RemoteObject.createImmutable(("contrasenia")),(_contrasenia)}))));
 BA.debugLineNum = 20;BA.debugLine="Dim jsonTxt As String = jsonGen.ToString";
Debug.ShouldStop(524288);
_jsontxt = _jsongen.runMethod(true,"ToString");Debug.locals.put("jsonTxt", _jsontxt);Debug.locals.put("jsonTxt", _jsontxt);
 BA.debugLineNum = 21;BA.debugLine="Log(jsonTxt)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("LogImpl","42359306",_jsontxt,0);
 BA.debugLineNum = 23;BA.debugLine="api.PostString( apiUrl, jsonTxt)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_api" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_apiurl" /*RemoteObject*/ )),(Object)(_jsontxt));
 BA.debugLineNum = 24;BA.debugLine="api.GetRequest.SetContentType(\"application/json\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_api" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 27;BA.debugLine="Wait For (api) JobDone( response As HttpJob )";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "inicios", "create"), (__ref.getField(false,"_api" /*RemoteObject*/ )));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_response = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("response", _response);
;
 BA.debugLineNum = 29;BA.debugLine="Dim datos As inicio";
Debug.ShouldStop(268435456);
_datos = RemoteObject.createNew ("b4a.example.inicio");Debug.locals.put("datos", _datos);
 BA.debugLineNum = 30;BA.debugLine="If response.Success Then";
Debug.ShouldStop(536870912);
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
 BA.debugLineNum = 31;BA.debugLine="Log(response.GetString)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","42359316",_response.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 32;BA.debugLine="datos = DeserializarUno( response.GetString )";
Debug.ShouldStop(-2147483648);
_datos = __ref.runClassMethod (b4a.example.inicios.class, "_deserializaruno" /*RemoteObject*/ ,(Object)(_response.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("datos", _datos);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 34;BA.debugLine="datos.Initialize";
Debug.ShouldStop(2);
_datos.runClassMethod (b4a.example.inicio.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
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
public static RemoteObject  _deserializaruno(RemoteObject __ref,RemoteObject _jsontxt) throws Exception{
try {
		Debug.PushSubsStack("DeserializarUno (inicios) ","inicios",5,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("deserializaruno")) { return __ref.runUserSub(false, "inicios","deserializaruno", __ref, _jsontxt);}
RemoteObject _jsonparser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _datos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("jsonTxt", _jsontxt);
 BA.debugLineNum = 64;BA.debugLine="Private Sub DeserializarUno( jsonTxt As String) As";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="Dim jsonParser As JSONParser";
Debug.ShouldStop(1);
_jsonparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jsonParser", _jsonparser);
 BA.debugLineNum = 66;BA.debugLine="jsonParser.Initialize(jsonTxt)";
Debug.ShouldStop(2);
_jsonparser.runVoidMethod ("Initialize",(Object)(_jsontxt));
 BA.debugLineNum = 68;BA.debugLine="Dim datos As Map = jsonParser.NextObject";
Debug.ShouldStop(8);
_datos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_datos = _jsonparser.runMethod(false,"NextObject");Debug.locals.put("datos", _datos);Debug.locals.put("datos", _datos);
 BA.debugLineNum = 69;BA.debugLine="Log(datos)";
Debug.ShouldStop(16);
inicios.__c.runVoidMethod ("LogImpl","42555909",BA.ObjectToString(_datos),0);
 BA.debugLineNum = 70;BA.debugLine="Return MapToInicio(datos)";
Debug.ShouldStop(32);
if (true) return __ref.runClassMethod (b4a.example.inicios.class, "_maptoinicio" /*RemoteObject*/ ,(Object)(_datos));
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("Initialize (inicios) ","inicios",5,__ref.getField(false, "ba"),__ref,7);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "inicios","initialize", __ref, _ba);}
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
public static RemoteObject  _maptoinicio(RemoteObject __ref,RemoteObject _datos) throws Exception{
try {
		Debug.PushSubsStack("MapToInicio (inicios) ","inicios",5,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("maptoinicio")) { return __ref.runUserSub(false, "inicios","maptoinicio", __ref, _datos);}
RemoteObject _ini = RemoteObject.declareNull("b4a.example.inicio");
Debug.locals.put("datos", _datos);
 BA.debugLineNum = 56;BA.debugLine="Private Sub MapToInicio( datos As Map ) As inicio";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="Dim ini As inicio";
Debug.ShouldStop(16777216);
_ini = RemoteObject.createNew ("b4a.example.inicio");Debug.locals.put("ini", _ini);
 BA.debugLineNum = 58;BA.debugLine="ini.Initialize";
Debug.ShouldStop(33554432);
_ini.runClassMethod (b4a.example.inicio.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 59;BA.debugLine="ini.Username              = datos.Get(\"username\")";
Debug.ShouldStop(67108864);
_ini.setField ("_username" /*RemoteObject*/ ,BA.ObjectToString(_datos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username"))))));
 BA.debugLineNum = 60;BA.debugLine="ini.Contrasenia		     = datos.Get(\"contrasenia\")";
Debug.ShouldStop(134217728);
_ini.setField ("_contrasenia" /*RemoteObject*/ ,BA.ObjectToString(_datos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("contrasenia"))))));
 BA.debugLineNum = 61;BA.debugLine="Return ini";
Debug.ShouldStop(268435456);
if (true) return _ini;
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _read_one(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("Read_One (inicios) ","inicios",5,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("read_one")) { return __ref.runUserSub(false, "inicios","read_one", __ref, _id);}
ResumableSub_Read_One rsub = new ResumableSub_Read_One(null,__ref,_id);
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
public static class ResumableSub_Read_One extends BA.ResumableSub {
public ResumableSub_Read_One(b4a.example.inicios parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.inicios parent;
RemoteObject _id;
RemoteObject _response = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _datos = RemoteObject.declareNull("b4a.example.inicio");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Read_One (inicios) ","inicios",5,__ref.getField(false, "ba"),__ref,40);
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
Debug.locals.put("Id", _id);
 BA.debugLineNum = 42;BA.debugLine="api.Download( apiUrl & \"/\" & Id)";
Debug.ShouldStop(512);
__ref.getField(false,"_api" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)));
 BA.debugLineNum = 43;BA.debugLine="api.GetRequest.SetHeader(\"access-token\",\"eyJhbGci";
Debug.ShouldStop(1024);
__ref.getField(false,"_api" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("access-token")),(Object)(RemoteObject.createImmutable("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjaGVjayI6dHJ1ZSwiaWF0IjoxNjU3MzgxNzM3LCJleHAiOjE2NTc1NTQ1Mzd9.-3a8wuthLwDFZhOD7kZQn8kxX8u84GBDTvfwKSYnu3w")));
 BA.debugLineNum = 45;BA.debugLine="Wait For (api) JobDone( response As HttpJob)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "inicios", "read_one"), (__ref.getField(false,"_api" /*RemoteObject*/ )));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_response = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("response", _response);
;
 BA.debugLineNum = 46;BA.debugLine="Dim datos As inicio";
Debug.ShouldStop(8192);
_datos = RemoteObject.createNew ("b4a.example.inicio");Debug.locals.put("datos", _datos);
 BA.debugLineNum = 47;BA.debugLine="If response.Success Then";
Debug.ShouldStop(16384);
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
 BA.debugLineNum = 48;BA.debugLine="datos = DeserializarUno( response.GetString )";
Debug.ShouldStop(32768);
_datos = __ref.runClassMethod (b4a.example.inicios.class, "_deserializaruno" /*RemoteObject*/ ,(Object)(_response.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("datos", _datos);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 50;BA.debugLine="datos.Initialize";
Debug.ShouldStop(131072);
_datos.runClassMethod (b4a.example.inicio.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 53;BA.debugLine="Return datos";
Debug.ShouldStop(1048576);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_datos));return;};
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
}