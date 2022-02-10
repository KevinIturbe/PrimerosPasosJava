package paquete2;

public class ClasePrivada {
	//atributos
	public String nombre;
	public int edad;
	
	//Método
	public void setSaludar (String nombre) { //Fijar un valor
		this.nombre = nombre;
	}
	public String getSaludar() {
		return this.nombre;
	}
	
	}
}
