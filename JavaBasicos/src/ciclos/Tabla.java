package ciclos;
import java.util.Scanner;

	public class Tabla
	{
		
	    public static void main(String[] args)
	    {
	        Scanner console = new Scanner(System.in);
	        int num;
	        
	        System.out.print("Ingresa cualquier n�mero positivo: ");
	        num = console.nextInt();
	                
	        System.out.println("Tabla de multiplicar de  " + num);
	        
	       //Implementa un bucle while que imprima el resultado
	        
	        int num2 = 0;
	    	
	    	while(num2 < 11) {
	    		System.out.println(num2*num);
	    		num2++;
	    	}
	        
	    }
	}	
/*
3.- Debe imprimir la tabla de multiplicar del n�mero en cuesti�n (solo los primeros 10 n�meros)
*/