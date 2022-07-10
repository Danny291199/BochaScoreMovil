
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class campeonatosequipos implements IRemote{
	public static campeonatosequipos mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public campeonatosequipos() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("campeonatosequipos"), "b4a.example.campeonatosequipos");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, campeonatosequipos.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _camp_equi = RemoteObject.declareNull("b4a.example.campequipos");
public static RemoteObject _txtnomcamp = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _imgcamp = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _lstequipos = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _btnagregar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",campeonatosequipos.mostCurrent._activity,"btnAgregar",campeonatosequipos.mostCurrent._btnagregar,"camp_equi",campeonatosequipos._camp_equi,"HttpUtils2Service",Debug.moduleToString(b4a.example.httputils2service.class),"ImgCamp",campeonatosequipos.mostCurrent._imgcamp,"lstEquipos",campeonatosequipos.mostCurrent._lstequipos,"Main",Debug.moduleToString(b4a.example.main.class),"Starter",Debug.moduleToString(b4a.example.starter.class),"txtNomCamp",campeonatosequipos.mostCurrent._txtnomcamp,"xui",campeonatosequipos._xui};
}
}