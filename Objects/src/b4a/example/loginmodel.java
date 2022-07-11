package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class loginmodel extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.loginmodel");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.loginmodel.class).invoke(this, new Object[] {null});
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
public String  _initialize(b4a.example.loginmodel __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="loginmodel";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="api.Initialize(\"\", Me)";
__ref._api /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",this);
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _login_post(b4a.example.loginmodel __ref,String _username,String _password) throws Exception{
RDebugUtils.currentModule="loginmodel";
if (Debug.shouldDelegate(ba, "login_post", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "login_post", new Object[] {_username,_password}));}
ResumableSub_Login_Post rsub = new ResumableSub_Login_Post(this,__ref,_username,_password);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Login_Post extends BA.ResumableSub {
public ResumableSub_Login_Post(b4a.example.loginmodel parent,b4a.example.loginmodel __ref,String _username,String _password) {
this.parent = parent;
this.__ref = __ref;
this._username = _username;
this._password = _password;
this.__ref = parent;
}
b4a.example.loginmodel __ref;
b4a.example.loginmodel parent;
String _username;
String _password;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _jsongen = null;
String _jsontxt = "";
b4a.example.httpjob _response = null;
b4a.example.login _datos = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="loginmodel";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="Dim jsonGen As JSONGenerator";
_jsongen = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=7143428;
 //BA.debugLineNum = 7143428;BA.debugLine="jsonGen.Initialize( CreateMap ( _ 		\"userName\" :";
_jsongen.Initialize(parent.__c.createMap(new Object[] {(Object)("userName"),(Object)(_username),(Object)("contrasenia"),(Object)(_password),(Object)("rolCodigo"),(Object)("AC")}));
RDebugUtils.currentLine=7143434;
 //BA.debugLineNum = 7143434;BA.debugLine="Dim jsonTxt As String = jsonGen.ToString";
_jsontxt = _jsongen.ToString();
RDebugUtils.currentLine=7143435;
 //BA.debugLineNum = 7143435;BA.debugLine="api.PostString(apiUrl,jsonTxt)";
__ref._api /*b4a.example.httpjob*/ ._poststring /*String*/ (null,__ref._apiurl /*String*/ ,_jsontxt);
RDebugUtils.currentLine=7143436;
 //BA.debugLineNum = 7143436;BA.debugLine="api.GetRequest.SetContentType(\"application/json\")";
__ref._api /*b4a.example.httpjob*/ ._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=7143439;
 //BA.debugLineNum = 7143439;BA.debugLine="Wait For (api) JobDone( response As HttpJob )";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "loginmodel", "login_post"), (Object)(__ref._api /*b4a.example.httpjob*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_response = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=7143440;
 //BA.debugLineNum = 7143440;BA.debugLine="Dim datos As Login";
_datos = new b4a.example.login();
RDebugUtils.currentLine=7143441;
 //BA.debugLineNum = 7143441;BA.debugLine="If response.Success Then";
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
RDebugUtils.currentLine=7143442;
 //BA.debugLineNum = 7143442;BA.debugLine="Log(response.GetString)";
parent.__c.LogImpl("67143442",_response._getstring /*String*/ (null),0);
RDebugUtils.currentLine=7143443;
 //BA.debugLineNum = 7143443;BA.debugLine="datos = DeserializarUno( response.GetString )";
_datos = __ref._deserializaruno /*b4a.example.login*/ (null,_response._getstring /*String*/ (null));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=7143445;
 //BA.debugLineNum = 7143445;BA.debugLine="datos.Initialize";
_datos._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=7143446;
 //BA.debugLineNum = 7143446;BA.debugLine="datos.CampeonatoId = \"\"";
_datos._campeonatoid /*String*/  = "";
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=7143449;
 //BA.debugLineNum = 7143449;BA.debugLine="Return datos";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_datos));return;};
RDebugUtils.currentLine=7143450;
 //BA.debugLineNum = 7143450;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4a.example.loginmodel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginmodel";
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="Private apiUrl 	As String = \"https://brochascore.";
_apiurl = "https://brochascore.herokuapp.com/login";
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="Private api		As HttpJob";
_api = new b4a.example.httpjob();
RDebugUtils.currentLine=5701635;
 //BA.debugLineNum = 5701635;BA.debugLine="End Sub";
return "";
}
public b4a.example.login  _deserializaruno(b4a.example.loginmodel __ref,String _jsontxt) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginmodel";
if (Debug.shouldDelegate(ba, "deserializaruno", false))
	 {return ((b4a.example.login) Debug.delegate(ba, "deserializaruno", new Object[] {_jsontxt}));}
anywheresoftware.b4a.objects.collections.JSONParser _jsonparser = null;
anywheresoftware.b4a.objects.collections.Map _datos = null;
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Private Sub DeserializarUno( jsonTxt As String) As";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="Dim jsonParser As JSONParser";
_jsonparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="jsonParser.Initialize(jsonTxt)";
_jsonparser.Initialize(_jsontxt);
RDebugUtils.currentLine=6750212;
 //BA.debugLineNum = 6750212;BA.debugLine="Dim datos As Map = jsonParser.NextObject";
_datos = new anywheresoftware.b4a.objects.collections.Map();
_datos = _jsonparser.NextObject();
RDebugUtils.currentLine=6750213;
 //BA.debugLineNum = 6750213;BA.debugLine="Return MapToLogin(datos)";
if (true) return __ref._maptologin /*b4a.example.login*/ (null,_datos);
RDebugUtils.currentLine=6750214;
 //BA.debugLineNum = 6750214;BA.debugLine="End Sub";
return null;
}
public b4a.example.login  _maptologin(b4a.example.loginmodel __ref,anywheresoftware.b4a.objects.collections.Map _datos) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginmodel";
if (Debug.shouldDelegate(ba, "maptologin", false))
	 {return ((b4a.example.login) Debug.delegate(ba, "maptologin", new Object[] {_datos}));}
