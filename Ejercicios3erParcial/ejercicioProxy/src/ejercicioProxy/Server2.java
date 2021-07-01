package ejercicioProxy;

public class Server2 implements IServer {

	@Override
	public void login(int user) {
		System.out.println("servidor 2:");
		System.out.println("Se logeo al usuario" + user);
	}

}
