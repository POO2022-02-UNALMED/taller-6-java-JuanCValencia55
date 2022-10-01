package vehiculos;

public class Camioneta extends Vehiculo {
	private boolean volco;
	private static int CantidadCamionetas;
	
	//constructores
	public Camioneta() {
		super();
	}
	
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.volco = volco;
	}
	
	//metodos get y set
	public boolean isVolco() {
		return(this.volco);
	}
	
	public static int getCantidadCamionetas() {
		return(Camioneta.CantidadCamionetas);
	}
	
	public void setVolco(boolean volco) {
		this.volco = volco;
	}
	
	public static void setCantidadCamionetas(int cantidadCamionetas) {
		Camioneta.CantidadCamionetas = cantidadCamionetas;
	}
}
