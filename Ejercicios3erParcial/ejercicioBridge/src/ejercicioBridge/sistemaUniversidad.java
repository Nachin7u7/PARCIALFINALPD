package ejercicioBridge;

public class sistemaUniversidad implements ISistemas {

	public sistemaUniversidad(IRed redSocial) {
		super();
		this.red = redSocial;
	}

	public sistemaUniversidad(String nombre, String[] estudiantes, String requisitos, int capacidad) {
		super();
		this.nombre = nombre;
		this.estudiantes = estudiantes;
		this.requisitos = requisitos;
		this.capacidad = capacidad;
	}

	String nombre, estudiantes[], requisitos;
	int capacidad;
	IRed red;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String[] getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(String[] estudiantes) {
		this.estudiantes = estudiantes;
	}

	public String getRequisitos() {
		return requisitos;
	}

	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public void show() {
		System.out.println();
		System.out.println("nombre: " + nombre);
		System.out.println("estudiantes: ");
		for (int i = 0; i <= estudiantes.length - 1; i++)
			System.out.println("	" + estudiantes[i]);
		System.out.println("requisitos: " + requisitos);
		System.out.println("capacidad: " + capacidad);
	}

}
