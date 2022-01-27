package operadores;

public class Operadores {
	public static void main(String[] args){
	int a = 10;
	int b = 20;
	double c = 10.0;
	
	int suma = a + b;
	System.out.println(suma);
	
	String str1 = "El resultado de la suma es:";
	System.out.println(str1 + suma);
	
	System.out.println("El resultdo de la resta" + (a -b));
	
	int division = a / b;
	System.out.println("El resultado de la division es: " + division);
	
	double division2 = (double) a / b;
	
	//Para que un resultado sea double al menos uno de los resultado debe ser double
	System.out.println("El resultado de la division es: " + division2);
	
	
	double multiplicacion = c * a;
	System.out.println("El resultado de la division es: " + multiplicacion);
	
	
	
	int d = 5, e; //podemos inicializar variables vacias
	e=6;
	System.out.println(d + " - " + e );
	
	//Operadores de declaración compuesta
	//+- /= 
	//Operacion simplificada
	
	int f = 0, g = 5;
	f += 5;
	System.out.println(f);
	
	//Operadores relacionales
	//resultado de tipo boolean 
	//igual ==
	// != diferencia
	
	int h = 15, i = 25;
	String j = "Hola";
	
	System.out.print(h > i);//false
	System.out.println(i != h);
	//System.out.println(h != j); Son valores de diferentes tipos y no se puedenn comparar
	
	
	//Operador unario
	/*++ --
	 * preasignación
	 * protasignación
	 * 
	 */
	int k = 0, l = 0;
	System.out.println(++k);
	
	
	
	//Operador ternario
	
	int edad = 18, valor1 = 0, valor2 = 1;
	int resultado = (edad <= 18) ? valor1 = 1 : valor2 ;
	System.out.println(resultado);
}
}
