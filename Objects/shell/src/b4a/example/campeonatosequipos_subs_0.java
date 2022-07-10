package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class campeonatosequipos_subs_0 {


public static void  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (campeonatosequipos) ","campeonatosequipos",6,campeonatosequipos.mostCurrent.activityBA,campeonatosequipos.mostCurrent,24);
if (RapidSub.canDelegate("activity_create")) { b4a.example.campeonatosequipos.remoteMe.runUserSub(false, "campeonatosequipos","activity_create", _firsttime); return;}
ResumableSub_Activity_Create rsub = new ResumableSub_Activity_Create(null,_firsttime);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Activity_Create extends BA.ResumableSub {
public ResumableSub_Activity_Create(b4a.example.campeonatosequipos parent,RemoteObject _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.campeonatosequipos parent;
RemoteObject _firsttime;
RemoteObject _job = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _respuesta = RemoteObject.declareNull("b4a.example.campeonato");
RemoteObject _respuestalista = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _equip = RemoteObject.declareNull("b4a.example.equipo");
RemoteObject group15;
int index15;
int groupLen15;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (campeonatosequipos) ","campeonatosequipos",6,campeonatosequipos.mostCurrent.activityBA,campeonatosequipos.mostCurrent,24);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 28;BA.debugLine="Activity.LoadLayout(\"listaEquiposbyCampeonatos\")";
Debug.ShouldStop(134217728);
parent.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("listaEquiposbyCampeonatos")),campeonatosequipos.mostCurrent.activityBA);
 BA.debugLineNum = 29;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(268435456);
_job = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 30;BA.debugLine="Job.Initialize(\"Job\",Me)";
Debug.ShouldStop(536870912);
_job.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,campeonatosequipos.processBA,(Object)(BA.ObjectToString("Job")),(Object)(campeonatosequipos.getObject()));
 BA.debugLineNum = 31;BA.debugLine="lstEquipos.SingleLineLayout.Label.TextColor=Color";
Debug.ShouldStop(1073741824);
parent.mostCurrent._lstequipos.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 34;BA.debugLine="camp_equi.Initialize";
Debug.ShouldStop(2);
parent._camp_equi.runClassMethod (b4a.example.campequipos.class, "_initialize" /*RemoteObject*/ ,campeonatosequipos.processBA);
 BA.debugLineNum = 35;BA.debugLine="Wait For (camp_equi.Read_One(Main.idCampeonato))";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", campeonatosequipos.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "campeonatosequipos", "activity_create"), parent._camp_equi.runClassMethod (b4a.example.campequipos.class, "_read_one" /*RemoteObject*/ ,(Object)(parent.mostCurrent._main._idcampeonato /*RemoteObject*/ )));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_respuesta = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("respuesta", _respuesta);
;
 BA.debugLineNum = 36;BA.debugLine="Job.Download(respuesta.Imagen)";
Debug.ShouldStop(8);
_job.runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_respuesta.getField(true,"_imagen" /*RemoteObject*/ )));
 BA.debugLineNum = 37;BA.debugLine="txtNomCamp.Text = respuesta.Nombre";
Debug.ShouldStop(16);
parent.mostCurrent._txtnomcamp.runMethod(true,"setText",BA.ObjectToCharSequence(_respuesta.getField(true,"_nombre" /*RemoteObject*/ )));
 BA.debugLineNum = 38;BA.debugLine="Wait For (Job) JobDone (Job As HttpJob)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", campeonatosequipos.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "campeonatosequipos", "activity_create"), (_job));
