package ejercicioBridge;

public class sistemaEscuela implements ISistemas {

	String nombre, estudiantes[], requisitos;
	int capacidad;

	IRed red;

	public IRed getRed() {
		return red;
	}

	public void setRed(IRed red) {
		this.red = red;
	}

	public sistemaEscuela(IRed redSocial) {
		super();
		this.red = redSocial;
	}

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

	@Override
	public void integrar() {
		System.out.println("Integrando...");
		red.show();
	}

}
