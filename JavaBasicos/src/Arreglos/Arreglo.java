package Arreglos;
public class Arreglo {
	public static void main(String[] args) {
		int numeros[];
		numeros = new int[4];
		
		//Segunda forma
		String[] nombres = new String[4];
		
		//Tercera forma
		String[]nombreFrutas = new String[] {"manzana", "uva", "pera", "platano"};
		
		
		
		
		
		numeros[0] = 10;
		numeros[1] = 8;
		numeros[2] = 100;
		numeros[3] = 2000;
		
		nombres[0] = "Juan";
		nombres[1] = "Pedro";
		nombres[2] = "Antonio"
		nombres[3] = "Felipe"
		
		System.out.println(numeros[0]);
		
		
		for (int i =0; i< numeros.length; i++) 
		{System.out.println("Elemento de números " + numeros[i]);
		}
	}

}
