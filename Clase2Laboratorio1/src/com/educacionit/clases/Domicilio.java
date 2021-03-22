package com.educacionit.clases;

public class Domicilio {
	//Defino los atributos de la clase domicilio
	public String calle;
	public int numero;
	public String localidad;
	
	public Domicilio(String calle, int numero, String localidad) {
		this.calle = calle;
		this.numero = numero;
		this.localidad = localidad;
	}

	//Constructor por defecto
	public Domicilio() {
		
	}

	@Override
	public String toString() {
		return "Domicilio [calle=" + calle + ", numero=" + numero + ", localidad=" + localidad + "]";
	}
	
	
	
}
