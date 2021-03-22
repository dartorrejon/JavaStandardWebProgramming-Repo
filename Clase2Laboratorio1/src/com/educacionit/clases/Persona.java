package com.educacionit.clases;

public class Persona {
	//defino los atributos de la clase persona
	public String nombre;
	public String apellido;
	public int edad;
	public Domicilio domicilio = new Domicilio();
	
	
	//constructor
	public Persona(String nombre, String apellido, int edad, Domicilio domicilio) {
	
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.domicilio = domicilio;
	}

	//constructor por defecto
	public Persona() {
		
	}

	
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", domicilio=" + domicilio
				+ "]";
	}
	
	
	
	
	
	
}
