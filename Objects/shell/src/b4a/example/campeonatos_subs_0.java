package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class campeonatos_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private apiUrl 	As String = \"https://brochascore.";
campeonatos._apiurl = BA.ObjectToString("https://brochascore.herokuapp.com/campeonatos");__ref.setField("_apiurl",campeonatos._apiurl);
 //BA.debugLineNum = 3;BA.debugLine="Private api		As HttpJob";
campeonatos._api = RemoteObject.createNew ("b4a.example.httpjob");__ref.setField("_api",campeonatos._api);
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _create(RemoteObject __ref,RemoteObject _nombre,RemoteObject _estado,RemoteObject _fecha_inicio,RemoteObject _imagen,RemoteObject _delete_status) throws Exception{
try {
		Debug.PushSubsStack("Create (campeonatos) ","campeonatos",2,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("create")) { return __ref.runUserSub(false, "campeonatos","create", __ref, _nombre, _estado, _fecha_inicio, _imagen, _delete_status);}
ResumableSub_Create rsub = new ResumableSub_Create(null,__ref,_nombre,_estado,_fecha_inicio,_imagen,_delete_status);
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
public ResumableSub_Create(b4a.example.campeonatos parent,RemoteObject __ref,RemoteObject _nombre,RemoteObject _estado,RemoteObject _fecha_inicio,RemoteObject _imagen,RemoteObject _delete_status) {
this.parent = parent;
this.__ref = __ref;
this._nombre = _nombre;
this._estado = _estado;
this._fecha_inicio = _fecha_inicio;
this._imagen = _imagen;
this._delete_status = _delete_status;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.campeonatos parent;
RemoteObject _nombre;
RemoteObject _estado;
RemoteObject _fecha_inicio;
RemoteObject _imagen;
RemoteObject _delete_status;
RemoteObject _jsongen = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _jsontxt = RemoteObject.createImmutable("");
RemoteObject _response = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _datos = RemoteObject.declareNull("b4a.example.campeonato");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Create (campeonatos) ","campeonatos",2,__ref.getField(false, "ba"),__ref,13);
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
Debug.locals.put("Nombre", _nombre);
Debug.locals.put("Estado", _estado);
Debug.locals.put("Fecha_Inicio", _fecha_inicio);
Debug.locals.put("Imagen", _imagen);
Debug.locals.put("Delete_Status", _delete_status);
 BA.debugLineNum = 16;BA.debugLine="Dim jsonGen As JSONGenerator";
Debug.ShouldStop(32768);
_jsongen = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("jsonGen", _jsongen);
 BA.debugLineNum = 17;BA.debugLine="jsonGen.Initialize( CreateMap ( _ 		\"nombre\" : No";
Debug.ShouldStop(65536);
_jsongen.runVoidMethod ("Initialize",(Object)(parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("nombre")),(_nombre),RemoteObject.createImmutable(("estado")),(_estado),RemoteObject.createImmutable(("fecha_inicio")),(_fecha_inicio),RemoteObject.createImmutable(("imagen")),(_imagen),RemoteObject.createImmutable(("delete_status")),(_delete_status)}))));
 BA.debugLineNum = 25;BA.debugLine="Dim jsonTxt As String = jsonGen.ToString";
Debug.ShouldStop(16777216);
_jsontxt = _jsongen.runMethod(true,"ToString");Debug.locals.put("jsonTxt", _jsontxt);Debug.locals.put("jsonTxt", _jsontxt);
 BA.debugLineNum = 26;BA.debugLine="Log(jsonTxt)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","6917517",_jsontxt,0);
 BA.debugLineNum = 28;BA.debugLine="api.PostString( apiUrl, jsonTxt)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_api" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_apiurl" /*RemoteObject*/ )),(Object)(_jsontxt));
 BA.debugLineNum = 29;BA.debugLine="api.GetRequest.SetContentType(\"application/json\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_api" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 32;BA.debugLine="Wait For (api) JobDone( response As HttpJob )";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "campeonatos", "create"), (__ref.getField(false,"_api" /*RemoteObject*/ )));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_response = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("response", _response);
;
 BA.debugLineNum = 34;BA.debugLine="Dim datos As Campeonato";
Debug.ShouldStop(2);
_datos = RemoteObject.createNew ("b4a.example.campeonato");Debug.locals.put("datos", _datos);
 BA.debugLineNum = 35;BA.debugLine="If response.Success Then";
