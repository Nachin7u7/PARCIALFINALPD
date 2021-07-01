package ejercicioBridge;

//	15% Bridge : Se tienen 3 sistemas de control de inscripción de estudiantes, sistema de
//	colegio (nombre, capacidad, estudiantes[], requisitos), sistema de escuela(nombre, capacidad,
//	estudiantes[], requisitos) y sistema de universidad(nombre, capacidad, estudiantes[], requisitos),
//	a estos sistemas tienen inicialmente una integration con una red social: facebook donde
//	muestra los datos que tiene el sistema, pero se desea agregar integración a whatsapp y a
//	twitter para realizar la misma acción.

public class Cliente {

	public static void main(String[] args) {

		String estudiantes[] = { "juan", "pedro", "pablo", "messi" };

		sistemaEscuela escuela = new sistemaEscuela(new Facebook());
		sistemaColegio colegio = new sistemaColegio(new Whatsapp());
		sistemaUniversidad universidad = new sistemaUniversidad(new Twitter());

		escuela.setEstudiantes(estudiantes);
		escuela.setCapacidad(500);
		escuela.setNombre("Amor de Dios");
		escuela.setRequisitos("no ser ateo xd");

		escuela.show();
		escuela.integrar();

		colegio.setEstudiantes(estudiantes);
		colegio.setCapacidad(450);
		colegio.setNombre("Amoretti");
		colegio.setRequisitos("ninguno");

		colegio.show();
		colegio.integrar();

		universidad.setEstudiantes(estudiantes);
		universidad.setCapacidad(700);
		universidad.setNombre("UPB");
		universidad.setRequisitos("notas de excelencia");

		universidad.show();
		universidad.integrar();

	}

}
