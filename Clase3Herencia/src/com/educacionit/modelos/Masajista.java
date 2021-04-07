package com.educacionit.modelos;

import com.educacionit.clasePadre.Persona;

public class Masajista extends Persona{
	
	private Integer aniosDeExperiencia;
	private String titulacion;
	
	
	
	public Masajista() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Masajista(int id, String nombre, String apellido, int edad, String titulacion, int aniosDeExperiencia) {
		super(id, nombre, apellido, edad);
		this.aniosDeExperiencia = aniosDeExperiencia;
		this.titulacion = titulacion;
		// TODO Auto-generated constructor stub
	}



	public Integer getAniosDeExperiencia() {
		return aniosDeExperiencia;
	}



	public void setAniosDeExperiencia(Integer aniosDeExperiencia) {
		this.aniosDeExperiencia = aniosDeExperiencia;
	}



	public String getTitulacion() {
		return titulacion;
	}



	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}



	public void darMasaje() {
		System.out.println("Estoy dando un masaje(Clase Masajista)");
	}
	
}
