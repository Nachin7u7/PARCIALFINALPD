package ejercicioAdapter;

public class CuadraElectrico {

	int carga;

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	void cargar(int carga) {
		if (carga % 2 == 0 && carga < 20)
			this.carga = carga;
	}

	void estadoDeElectricidad() {
		int cantidad = (int) (Math.random() * 10 + 1);
		System.out.println("Carga: " + cantidad);
	}

}
