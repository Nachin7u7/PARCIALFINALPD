package ejercicioAdapter;

//	15% Adapter : Se tiene una empresa de Cuadratracks que tiene 3 tipos de Cuadratracks (
//	Gasolina,Diesel, Gasolina Especial) estas Cuadratracks tienen los métodos de llenar gasolina
//	(setea un atributo capacidad entre 0 - 50) y estado del combustible( retorna un numero random
//	del 1 al 50), Esta empresa decide vender Cuadratracks Eléctricas pero este tiene como metodo
//	cargar (setea un número par entre 0-20) y estadoDeElectricidad (retorna numero random entre
//	1 - 10). se debe adaptar el Cuadratracks Eléctrico a la estructura de las primeras Cuadratracks.

public class Cliente {

	public static void main(String[] args) {

		CuadraElectrico electrico = new CuadraElectrico();

		CuadraDiesel diesel = new CuadraDiesel();
		CuadraGasolina gasolina = new CuadraGasolina();
		CuadraGasolinaEspecial especial = new CuadraGasolinaEspecial();

		CuadraElectricoAdaptado adaptado = new CuadraElectricoAdaptado(electrico);

		diesel.llenarGasolina(20);
		diesel.estadoCombustible();

		gasolina.llenarGasolina(30);
		gasolina.estadoCombustible();

		especial.llenarGasolina(40);
		especial.estadoCombustible();

		adaptado.llenarGasolina(50);
		adaptado.estadoCombustible();
	}

}
