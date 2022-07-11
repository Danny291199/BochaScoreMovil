package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class campequipos_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private apiUrl 	As String = \"https://brochascore.";
campequipos._apiurl = BA.ObjectToString("https://brochascore.herokuapp.com/campeonatos");__ref.setField("_apiurl",campequipos._apiurl);
 //BA.debugLineNum = 3;BA.debugLine="Private apiUrlEquipos As String = \"https://brocha";
campequipos._apiurlequipos = BA.ObjectToString("https://brochascore.herokuapp.com/equiposCampeonato");__ref.setField("_apiurlequipos",campequipos._apiurlequipos);
 //BA.debugLineNum = 4;BA.debugLine="Private api		As HttpJob";
campequipos._api = RemoteObject.createNew ("b4a.example.httpjob");__ref.setField("_api",campequipos._api);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _deserializarlista(RemoteObject __ref,RemoteObject _jsontxt) throws Exception{
try {
		Debug.PushSubsStack("DeserializarLista (campequipos) ","campequipos",7,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("deserializarlista")) { return __ref.runUserSub(false, "campequipos","deserializarlista", __ref, _jsontxt);}
RemoteObject _list = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _jsonparser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _datos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _item = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("jsonTxt", _jsontxt);
 BA.debugLineNum = 77;BA.debugLine="Private Sub DeserializarLista( jsonTxt As String)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="Dim list 		As List";
Debug.ShouldStop(8192);
_list = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("list", _list);
 BA.debugLineNum = 79;BA.debugLine="Dim jsonParser	As JSONParser";
Debug.ShouldStop(16384);
_jsonparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jsonParser", _jsonparser);
 BA.debugLineNum = 81;BA.debugLine="list.Initialize";
Debug.ShouldStop(65536);
_list.runVoidMethod ("Initialize");
 BA.debugLineNum = 82;BA.debugLine="Log(jsonTxt)";
Debug.ShouldStop(131072);
campequipos.__c.runVoidMethod ("LogImpl","62949125",_jsontxt,0);
 BA.debugLineNum = 83;BA.debugLine="jsonParser.Initialize( jsonTxt )";
Debug.ShouldStop(262144);
_jsonparser.runVoidMethod ("Initialize",(Object)(_jsontxt));
 BA.debugLineNum = 85;BA.debugLine="Dim datos As List = jsonParser.NextArray";
Debug.ShouldStop(1048576);
_datos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_datos = _jsonparser.runMethod(false,"NextArray");Debug.locals.put("datos", _datos);Debug.locals.put("datos", _datos);
 BA.debugLineNum = 86;BA.debugLine="For Each item As Map In datos";
Debug.ShouldStop(2097152);
_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group7 = _datos;
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_item = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group7.runMethod(false,"Get",index7));Debug.locals.put("item", _item);
Debug.locals.put("item", _item);
 BA.debugLineNum = 87;BA.debugLine="list.Add( MapToEquipos( item ))";
Debug.ShouldStop(4194304);
_list.runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4a.example.campequipos.class, "_maptoequipos" /*RemoteObject*/ ,(Object)(_item)))));
 }
}Debug.locals.put("item", _item);
;
 BA.debugLineNum = 90;BA.debugLine="Return list";
