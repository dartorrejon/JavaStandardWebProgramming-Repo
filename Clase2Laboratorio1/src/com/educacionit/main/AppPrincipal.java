package com.educacionit.main;

import com.educacionit.clases.Domicilio;
import com.educacionit.clases.Persona;

public class AppPrincipal {
	public static void main(String[] args) {
		Domicilio d1 = new Domicilio("Las Golondrinas",1568,"Salta Capital");
		Persona p1 = new Persona("Dario", "Torrejon", 37, d1);
		Persona p2 = new Persona();
		
		System.out.println(p1);
		
		
		
	}
}
