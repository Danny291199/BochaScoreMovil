
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class login {
    public static RemoteObject myClass;
	public login() {
	}
    public static PCBA staticBA = new PCBA(null, login.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _msg = RemoteObject.createImmutable("");
public static RemoteObject _username = RemoteObject.createImmutable("");
public static RemoteObject _nombre = RemoteObject.createImmutable("");
public static RemoteObject _apellido = RemoteObject.createImmutable("");
public static RemoteObject _campeonatoid = RemoteObject.createImmutable("");
public static RemoteObject _codigo = RemoteObject.createImmutable("");
public static RemoteObject _rol = RemoteObject.createImmutable("");
public static RemoteObject _token = RemoteObject.createImmutable("");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.campeonatosequipos _campeonatosequipos = null;
public static b4a.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Apellido",_ref.getField(false, "_apellido"),"CampeonatoId",_ref.getField(false, "_campeonatoid"),"Codigo",_ref.getField(false, "_codigo"),"msg",_ref.getField(false, "_msg"),"Nombre",_ref.getField(false, "_nombre"),"Rol",_ref.getField(false, "_rol"),"Token",_ref.getField(false, "_token"),"UserName",_ref.getField(false, "_username")};
}
}