package com.educacionit.clasePadre;

public class Persona {
	//CLASE PADRE: LAS CLASES HIJAS HEREDARAN DE ESTA	
	//solo se heredaran sus atributos public y protected
	//Si son clases private no heredan las hijas
	
	protected Integer id;
	protected String nombre;
	protected String apellido;
	protected Integer edad;
	
	
	public Persona() {}
	
	public Persona(int id, String nombre, String apellido, int edad) {
		this.id = id;
		this.nombre =nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public void concentrarse() {
		System.out.println("Seleccion futbol, estoy concentrando");
	}
	
	public void viajar() {
		System.out.println("Seleccion futbol, estoy viajando");
	}

}
