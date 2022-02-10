package paquete2;

import paquete1.ClaseDefault;
import paquete1.ClaseProtected;

public class Main {
public static void main extends (String[] args) {
	//ClaseDefault prueba = new ClaseDefault();

	//prueba.mostrar
	
	ClasePrivada privada = new ClasePrivada();
	
	privada.edad = 30;
	privada.nombre = "Juan";
	
	privada.setSaludar("Juan");
	
	System.out.println(privada.getSaludar());
	
ClaseProtected protegido = new ClaseProtected ();

protegido.setEdad(50);
}
}
