import java.util.Scanner;

public class ScanneryBuffer {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Introduce un número");
			int numero1 = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Introduce tu nombre");
			String nombre = sc.nextLine();
	
			
		
			System.out.println("Tu nombre es: " + nombre + 
					"Tu número es" + numero1);
		}
	}
}
