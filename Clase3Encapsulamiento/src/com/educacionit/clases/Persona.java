package com.educacionit.clases;

public class Persona {
	
	private int edad;
	private String nombre;
	
	
	//metodos constructores
	public Persona(int edad, String nombre) {
		this.edad = edad;
		this.nombre = nombre;
	}
	
	public Persona() {
		
	}
	
	
	//Getters & Setters
	public int getEdad() {
		return edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	
	public void setEdad(int edad) {
		if(edad<=0) {
			System.out.println("La edad no puede ser negativa");
		}
		else {
			this.edad = edad;
		}
		
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String toString() {
		return "Persona [Edad=" + edad + ", Nombre=" + nombre + "]";
	}
	
	
}
