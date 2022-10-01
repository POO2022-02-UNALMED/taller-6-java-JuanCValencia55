package vehiculos;

public class Fabricante {
	private String nombre;
	private País pais;
	private int cantidadVentas;
	
	//Constructores
	public Fabricante() {
		
	}
	
	public Fabricante(String nombre, País pais) {
		this.nombre = nombre;
		this.pais = pais;
	}
	//Metodos get
	public String getNombre() {
		return(this.nombre);
	}
	
	public País getPais() {
		return(this.pais);
	}
	
	public int getCantidadVentas() {
		return(this.cantidadVentas);
	}
	//Metodos set
	public void setPais(País pais) {
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
}
