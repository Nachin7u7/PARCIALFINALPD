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
		setDinero(dinero - gasto);
		System.out.println("Gasto en La Paz: " + gasto);
		System.out.println("Dinero del turista despues del gasto: " + dinero);
	}

	@Override
	public void visit(Cochabamba cbba) {
		System.out.println();
		System.out.println("Visitando Cochabamba...");
		cbba.show();
		System.out.println("Dinero del turista: " + dinero);
		int gasto = (int) (cbba.getNumeroHabitantes() * 0.1);
		System.out.println("Gasto en Cochabamba: " + gasto);
		System.out.println("Dinero del turista despues del gasto: " + dinero);
	}

	@Override
	public void visit(SantaCruz sc) {
		System.out.println();
		System.out.println("Visitando SantaCruz...");
		sc.show();
		System.out.println("Dinero del turista: " + dinero);
		int gasto = (int) (sc.getNumeroHabitantes() * 0.5);
		System.out.println("Gasto en Cochabamba: " + gasto);
		System.out.println("Dinero del turista despues del gasto: " + dinero);
	}

}
