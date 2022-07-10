package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,21);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 21;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 24;BA.debugLine="Activity.LoadLayout(\"1LoginBochaScore\")";
Debug.ShouldStop(8388608);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("1LoginBochaScore")),main.mostCurrent.activityBA);
 BA.debugLineNum = 25;BA.debugLine="ini.Initialize";
Debug.ShouldStop(16777216);
main._ini.runClassMethod (b4a.example.inicios.class, "_initialize" /*RemoteObject*/ ,main.processBA);
 BA.debugLineNum = 26;BA.debugLine="txtUsuario.SingleLine=False";
Debug.ShouldStop(33554432);
main.mostCurrent._txtusuario.runVoidMethod ("setSingleLine",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 27;BA.debugLine="txtContrasenia.SingleLine=False";
Debug.ShouldStop(67108864);
main.mostCurrent._txtcontrasenia.runVoidMethod ("setSingleLine",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 28;BA.debugLine="Dim cd As ColorDrawable";
Debug.ShouldStop(134217728);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd", _cd);
 BA.debugLineNum = 29;BA.debugLine="cd.Initialize2(Colors.Transparent, 10dip,1dip,";
Debug.ShouldStop(268435456);
_cd.runVoidMethod ("Initialize2",(Object)(main.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent")),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))),(Object)(main.mostCurrent.__c.getField(false,"Colors").getField(true,"White")));
 BA.debugLineNum = 30;BA.debugLine="txtUsuario.Background=cd";
Debug.ShouldStop(536870912);
main.mostCurrent._txtusuario.runMethod(false,"setBackground",(_cd.getObject()));
 BA.debugLineNum = 31;BA.debugLine="txtContrasenia.Background=cd";
Debug.ShouldStop(1073741824);
main.mostCurrent._txtcontrasenia.runMethod(false,"setBackground",(_cd.getObject()));
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,38);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 38;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,34);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2);
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnentrar_click() throws Exception{
try {
		Debug.PushSubsStack("btnEntrar_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,42);
if (RapidSub.canDelegate("btnentrar_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btnentrar_click");}
 BA.debugLineNum = 42;BA.debugLine="Sub btnEntrar_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 61;BA.debugLine="idCampeonato = txtUsuario.Text";
Debug.ShouldStop(268435456);
main._idcampeonato = main.mostCurrent._txtusuario.runMethod(true,"getText");
 BA.debugLineNum = 62;BA.debugLine="StartActivity(CampeonatosEquipos)";
Debug.ShouldStop(536870912);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._campeonatosequipos.getObject())));
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 17;BA.debugLine="Private txtUsuario As EditText";
main.mostCurrent._txtusuario = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private txtContrasenia As EditText";
main.mostCurrent._txtcontrasenia = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 10;BA.debugLine="Private ini As inicios";
main._ini = RemoteObject.createNew ("b4a.example.inicios");
 //BA.debugLineNum = 11;BA.debugLine="Dim idCampeonato As String";
main._idcampeonato = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}