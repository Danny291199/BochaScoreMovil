package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class campequipos extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.campequipos");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.campequipos.class).invoke(this, new Object[] {null});
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
public String _apiurlequipos = "";
public b4a.example.httpjob _api = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.campeonatosequipos _campeonatosequipos = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _initialize(b4a.example.campequipos __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="campequipos";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="api.Initialize(\"\", Me)";
__ref._api /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",this);
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _read_one(b4a.example.campequipos __ref,String _id) throws Exception{
RDebugUtils.currentModule="campequipos";
if (Debug.shouldDelegate(ba, "read_one", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "read_one", new Object[] {_id}));}
ResumableSub_Read_One rsub = new ResumableSub_Read_One(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Read_One extends BA.ResumableSub {
public ResumableSub_Read_One(b4a.example.campequipos parent,b4a.example.campequipos __ref,String _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.campequipos __ref;
b4a.example.campequipos parent;
String _id;
b4a.example.httpjob _response = null;
b4a.example.campeonato _datos = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="campequipos";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="api.Download( apiUrl & \"/\" & Id)";
__ref._api /*b4a.example.httpjob*/ ._download /*String*/ (null,__ref._apiurl /*String*/ +"/"+_id);
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="api.GetRequest.SetHeader(\"access-token\", \"eyJhbGc";
__ref._api /*b4a.example.httpjob*/ ._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("access-token","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjaGVjayI6dHJ1ZSwiaWF0IjoxNjU3MzgxNzM3LCJleHAiOjE2NTc1NTQ1Mzd9.-3a8wuthLwDFZhOD7kZQn8kxX8u84GBDTvfwKSYnu3w");
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="Wait For (api) JobDone( response As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "campequipos", "read_one"), (Object)(__ref._api /*b4a.example.httpjob*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_response = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="Dim datos As Campeonato";
_datos = new b4a.example.campeonato();
RDebugUtils.currentLine=3145735;
 //BA.debugLineNum = 3145735;BA.debugLine="If response.Success Then";
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
RDebugUtils.currentLine=3145736;
 //BA.debugLineNum = 3145736;BA.debugLine="datos = DeserializarUno( response.GetString )";
_datos = __ref._deserializaruno /*b4a.example.campeonato*/ (null,_response._getstring /*String*/ (null));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=3145738;
 //BA.debugLineNum = 3145738;BA.debugLine="datos.Initialize";
_datos._initialize /*String*/ (null,ba);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=3145741;
 //BA.debugLineNum = 3145741;BA.debugLine="Return datos";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_datos));return;};
RDebugUtils.currentLine=3145742;
 //BA.debugLineNum = 3145742;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _read_all_equipos_by_campeonato(b4a.example.campequipos __ref,String _id) throws Exception{
RDebugUtils.currentModule="campequipos";
if (Debug.shouldDelegate(ba, "read_all_equipos_by_campeonato", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "read_all_equipos_by_campeonato", new Object[] {_id}));}
ResumableSub_Read_All_Equipos_By_Campeonato rsub = new ResumableSub_Read_All_Equipos_By_Campeonato(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Read_All_Equipos_By_Campeonato extends BA.ResumableSub {
public ResumableSub_Read_All_Equipos_By_Campeonato(b4a.example.campequipos parent,b4a.example.campequipos __ref,String _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.campequipos __ref;
b4a.example.campequipos parent;
String _id;
b4a.example.httpjob _response = null;
anywheresoftware.b4a.objects.collections.List _datos = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="campequipos";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=8323075;
 //BA.debugLineNum = 8323075;BA.debugLine="api.Download( apiUrlEquipos & \"/\" & Id)";
__ref._api /*b4a.example.httpjob*/ ._download /*String*/ (null,__ref._apiurlequipos /*String*/ +"/"+_id);
RDebugUtils.currentLine=8323076;
 //BA.debugLineNum = 8323076;BA.debugLine="api.GetRequest.SetHeader(\"access-token\", \"eyJhbGc";
__ref._api /*b4a.example.httpjob*/ ._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("access-token","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjaGVjayI6dHJ1ZSwiaWF0IjoxNjU3MzgxNzM3LCJleHAiOjE2NTc1NTQ1Mzd9.-3a8wuthLwDFZhOD7kZQn8kxX8u84GBDTvfwKSYnu3w");
RDebugUtils.currentLine=8323078;
 //BA.debugLineNum = 8323078;BA.debugLine="Wait For (api) JobDone( response As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "campequipos", "read_all_equipos_by_campeonato"), (Object)(__ref._api /*b4a.example.httpjob*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_response = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=8323080;
 //BA.debugLineNum = 8323080;BA.debugLine="Dim datos As List";
_datos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8323081;
 //BA.debugLineNum = 8323081;BA.debugLine="If response.Success Then";
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
RDebugUtils.currentLine=8323082;
 //BA.debugLineNum = 8323082;BA.debugLine="datos = DeserializarLista( response.GetString )";
_datos = __ref._deserializarlista /*anywheresoftware.b4a.objects.collections.List*/ (null,_response._getstring /*String*/ (null));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=8323084;
 //BA.debugLineNum = 8323084;BA.debugLine="datos.Initialize";
_datos.Initialize();
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=8323087;
 //BA.debugLineNum = 8323087;BA.debugLine="Return datos";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_datos));return;};
RDebugUtils.currentLine=8323088;
 //BA.debugLineNum = 8323088;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4a.example.campequipos __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="campequipos";
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="Private apiUrl 	As String = \"https://brochascore.";
_apiurl = "https://brochascore.herokuapp.com/campeonatos";
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="Private apiUrlEquipos As String = \"https://brocha";
_apiurlequipos = "https://brochascore.herokuapp.com/equiposCampeonato";
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="Private api		As HttpJob";
_api = new b4a.example.httpjob();
RDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _deserializarlista(b4a.example.campequipos __ref,String _jsontxt) throws Exception{
__ref = this;
RDebugUtils.currentModule="campequipos";
if (Debug.shouldDelegate(ba, "deserializarlista", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "deserializarlista", new Object[] {_jsontxt}));}
anywheresoftware.b4a.objects.collections.List _list = null;
anywheresoftware.b4a.objects.collections.JSONParser _jsonparser = null;
anywheresoftware.b4a.objects.collections.List _datos = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Private Sub DeserializarLista( jsonTxt As String)";
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="Dim list 		As List";
_list = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="Dim jsonParser	As JSONParser";
_jsonparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=5832708;
 //BA.debugLineNum = 5832708;BA.debugLine="list.Initialize";
_list.Initialize();
RDebugUtils.currentLine=5832709;
 //BA.debugLineNum = 5832709;BA.debugLine="Log(jsonTxt)";
__c.LogImpl("45832709",_jsontxt,0);
RDebugUtils.currentLine=5832710;
 //BA.debugLineNum = 5832710;BA.debugLine="jsonParser.Initialize( jsonTxt )";
_jsonparser.Initialize(_jsontxt);
RDebugUtils.currentLine=5832712;
 //BA.debugLineNum = 5832712;BA.debugLine="Dim datos As List = jsonParser.NextArray";
_datos = new anywheresoftware.b4a.objects.collections.List();
_datos = _jsonparser.NextArray();
RDebugUtils.currentLine=5832713;
 //BA.debugLineNum = 5832713;BA.debugLine="For Each item As Map In datos";
_item = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group7 = _datos;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group7.Get(index7)));
RDebugUtils.currentLine=5832714;
 //BA.debugLineNum = 5832714;BA.debugLine="list.Add( MapToEquipos( item ))";
_list.Add((Object)(__ref._maptoequipos /*b4a.example.equipo*/ (null,_item)));
 }
};
RDebugUtils.currentLine=5832717;
 //BA.debugLineNum = 5832717;BA.debugLine="Return list";
if (true) return _list;
RDebugUtils.currentLine=5832718;
 //BA.debugLineNum = 5832718;BA.debugLine="End Sub";
return null;
}
public b4a.example.equipo  _maptoequipos(b4a.example.campequipos __ref,anywheresoftware.b4a.objects.collections.Map _datos) throws Exception{
__ref = this;
RDebugUtils.currentModule="campequipos";
if (Debug.shouldDelegate(ba, "maptoequipos", false))
	 {return ((b4a.example.equipo) Debug.delegate(ba, "maptoequipos", new Object[] {_datos}));}
b4a.example.equipo _eq = null;
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Private Sub MapToEquipos( datos As Map ) As Equipo";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="Dim eq As Equipo";
_eq = new b4a.example.equipo();
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="eq.Initialize";
_eq._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=6422532;
 //BA.debugLineNum = 6422532;BA.debugLine="eq.Id                   = datos.Get(\"id\")";
_eq._id /*int*/  = (int)(BA.ObjectToNumber(_datos.Get((Object)("id"))));
RDebugUtils.currentLine=6422533;
 //BA.debugLineNum = 6422533;BA.debugLine="eq.Nombre              = datos.Get(\"nombre\")";
_eq._nombre /*String*/  = BA.ObjectToString(_datos.Get((Object)("nombre")));
RDebugUtils.currentLine=6422534;
 //BA.debugLineNum = 6422534;BA.debugLine="eq.Imagen              = datos.Get(\"imagen\")";
_eq._imagen /*String*/  = BA.ObjectToString(_datos.Get((Object)("imagen")));
RDebugUtils.currentLine=6422535;
 //BA.debugLineNum = 6422535;BA.debugLine="Return eq";
if (true) return _eq;
RDebugUtils.currentLine=6422536;
 //BA.debugLineNum = 6422536;BA.debugLine="End Sub";
return null;
}
public b4a.example.campeonato  _deserializaruno(b4a.example.campequipos __ref,String _jsontxt) throws Exception{
__ref = this;
RDebugUtils.currentModule="campequipos";
if (Debug.shouldDelegate(ba, "deserializaruno", false))
	 {return ((b4a.example.campeonato) Debug.delegate(ba, "deserializaruno", new Object[] {_jsontxt}));}
anywheresoftware.b4a.objects.collections.JSONParser _jsonparser = null;
anywheresoftware.b4a.objects.collections.Map _datos = null;
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Private Sub DeserializarUno( jsonTxt As String) As";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="Dim jsonParser As JSONParser";
_jsonparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="jsonParser.Initialize(jsonTxt)";
_jsonparser.Initialize(_jsontxt);
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="Dim datos As Map = jsonParser.NextObject";
_datos = new anywheresoftware.b4a.objects.collections.Map();
_datos = _jsonparser.NextObject();
RDebugUtils.currentLine=3276805;
 //BA.debugLineNum = 3276805;BA.debugLine="Log(datos)";
__c.LogImpl("43276805",BA.ObjectToString(_datos),0);
RDebugUtils.currentLine=3276806;
 //BA.debugLineNum = 3276806;BA.debugLine="Return MapToCampeonato(datos)";
if (true) return __ref._maptocampeonato /*b4a.example.campeonato*/ (null,_datos);
RDebugUtils.currentLine=3276807;
 //BA.debugLineNum = 3276807;BA.debugLine="End Sub";
return null;
}
public b4a.example.campeonato  _maptocampeonato(b4a.example.campequipos __ref,anywheresoftware.b4a.objects.collections.Map _datos) throws Exception{
__ref = this;
RDebugUtils.currentModule="campequipos";
if (Debug.shouldDelegate(ba, "maptocampeonato", false))
	 {return ((b4a.example.campeonato) Debug.delegate(ba, "maptocampeonato", new Object[] {_datos}));}
b4a.example.campeonato _camp = null;
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Private Sub MapToCampeonato( datos As Map ) As Cam";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="Dim camp As Campeonato";
_camp = new b4a.example.campeonato();
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="camp.Initialize";
_camp._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=3211269;
 //BA.debugLineNum = 3211269;BA.debugLine="camp.Nombre              = datos.Get(\"nombre\")";
_camp._nombre /*String*/  = BA.ObjectToString(_datos.Get((Object)("nombre")));
RDebugUtils.currentLine=3211270;
 //BA.debugLineNum = 3211270;BA.debugLine="camp.Imagen              = datos.Get(\"imagen\")";
_camp._imagen /*String*/  = BA.ObjectToString(_datos.Get((Object)("imagen")));
RDebugUtils.currentLine=3211271;
 //BA.debugLineNum = 3211271;BA.debugLine="Return camp";
if (true) return _camp;
RDebugUtils.currentLine=3211272;
 //BA.debugLineNum = 3211272;BA.debugLine="End Sub";
return null;
}
}