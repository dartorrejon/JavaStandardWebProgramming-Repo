package com.educacionit.clases;

public class Alumno {
	//Definimos los atributos de la clase
	public String apellido;
	public String nombre;
	public int edad;
	
	
	//Metodo constructor explicito
	public Alumno(String apellido, String nombre, int edad) {
		this.apellido = apellido;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Alumno(String apellido, String nombre) {
		this.apellido = apellido;
		this.nombre = nombre;
		
	}
	
	//Declaramos el constructor vacio
	public Alumno() {
		
	}
	
	
	//Metodo toString modificado
	public String toString() {
		return "Alumno [apellido=" + apellido + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
//	public String muestraEstadoDeAtributos() {
//		return  "Nombre "+nombre+", "+"Apellido: "+apellido+"\n";
//		
//	}

	
	

	
	
}

