package ejercicioProxy;

public class Server1 implements IServer {

	@Override
	public void login(int user) {
		System.out.println("servidor 1:");
		System.out.println("Se logeo al usuario" + user);
	}

}
