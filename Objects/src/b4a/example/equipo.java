package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class equipo extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.equipo");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.equipo.class).invoke(this, new Object[] {null});
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
public int _id = 0;
public String _nombre = "";
public String _imagen = "";
public String _fecha_creacion = "";
public int _delete_status = 0;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.campeonatosequipos _campeonatosequipos = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _initialize(b4a.example.equipo __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="equipo";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.equipo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="equipo";
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="Public Id 		    As Int";
_id = 0;
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="Public Nombre 		As String";
_nombre = "";
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="Public Imagen As String";
_imagen = "";
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="Public Fecha_Creacion As String";
_fecha_creacion = "";
RDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="Public Delete_Status As Int";
_delete_status = 0;
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="End Sub";
return "";
}
}