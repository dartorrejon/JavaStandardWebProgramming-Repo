package com.educacionit.models;

public abstract class Persona {
	public int id;
	public String nombre;
	public Telefono telefono;
	public Domicilio domicilio;
	
	
	public Persona() {
		
		// TODO Auto-generated constructor stub
	}


	public Persona(int id, String nombre, Telefono telefono, Domicilio domicilio) {
		
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.domicilio = domicilio;
	}


	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + ", domicilio=" + domicilio + "]";
	}
	
	
	
	
}
