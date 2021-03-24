package com.educacionit.main;

import java.util.ArrayList;

import com.educacionit.clasePadre.Persona;
import com.educacionit.modelos.Entrenador;
import com.educacionit.modelos.Futbolista;
import com.educacionit.modelos.Masajista;

import jdk.swing.interop.SwingInterOpUtils;

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
		
		//concentracion
		System.out.println("Todos los integrantes realizan la concentracion.");
		for (Persona aux : integrantes) {
			System.out.println(aux.getNombre()+" "+aux.getApellido()+"->");
			aux.viajar();
			aux.concentrarse();
		}
		
		
	}
}
