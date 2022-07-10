package b4a.example;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class campeonatosequipos extends Activity implements B4AActivity{
	public static campeonatosequipos mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.campeonatosequipos");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (campeonatosequipos).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.campeonatosequipos");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.campeonatosequipos", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (campeonatosequipos) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (campeonatosequipos) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return campeonatosequipos.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (campeonatosequipos) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (campeonatosequipos) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            campeonatosequipos mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (campeonatosequipos) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static b4a.example.campequipos _camp_equi = null;
public anywheresoftware.b4a.objects.LabelWrapper _txtnomcamp = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgcamp = null;
public anywheresoftware.b4a.objects.ListViewWrapper _lstequipos = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnagregar = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.httputils2service _httputils2service = null;
public static void  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="campeonatosequipos";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}); return;}
ResumableSub_Activity_Create rsub = new ResumableSub_Activity_Create(null,_firsttime);
rsub.resume(processBA, null);
}
public static class ResumableSub_Activity_Create extends BA.ResumableSub {
public ResumableSub_Activity_Create(b4a.example.campeonatosequipos parent,boolean _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
b4a.example.campeonatosequipos parent;
boolean _firsttime;
b4a.example.httpjob _job = null;
b4a.example.campeonato _respuesta = null;
anywheresoftware.b4a.objects.collections.List _respuestalista = null;
b4a.example.equipo _equip = null;
anywheresoftware.b4a.BA.IterableList group15;
int index15;
int groupLen15;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="campeonatosequipos";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="Activity.LoadLayout(\"listaEquiposbyCampeonatos\")";
parent.mostCurrent._activity.LoadLayout("listaEquiposbyCampeonatos",mostCurrent.activityBA);
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="Dim Job As HttpJob";
_job = new b4a.example.httpjob();
RDebugUtils.currentLine=2752518;
 //BA.debugLineNum = 2752518;BA.debugLine="Job.Initialize(\"Job\",Me)";
_job._initialize /*String*/ (null,processBA,"Job",campeonatosequipos.getObject());
RDebugUtils.currentLine=2752519;
 //BA.debugLineNum = 2752519;BA.debugLine="lstEquipos.SingleLineLayout.Label.TextColor=Color";
parent.mostCurrent._lstequipos.getSingleLineLayout().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=2752522;
 //BA.debugLineNum = 2752522;BA.debugLine="camp_equi.Initialize";
parent._camp_equi._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=2752523;
 //BA.debugLineNum = 2752523;BA.debugLine="Wait For (camp_equi.Read_One(Main.idCampeonato))";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "campeonatosequipos", "activity_create"), parent._camp_equi._read_one /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,parent.mostCurrent._main._idcampeonato /*String*/ ));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_respuesta = (b4a.example.campeonato) result[0];
;
RDebugUtils.currentLine=2752524;
 //BA.debugLineNum = 2752524;BA.debugLine="Job.Download(respuesta.Imagen)";
_job._download /*String*/ (null,_respuesta._imagen /*String*/ );
RDebugUtils.currentLine=2752525;
 //BA.debugLineNum = 2752525;BA.debugLine="txtNomCamp.Text = respuesta.Nombre";
parent.mostCurrent._txtnomcamp.setText(BA.ObjectToCharSequence(_respuesta._nombre /*String*/ ));
RDebugUtils.currentLine=2752526;
 //BA.debugLineNum = 2752526;BA.debugLine="Wait For (Job) JobDone (Job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "campeonatosequipos", "activity_create"), (Object)(_job));
this.state = 14;
return;
case 14:
//C
this.state = 1;
_job = (b4a.example.httpjob) result[0];
;
RDebugUtils.currentLine=2752527;
 //BA.debugLineNum = 2752527;BA.debugLine="If Job.Success = True Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_job._success /*boolean*/ ==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=2752528;
 //BA.debugLineNum = 2752528;BA.debugLine="ImgCamp.Bitmap = Job.GetBitmap";
parent.mostCurrent._imgcamp.setBitmap((android.graphics.Bitmap)(_job._getbitmap /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ (null).getObject()));
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=2752532;
 //BA.debugLineNum = 2752532;BA.debugLine="Wait For (camp_equi.Read_All_Equipos_By_Campeonat";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "campeonatosequipos", "activity_create"), parent._camp_equi._read_all_equipos_by_campeonato /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,parent.mostCurrent._main._idcampeonato /*String*/ ));
this.state = 15;
return;
case 15:
//C
this.state = 5;
_respuestalista = (anywheresoftware.b4a.objects.collections.List) result[0];
;
RDebugUtils.currentLine=2752533;
 //BA.debugLineNum = 2752533;BA.debugLine="If respuestalista.Size > 0 Then";
if (true) break;

case 5:
//if
this.state = 12;
if (_respuestalista.getSize()>0) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=2752534;
 //BA.debugLineNum = 2752534;BA.debugLine="For Each equip As Equipo In respuestalista";
if (true) break;

case 8:
//for
this.state = 11;
group15 = _respuestalista;
index15 = 0;
groupLen15 = group15.getSize();
this.state = 16;
if (true) break;

case 16:
//C
this.state = 11;
if (index15 < groupLen15) {
this.state = 10;
_equip = (b4a.example.equipo)(group15.Get(index15));}
if (true) break;

case 17:
//C
this.state = 16;
index15++;
if (true) break;

case 10:
//C
this.state = 17;
RDebugUtils.currentLine=2752535;
 //BA.debugLineNum = 2752535;BA.debugLine="lstEquipos.AddSingleLine(equip.Nombre)";
parent.mostCurrent._lstequipos.AddSingleLine(BA.ObjectToCharSequence(_equip._nombre /*String*/ ));
 if (true) break;
if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=2752539;
 //BA.debugLineNum = 2752539;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="campeonatosequipos";
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="campeonatosequipos";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="End Sub";
return "";
}
public static String  _btnagregar_click() throws Exception{
RDebugUtils.currentModule="campeonatosequipos";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnagregar_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnagregar_click", null));}
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Private Sub btnAgregar_Click";
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="End Sub";
return "";
}
}