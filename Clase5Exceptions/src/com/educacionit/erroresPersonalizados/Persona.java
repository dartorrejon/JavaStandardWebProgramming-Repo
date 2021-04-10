package com.educacionit.erroresPersonalizados;

public class Persona {
	private int id;
	private String nombre;
	
	public Persona() {
		
		// TODO Auto-generated constructor stub
	}

	public Persona(int id, String nombre) {
		
		this.id = id;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + "]";
	}
	
	public void metodoQuePuedeLanzarmeUnError() throws MiPropiaException {
		throw new MiPropiaException();
	}
	
	
	
}
