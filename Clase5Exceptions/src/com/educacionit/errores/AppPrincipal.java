package com.educacionit.errores;

public class AppPrincipal {
	public static int numerador = 10;
	public static Integer denominador = null;
	public static double division;

	public static void main(String[] args) {
		try {//Instrucciones que pueden generar una Exception
			division = numerador / denominador;
		} catch (ArithmeticException e) {
			//Instrucciones a ejecutar cuando se capture un objeto exception
			System.out.println("Excepcion caputarada: "+ e.getMessage());
			division =0;
			
			
		}catch (NullPointerException e) {
			division =1;
			System.out.println("Error capturado: "+e.getMessage());
		}
		
		finally {
			//Instrucciones que se ejecutan tanto como si hay o no hay excepcciones
			System.out.println("Division "+division);	
			System.out.println("Soy el finally y me ejecuto siempre si hay o no hay una exception.");
			System.out.println("Despues de la division");
			
		}
		
		
	}
}
