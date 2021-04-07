package com.educacionit.models;

public class Domicilio {
	private int id;
	private int numero;
	private String calle, localidad;
	
	public Domicilio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Domicilio(int id, int numero, String calle, String localidad) {
		super();
		this.id = id;
		this.numero = numero;
		this.calle = calle;
		this.localidad = localidad;
	}

	@Override
	public String toString() {
		return "Domicilio [id=" + id + ", numero=" + numero + ", calle=" + calle + ", localidad=" + localidad + "]";
	}
	
	
	
}
