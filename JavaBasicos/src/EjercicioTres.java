import java.util.Scanner;

public class EjercicioTres {

	public static void main(String[] args) {
		
		
		
		System.out.println("Introduce el total de la compra");
		Scanner compra = new Scanner(System.in);
		int total = compra.nextInt();
		
		
		if(total <= 1000)
		{System.out.print(total);}
		else if (total > 1000 && total  < 5000)
		{System.out.print(total *.9);}
		else if (total >= 5000 && total  < 10000)
		{System.out.print(total *.8);}
		else 
		{System.out.print(total *  .7);}
	}
}


