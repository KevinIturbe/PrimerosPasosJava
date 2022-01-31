import java.util.Scanner;

public class EstructuraDeControlSwitch {
/*
 * 
 switch(condicion_a_evaluar) {
 case "valor":
 	//codigo a ejecutar
  	//break
  	 ...
  case "n" :
  	//código a ejecutar
  	//break
  default:
  	//codigo a ejecutar 
  }
 * 
 */

//Solicitar al usuario un dia de la semana y mostrarle un mensaje
	public static void main(String[] args) {
	System.out.println("Introduce un día de la semana");
	Scanner sc = new Scanner(System.in);
	String dia = sc.nextLine();
	
	
	switch(dia.toLowerCase()) {
	case "lunes":
		System.out.println("Luneeees");
		break;
	case "martes":
		System.out.println("lunes chiquito");
		break;
	case "miercoles":
		System.out.println("miercoles pero a qué costo");
		break;
	case "jueves":
		System.out.println("juebebes");
		break;
	case "viernes":
		System.out.println("Por fin");
		break;
	default: 
		System.out.println("No es día")
	}
	
}}