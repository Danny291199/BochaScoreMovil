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
public String  _initialize(b4a.example.inicios __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="inicios";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="api.Initialize(\"\", Me)";
__ref._api /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",this);
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.inicios __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="inicios";
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Private apiUrl 	As String = \"https://brochascore.";
_apiurl = "https://brochascore.herokuapp.com/campeonatos";
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="Private api		As HttpJob";
_api = new b4a.example.httpjob();
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="Dim jsonGen As JSONGenerator";
_jsongen = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="jsonGen.Initialize( CreateMap ( _ 		\"username\" :";
_jsongen.Initialize(parent.__c.createMap(new Object[] {(Object)("username"),(Object)(_username),(Object)("contrasenia"),(Object)(_contrasenia)}));
RDebugUtils.currentLine=2359305;
 //BA.debugLineNum = 2359305;BA.debugLine="Dim jsonTxt As String = jsonGen.ToString";
_jsontxt = _jsongen.ToString();
RDebugUtils.currentLine=2359306;
 //BA.debugLineNum = 2359306;BA.debugLine="Log(jsonTxt)";
parent.__c.LogImpl("42359306",_jsontxt,0);
RDebugUtils.currentLine=2359308;
 //BA.debugLineNum = 2359308;BA.debugLine="api.PostString( apiUrl, jsonTxt)";
__ref._api /*b4a.example.httpjob*/ ._poststring /*String*/ (null,__ref._apiurl /*String*/ ,_jsontxt);
RDebugUtils.currentLine=2359309;
 //BA.debugLineNum = 2359309;BA.debugLine="api.GetRequest.SetContentType(\"application/json\")";
__ref._api /*b4a.example.httpjob*/ ._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=2359312;
 //BA.debugLineNum = 2359312;BA.debugLine="Wait For (api) JobDone( response As HttpJob )";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "inicios", "create"), (Object)(__ref._api /*b4a.example.httpjob*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_response = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=2359314;
 //BA.debugLineNum = 2359314;BA.debugLine="Dim datos As inicio";
_datos = new b4a.example.inicio();
RDebugUtils.currentLine=2359315;
 //BA.debugLineNum = 2359315;BA.debugLine="If response.Success Then";
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
RDebugUtils.currentLine=2359316;
 //BA.debugLineNum = 2359316;BA.debugLine="Log(response.GetString)";
parent.__c.LogImpl("42359316",_response._getstring /*String*/ (null),0);
RDebugUtils.currentLine=2359317;
 //BA.debugLineNum = 2359317;BA.debugLine="datos = DeserializarUno( response.GetString )";
_datos = __ref._deserializaruno /*b4a.example.inicio*/ (null,_response._getstring /*String*/ (null));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=2359319;
 //BA.debugLineNum = 2359319;BA.debugLine="datos.Initialize";
_datos._initialize /*String*/ (null,ba);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=2359322;
 //BA.debugLineNum = 2359322;BA.debugLine="Return datos";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_datos));return;};
RDebugUtils.currentLine=2359323;
 //BA.debugLineNum = 2359323;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Private Sub DeserializarUno( jsonTxt As String) As";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Dim jsonParser As JSONParser";
_jsonparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="jsonParser.Initialize(jsonTxt)";
_jsonparser.Initialize(_jsontxt);
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="Dim datos As Map = jsonParser.NextObject";
_datos = new anywheresoftware.b4a.objects.collections.Map();
_datos = _jsonparser.NextObject();
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="Log(datos)";
__c.LogImpl("42555909",BA.ObjectToString(_datos),0);
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="Return MapToInicio(datos)";
if (true) return __ref._maptoinicio /*b4a.example.inicio*/ (null,_datos);
RDebugUtils.currentLine=2555911;
 //BA.debugLineNum = 2555911;BA.debugLine="End Sub";
return null;
}
public b4a.example.inicio  _maptoinicio(b4a.example.inicios __ref,anywheresoftware.b4a.objects.collections.Map _datos) throws Exception{
__ref = this;
RDebugUtils.currentModule="inicios";
if (Debug.shouldDelegate(ba, "maptoinicio", false))
	 {return ((b4a.example.inicio) Debug.delegate(ba, "maptoinicio", new Object[] {_datos}));}
b4a.example.inicio _ini = null;
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Private Sub MapToInicio( datos As Map ) As inicio";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Dim ini As inicio";
_ini = new b4a.example.inicio();
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="ini.Initialize";
_ini._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="ini.Username              = datos.Get(\"username\")";
_ini._username /*String*/  = BA.ObjectToString(_datos.Get((Object)("username")));
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="ini.Contrasenia		     = datos.Get(\"contrasenia\")";
_ini._contrasenia /*String*/  = BA.ObjectToString(_datos.Get((Object)("contrasenia")));
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="Return ini";
if (true) return _ini;
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="End Sub";
return null;
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
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="api.Download( apiUrl & \"/\" & Id)";
__ref._api /*b4a.example.httpjob*/ ._download /*String*/ (null,__ref._apiurl /*String*/ +"/"+_id);
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="api.GetRequest.SetHeader(\"access-token\",\"eyJhbGci";
__ref._api /*b4a.example.httpjob*/ ._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("access-token","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjaGVjayI6dHJ1ZSwiaWF0IjoxNjU3MzgxNzM3LCJleHAiOjE2NTc1NTQ1Mzd9.-3a8wuthLwDFZhOD7kZQn8kxX8u84GBDTvfwKSYnu3w");
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="Wait For (api) JobDone( response As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "inicios", "read_one"), (Object)(__ref._api /*b4a.example.httpjob*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_response = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="Dim datos As inicio";
_datos = new b4a.example.inicio();
RDebugUtils.currentLine=2424839;
 //BA.debugLineNum = 2424839;BA.debugLine="If response.Success Then";
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
RDebugUtils.currentLine=2424840;
 //BA.debugLineNum = 2424840;BA.debugLine="datos = DeserializarUno( response.GetString )";
_datos = __ref._deserializaruno /*b4a.example.inicio*/ (null,_response._getstring /*String*/ (null));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=2424842;
 //BA.debugLineNum = 2424842;BA.debugLine="datos.Initialize";
_datos._initialize /*String*/ (null,ba);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=2424845;
 //BA.debugLineNum = 2424845;BA.debugLine="Return datos";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_datos));return;};
RDebugUtils.currentLine=2424846;
 //BA.debugLineNum = 2424846;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}