package ejercicioVisitor;

//	15% Visitor : Se tienen los departamentos principales de Bolivia: La Paz , Cochabamba y
//	Santa Cruz cada uno con atributos (nombre,número provincias, numero habitantes , clima,
//	dinero por turismo), se tiene un turista (nombre,monto Dinero, ci)que desea viajar a todos los
//	departamentos y según el clima que tienen estos departamentos este desea realizar un gasto
//	de su monto de dinero que tiene disponible, para la ciudad de la paz un gasto de una cantidad
//	randomica, para cochabamba se desea gastar el 10% del total de su número de habitantes y en
//	santa cruz gasta una cantidad igual al 50% de su número de provincias.

public class Cliente {

	public static void main(String[] args) {

		LaPaz lp = new LaPaz("La Paz", "Murillo", "frio", 12000, 5900);
		Cochabamba cbba = new Cochabamba("Cochabamba", "Capinota", "calor", 15000, 6000);
		SantaCruz sc = new SantaCruz("Santa Cruz", "Andrés Ibáñez", "calor", 16000, 7000);

		Turista turista = new Turista("juan", 12000, 10924658);

		lp.aceptar(turista);
		cbba.aceptar(turista);
		sc.aceptar(turista);

	}

}
