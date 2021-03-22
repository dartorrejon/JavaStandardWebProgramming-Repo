package com.educacionit.ejercicio1;

import java.util.Scanner; //Importamos la librearia para poder tomar datos desde teclado
/*Determinar si un alumno aprueba un curso de programacion, sabiendo que aprobara
 * si su promedio de tres clasificaciones es mayor o igual a 7; reprueba en caso contrario*/

public class Ejercicio1 {
	public static void main(String[] args) {
		// Definimos la variables de entrada
		float nota1, nota2, nota3;
		float promedio;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese la nota 1: ");
		nota1 = teclado.nextFloat();
		
		System.out.println("Ingrese la nota2: ");
		nota2 = teclado.nextFloat();
		
		System.out.println("Ingrese la nota3: ");
		nota3 = teclado.nextFloat();
		
		promedio = (nota1+nota2+nota3)/3;
		
		if(promedio>=7) {
			System.out.println("El alumno esta aprobado");
		}else {
			System.out.println("El alumno esta reprobado");
		}
		
		
	}
}
