
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class campeonato {
    public static RemoteObject myClass;
	public campeonato() {
	}
    public static PCBA staticBA = new PCBA(null, campeonato.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _id = RemoteObject.createImmutable(0);
public static RemoteObject _nombre = RemoteObject.createImmutable("");
public static RemoteObject _estado = RemoteObject.createImmutable(0);
public static RemoteObject _fecha_inicio = RemoteObject.createImmutable("");
public static RemoteObject _imagen = RemoteObject.createImmutable("");
public static RemoteObject _delete_status = RemoteObject.createImmutable(0);
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Delete_Status",_ref.getField(false, "_delete_status"),"Estado",_ref.getField(false, "_estado"),"Fecha_Inicio",_ref.getField(false, "_fecha_inicio"),"Id",_ref.getField(false, "_id"),"Imagen",_ref.getField(false, "_imagen"),"Nombre",_ref.getField(false, "_nombre")};
}
}