Debug.ShouldStop(4);
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
 BA.debugLineNum = 36;BA.debugLine="Log(response.GetString)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","6917527",_response.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 37;BA.debugLine="datos = DeserializarUno( response.GetString )";
Debug.ShouldStop(16);
_datos = __ref.runClassMethod (b4a.example.campeonatos.class, "_deserializaruno" /*RemoteObject*/ ,(Object)(_response.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("datos", _datos);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 39;BA.debugLine="datos.Initialize";
Debug.ShouldStop(64);
_datos.runClassMethod (b4a.example.campeonato.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 42;BA.debugLine="Return datos";
Debug.ShouldStop(512);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_datos));return;};
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
public static RemoteObject  _delete(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("Delete (campeonatos) ","campeonatos",2,__ref.getField(false, "ba"),__ref,110);
if (RapidSub.canDelegate("delete")) { return __ref.runUserSub(false, "campeonatos","delete", __ref, _id);}
ResumableSub_Delete rsub = new ResumableSub_Delete(null,__ref,_id);
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
public static class ResumableSub_Delete extends BA.ResumableSub {
public ResumableSub_Delete(b4a.example.campeonatos parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.campeonatos parent;
RemoteObject _id;
RemoteObject _respuesta = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Delete (campeonatos) ","campeonatos",2,__ref.getField(false, "ba"),__ref,110);
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
 BA.debugLineNum = 112;BA.debugLine="Log(Id)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("LogImpl","61179650",_id,0);
 BA.debugLineNum = 113;BA.debugLine="api.Delete(apiUrl & \"/\" & Id)";
Debug.ShouldStop(65536);
__ref.getField(false,"_api" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_delete" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)));
 BA.debugLineNum = 116;BA.debugLine="Wait For (api) JobDone( respuesta As HttpJob)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "campeonatos", "delete"), (__ref.getField(false,"_api" /*RemoteObject*/ )));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_respuesta = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("respuesta", _respuesta);
;
 BA.debugLineNum = 117;BA.debugLine="If respuesta.Success Then";
Debug.ShouldStop(1048576);
if (true) break;

case 1:
//if
this.state = 6;
if (_respuesta.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 118;BA.debugLine="Return 0";
Debug.ShouldStop(2097152);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable((0)));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 120;BA.debugLine="Return respuesta.Response.StatusCode";
Debug.ShouldStop(8388608);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_respuesta.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode")));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 122;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
public static RemoteObject  _deserializarlista(RemoteObject __ref,RemoteObject _jsontxt) throws Exception{
try {
		Debug.PushSubsStack("DeserializarLista (campeonatos) ","campeonatos",2,__ref.getField(false, "ba"),__ref,148);
if (RapidSub.canDelegate("deserializarlista")) { return __ref.runUserSub(false, "campeonatos","deserializarlista", __ref, _jsontxt);}
RemoteObject _list = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _jsonparser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _datos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _item = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("jsonTxt", _jsontxt);
 BA.debugLineNum = 148;BA.debugLine="Private Sub DeserializarLista( jsonTxt As String)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 149;BA.debugLine="Dim list 		As List";
Debug.ShouldStop(1048576);
_list = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("list", _list);
 BA.debugLineNum = 150;BA.debugLine="Dim jsonParser	As JSONParser";
Debug.ShouldStop(2097152);
_jsonparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jsonParser", _jsonparser);
 BA.debugLineNum = 152;BA.debugLine="list.Initialize";
Debug.ShouldStop(8388608);
_list.runVoidMethod ("Initialize");
 BA.debugLineNum = 153;BA.debugLine="jsonParser.Initialize( jsonTxt )";
Debug.ShouldStop(16777216);
_jsonparser.runVoidMethod ("Initialize",(Object)(_jsontxt));
 BA.debugLineNum = 155;BA.debugLine="Dim datos As List = jsonParser.NextArray";
Debug.ShouldStop(67108864);
_datos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_datos = _jsonparser.runMethod(false,"NextArray");Debug.locals.put("datos", _datos);Debug.locals.put("datos", _datos);
 BA.debugLineNum = 156;BA.debugLine="For Each item As Map In datos";
Debug.ShouldStop(134217728);
_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group6 = _datos;
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_item = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group6.runMethod(false,"Get",index6));Debug.locals.put("item", _item);
Debug.locals.put("item", _item);
 BA.debugLineNum = 157;BA.debugLine="list.Add( MapToCampeonato( item ))";
Debug.ShouldStop(268435456);
_list.runVoidMethod ("Add",(Object)((__ref.runClassMethod (b4a.example.campeonatos.class, "_maptocampeonato" /*RemoteObject*/ ,(Object)(_item)))));
 }
}Debug.locals.put("item", _item);
;
 BA.debugLineNum = 160;BA.debugLine="Return list";
Debug.ShouldStop(-2147483648);
if (true) return _list;
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("DeserializarUno (campeonatos) ","campeonatos",2,__ref.getField(false, "ba"),__ref,138);
if (RapidSub.canDelegate("deserializaruno")) { return __ref.runUserSub(false, "campeonatos","deserializaruno", __ref, _jsontxt);}
RemoteObject _jsonparser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _datos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("jsonTxt", _jsontxt);
 BA.debugLineNum = 138;BA.debugLine="Private Sub DeserializarUno( jsonTxt As String) As";
Debug.ShouldStop(512);
 BA.debugLineNum = 139;BA.debugLine="Dim jsonParser As JSONParser";
Debug.ShouldStop(1024);
_jsonparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jsonParser", _jsonparser);
 BA.debugLineNum = 140;BA.debugLine="jsonParser.Initialize(jsonTxt)";
Debug.ShouldStop(2048);
_jsonparser.runVoidMethod ("Initialize",(Object)(_jsontxt));
 BA.debugLineNum = 142;BA.debugLine="Dim datos As Map = jsonParser.NextObject";
Debug.ShouldStop(8192);
_datos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_datos = _jsonparser.runMethod(false,"NextObject");Debug.locals.put("datos", _datos);Debug.locals.put("datos", _datos);
 BA.debugLineNum = 143;BA.debugLine="Log(datos)";
Debug.ShouldStop(16384);
campeonatos.__c.runVoidMethod ("LogImpl","61310725",BA.ObjectToString(_datos),0);
 BA.debugLineNum = 144;BA.debugLine="Return MapToCampeonato(datos)";
Debug.ShouldStop(32768);
if (true) return __ref.runClassMethod (b4a.example.campeonatos.class, "_maptocampeonato" /*RemoteObject*/ ,(Object)(_datos));
 BA.debugLineNum = 145;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("Initialize (campeonatos) ","campeonatos",2,__ref.getField(false, "ba"),__ref,7);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "campeonatos","initialize", __ref, _ba);}
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
public static RemoteObject  _maptocampeonato(RemoteObject __ref,RemoteObject _datos) throws Exception{
try {
		Debug.PushSubsStack("MapToCampeonato (campeonatos) ","campeonatos",2,__ref.getField(false, "ba"),__ref,124);
if (RapidSub.canDelegate("maptocampeonato")) { return __ref.runUserSub(false, "campeonatos","maptocampeonato", __ref, _datos);}
RemoteObject _camp = RemoteObject.declareNull("b4a.example.campeonato");
Debug.locals.put("datos", _datos);
 BA.debugLineNum = 124;BA.debugLine="Private Sub MapToCampeonato( datos As Map ) As Cam";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 125;BA.debugLine="Dim camp As Campeonato";
Debug.ShouldStop(268435456);
_camp = RemoteObject.createNew ("b4a.example.campeonato");Debug.locals.put("camp", _camp);
 BA.debugLineNum = 126;BA.debugLine="camp.Initialize";
Debug.ShouldStop(536870912);
_camp.runClassMethod (b4a.example.campeonato.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 129;BA.debugLine="camp.Nombre              = datos.Get(\"nombre\")";
Debug.ShouldStop(1);
_camp.setField ("_nombre" /*RemoteObject*/ ,BA.ObjectToString(_datos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nombre"))))));
 BA.debugLineNum = 130;BA.debugLine="camp.Estado 		     = datos.Get(\"estado\")";
Debug.ShouldStop(2);
_camp.setField ("_estado" /*RemoteObject*/ ,BA.numberCast(int.class, _datos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("estado"))))));
 BA.debugLineNum = 131;BA.debugLine="camp.Fecha_Inicio        = datos.Get(\"fecha_inici";
Debug.ShouldStop(4);
_camp.setField ("_fecha_inicio" /*RemoteObject*/ ,BA.ObjectToString(_datos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fecha_inicio"))))));
 BA.debugLineNum = 132;BA.debugLine="camp.Imagen       		 = datos.Get(\"imagen\")";
Debug.ShouldStop(8);
_camp.setField ("_imagen" /*RemoteObject*/ ,BA.ObjectToString(_datos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("imagen"))))));
 BA.debugLineNum = 133;BA.debugLine="camp.Delete_Status       = datos.Get(\"delete_stat";
Debug.ShouldStop(16);
_camp.setField ("_delete_status" /*RemoteObject*/ ,BA.numberCast(int.class, _datos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("delete_status"))))));
 BA.debugLineNum = 135;BA.debugLine="Return camp";
