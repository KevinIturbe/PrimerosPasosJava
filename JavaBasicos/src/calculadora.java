import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {
	System.out.println("Introduce un n�mero");
	Scanner sc = new Scanner(System.in);
	int numero = sc.nextInt();
	System.out.println("Introduce otro n�mero");
	Scanner ssc = new Scanner(System.in);
	int numero2 = ssc.nextInt();
	System.out.println("Introduce una operaci�n\r\n"
			+ "1)Suma\r\n"
			+ "2) Resta\r\n"
			+ "3) Divisi�n\r\n"
			+ "4) Multiplicaci�n\r\n");
	Scanner op = new Scanner(System.in);
	int eleccion = op.nextInt();
	
	switch(eleccion) {
	case 1: 
	System.out.print(numero + numero2);
	break;
	case 2: 
	System.out.print(numero - numero2);
	break;
	case 3: 
	System.out.print(numero / numero2);
	break;
	case 4: 
	System.out.print(numero * numero2);
	break;
	default:
	System.out.println("No mi chavo")
	}
	}}
