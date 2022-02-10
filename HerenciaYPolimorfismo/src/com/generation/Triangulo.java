package com.generation;

public class Triangulo extends FiguraGeometrica  {
	public Triangulo() {
		super ("Triangulo");
		
		
		public float calcularArea() {
			return ( getAlto() * getLargo()) /2;
		}
	}
}