Debug.ShouldStop(64);
if (true) return _camp;
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _read_all(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Read_All (campeonatos) ","campeonatos",2,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("read_all")) { return __ref.runUserSub(false, "campeonatos","read_all", __ref);}
ResumableSub_Read_All rsub = new ResumableSub_Read_All(null,__ref);
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
public static class ResumableSub_Read_All extends BA.ResumableSub {
public ResumableSub_Read_All(b4a.example.campeonatos parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.campeonatos parent;
RemoteObject _response = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _datos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Read_All (campeonatos) ","campeonatos",2,__ref.getField(false, "ba"),__ref,46);
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
 BA.debugLineNum = 49;BA.debugLine="api.Download(apiUrl)";
Debug.ShouldStop(65536);
__ref.getField(false,"_api" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_apiurl" /*RemoteObject*/ )));
 BA.debugLineNum = 52;BA.debugLine="Wait For (api) JobDone( response As HttpJob)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "campeonatos", "read_all"), (__ref.getField(false,"_api" /*RemoteObject*/ )));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_response = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("response", _response);
;
 BA.debugLineNum = 54;BA.debugLine="Dim datos As List";
Debug.ShouldStop(2097152);
_datos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("datos", _datos);
 BA.debugLineNum = 55;BA.debugLine="If response.Success Then";
Debug.ShouldStop(4194304);
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
 BA.debugLineNum = 56;BA.debugLine="datos = DeserializarLista( response.GetString )";
Debug.ShouldStop(8388608);
_datos = __ref.runClassMethod (b4a.example.campeonatos.class, "_deserializarlista" /*RemoteObject*/ ,(Object)(_response.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("datos", _datos);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 58;BA.debugLine="datos.Initialize";
Debug.ShouldStop(33554432);
_datos.runVoidMethod ("Initialize");
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 61;BA.debugLine="Return datos";
Debug.ShouldStop(268435456);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_datos));return;};
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
public static RemoteObject  _read_one(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("Read_One (campeonatos) ","campeonatos",2,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("read_one")) { return __ref.runUserSub(false, "campeonatos","read_one", __ref, _id);}
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
public ResumableSub_Read_One(b4a.example.campeonatos parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.campeonatos parent;
RemoteObject _id;
RemoteObject _response = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _datos = RemoteObject.declareNull("b4a.example.campeonato");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Read_One (campeonatos) ","campeonatos",2,__ref.getField(false, "ba"),__ref,65);
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
 BA.debugLineNum = 67;BA.debugLine="api.Download( apiUrl & \"/\" & Id)";
Debug.ShouldStop(4);
__ref.getField(false,"_api" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)));
 BA.debugLineNum = 70;BA.debugLine="Wait For (api) JobDone( response As HttpJob)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "campeonatos", "read_one"), (__ref.getField(false,"_api" /*RemoteObject*/ )));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_response = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("response", _response);
;
 BA.debugLineNum = 71;BA.debugLine="Dim datos As Campeonato";
Debug.ShouldStop(64);
_datos = RemoteObject.createNew ("b4a.example.campeonato");Debug.locals.put("datos", _datos);
 BA.debugLineNum = 72;BA.debugLine="If response.Success Then";
Debug.ShouldStop(128);
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
 BA.debugLineNum = 73;BA.debugLine="datos = DeserializarUno( response.GetString )";
Debug.ShouldStop(256);
_datos = __ref.runClassMethod (b4a.example.campeonatos.class, "_deserializaruno" /*RemoteObject*/ ,(Object)(_response.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));Debug.locals.put("datos", _datos);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 75;BA.debugLine="datos.Initialize";
Debug.ShouldStop(1024);
_datos.runClassMethod (b4a.example.campeonato.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 78;BA.debugLine="Return datos";
Debug.ShouldStop(8192);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_datos));return;};
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
public static RemoteObject  _update(RemoteObject __ref,RemoteObject _id,RemoteObject _nombre,RemoteObject _estado,RemoteObject _fecha_inicio,RemoteObject _imagen,RemoteObject _delete_status) throws Exception{
try {
		Debug.PushSubsStack("Update (campeonatos) ","campeonatos",2,__ref.getField(false, "ba"),__ref,82);
if (RapidSub.canDelegate("update")) { return __ref.runUserSub(false, "campeonatos","update", __ref, _id, _nombre, _estado, _fecha_inicio, _imagen, _delete_status);}
ResumableSub_Update rsub = new ResumableSub_Update(null,__ref,_id,_nombre,_estado,_fecha_inicio,_imagen,_delete_status);
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
public static class ResumableSub_Update extends BA.ResumableSub {
public ResumableSub_Update(b4a.example.campeonatos parent,RemoteObject __ref,RemoteObject _id,RemoteObject _nombre,RemoteObject _estado,RemoteObject _fecha_inicio,RemoteObject _imagen,RemoteObject _delete_status) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre = _nombre;
this._estado = _estado;
this._fecha_inicio = _fecha_inicio;
this._imagen = _imagen;
this._delete_status = _delete_status;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.campeonatos parent;
RemoteObject _id;
RemoteObject _nombre;
RemoteObject _estado;
RemoteObject _fecha_inicio;
RemoteObject _imagen;
RemoteObject _delete_status;
RemoteObject _jsongen = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _jsontxt = RemoteObject.createImmutable("");
RemoteObject _response = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Update (campeonatos) ","campeonatos",2,__ref.getField(false, "ba"),__ref,82);
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
Debug.locals.put("Nombre", _nombre);
Debug.locals.put("Estado", _estado);
Debug.locals.put("Fecha_Inicio", _fecha_inicio);
Debug.locals.put("Imagen", _imagen);
Debug.locals.put("Delete_Status", _delete_status);
 BA.debugLineNum = 84;BA.debugLine="Dim jsonGen As JSONGenerator";
Debug.ShouldStop(524288);
_jsongen = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("jsonGen", _jsongen);
 BA.debugLineNum = 85;BA.debugLine="jsonGen.Initialize( CreateMap ( _ 		\"id\" : Id, _";
Debug.ShouldStop(1048576);
_jsongen.runVoidMethod ("Initialize",(Object)(parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("id")),(_id),RemoteObject.createImmutable(("nombre")),(_nombre),RemoteObject.createImmutable(("estado")),(_estado),RemoteObject.createImmutable(("fecha_inicio")),(_fecha_inicio),RemoteObject.createImmutable(("imagen")),(_imagen),RemoteObject.createImmutable(("delete_status")),(_delete_status)}))));
 BA.debugLineNum = 94;BA.debugLine="Dim jsonTxt As String = jsonGen.ToString";
Debug.ShouldStop(536870912);
_jsontxt = _jsongen.runMethod(true,"ToString");Debug.locals.put("jsonTxt", _jsontxt);Debug.locals.put("jsonTxt", _jsontxt);
 BA.debugLineNum = 97;BA.debugLine="api.PutString( apiUrl, jsonTxt)";
Debug.ShouldStop(1);
__ref.getField(false,"_api" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_putstring" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_apiurl" /*RemoteObject*/ )),(Object)(_jsontxt));
 BA.debugLineNum = 98;BA.debugLine="api.GetRequest.SetContentType(\"application/json\")";
Debug.ShouldStop(2);
__ref.getField(false,"_api" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 101;BA.debugLine="Wait For (api) JobDone( response As HttpJob)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "campeonatos", "update"), (__ref.getField(false,"_api" /*RemoteObject*/ )));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_response = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("response", _response);
;
 BA.debugLineNum = 102;BA.debugLine="If response.Success Then";
Debug.ShouldStop(32);
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
 BA.debugLineNum = 103;BA.debugLine="Return 0";
Debug.ShouldStop(64);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable((0)));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 105;BA.debugLine="Return response.Response.StatusCode";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_response.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode")));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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