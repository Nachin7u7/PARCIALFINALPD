package ejercicioProxy;

//	15 % Proxy : Se tienen 2 servidores que son parte de un cluster donde en cada servidor se
//	tiene la misma aplicaci�n web, se tiene configurado un proxy que va almacenando a los
//	usuarios( id,nombre, pwd) que realizan login (verificar si el pwd es correcto), si el id del usuario
//	que se acaba de loguear es un n�mero primo se guarda en el servidor1 si no es primo se
//	guarda en el segundo servidor. (hacer la prueba con un usuario con id que sea primo y con id
//	que no sea primo)

public class Cliente {

	Proxyy p = new Proxyy("contrase�a1");

	Usuario user = new Usuario("2", "juan", "contrase�a1");
	Usuario user2 = new Usuario("3", "messi", "contrase�a2");
	
	p.setUser(user);
	p.show();
	
	p.setUser(user2);
	p.show();
}
