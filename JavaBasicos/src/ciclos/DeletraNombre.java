package ciclos;

import java.util.Scanner;

public class DeletraNombre {
	public static void main(String[] args) {
		System.out.println("Introduce tu nombre");
		Scanner nombre = new Scanner(System.in);
		String deletreo = nombre.next();
		
		
				
		for (int i = 0; i < deletreo.length(); i++) {System.out.println(deletreo.charAt(i));
	}
}
}
