
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class campeonatos {
    public static RemoteObject myClass;
	public campeonatos() {
	}
    public static PCBA staticBA = new PCBA(null, campeonatos.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _apiurl = RemoteObject.createImmutable("");
public static RemoteObject _api = RemoteObject.declareNull("b4a.example.httpjob");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"api",_ref.getField(false, "_api"),"apiUrl",_ref.getField(false, "_apiurl")};
}
}