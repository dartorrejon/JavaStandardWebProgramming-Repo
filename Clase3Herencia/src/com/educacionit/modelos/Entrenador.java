package com.educacionit.modelos;

import com.educacionit.clasePadre.Persona;

public class Entrenador extends Persona{
	
	private String idFederacion;
	
	
	
	

	

	public Entrenador(int id, String nombre, String apellido, int edad, String idFederacion) {
		super(id, nombre, apellido, edad);
		this.idFederacion = idFederacion;
		
	}
	
	
	public String getIdFederacion() {
		return idFederacion;
	}


	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}


	public Entrenador() {}

	public void dirigirPartido() {}
	
	public void dirigirEntrenamiento() {}
	
}
