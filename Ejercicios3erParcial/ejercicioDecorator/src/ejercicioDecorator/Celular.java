package ejercicioDecorator;

public class Celular {

	public Celular(String marca, String ram, String almacenamiento, String cpu, int precio) {
		super();
		this.marca = marca;
		this.ram = ram;
		this.almacenamiento = almacenamiento;
		this.cpu = cpu;
		this.precio = precio;
	}

	String marca, ram, almacenamiento, cpu;
	int precio;

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(String almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

}
