package Arreglos;

public class ManipuladorArreglo {
public static void main(String[] args) {
	
/*

1, 6, 45, 53, 80, 102, 145, 326, 450, 892
Crea un programa que use un ciclo que tome los números de arreglo y devuelva la suma total, la suma de los números pares y la suma de los números impares.
*/
	
	
	int[]numeros = new int [] {1, 6, 45, 53, 80, 102, 145, 326, 450, 892};
	int suma = 0;
	int sumapar = 0;
	int sumaimpar = 0;
	
	for (int i =0; i <numeros.length; i++)
	{suma = suma + numeros[i];}
	System.out.println(suma);
	if (numeros[i] % == 0) {sumapar = sumapar + numeros[i];}
	
	
	/*
	{if (int i % = 0) {System.out.println(sumapar + i);
	else  {Systeout.println(sumaimpar + i); */
}
}