b4a.example.login _logi = null;
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Private Sub MapToLogin( datos As Map ) As Login";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="Dim logi As Login";
_logi = new b4a.example.login();
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="logi.Initialize";
_logi._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=6684676;
 //BA.debugLineNum = 6684676;BA.debugLine="logi.msg              = datos.Get(\"msg\")";
_logi._msg /*String*/  = BA.ObjectToString(_datos.Get((Object)("msg")));
RDebugUtils.currentLine=6684677;
 //BA.debugLineNum = 6684677;BA.debugLine="logi.UserName         = datos.Get(\"userName\")";
_logi._username /*String*/  = BA.ObjectToString(_datos.Get((Object)("userName")));
RDebugUtils.currentLine=6684678;
 //BA.debugLineNum = 6684678;BA.debugLine="logi.Nombre           = datos.Get(\"nombre\")";
_logi._nombre /*String*/  = BA.ObjectToString(_datos.Get((Object)("nombre")));
RDebugUtils.currentLine=6684679;
 //BA.debugLineNum = 6684679;BA.debugLine="logi.Apellido         = datos.Get(\"apellido\")";
_logi._apellido /*String*/  = BA.ObjectToString(_datos.Get((Object)("apellido")));
RDebugUtils.currentLine=6684680;
 //BA.debugLineNum = 6684680;BA.debugLine="logi.CampeonatoId     = datos.Get(\"campeonatoId\")";
_logi._campeonatoid /*String*/  = BA.ObjectToString(_datos.Get((Object)("campeonatoId")));
RDebugUtils.currentLine=6684681;
 //BA.debugLineNum = 6684681;BA.debugLine="logi.Codigo           = datos.Get(\"codigo\")";
_logi._codigo /*String*/  = BA.ObjectToString(_datos.Get((Object)("codigo")));
RDebugUtils.currentLine=6684682;
 //BA.debugLineNum = 6684682;BA.debugLine="logi.Rol              = datos.Get(\"rol\")";
_logi._rol /*String*/  = BA.ObjectToString(_datos.Get((Object)("rol")));
RDebugUtils.currentLine=6684683;
 //BA.debugLineNum = 6684683;BA.debugLine="logi.Token            = datos.Get(\"token\")";
_logi._token /*String*/  = BA.ObjectToString(_datos.Get((Object)("token")));
RDebugUtils.currentLine=6684685;
 //BA.debugLineNum = 6684685;BA.debugLine="Return logi";
if (true) return _logi;
RDebugUtils.currentLine=6684686;
 //BA.debugLineNum = 6684686;BA.debugLine="End Sub";
return null;
}
}