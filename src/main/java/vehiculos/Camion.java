package vehiculos;

public class Camion extends Vehiculo {
	private int ejes;
	private static int CantidadCamion;
	//constructores
	public Camion() {
		super();
		Camion.CantidadCamion ++;
	}
	
	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		this.ejes = ejes;
		Camion.CantidadCamion ++;
	}
	
	//metodos get y set
	public int getEjes() {
		return(this.ejes);
	}
	
	public static int getCantidadCamion() {
		return(Camion.CantidadCamion);
	}
	
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	
	public static void setCantidadCamion(int cantidad) {
		Camion.CantidadCamion = cantidad;
	}
	
}
