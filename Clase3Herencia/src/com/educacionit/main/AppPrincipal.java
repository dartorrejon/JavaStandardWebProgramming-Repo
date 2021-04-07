package com.educacionit.main;



import java.util.ArrayList;

import com.educacionit.clasePadre.Persona;
import com.educacionit.modelos.Entrenador;
import com.educacionit.modelos.Futbolista;
import com.educacionit.modelos.Masajista;



public class AppPrincipal {
	
	public static ArrayList<Persona> integrantes = new ArrayList<Persona>();
	
	public static void main(String[] args) {
		
		//Array de objetos - Seleccion de futbol
		//Independientemente de la clase hija a la que 
		//pertenezca el objeto
		
		
		
		Entrenador delBosque = new Entrenador(1,"Vicente","del Bosque",60,"25ZZ450");
		Futbolista Raul = new Futbolista(2,"Andres","Iniesta",29,6,"Interior derecho");
		Masajista Carlos = new Masajista(3,"Carlos", "Martinez", 45, "Licenciado en Fisioterapia", 20);
		
		//Agrego los objetos al Array
		integrantes.add(delBosque);
		integrantes.add(Raul);
		integrantes.add(Carlos);
		//		UTILIZAMOS LOS METODOS PROPIOS DE LA CLASE PADRE
		//concentracion
		System.out.println("Todos los integrantes realizan la concentracion.");
		for (Persona aux : integrantes) {
			System.out.println(aux.getNombre()+" "+aux.getApellido()+"->");
			aux.viajar();
			aux.concentrarse();
		}
		
		System.out.println("UTILIZAMOS LOS METODOS PROPIOS DE LAS CLASES HIJAS");
		//ENTRENAMIENTO
		System.out.println("Entrenamiento de futbol:Solamente el entrenador y el futbolista tienen metodos para entrar");
		System.out.println(delBosque.getNombre()+" "+delBosque.getApellido()+"->");
		delBosque.dirigirEntrenamiento();
		System.out.println(Raul.getNombre()+" "+Raul.getApellido()+"->");
		Raul.entrenar();
		
		//MASAJE
		System.out.println("Solo el masajista tiene el metodo para dar un masaje");
		System.out.println(Carlos.getNombre()+" "+Carlos.getApellido()+"->");
		Carlos.darMasaje();
		
		//Partido de futbol
		System.out.println("Solamente el entrenador y los futbolistas tienen metodos para los partidos");
		System.out.println(delBosque.getNombre()+" "+delBosque.getApellido()+"->");
		delBosque.dirigirPartido();
		System.out.println(Raul.getNombre()+" "+Raul.getApellido()+"->");
		Raul.jugarPartido();
		
	}
}
