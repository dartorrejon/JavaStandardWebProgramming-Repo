package com.educacionit.main;

import com.educacionit.clases.Alumno;

public class AppPrincipal {
	public static void main(String[] args) {
		Alumno alu1 = new Alumno();
		Alumno alu2 = new Alumno();
		Alumno alu3 = new Alumno("Martinez", "Jose", 29);

		
		alu1.nombre = "Dario";
		alu1.apellido = "Torrejon";
		alu1.edad = 13;
		
		alu2.nombre = "Pablo";
		alu2.apellido = "Torrejon";
		alu2.edad = 33;
		
//		alu3.nombre = "Maria";
//		alu3.apellido = "Rordiguez";
//		alu3.edad = 21;
				

//		// Mostramos por consola el estado de los atributos del objeto alu1
//		System.out.println("Apellido: " + alu1.apellido);
//		System.out.println("Nombre: " + alu1.nombre);
//
//		// Mostramos por consola el estado de los atributos del objeto alu2
//		System.out.println("Apellido: " + alu2.apellido);
//		System.out.println("Nombre: " + alu2.nombre);
//
//		// Mostramos por consola el estado de los atributos del objeto alu3
//		System.out.println("Apellido: " + alu3.apellido);
//		System.out.println("Nombre: " + alu3.nombre);

		
		System.out.println("Alumno 1 "+alu1.toString());
		System.out.println("Alumno 2 "+alu2.toString());
		System.out.println("Alumno 3 "+alu3.toString());
	}
}
