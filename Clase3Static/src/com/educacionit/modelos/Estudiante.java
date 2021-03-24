package com.educacionit.modelos;

public class Estudiante {
	/*static: 
		- Pertenece a la clase y no al objeto
		- Se inicializan una sola vez al inicio del programa
		*/
	public static int b;
	private int a;
	
	public Estudiante() {b++;}//se incrementa el valor de b
								//en cada inicializacion
								//de un objeto

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	public void mostrarInfo() {
		System.out.println("Metodo mostrar info: ");
		System.out.println("Valor de a: "+a);
		System.out.println("Valor de b: "+b);
	}
	
	//Metodo estatico: pertenece a la clase y no al objeto
	//SOLO PUEDE ACCEDER A LAS VARIABLES ESTATICAS DE LA CLASE
	//se puede acceder directamente al metodo mediante
	//el nombre de la clase	
	public static void mostarInfoStatic() {
		System.out.println("Metodo mostrar info static:");
		//System.out.println("Valor de a: "+a);
		System.out.println("Valor de b: "+b);
	}
	
	
		
}
