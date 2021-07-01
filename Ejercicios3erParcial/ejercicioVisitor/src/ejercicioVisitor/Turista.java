package ejercicioVisitor;

public class Turista implements IVisit {

	public Turista(String nombre, int dinero, long ci) {
		super();
		this.nombre = nombre;
		this.dinero = dinero;
		this.ci = ci;
	}

	String nombre;
	int dinero;
	long ci;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	public long getCi() {
		return ci;
	}

	public void setCi(long ci) {
		this.ci = ci;
	}

	@Override
	public void visit(LaPaz lp) {
		System.out.println();
		System.out.println("Visitando La Paz...");
		lp.show();
		System.out.println("Dinero del turista: " + dinero);
		int gasto = (int) (Math.random() * dinero);
		System.out.println("");
	}

	@Override
	public void visit(Cochabamba cbba) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(SantaCruz sc) {
		// TODO Auto-generated method stub

	}

}
