package ejercicioAdapter;

public class CuadraElectricoAdaptado implements ICuadra {

	private CuadraElectrico cuadra;

	public CuadraElectricoAdaptado(CuadraElectrico cuadra) {
		System.out.println("Adaptando...");
		this.cuadra = cuadra;
	}

	@Override
	public void llenarGasolina(int cantidad) {
		System.out.println("Adaptando bateria...");
		cuadra.cargar(cantidad);
	}

	@Override
	public void estadoCombustible() {
		System.out.println("Adaptando estado electricidad...");
		cuadra.estadoDeElectricidad();
	}

}
