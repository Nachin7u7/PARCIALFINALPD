package ejercicioProxy;

public class Usuario implements IUser {
	public Usuario(String id, String nombre, String pwd) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.pwd = pwd;
	}

	String id, nombre, pwd;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public void show() {
		System.out.println();
		System.out.println("Nombre:" + nombre);
		System.out.println("id:" + id);
		System.out.println("password:" + pwd);
	}
}
