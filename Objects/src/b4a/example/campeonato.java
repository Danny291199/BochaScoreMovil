package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class campeonato extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.campeonato");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.campeonato.class).invoke(this, new Object[] {null});
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
public int _estado = 0;
public String _fecha_inicio = "";
public String _imagen = "";
public int _delete_status = 0;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.campeonatosequipos _campeonatosequipos = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _initialize(b4a.example.campeonato __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="campeonato";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.campeonato __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="campeonato";
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="Public Id 		    As Int";
_id = 0;
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="Public Nombre 		As String";
_nombre = "";
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="Public Estado	    As Int";
_estado = 0;
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="Public Fecha_Inicio As String";
_fecha_inicio = "";
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="Public Imagen As String";
_imagen = "";
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="Public Delete_Status As Int";
_delete_status = 0;
RDebugUtils.currentLine=1966088;
 //BA.debugLineNum = 1966088;BA.debugLine="End Sub";
return "";
}
}