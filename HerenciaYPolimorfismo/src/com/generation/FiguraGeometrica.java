package com.generation;

public class FiguraGeometrica {
	 private String nombre;
	private float alto;
	private float largo;
	//Clases abstractas
	//Clases que pueden o no contener m�todos abstractos
	//No podemos crear objetos de la clase abstracta 
	//Es para heredar
	//Metodo abstracto te dice que hacer pero no como hacerlo
	public FiguraGeometrica(String nombre) {
		this.nombre = nombre;}
	
	public FiguraGeometrica () {}
	
	public float calcularArea() {
		return alto * largo;}
		

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getAlto() {
		return alto;
	}

	public void setAlto(float alto) {
		this.alto = alto;
	}

	public float getLargo() {
		return largo;
	}

	public void setLargo(float largo) {
		this.largo = largo;
	}
	
	
}
