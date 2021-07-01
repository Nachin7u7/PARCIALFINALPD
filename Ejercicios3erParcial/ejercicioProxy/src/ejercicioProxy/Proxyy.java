package ejercicioProxy;

public class Proxyy implements IUser {

	public Proxyy(String pwd) {
		super();
		this.pwd = pwd;
	}

	String pwd;
	int cont = 0, cont2 = 0;

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	Usuario user;
	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

	Server1 server1;
	Server2 server2;

	@Override
	public void show() {
		if (pwd.equals(user.getPwd())) {
			System.out.println("Contraseña correcta!");
			cont++;
			for (int i = 0; i <= cont; i++) {
				if (cont % i == 0)
					cont2++;
			}
			if (cont2 == 2) {
				server1.login(cont);
			} else
				server2.login(cont);
		}
		cont2 = 0;
	}

}
