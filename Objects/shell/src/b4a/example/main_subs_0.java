package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,34);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(4);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 36;BA.debugLine="cam.Initialize";
Debug.ShouldStop(8);
main._cam.runClassMethod (b4a.example.campeonatos.class, "_initialize" /*RemoteObject*/ ,main.processBA);
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,43);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 43;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,39);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 39;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(64);
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _cmdadd_click() throws Exception{
try {
		Debug.PushSubsStack("cmdAdd_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,48);
if (RapidSub.canDelegate("cmdadd_click")) { b4a.example.main.remoteMe.runUserSub(false, "main","cmdadd_click"); return;}
ResumableSub_cmdAdd_Click rsub = new ResumableSub_cmdAdd_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cmdAdd_Click extends BA.ResumableSub {
public ResumableSub_cmdAdd_Click(b4a.example.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.main parent;
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.campeonato");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmdAdd_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,48);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 49;BA.debugLine="Wait For (cam.Create(txtNombre.Text,txtEstado.Tex";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "cmdadd_click"), parent._cam.runClassMethod (b4a.example.campeonatos.class, "_create" /*RemoteObject*/ ,(Object)(parent.mostCurrent._txtnombre.runMethod(true,"getText")),(Object)(BA.numberCast(int.class, parent.mostCurrent._txtestado.runMethod(true,"getText"))),(Object)(parent.mostCurrent._txtfecha_inicio.runMethod(true,"getText")),(Object)(parent.mostCurrent._txtimagen.runMethod(true,"getText")),(Object)(BA.numberCast(int.class, parent.mostCurrent._txtdeletestatus.runMethod(true,"getText")))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 50;BA.debugLine="If resultado.Id = 0 Then";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_resultado.getField(true,"_id" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 51;BA.debugLine="xui.MsgboxAsync(\"REGISTRO CREADO !!\", \"OK\")";
Debug.ShouldStop(262144);
parent._xui.runVoidMethod ("MsgboxAsync",main.processBA,(Object)(BA.ObjectToCharSequence("REGISTRO CREADO !!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))));
 BA.debugLineNum = 52;BA.debugLine="txtId.Text = resultado.Id";
Debug.ShouldStop(524288);
parent.mostCurrent._txtid.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_resultado.getField(true,"_id" /*RemoteObject*/ )));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 54;BA.debugLine="xui.MsgboxAsync(\"REGISTRO NO SE PUDO CREAR!!\", \"";
Debug.ShouldStop(2097152);
parent._xui.runVoidMethod ("MsgboxAsync",main.processBA,(Object)(BA.ObjectToCharSequence("REGISTRO NO SE PUDO CREAR!!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("ERROR"))));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
public static void  _cmdreadall_click() throws Exception{
try {
		Debug.PushSubsStack("cmdReadAll_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,97);
if (RapidSub.canDelegate("cmdreadall_click")) { b4a.example.main.remoteMe.runUserSub(false, "main","cmdreadall_click"); return;}
ResumableSub_cmdReadAll_Click rsub = new ResumableSub_cmdReadAll_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cmdReadAll_Click extends BA.ResumableSub {
public ResumableSub_cmdReadAll_Click(b4a.example.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.main parent;
RemoteObject _listacamptos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _camp = RemoteObject.declareNull("b4a.example.campeonato");
RemoteObject group5;
int index5;
int groupLen5;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmdReadAll_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,97);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 98;BA.debugLine="lstCampeonatos.Clear";
Debug.ShouldStop(2);
parent.mostCurrent._lstcampeonatos.runVoidMethod ("Clear");
 BA.debugLineNum = 100;BA.debugLine="Wait For (cam.Read_All) Complete( listaCamptos As";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "cmdreadall_click"), parent._cam.runClassMethod (b4a.example.campeonatos.class, "_read_all" /*RemoteObject*/ ));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_listacamptos = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("listaCamptos", _listacamptos);
;
 BA.debugLineNum = 101;BA.debugLine="If listaCamptos.Size > 0 Then";
Debug.ShouldStop(16);
if (true) break;

case 1:
//if
this.state = 10;
if (RemoteObject.solveBoolean(">",_listacamptos.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 102;BA.debugLine="xui.MsgboxAsync(\"REGISTROS ENCONTRADOS !!\", \"OK\"";
Debug.ShouldStop(32);
parent._xui.runVoidMethod ("MsgboxAsync",main.processBA,(Object)(BA.ObjectToCharSequence("REGISTROS ENCONTRADOS !!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))));
 BA.debugLineNum = 104;BA.debugLine="For Each camp As Campeonato In listaCamptos";
Debug.ShouldStop(128);
if (true) break;

case 4:
//for
this.state = 7;
group5 = _listacamptos;
index5 = 0;
groupLen5 = group5.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("camp", _camp);
this.state = 12;
if (true) break;

case 12:
//C
this.state = 7;
if (index5 < groupLen5) {
this.state = 6;
_camp = (group5.runMethod(false,"Get",index5));Debug.locals.put("camp", _camp);}
if (true) break;

case 13:
//C
this.state = 12;
index5++;
Debug.locals.put("camp", _camp);
if (true) break;

case 6:
//C
this.state = 13;
 BA.debugLineNum = 105;BA.debugLine="lstCampeonatos.AddTwoLines2( camp.Nombre, \"Fech";
Debug.ShouldStop(256);
parent.mostCurrent._lstcampeonatos.runVoidMethod ("AddTwoLines2",(Object)(BA.ObjectToCharSequence(_camp.getField(true,"_nombre" /*RemoteObject*/ ))),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Fecha Inicio = "),_camp.getField(true,"_fecha_inicio" /*RemoteObject*/ )))),(Object)((_camp)));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
Debug.locals.put("camp", _camp);
;
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 108;BA.debugLine="xui.MsgboxAsync(\"REGISTROS NO ENCONTRADOS!!\", \"E";
Debug.ShouldStop(2048);
parent._xui.runVoidMethod ("MsgboxAsync",main.processBA,(Object)(BA.ObjectToCharSequence("REGISTROS NO ENCONTRADOS!!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("ERROR"))));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 110;BA.debugLine="End Sub";
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 24;BA.debugLine="Private txtId As EditText";
main.mostCurrent._txtid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private txtNombre As EditText";
main.mostCurrent._txtnombre = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private txtEstado As EditText";
main.mostCurrent._txtestado = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private txtFecha_Inicio As EditText";
main.mostCurrent._txtfecha_inicio = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private txtImagen As EditText";
main.mostCurrent._txtimagen = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private txtDeleteStatus As EditText";
main.mostCurrent._txtdeletestatus = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private lstCampeonatos As ListView";
main.mostCurrent._lstcampeonatos = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _lstdepartamentos_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("lstDepartamentos_ItemClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,112);
if (RapidSub.canDelegate("lstdepartamentos_itemclick")) { return b4a.example.main.remoteMe.runUserSub(false, "main","lstdepartamentos_itemclick", _position, _value);}
RemoteObject _camp = RemoteObject.declareNull("b4a.example.campeonato");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 112;BA.debugLine="Private Sub lstDepartamentos_ItemClick (Position A";
Debug.ShouldStop(32768);
 BA.debugLineNum = 113;BA.debugLine="Dim camp As Campeonato = Value";
Debug.ShouldStop(65536);
_camp = (_value);Debug.locals.put("camp", _camp);Debug.locals.put("camp", _camp);
 BA.debugLineNum = 114;BA.debugLine="txtId.Text = camp.Id";
Debug.ShouldStop(131072);
main.mostCurrent._txtid.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_camp.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 115;BA.debugLine="txtNombre.Text = camp.Nombre";
Debug.ShouldStop(262144);
main.mostCurrent._txtnombre.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_camp.getField(true,"_nombre" /*RemoteObject*/ )));
 BA.debugLineNum = 116;BA.debugLine="txtEstado.Text = camp.Estado";
Debug.ShouldStop(524288);
main.mostCurrent._txtestado.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_camp.getField(true,"_estado" /*RemoteObject*/ )));
 BA.debugLineNum = 117;BA.debugLine="txtFecha_Inicio.Text = camp.Fecha_Inicio";
Debug.ShouldStop(1048576);
main.mostCurrent._txtfecha_inicio.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_camp.getField(true,"_fecha_inicio" /*RemoteObject*/ )));
 BA.debugLineNum = 118;BA.debugLine="txtImagen.Text = camp.Imagen";
Debug.ShouldStop(2097152);
main.mostCurrent._txtimagen.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_camp.getField(true,"_imagen" /*RemoteObject*/ )));
 BA.debugLineNum = 119;BA.debugLine="txtDeleteStatus.Text = camp.Delete_Status";
Debug.ShouldStop(4194304);
main.mostCurrent._txtdeletestatus.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_camp.getField(true,"_delete_status" /*RemoteObject*/ )));
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
httputils2service_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
campeonatos.myClass = BA.getDeviceClass ("b4a.example.campeonatos");
campeonato.myClass = BA.getDeviceClass ("b4a.example.campeonato");
httputils2service.myClass = BA.getDeviceClass ("b4a.example.httputils2service");
httpjob.myClass = BA.getDeviceClass ("b4a.example.httpjob");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 19;BA.debugLine="Private cam As Campeonatos";
main._cam = RemoteObject.createNew ("b4a.example.campeonatos");
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}