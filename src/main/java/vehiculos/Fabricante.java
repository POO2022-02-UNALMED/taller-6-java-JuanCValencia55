package vehiculos;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private int cantidadVentas;
	
	//Constructores
	public Fabricante() {
		
	}
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
	}
	//Metodos get
	public String getNombre() {
		return(this.nombre);
	}
	
	public Pais getPais() {
		return(this.pais);
	}
	
	public int getCantidadVentas() {
		return(this.cantidadVentas);
	}
	//Metodos set
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setCantidadVentas(int cantidadVentas) {
		this.cantidadVentas = cantidadVentas;
	}
	
	//metodos de la clase
	public void aumentarVentas() {
		this.cantidadVentas ++;
	}
	
	public static Fabricante fabricaMayorVentas() {
		return(Vehiculo.fabricaMayorVentas());
	}
}
