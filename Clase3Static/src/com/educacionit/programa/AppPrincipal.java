package com.educacionit.programa;

import java.util.Scanner;

import com.educacionit.modelos.Calculadora;

public class AppPrincipal {
	public static void main(String[] args) {
//		Estudiante e1 = new Estudiante();
//		e1.mostrarInfo();
//		Estudiante e2 = new Estudiante();
//		e2.mostrarInfo();
//		
//		//Accedemos a la variable estatica "b" desde el
//		//objeto e incrementamos en 1 su valor.
//		e1.b++;	
//		
//		
//		//Accedemos a la variable esatica "b" desde la
//		//clase direcamente e incrementamos en 1 su valor.
//		Estudiante.mostarInfoStatic();
		
		Scanner t1 = new Scanner(System.in);
		
		System.out.println("Ingrese el valor del numero 1: ");
		int n1 = t1.nextInt();
		
		System.out.println("Ingrese el valor del numero 2: ");
		int n2 = t1.nextInt();
		
		int suma =Calculadora.sumar(n1, n2);
		int  resta = Calculadora.restar(n1, n2);
		
		System.out.println("El resultado de la suma es: "+suma);
		System.out.println("El resultado de la resta es: "+resta);
	}
}
