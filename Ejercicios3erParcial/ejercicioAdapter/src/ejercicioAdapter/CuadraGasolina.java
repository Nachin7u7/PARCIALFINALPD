package ejercicioAdapter;

public class CuadraGasolina implements ICuadra {

	int combustible;

	public int getCombustible() {
		return combustible;
	}

	public void setCombustible(int combustible) {
		this.combustible = combustible;
	}

	@Override
	public void llenarGasolina(int cantidad) {
		setCombustible(cantidad);
	}

	@Override
	public void estadoCombustible() {
		int cantidad = (int) (Math.random() * 50 + 1);
		System.out.println("Combustible: " + cantidad);
	}

}
