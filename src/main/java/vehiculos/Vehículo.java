package vehiculos;

import java.util.ArrayList;

public class Vehículo {
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	private static int CantidadVehiculos;
	private static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
	
	//Constructores
	public Vehículo() {
		Vehículo.CantidadVehiculos ++;
	}
	
	public Vehículo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		Vehículo.CantidadVehiculos ++;
		this.fabricante.getPais().aumentarCreados();
		this.fabricante.aumentarVentas();
	}
	
	//metodos get
	public String getPlaca() {
		return(this.placa);
	}
	
	public int getPuertas() {
		return(this.puertas);
	}
	
	public int getVelocidadMaxima() {
		return(this.velocidadMaxima);
	}
	
	public String getNombre() {
		return(this.nombre);
	}
	
	public int getPrecio() {
		return(this.precio);
	}
	
	public int getPeso() {
		return(this.peso);
	}
	
	public String getTraccion() {
		return(this.traccion);
	}
	
	public Fabricante getFabricante() {
		return(this.fabricante);
	}
	
	public static int getCantidadVehiculos() {
		return(Vehículo.CantidadVehiculos);
	}
	
	//metodos set
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	public static void setCantidadVehiculos(int cantidadVehiculos) {
		Vehículo.CantidadVehiculos = cantidadVehiculos;
	}
	
	//metodos de la clase
	public static String vehiculosPorTipo() {
		return ("Automoviles: " + String.valueOf(Automóvil.getCantidadAutomovil()) + "\n" + "Camionetas: " + String.valueOf(Camioneta.getCantidadCamionetas()) + "\n" + "Camiones: " + String.valueOf(Camion.getCantidadCamion()));
	}
	
	public static País paisMasVendedor() {
		int max = 0;
		int maxIndice = 0;
		for (int i = 0; i < fabricantes.size(); i++) {
			if(fabricantes.get(i).getPais().getCantidadCreados() > max) {
				max = fabricantes.get(i).getPais().getCantidadCreados();
				maxIndice = i;
			}
		}
		return (fabricantes.get(maxIndice).getPais());
	}
	
	public static Fabricante fabricaMayorVentas() {
		int max = 0;
		int maxIndice = 0;
		for(int i = 0; i < fabricantes.size(); i++) {
			if(fabricantes.get(i).getCantidadVentas() > max) {
				max = fabricantes.get(i).getCantidadVentas();
				maxIndice = i;
			}
		}
		return (fabricantes.get(maxIndice));
	}
}