Debug.ShouldStop(33554432);
if (true) return _list;
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _deserializaruno(RemoteObject __ref,RemoteObject _jsontxt) throws Exception{
try {
		Debug.PushSubsStack("DeserializarUno (campequipos) ","campequipos",7,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("deserializaruno")) { return __ref.runUserSub(false, "campequipos","deserializaruno", __ref, _jsontxt);}
RemoteObject _jsonparser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _datos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("jsonTxt", _jsontxt);
 BA.debugLineNum = 68;BA.debugLine="Private Sub DeserializarUno( jsonTxt As String) As";
Debug.ShouldStop(8);
 BA.debugLineNum = 69;BA.debugLine="Dim jsonParser As JSONParser";
Debug.ShouldStop(16);
_jsonparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jsonParser", _jsonparser);
 BA.debugLineNum = 70;BA.debugLine="jsonParser.Initialize(jsonTxt)";
Debug.ShouldStop(32);
_jsonparser.runVoidMethod ("Initialize",(Object)(_jsontxt));
 BA.debugLineNum = 72;BA.debugLine="Dim datos As Map = jsonParser.NextObject";
Debug.ShouldStop(128);
_datos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_datos = _jsonparser.runMethod(false,"NextObject");Debug.locals.put("datos", _datos);Debug.locals.put("datos", _datos);
 BA.debugLineNum = 73;BA.debugLine="Log(datos)";
Debug.ShouldStop(256);
campequipos.__c.runVoidMethod ("LogImpl","62883589",BA.ObjectToString(_datos),0);
 BA.debugLineNum = 74;BA.debugLine="Return MapToCampeonato(datos)";
Debug.ShouldStop(512);
if (true) return __ref.runClassMethod (b4a.example.campequipos.class, "_maptocampeonato" /*RemoteObject*/ ,(Object)(_datos));
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("Initialize (campequipos) ","campequipos",7,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "campequipos","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="api.Initialize(\"\", Me)";
Debug.ShouldStop(512);
__ref.getField(false,"_api" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
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
public static RemoteObject  _maptocampeonato(RemoteObject __ref,RemoteObject _datos) throws Exception{
try {
		Debug.PushSubsStack("MapToCampeonato (campequipos) ","campequipos",7,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("maptocampeonato")) { return __ref.runUserSub(false, "campequipos","maptocampeonato", __ref, _datos);}
RemoteObject _camp = RemoteObject.declareNull("b4a.example.campeonato");
Debug.locals.put("datos", _datos);
 BA.debugLineNum = 48;BA.debugLine="Private Sub MapToCampeonato( datos As Map ) As Cam";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="Dim camp As Campeonato";
Debug.ShouldStop(65536);
_camp = RemoteObject.createNew ("b4a.example.campeonato");Debug.locals.put("camp", _camp);
 BA.debugLineNum = 50;BA.debugLine="camp.Initialize";
Debug.ShouldStop(131072);
_camp.runClassMethod (b4a.example.campeonato.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 53;BA.debugLine="camp.Nombre              = datos.Get(\"nombre\")";
Debug.ShouldStop(1048576);
_camp.setField ("_nombre" /*RemoteObject*/ ,BA.ObjectToString(_datos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nombre"))))));
 BA.debugLineNum = 54;BA.debugLine="camp.Imagen              = datos.Get(\"imagen\")";
Debug.ShouldStop(2097152);
_camp.setField ("_imagen" /*RemoteObject*/ ,BA.ObjectToString(_datos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("imagen"))))));
 BA.debugLineNum = 55;BA.debugLine="Return camp";
Debug.ShouldStop(4194304);
if (true) return _camp;
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _maptoequipos(RemoteObject __ref,RemoteObject _datos) throws Exception{
try {
		Debug.PushSubsStack("MapToEquipos (campequipos) ","campequipos",7,__ref.getField(false, "ba"),__ref,58);
if (RapidSub.canDelegate("maptoequipos")) { return __ref.runUserSub(false, "campequipos","maptoequipos", __ref, _datos);}
RemoteObject _eq = RemoteObject.declareNull("b4a.example.equipo");
Debug.locals.put("datos", _datos);
 BA.debugLineNum = 58;BA.debugLine="Private Sub MapToEquipos( datos As Map ) As Equipo";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="Dim eq As Equipo";
Debug.ShouldStop(67108864);
_eq = RemoteObject.createNew ("b4a.example.equipo");Debug.locals.put("eq", _eq);
 BA.debugLineNum = 60;BA.debugLine="eq.Initialize";
Debug.ShouldStop(134217728);
_eq.runClassMethod (b4a.example.equipo.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 62;BA.debugLine="eq.Id                   = datos.Get(\"id\")";
Debug.ShouldStop(536870912);
_eq.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _datos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 63;BA.debugLine="eq.Nombre              = datos.Get(\"nombre\")";
Debug.ShouldStop(1073741824);
_eq.setField ("_nombre" /*RemoteObject*/ ,BA.ObjectToString(_datos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nombre"))))));
 BA.debugLineNum = 64;BA.debugLine="eq.Imagen              = datos.Get(\"imagen\")";
Debug.ShouldStop(-2147483648);
_eq.setField ("_imagen" /*RemoteObject*/ ,BA.ObjectToString(_datos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("imagen"))))));
 BA.debugLineNum = 65;BA.debugLine="Return eq";
Debug.ShouldStop(1);
if (true) return _eq;
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _read_all_equipos_by_campeonato(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("Read_All_Equipos_By_Campeonato (campequipos) ","campequipos",7,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("read_all_equipos_by_campeonato")) { return __ref.runUserSub(false, "campequipos","read_all_equipos_by_campeonato", __ref, _id);}
ResumableSub_Read_All_Equipos_By_Campeonato rsub = new ResumableSub_Read_All_Equipos_By_Campeonato(null,__ref,_id);
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
public static class ResumableSub_Read_All_Equipos_By_Campeonato extends BA.ResumableSub {
public ResumableSub_Read_All_Equipos_By_Campeonato(b4a.example.campequipos parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.campequipos parent;
RemoteObject _id;
RemoteObject _response = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _datos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Read_All_Equipos_By_Campeonato (campequipos) ","campequipos",7,__ref.getField(false, "ba"),__ref,30);
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
 BA.debugLineNum = 33;BA.debugLine="api.Download( apiUrlEquipos & \"/\" & Id)";
Debug.ShouldStop(1);
__ref.getField(false,"_api" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurlequipos" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)));
 BA.debugLineNum = 34;BA.debugLine="api.GetRequest.SetHeader(\"access-token\", Main.tok";
Debug.ShouldStop(2);
__ref.getField(false,"_api" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("access-token")),(Object)(parent._main._token /*RemoteObject*/ ));
 BA.debugLineNum = 36;BA.debugLine="Wait For (api) JobDone( response As HttpJob)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "campequipos", "read_all_equipos_by_campeonato"), (__ref.getField(false,"_api" /*RemoteObject*/ )));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_response = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("response", _response);
;
 BA.debugLineNum = 38;BA.debugLine="Dim datos As List";
Debug.ShouldStop(32);
_datos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("datos", _datos);
 BA.debugLineNum = 39;BA.debugLine="If response.Success Then";
Debug.ShouldStop(64);
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
 BA.debugLineNum = 40;BA.debugLine="datos = DeserializarLista( response.GetString )";
Debug.ShouldStop(128);
_datos = __ref.runClassMethod (b4a.example.campequipos.class, "_deserializarlista" /*RemoteObject*/ ,(Object)(_response.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("datos", _datos);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 42;BA.debugLine="datos.Initialize";
Debug.ShouldStop(512);
_datos.runVoidMethod ("Initialize");
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 45;BA.debugLine="Return datos";
Debug.ShouldStop(4096);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_datos));return;};
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
public static RemoteObject  _read_one(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("Read_One (campequipos) ","campequipos",7,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("read_one")) { return __ref.runUserSub(false, "campequipos","read_one", __ref, _id);}
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
public ResumableSub_Read_One(b4a.example.campequipos parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.campequipos parent;
RemoteObject _id;
RemoteObject _response = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _datos = RemoteObject.declareNull("b4a.example.campeonato");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Read_One (campequipos) ","campequipos",7,__ref.getField(false, "ba"),__ref,14);
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
 BA.debugLineNum = 16;BA.debugLine="api.Download( apiUrl & \"/\" & Id)";
Debug.ShouldStop(32768);
__ref.getField(false,"_api" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)));
 BA.debugLineNum = 17;BA.debugLine="api.GetRequest.SetHeader(\"access-token\", Main.tok";
Debug.ShouldStop(65536);
__ref.getField(false,"_api" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("access-token")),(Object)(parent._main._token /*RemoteObject*/ ));
 BA.debugLineNum = 19;BA.debugLine="Wait For (api) JobDone( response As HttpJob)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "campequipos", "read_one"), (__ref.getField(false,"_api" /*RemoteObject*/ )));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_response = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("response", _response);
;
 BA.debugLineNum = 20;BA.debugLine="Dim datos As Campeonato";
Debug.ShouldStop(524288);
_datos = RemoteObject.createNew ("b4a.example.campeonato");Debug.locals.put("datos", _datos);
 BA.debugLineNum = 21;BA.debugLine="If response.Success Then";
Debug.ShouldStop(1048576);
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
 BA.debugLineNum = 22;BA.debugLine="datos = DeserializarUno( response.GetString )";
Debug.ShouldStop(2097152);
_datos = __ref.runClassMethod (b4a.example.campequipos.class, "_deserializaruno" /*RemoteObject*/ ,(Object)(_response.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("datos", _datos);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 24;BA.debugLine="datos.Initialize";
Debug.ShouldStop(8388608);
_datos.runClassMethod (b4a.example.campeonato.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 27;BA.debugLine="Return datos";
Debug.ShouldStop(67108864);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_datos));return;};
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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