import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Colecciones {
	
public static void main(String[] args) {
	
	
	/* Tiene 3 imlementaciones
	 * Hashset
	 * Treeset
	 *LinkedHashSet   

	Set<String> frutas = new HashSet<String>();
	frutas.add("mango");
	frutas.add("granadas");
	frutas.add("piña");
	frutas.add("mamey");
	frutas.add("fresa");
//for each puede recorrer una coleccion y en cada recorrido recupera el valor y lo podemos
	//almacenar en una variable 
	
	//Sintaxis
	//for (tipodeDatoElemento variable : elementoARecorrer)
	
	for(String fruta : frutas)
	{System.out.println(fruta);
	
	
	Set<String> frutas = new HashSet<Strings>();
	frutas.add("mango");
	frutas.add("granadas");
	frutas.add("piña");
	frutas.add("mamey");
	frutas.add("fresa");
	
	
	} 
	
	
	//TreeSet los ordena alfabeticamente 
	//es más lenta
	
	Set<String> frutas = new TreeSet<Strin>();
	frutas.add("mango");
	frutas.add("granadas");
	frutas.add("piña");
	frutas.add("mamey");
	frutas.add("fresa");
	
	for(String fruta : frutas)
	{System.out.println(fruta);
	
	
	LinkedHashSet
	Ordena los elementos en orden de inserción
	es más lento
	
	
	
	Set<String> frutas = new LinkedHashSet<String>();
	frutas.add("mango");
	frutas.add("granadas");
	frutas.add("piña");
	frutas.add("mamey");
	frutas.add("fresa");
	
	for(String fruta : frutas)
	{System.out.println(fruta);
	}*/
	
	
	//Listas 
	//ArrayList
	//LinkedList
	//Acceder a elementos
	//Buscar elementos
	
	List<String> Pokemons  = new ArrayList<String>();
	
	Pokemons.add("Chikorita");
	Pokemons.add("Eevee");
	Pokemons.add("Psyduck");
	Pokemons.add("Gengar");
	Pokemons.add("Flygon");
	
	Pokemons.add(2, "Bulbasaur");
	//Estamos insertando el elemento a la posición indicada, los demás los desplaza
	for(String Pokemon : Pokemons)
	{
		System.out.println(Pokemon);
	}
	
	System.out.println("*************");
	System.out.println(Pokemons.get(0)); //Estoy accediendo al elemento especifico 
	
	
	System.out.println(Pokemons.indexOf("Gengar"));
	//System.out.println(Pokemon.lastIndexOf("GEngar") como si tuvieramos otro elemento repetido 
	
	Pokemons.set(0, "Flareon");
	System.out.println(Pokemons);
	// remove remueve el elemente de la posición especificada 
	
	
	
	//LinkedList es una lista doblemente enlazada
	//Es rapida para insertar y remover elementos
	List<String>digimones = new LinkedList<String>();
	digimones.add("Agumon");
	digimones.add("Patamon");
	digimones.add("Angewomon");
	
	
	//Map 
	//Asocia claves a valores
	//NO puede contener claves duplicadas
	//Solo puede tener un valor asociado
	
	//HashMap
	//Tiene mejor rendimiento pero no garantiza un orden
	//a la hora de hacer interacciones
	
	Map<Integer, String> usuarios = new HashMap<Integer, String>();
	usuarios.put(1,  "Kevin Iturbe");
	usuarios.put(2, "Raúl Sanchez");
	usuarios.put(3,  "Ro");
	
	System.out.println(usuarios.get(1));
	
	//KeySet
	//nos permite recuperar el nombre de la clave
	System.out.println(usuarios.keySet());
	//Values
	//Nos permite recuperar el valor directamente
	
	System.out.println(usuarios.values());
	
	//TreeMap
	Map<String, String> tamales = new TreeMap<String,String>();
	tamales.put("oaxaqueño", "Mole");
	tamales.put("salado", "tamal salado");
	tamales.put("torta", "verde");
	
	System.out.println(tamales.keySet());
//Guarda los elementos segun el orden de inserción
	Map<Integer, String> carros = new LinkedHashMap <Integer, String>();
	carros.put(1, "Volvo");
	carros.put(2, "tsuru");
	carros.put(8, "bocho");
	carros.put(4, "mustang");
	
	
	System.out.println(carros.values());
	}
}

