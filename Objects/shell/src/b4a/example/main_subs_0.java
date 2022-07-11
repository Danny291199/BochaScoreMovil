package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,22);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 22;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 25;BA.debugLine="Activity.LoadLayout(\"1LoginBochaScore\")";
Debug.ShouldStop(16777216);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("1LoginBochaScore")),main.mostCurrent.activityBA);
 BA.debugLineNum = 26;BA.debugLine="logi.Initialize";
Debug.ShouldStop(33554432);
main._logi.runClassMethod (b4a.example.loginmodel.class, "_initialize" /*RemoteObject*/ ,main.processBA);
 BA.debugLineNum = 27;BA.debugLine="txtUsuario.SingleLine=False";
Debug.ShouldStop(67108864);
main.mostCurrent._txtusuario.runVoidMethod ("setSingleLine",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 28;BA.debugLine="txtContrasenia.SingleLine=False";
Debug.ShouldStop(134217728);
main.mostCurrent._txtcontrasenia.runVoidMethod ("setSingleLine",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 29;BA.debugLine="Dim cd As ColorDrawable";
Debug.ShouldStop(268435456);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd", _cd);
 BA.debugLineNum = 30;BA.debugLine="cd.Initialize2(Colors.Transparent, 10dip,1dip,";
Debug.ShouldStop(536870912);
_cd.runVoidMethod ("Initialize2",(Object)(main.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent")),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))),(Object)(main.mostCurrent.__c.getField(false,"Colors").getField(true,"White")));
 BA.debugLineNum = 31;BA.debugLine="txtUsuario.Background=cd";
Debug.ShouldStop(1073741824);
main.mostCurrent._txtusuario.runMethod(false,"setBackground",(_cd.getObject()));
 BA.debugLineNum = 32;BA.debugLine="txtContrasenia.Background=cd";
Debug.ShouldStop(-2147483648);
main.mostCurrent._txtcontrasenia.runMethod(false,"setBackground",(_cd.getObject()));
 BA.debugLineNum = 33;BA.debugLine="txtContrasenia.PasswordMode = True";
Debug.ShouldStop(1);
main.mostCurrent._txtcontrasenia.runVoidMethod ("setPasswordMode",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,40);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 40;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(128);
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,36);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 36;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8);
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnentrar_click() throws Exception{
try {
		Debug.PushSubsStack("btnEntrar_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,44);
if (RapidSub.canDelegate("btnentrar_click")) { b4a.example.main.remoteMe.runUserSub(false, "main","btnentrar_click"); return;}
ResumableSub_btnEntrar_Click rsub = new ResumableSub_btnEntrar_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnEntrar_Click extends BA.ResumableSub {
public ResumableSub_btnEntrar_Click(b4a.example.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.main parent;
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.login");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnEntrar_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,44);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 47;BA.debugLine="Wait For (logi.Login_Post(txtUsuario.Text,txtCont";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btnentrar_click"), parent._logi.runClassMethod (b4a.example.loginmodel.class, "_login_post" /*RemoteObject*/ ,(Object)(parent.mostCurrent._txtusuario.runMethod(true,"getText")),(Object)(parent.mostCurrent._txtcontrasenia.runMethod(true,"getText"))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 48;BA.debugLine="Log(resultado.CampeonatoId <> \"\")";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6327684",BA.ObjectToString(RemoteObject.solveBoolean("!",_resultado.getField(true,"_campeonatoid" /*RemoteObject*/ ),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 49;BA.debugLine="If resultado.CampeonatoId <> \"\"  Then";
Debug.ShouldStop(65536);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_resultado.getField(true,"_campeonatoid" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 50;BA.debugLine="idCampeonato = resultado.CampeonatoId";
Debug.ShouldStop(131072);
parent._idcampeonato = _resultado.getField(true,"_campeonatoid" /*RemoteObject*/ );
 BA.debugLineNum = 51;BA.debugLine="token = resultado.Token";
Debug.ShouldStop(262144);
parent._token = _resultado.getField(true,"_token" /*RemoteObject*/ );
 BA.debugLineNum = 52;BA.debugLine="StartActivity(CampeonatosEquipos)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((parent.mostCurrent._campeonatosequipos.getObject())));
 BA.debugLineNum = 53;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1048576);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 55;BA.debugLine="xui.MsgboxAsync(\"Error al ingresar\", \"ERROR\")";
Debug.ShouldStop(4194304);
parent._xui.runVoidMethod ("MsgboxAsync",main.processBA,(Object)(BA.ObjectToCharSequence("Error al ingresar")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("ERROR"))));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
public static void  _complete(RemoteObject _resultado) throws Exception{
}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private txtUsuario As EditText";
main.mostCurrent._txtusuario = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private txtContrasenia As EditText";
main.mostCurrent._txtcontrasenia = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
campeonatosequipos_subs_0._process_globals();
httputils2service_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
campeonatos.myClass = BA.getDeviceClass ("b4a.example.campeonatos");
campeonato.myClass = BA.getDeviceClass ("b4a.example.campeonato");
inicio.myClass = BA.getDeviceClass ("b4a.example.inicio");
inicios.myClass = BA.getDeviceClass ("b4a.example.inicios");
campeonatosequipos.myClass = BA.getDeviceClass ("b4a.example.campeonatosequipos");
campequipos.myClass = BA.getDeviceClass ("b4a.example.campequipos");
equipo.myClass = BA.getDeviceClass ("b4a.example.equipo");
loginmodel.myClass = BA.getDeviceClass ("b4a.example.loginmodel");
login.myClass = BA.getDeviceClass ("b4a.example.login");
httputils2service.myClass = BA.getDeviceClass ("b4a.example.httputils2service");
httpjob.myClass = BA.getDeviceClass ("b4a.example.httpjob");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 10;BA.debugLine="Private logi As loginModel";
main._logi = RemoteObject.createNew ("b4a.example.loginmodel");
 //BA.debugLineNum = 11;BA.debugLine="Dim idCampeonato As String";
main._idcampeonato = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="Dim token As String";
main._token = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}