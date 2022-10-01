package vehiculos;

public class Automóvil extends Vehículo {
	private int puestos;
	private static int CantidadAutomovil;
	
	//constructores
	public Automóvil() {
		super();
	}
	
	public Automóvil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
	}
	
	//metodos get y set
	public int getPuestos() {
		return(this.puestos);
	}
	
	public static int getCantidadAutomovil() {
		return(Automóvil.CantidadAutomovil);
	}
	
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	
	public static void setCantidadAutomovil(int cantidadAutomovil) {
		Automóvil.CantidadAutomovil = cantidadAutomovil;
	}
}