this.state = 14;
return;
case 14:
//C
this.state = 1;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 39;BA.debugLine="If Job.Success = True Then";
Debug.ShouldStop(64);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success" /*RemoteObject*/ ),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 40;BA.debugLine="ImgCamp.Bitmap = Job.GetBitmap";
Debug.ShouldStop(128);
parent.mostCurrent._imgcamp.runMethod(false,"setBitmap",(_job.runClassMethod (b4a.example.httpjob.class, "_getbitmap" /*RemoteObject*/ ).getObject()));
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 44;BA.debugLine="Wait For (camp_equi.Read_All_Equipos_By_Campeonat";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", campeonatosequipos.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "campeonatosequipos", "activity_create"), parent._camp_equi.runClassMethod (b4a.example.campequipos.class, "_read_all_equipos_by_campeonato" /*RemoteObject*/ ,(Object)(parent.mostCurrent._main._idcampeonato /*RemoteObject*/ )));
this.state = 15;
return;
case 15:
//C
this.state = 5;
_respuestalista = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("respuestalista", _respuestalista);
;
 BA.debugLineNum = 45;BA.debugLine="If respuestalista.Size > 0 Then";
Debug.ShouldStop(4096);
if (true) break;

case 5:
//if
this.state = 12;
if (RemoteObject.solveBoolean(">",_respuestalista.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 46;BA.debugLine="For Each equip As Equipo In respuestalista";
Debug.ShouldStop(8192);
if (true) break;

case 8:
//for
this.state = 11;
group15 = _respuestalista;
index15 = 0;
groupLen15 = group15.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("equip", _equip);
this.state = 16;
if (true) break;

case 16:
//C
this.state = 11;
if (index15 < groupLen15) {
this.state = 10;
_equip = (group15.runMethod(false,"Get",index15));Debug.locals.put("equip", _equip);}
if (true) break;

case 17:
//C
this.state = 16;
index15++;
Debug.locals.put("equip", _equip);
if (true) break;

case 10:
//C
this.state = 17;
 BA.debugLineNum = 47;BA.debugLine="lstEquipos.AddSingleLine(equip.Nombre)";
Debug.ShouldStop(16384);
parent.mostCurrent._lstequipos.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(_equip.getField(true,"_nombre" /*RemoteObject*/ ))));
 if (true) break;
if (true) break;

case 11:
//C
this.state = 12;
Debug.locals.put("equip", _equip);
;
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
public static void  _complete(RemoteObject _respuesta) throws Exception{
}
public static void  _jobdone(RemoteObject _job) throws Exception{
}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (campeonatosequipos) ","campeonatosequipos",6,campeonatosequipos.mostCurrent.activityBA,campeonatosequipos.mostCurrent,57);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.campeonatosequipos.remoteMe.runUserSub(false, "campeonatosequipos","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 57;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("Activity_Resume (campeonatosequipos) ","campeonatosequipos",6,campeonatosequipos.mostCurrent.activityBA,campeonatosequipos.mostCurrent,53);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.campeonatosequipos.remoteMe.runUserSub(false, "campeonatosequipos","activity_resume");}
 BA.debugLineNum = 53;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnagregar_click() throws Exception{
try {
		Debug.PushSubsStack("btnAgregar_Click (campeonatosequipos) ","campeonatosequipos",6,campeonatosequipos.mostCurrent.activityBA,campeonatosequipos.mostCurrent,62);
if (RapidSub.canDelegate("btnagregar_click")) { return b4a.example.campeonatosequipos.remoteMe.runUserSub(false, "campeonatosequipos","btnagregar_click");}
 BA.debugLineNum = 62;BA.debugLine="Private Sub btnAgregar_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private txtNomCamp As Label";
campeonatosequipos.mostCurrent._txtnomcamp = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private ImgCamp As ImageView";
campeonatosequipos.mostCurrent._imgcamp = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private lstEquipos As ListView";
campeonatosequipos.mostCurrent._lstequipos = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private btnAgregar As Button";
campeonatosequipos.mostCurrent._btnagregar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI";
campeonatosequipos._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 10;BA.debugLine="Private camp_equi As CampEquipos";
campeonatosequipos._camp_equi = RemoteObject.createNew ("b4a.example.campequipos");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}