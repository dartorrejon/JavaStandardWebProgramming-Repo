package com.educacionit.modelos;

import com.educacionit.clasePadre.Persona;

public class Futbolista extends Persona{
	
	private Integer dorsal;
	private String demarcacion;
	
	
	public Futbolista() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion)
	{
		super(id,nombre,apellido,edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
			
	}

	
	public Integer getDorsal() {
		return dorsal;
	}

	public void setDorsal(Integer dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

	public void jugarPartido() 
	{
		System.out.println("Estoy jugando un partido(Clase Futbolista)");
	}
	
	public void entrenar() {
		System.out.println("Estoy entrenando(Clase Futbolista)");
	}
	
	
	
}
