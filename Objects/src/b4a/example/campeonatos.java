package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class campeonatos extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.campeonatos");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.campeonatos.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public String _apiurl = "";
public b4a.example.httpjob _api = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.campeonatosequipos _campeonatosequipos = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _class_globals(b4a.example.campeonatos __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="campeonatos";
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Private apiUrl 	As String = \"https://brochascore.";
_apiurl = "https://brochascore.herokuapp.com/campeonatos";
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="Private api		As HttpJob";
_api = new b4a.example.httpjob();
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _create(b4a.example.campeonatos __ref,String _nombre,int _estado,String _fecha_inicio,String _imagen,int _delete_status) throws Exception{
RDebugUtils.currentModule="campeonatos";
if (Debug.shouldDelegate(ba, "create", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "create", new Object[] {_nombre,_estado,_fecha_inicio,_imagen,_delete_status}));}
ResumableSub_Create rsub = new ResumableSub_Create(this,__ref,_nombre,_estado,_fecha_inicio,_imagen,_delete_status);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Create extends BA.ResumableSub {
public ResumableSub_Create(b4a.example.campeonatos parent,b4a.example.campeonatos __ref,String _nombre,int _estado,String _fecha_inicio,String _imagen,int _delete_status) {
this.parent = parent;
this.__ref = __ref;
this._nombre = _nombre;
this._estado = _estado;
this._fecha_inicio = _fecha_inicio;
this._imagen = _imagen;
this._delete_status = _delete_status;
this.__ref = parent;
}
b4a.example.campeonatos __ref;
b4a.example.campeonatos parent;
String _nombre;
int _estado;
String _fecha_inicio;
String _imagen;
int _delete_status;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jsongen = null;
String _jsontxt = "";
b4a.example.httpjob _response = null;
b4a.example.campeonato _datos = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="campeonatos";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="Dim jsonGen As JSONGenerator";
_jsongen = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="jsonGen.Initialize( CreateMap ( _ 		\"nombre\" : No";
_jsongen.Initialize(parent.__c.createMap(new Object[] {(Object)("nombre"),(Object)(_nombre),(Object)("estado"),(Object)(_estado),(Object)("fecha_inicio"),(Object)(_fecha_inicio),(Object)("imagen"),(Object)(_imagen),(Object)("delete_status"),(Object)(_delete_status)}));
RDebugUtils.currentLine=1441804;
 //BA.debugLineNum = 1441804;BA.debugLine="Dim jsonTxt As String = jsonGen.ToString";
_jsontxt = _jsongen.ToString();
RDebugUtils.currentLine=1441805;
 //BA.debugLineNum = 1441805;BA.debugLine="Log(jsonTxt)";
parent.__c.LogImpl("41441805",_jsontxt,0);
RDebugUtils.currentLine=1441807;
 //BA.debugLineNum = 1441807;BA.debugLine="api.PostString( apiUrl, jsonTxt)";
__ref._api /*b4a.example.httpjob*/ ._poststring /*String*/ (null,__ref._apiurl /*String*/ ,_jsontxt);
RDebugUtils.currentLine=1441808;
 //BA.debugLineNum = 1441808;BA.debugLine="api.GetRequest.SetContentType(\"application/json\")";
__ref._api /*b4a.example.httpjob*/ ._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=1441811;
 //BA.debugLineNum = 1441811;BA.debugLine="Wait For (api) JobDone( response As HttpJob )";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "campeonatos", "create"), (Object)(__ref._api /*b4a.example.httpjob*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_response = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=1441813;
 //BA.debugLineNum = 1441813;BA.debugLine="Dim datos As Campeonato";
_datos = new b4a.example.campeonato();
RDebugUtils.currentLine=1441814;
 //BA.debugLineNum = 1441814;BA.debugLine="If response.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_response._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=1441815;
 //BA.debugLineNum = 1441815;BA.debugLine="Log(response.GetString)";
parent.__c.LogImpl("41441815",_response._getstring /*String*/ (null),0);
RDebugUtils.currentLine=1441816;
 //BA.debugLineNum = 1441816;BA.debugLine="datos = DeserializarUno( response.GetString )";
_datos = __ref._deserializaruno /*b4a.example.campeonato*/ (null,_response._getstring /*String*/ (null));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=1441818;
 //BA.debugLineNum = 1441818;BA.debugLine="datos.Initialize";
_datos._initialize /*String*/ (null,ba);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=1441821;
 //BA.debugLineNum = 1441821;BA.debugLine="Return datos";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_datos));return;};
RDebugUtils.currentLine=1441822;
 //BA.debugLineNum = 1441822;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public b4a.example.campeonato  _deserializaruno(b4a.example.campeonatos __ref,String _jsontxt) throws Exception{
__ref = this;
RDebugUtils.currentModule="campeonatos";
if (Debug.shouldDelegate(ba, "deserializaruno", false))
	 {return ((b4a.example.campeonato) Debug.delegate(ba, "deserializaruno", new Object[] {_jsontxt}));}
anywheresoftware.b4a.objects.collections.JSONParser _jsonparser = null;
anywheresoftware.b4a.objects.collections.Map _datos = null;
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Private Sub DeserializarUno( jsonTxt As String) As";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Dim jsonParser As JSONParser";
_jsonparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="jsonParser.Initialize(jsonTxt)";
_jsonparser.Initialize(_jsontxt);
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="Dim datos As Map = jsonParser.NextObject";
_datos = new anywheresoftware.b4a.objects.collections.Map();
_datos = _jsonparser.NextObject();
RDebugUtils.currentLine=1835013;
 //BA.debugLineNum = 1835013;BA.debugLine="Log(datos)";
__c.LogImpl("41835013",BA.ObjectToString(_datos),0);
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="Return MapToCampeonato(datos)";
if (true) return __ref._maptocampeonato /*b4a.example.campeonato*/ (null,_datos);
RDebugUtils.currentLine=1835015;
 //BA.debugLineNum = 1835015;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _delete(b4a.example.campeonatos __ref,String _id) throws Exception{
RDebugUtils.currentModule="campeonatos";
if (Debug.shouldDelegate(ba, "delete", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "delete", new Object[] {_id}));}
ResumableSub_Delete rsub = new ResumableSub_Delete(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Delete extends BA.ResumableSub {
public ResumableSub_Delete(b4a.example.campeonatos parent,b4a.example.campeonatos __ref,String _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.campeonatos __ref;
b4a.example.campeonatos parent;
String _id;
b4a.example.httpjob _respuesta = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="campeonatos";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="Log(Id)";
parent.__c.LogImpl("41703938",_id,0);
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="api.Delete(apiUrl & \"/\" & Id)";
__ref._api /*b4a.example.httpjob*/ ._delete /*String*/ (null,__ref._apiurl /*String*/ +"/"+_id);
RDebugUtils.currentLine=1703942;
 //BA.debugLineNum = 1703942;BA.debugLine="Wait For (api) JobDone( respuesta As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "campeonatos", "delete"), (Object)(__ref._api /*b4a.example.httpjob*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_respuesta = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=1703943;
 //BA.debugLineNum = 1703943;BA.debugLine="If respuesta.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_respuesta._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=1703944;
 //BA.debugLineNum = 1703944;BA.debugLine="Return 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(0));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=1703946;
 //BA.debugLineNum = 1703946;BA.debugLine="Return respuesta.Response.StatusCode";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_respuesta._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=1703948;
 //BA.debugLineNum = 1703948;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.objects.collections.List  _deserializarlista(b4a.example.campeonatos __ref,String _jsontxt) throws Exception{
__ref = this;
RDebugUtils.currentModule="campeonatos";
if (Debug.shouldDelegate(ba, "deserializarlista", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "deserializarlista", new Object[] {_jsontxt}));}
anywheresoftware.b4a.objects.collections.List _list = null;
anywheresoftware.b4a.objects.collections.JSONParser _jsonparser = null;
anywheresoftware.b4a.objects.collections.List _datos = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Private Sub DeserializarLista( jsonTxt As String)";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Dim list 		As List";
_list = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="Dim jsonParser	As JSONParser";
_jsonparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="list.Initialize";
_list.Initialize();
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="jsonParser.Initialize( jsonTxt )";
_jsonparser.Initialize(_jsontxt);
RDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="Dim datos As List = jsonParser.NextArray";
_datos = new anywheresoftware.b4a.objects.collections.List();
_datos = _jsonparser.NextArray();
RDebugUtils.currentLine=1900552;
 //BA.debugLineNum = 1900552;BA.debugLine="For Each item As Map In datos";
_item = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group6 = _datos;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group6.Get(index6)));
RDebugUtils.currentLine=1900553;
 //BA.debugLineNum = 1900553;BA.debugLine="list.Add( MapToCampeonato( item ))";
_list.Add((Object)(__ref._maptocampeonato /*b4a.example.campeonato*/ (null,_item)));
 }
};
RDebugUtils.currentLine=1900556;
 //BA.debugLineNum = 1900556;BA.debugLine="Return list";
