package ejercicioVisitor;

public class Cochabamba implements IDepartamento {

	public Cochabamba(String nombre, String provicias, String clima, int numeroHabitantes, int dineroTurismo) {
		super();
		this.nombre = nombre;
		this.provicias = provicias;
		this.clima = clima;
		this.numeroHabitantes = numeroHabitantes;
		this.dineroTurismo = dineroTurismo;
	}

	String nombre, provicias, clima;
	int numeroHabitantes, dineroTurismo;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProvicias() {
		return provicias;
	}

	public void setProvicias(String provicias) {
		this.provicias = provicias;
	}

	public String getClima() {
		return clima;
	}

	public void setClima(String clima) {
		this.clima = clima;
	}

	public int getNumeroHabitantes() {
		return numeroHabitantes;
	}

	public void setNumeroHabitantes(int numeroHabitantes) {
		this.numeroHabitantes = numeroHabitantes;
	}

	public int getDineroTurismo() {
		return dineroTurismo;
	}

	public void setDineroTurismo(int dineroTurismo) {
		this.dineroTurismo = dineroTurismo;
	}

	@Override
	public void show() {
		System.out.println();
		System.out.println("Clima: " + clima);
		System.out.println("Habitantes: " + numeroHabitantes);
		System.out.println("Dinero de turismo: " + dineroTurismo);
	}

	@Override
	public void aceptar(IVisit turista) {
		turista.visit(this);
	}

}
