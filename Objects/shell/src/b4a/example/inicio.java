
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class inicio {
    public static RemoteObject myClass;
	public inicio() {
	}
    public static PCBA staticBA = new PCBA(null, inicio.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _username = RemoteObject.createImmutable("");
public static RemoteObject _contrasenia = RemoteObject.createImmutable("");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.campeonatosequipos _campeonatosequipos = null;
public static b4a.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Contrasenia",_ref.getField(false, "_contrasenia"),"Username",_ref.getField(false, "_username")};
}
}