if (true) return _list;
RDebugUtils.currentLine=1900557;
 //BA.debugLineNum = 1900557;BA.debugLine="End Sub";
return null;
}
public b4a.example.campeonato  _maptocampeonato(b4a.example.campeonatos __ref,anywheresoftware.b4a.objects.collections.Map _datos) throws Exception{
__ref = this;
RDebugUtils.currentModule="campeonatos";
if (Debug.shouldDelegate(ba, "maptocampeonato", false))
	 {return ((b4a.example.campeonato) Debug.delegate(ba, "maptocampeonato", new Object[] {_datos}));}
b4a.example.campeonato _camp = null;
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Private Sub MapToCampeonato( datos As Map ) As Cam";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Dim camp As Campeonato";
_camp = new b4a.example.campeonato();
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="camp.Initialize";
_camp._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="camp.Nombre              = datos.Get(\"nombre\")";
_camp._nombre /*String*/  = BA.ObjectToString(_datos.Get((Object)("nombre")));
RDebugUtils.currentLine=1769478;
 //BA.debugLineNum = 1769478;BA.debugLine="camp.Estado 		     = datos.Get(\"estado\")";
_camp._estado /*int*/  = (int)(BA.ObjectToNumber(_datos.Get((Object)("estado"))));
RDebugUtils.currentLine=1769479;
 //BA.debugLineNum = 1769479;BA.debugLine="camp.Fecha_Inicio        = datos.Get(\"fecha_inici";
_camp._fecha_inicio /*String*/  = BA.ObjectToString(_datos.Get((Object)("fecha_inicio")));
RDebugUtils.currentLine=1769480;
 //BA.debugLineNum = 1769480;BA.debugLine="camp.Imagen       		 = datos.Get(\"imagen\")";
_camp._imagen /*String*/  = BA.ObjectToString(_datos.Get((Object)("imagen")));
RDebugUtils.currentLine=1769481;
 //BA.debugLineNum = 1769481;BA.debugLine="camp.Delete_Status       = datos.Get(\"delete_stat";
_camp._delete_status /*int*/  = (int)(BA.ObjectToNumber(_datos.Get((Object)("delete_status"))));
RDebugUtils.currentLine=1769483;
 //BA.debugLineNum = 1769483;BA.debugLine="Return camp";
if (true) return _camp;
RDebugUtils.currentLine=1769484;
 //BA.debugLineNum = 1769484;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.example.campeonatos __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="campeonatos";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="api.Initialize(\"\", Me)";
__ref._api /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",this);
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _read_all(b4a.example.campeonatos __ref) throws Exception{
RDebugUtils.currentModule="campeonatos";
if (Debug.shouldDelegate(ba, "read_all", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "read_all", null));}
ResumableSub_Read_All rsub = new ResumableSub_Read_All(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Read_All extends BA.ResumableSub {
public ResumableSub_Read_All(b4a.example.campeonatos parent,b4a.example.campeonatos __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.campeonatos __ref;
b4a.example.campeonatos parent;
b4a.example.httpjob _response = null;
anywheresoftware.b4a.objects.collections.List _datos = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="campeonatos";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="api.Download(apiUrl)";
__ref._api /*b4a.example.httpjob*/ ._download /*String*/ (null,__ref._apiurl /*String*/ );
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="Wait For (api) JobDone( response As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "campeonatos", "read_all"), (Object)(__ref._api /*b4a.example.httpjob*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_response = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=1507336;
 //BA.debugLineNum = 1507336;BA.debugLine="Dim datos As List";
_datos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1507337;
 //BA.debugLineNum = 1507337;BA.debugLine="If response.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_response._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=1507338;
 //BA.debugLineNum = 1507338;BA.debugLine="datos = DeserializarLista( response.GetString )";
_datos = __ref._deserializarlista /*anywheresoftware.b4a.objects.collections.List*/ (null,_response._getstring /*String*/ (null));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=1507340;
 //BA.debugLineNum = 1507340;BA.debugLine="datos.Initialize";
_datos.Initialize();
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=1507343;
 //BA.debugLineNum = 1507343;BA.debugLine="Return datos";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_datos));return;};
RDebugUtils.currentLine=1507344;
 //BA.debugLineNum = 1507344;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _read_one(b4a.example.campeonatos __ref,String _id) throws Exception{
RDebugUtils.currentModule="campeonatos";
if (Debug.shouldDelegate(ba, "read_one", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "read_one", new Object[] {_id}));}
ResumableSub_Read_One rsub = new ResumableSub_Read_One(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Read_One extends BA.ResumableSub {
public ResumableSub_Read_One(b4a.example.campeonatos parent,b4a.example.campeonatos __ref,String _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.campeonatos __ref;
b4a.example.campeonatos parent;
String _id;
b4a.example.httpjob _response = null;
b4a.example.campeonato _datos = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="campeonatos";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="api.Download( apiUrl & \"/\" & Id)";
__ref._api /*b4a.example.httpjob*/ ._download /*String*/ (null,__ref._apiurl /*String*/ +"/"+_id);
RDebugUtils.currentLine=1572869;
 //BA.debugLineNum = 1572869;BA.debugLine="Wait For (api) JobDone( response As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "campeonatos", "read_one"), (Object)(__ref._api /*b4a.example.httpjob*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_response = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=1572870;
 //BA.debugLineNum = 1572870;BA.debugLine="Dim datos As Campeonato";
_datos = new b4a.example.campeonato();
RDebugUtils.currentLine=1572871;
 //BA.debugLineNum = 1572871;BA.debugLine="If response.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_response._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=1572872;
 //BA.debugLineNum = 1572872;BA.debugLine="datos = DeserializarUno( response.GetString )";
_datos = __ref._deserializaruno /*b4a.example.campeonato*/ (null,_response._getstring /*String*/ (null));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=1572874;
 //BA.debugLineNum = 1572874;BA.debugLine="datos.Initialize";
_datos._initialize /*String*/ (null,ba);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=1572877;
 //BA.debugLineNum = 1572877;BA.debugLine="Return datos";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_datos));return;};
RDebugUtils.currentLine=1572878;
 //BA.debugLineNum = 1572878;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _update(b4a.example.campeonatos __ref,int _id,String _nombre,int _estado,String _fecha_inicio,String _imagen,int _delete_status) throws Exception{
RDebugUtils.currentModule="campeonatos";
if (Debug.shouldDelegate(ba, "update", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "update", new Object[] {_id,_nombre,_estado,_fecha_inicio,_imagen,_delete_status}));}
ResumableSub_Update rsub = new ResumableSub_Update(this,__ref,_id,_nombre,_estado,_fecha_inicio,_imagen,_delete_status);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Update extends BA.ResumableSub {
public ResumableSub_Update(b4a.example.campeonatos parent,b4a.example.campeonatos __ref,int _id,String _nombre,int _estado,String _fecha_inicio,String _imagen,int _delete_status) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre = _nombre;
this._estado = _estado;
this._fecha_inicio = _fecha_inicio;
this._imagen = _imagen;
this._delete_status = _delete_status;
this.__ref = parent;
}
b4a.example.campeonatos __ref;
b4a.example.campeonatos parent;
int _id;
String _nombre;
int _estado;
String _fecha_inicio;
String _imagen;
int _delete_status;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jsongen = null;
String _jsontxt = "";
b4a.example.httpjob _response = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="campeonatos";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Dim jsonGen As JSONGenerator";
_jsongen = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="jsonGen.Initialize( CreateMap ( _ 		\"id\" : Id, _";
_jsongen.Initialize(parent.__c.createMap(new Object[] {(Object)("id"),(Object)(_id),(Object)("nombre"),(Object)(_nombre),(Object)("estado"),(Object)(_estado),(Object)("fecha_inicio"),(Object)(_fecha_inicio),(Object)("imagen"),(Object)(_imagen),(Object)("delete_status"),(Object)(_delete_status)}));
RDebugUtils.currentLine=1638412;
 //BA.debugLineNum = 1638412;BA.debugLine="Dim jsonTxt As String = jsonGen.ToString";
_jsontxt = _jsongen.ToString();
RDebugUtils.currentLine=1638415;
 //BA.debugLineNum = 1638415;BA.debugLine="api.PutString( apiUrl, jsonTxt)";
__ref._api /*b4a.example.httpjob*/ ._putstring /*String*/ (null,__ref._apiurl /*String*/ ,_jsontxt);
RDebugUtils.currentLine=1638416;
 //BA.debugLineNum = 1638416;BA.debugLine="api.GetRequest.SetContentType(\"application/json\")";
__ref._api /*b4a.example.httpjob*/ ._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=1638419;
 //BA.debugLineNum = 1638419;BA.debugLine="Wait For (api) JobDone( response As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "campeonatos", "update"), (Object)(__ref._api /*b4a.example.httpjob*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_response = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=1638420;
 //BA.debugLineNum = 1638420;BA.debugLine="If response.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_response._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=1638421;
 //BA.debugLineNum = 1638421;BA.debugLine="Return 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(0));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=1638423;
 //BA.debugLineNum = 1638423;BA.debugLine="Return response.Response.StatusCode";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_response._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=1638425;
 //BA.debugLineNum = 1638425;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}