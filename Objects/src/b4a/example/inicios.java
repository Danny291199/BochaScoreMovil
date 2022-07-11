package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class inicios extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.inicios");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.inicios.class).invoke(this, new Object[] {null});
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
public String  _class_globals(b4a.example.inicios __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="inicios";
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Private apiUrl 	As String = \"https://brochascore.";
_apiurl = "https://brochascore.herokuapp.com/campeonatos";
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="Private api		As HttpJob";
_api = new b4a.example.httpjob();
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _create(b4a.example.inicios __ref,String _username,String _contrasenia) throws Exception{
RDebugUtils.currentModule="inicios";
if (Debug.shouldDelegate(ba, "create", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "create", new Object[] {_username,_contrasenia}));}
ResumableSub_Create rsub = new ResumableSub_Create(this,__ref,_username,_contrasenia);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Create extends BA.ResumableSub {
public ResumableSub_Create(b4a.example.inicios parent,b4a.example.inicios __ref,String _username,String _contrasenia) {
this.parent = parent;
this.__ref = __ref;
this._username = _username;
this._contrasenia = _contrasenia;
this.__ref = parent;
}
b4a.example.inicios __ref;
b4a.example.inicios parent;
String _username;
String _contrasenia;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jsongen = null;
String _jsontxt = "";
b4a.example.httpjob _response = null;
b4a.example.inicio _datos = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="inicios";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="Dim jsonGen As JSONGenerator";
_jsongen = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="jsonGen.Initialize( CreateMap ( _ 		\"username\" :";
_jsongen.Initialize(parent.__c.createMap(new Object[] {(Object)("username"),(Object)(_username),(Object)("contrasenia"),(Object)(_contrasenia)}));
RDebugUtils.currentLine=1835017;
 //BA.debugLineNum = 1835017;BA.debugLine="Dim jsonTxt As String = jsonGen.ToString";
_jsontxt = _jsongen.ToString();
RDebugUtils.currentLine=1835018;
 //BA.debugLineNum = 1835018;BA.debugLine="Log(jsonTxt)";
parent.__c.LogImpl("61835018",_jsontxt,0);
RDebugUtils.currentLine=1835020;
 //BA.debugLineNum = 1835020;BA.debugLine="api.PostString( apiUrl, jsonTxt)";
__ref._api /*b4a.example.httpjob*/ ._poststring /*String*/ (null,__ref._apiurl /*String*/ ,_jsontxt);
RDebugUtils.currentLine=1835021;
 //BA.debugLineNum = 1835021;BA.debugLine="api.GetRequest.SetContentType(\"application/json\")";
__ref._api /*b4a.example.httpjob*/ ._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=1835024;
 //BA.debugLineNum = 1835024;BA.debugLine="Wait For (api) JobDone( response As HttpJob )";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "inicios", "create"), (Object)(__ref._api /*b4a.example.httpjob*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_response = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=1835026;
 //BA.debugLineNum = 1835026;BA.debugLine="Dim datos As inicio";
_datos = new b4a.example.inicio();
RDebugUtils.currentLine=1835027;
 //BA.debugLineNum = 1835027;BA.debugLine="If response.Success Then";
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
RDebugUtils.currentLine=1835028;
 //BA.debugLineNum = 1835028;BA.debugLine="Log(response.GetString)";
parent.__c.LogImpl("61835028",_response._getstring /*String*/ (null),0);
RDebugUtils.currentLine=1835029;
 //BA.debugLineNum = 1835029;BA.debugLine="datos = DeserializarUno( response.GetString )";
_datos = __ref._deserializaruno /*b4a.example.inicio*/ (null,_response._getstring /*String*/ (null));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=1835031;
 //BA.debugLineNum = 1835031;BA.debugLine="datos.Initialize";
_datos._initialize /*String*/ (null,ba);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=1835034;
 //BA.debugLineNum = 1835034;BA.debugLine="Return datos";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_datos));return;};
RDebugUtils.currentLine=1835035;
 //BA.debugLineNum = 1835035;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public b4a.example.inicio  _deserializaruno(b4a.example.inicios __ref,String _jsontxt) throws Exception{
__ref = this;
RDebugUtils.currentModule="inicios";
if (Debug.shouldDelegate(ba, "deserializaruno", false))
	 {return ((b4a.example.inicio) Debug.delegate(ba, "deserializaruno", new Object[] {_jsontxt}));}
anywheresoftware.b4a.objects.collections.JSONParser _jsonparser = null;
anywheresoftware.b4a.objects.collections.Map _datos = null;
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Private Sub DeserializarUno( jsonTxt As String) As";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="Dim jsonParser As JSONParser";
_jsonparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="jsonParser.Initialize(jsonTxt)";
_jsonparser.Initialize(_jsontxt);
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="Dim datos As Map = jsonParser.NextObject";
_datos = new anywheresoftware.b4a.objects.collections.Map();
_datos = _jsonparser.NextObject();
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="Log(datos)";
__c.LogImpl("62031621",BA.ObjectToString(_datos),0);
RDebugUtils.currentLine=2031622;
 //BA.debugLineNum = 2031622;BA.debugLine="Return MapToInicio(datos)";
if (true) return __ref._maptoinicio /*b4a.example.inicio*/ (null,_datos);
RDebugUtils.currentLine=2031623;
 //BA.debugLineNum = 2031623;BA.debugLine="End Sub";
return null;
}
public b4a.example.inicio  _maptoinicio(b4a.example.inicios __ref,anywheresoftware.b4a.objects.collections.Map _datos) throws Exception{
__ref = this;
RDebugUtils.currentModule="inicios";
if (Debug.shouldDelegate(ba, "maptoinicio", false))
	 {return ((b4a.example.inicio) Debug.delegate(ba, "maptoinicio", new Object[] {_datos}));}
b4a.example.inicio _ini = null;
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Private Sub MapToInicio( datos As Map ) As inicio";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="Dim ini As inicio";
_ini = new b4a.example.inicio();
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="ini.Initialize";
_ini._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="ini.Username              = datos.Get(\"username\")";
_ini._username /*String*/  = BA.ObjectToString(_datos.Get((Object)("username")));
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="ini.Contrasenia		     = datos.Get(\"contrasenia\")";
_ini._contrasenia /*String*/  = BA.ObjectToString(_datos.Get((Object)("contrasenia")));
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="Return ini";
if (true) return _ini;
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.example.inicios __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="inicios";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="api.Initialize(\"\", Me)";
__ref._api /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",this);
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _read_one(b4a.example.inicios __ref,String _id) throws Exception{
RDebugUtils.currentModule="inicios";
if (Debug.shouldDelegate(ba, "read_one", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "read_one", new Object[] {_id}));}
ResumableSub_Read_One rsub = new ResumableSub_Read_One(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Read_One extends BA.ResumableSub {
public ResumableSub_Read_One(b4a.example.inicios parent,b4a.example.inicios __ref,String _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.inicios __ref;
b4a.example.inicios parent;
String _id;
b4a.example.httpjob _response = null;
b4a.example.inicio _datos = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="inicios";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="api.Download( apiUrl & \"/\" & Id)";
__ref._api /*b4a.example.httpjob*/ ._download /*String*/ (null,__ref._apiurl /*String*/ +"/"+_id);
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="api.GetRequest.SetHeader(\"access-token\",\"eyJhbGci";
__ref._api /*b4a.example.httpjob*/ ._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("access-token","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjaGVjayI6dHJ1ZSwiaWF0IjoxNjU3MzgxNzM3LCJleHAiOjE2NTc1NTQ1Mzd9.-3a8wuthLwDFZhOD7kZQn8kxX8u84GBDTvfwKSYnu3w");
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="Wait For (api) JobDone( response As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "inicios", "read_one"), (Object)(__ref._api /*b4a.example.httpjob*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_response = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="Dim datos As inicio";
_datos = new b4a.example.inicio();
RDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="If response.Success Then";
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
RDebugUtils.currentLine=1900552;
 //BA.debugLineNum = 1900552;BA.debugLine="datos = DeserializarUno( response.GetString )";
_datos = __ref._deserializaruno /*b4a.example.inicio*/ (null,_response._getstring /*String*/ (null));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=1900554;
 //BA.debugLineNum = 1900554;BA.debugLine="datos.Initialize";
_datos._initialize /*String*/ (null,ba);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=1900557;
 //BA.debugLineNum = 1900557;BA.debugLine="Return datos";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_datos));return;};
RDebugUtils.currentLine=1900558;
 //BA.debugLineNum = 1900558;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}