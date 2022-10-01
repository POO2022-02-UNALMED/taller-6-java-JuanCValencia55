package vehiculos;

public class País {
	private String nombre;
	private int cantidadCreados;
	
	//Constructor
	public País() {
		
	}
	
	public País(String nombre) {
		this.nombre = nombre;
	}
	//Metodos get y set
	public String getNombre(){
		return(this.nombre);
	}
	
	public int getCantidadCreados() {
		return(this.cantidadCreados);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setCantidadCreados(int cantidadCreados) {
		this.cantidadCreados = cantidadCreados;
	}
	
	//metodos de la clase
	public void aumentarCreados() {
		this.cantidadCreados ++;
	}
}
