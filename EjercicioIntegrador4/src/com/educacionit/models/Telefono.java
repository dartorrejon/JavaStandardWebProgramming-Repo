package com.educacionit.models;

public class Telefono {
	private int id;
	private String tipo, numero;
	
	public Telefono() {
		
		// TODO Auto-generated constructor stub
	}

	public Telefono(int id, String tipo, String numero) {
		
		this.id = id;
		this.tipo = tipo;
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Telefono [id=" + id + ", tipo=" + tipo + ", numero=" + numero + "]";
	}
	
	
	
	
}
