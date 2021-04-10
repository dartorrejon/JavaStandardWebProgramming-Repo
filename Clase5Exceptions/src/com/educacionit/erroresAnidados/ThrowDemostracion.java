package com.educacionit.erroresAnidados;

public class ThrowDemostracion {
	public static void main(String[] args) {
		
		
		try {
			System.out.println("Creamos un objeto Exceptions");
			throw new ArithmeticException();//lanzamos una exception
		} catch (ArithmeticException e) {
			System.out.println("Se ah capturado la Exception");
			// TODO: handle exception7
		}
		
		System.out.println("Fin del Bloque Try Catch");
	}
}
