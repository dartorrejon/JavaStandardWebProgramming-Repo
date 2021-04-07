package com.educacionit.models;

public class Cliente extends Persona {
	private int nroCliente;

	//Constructores
	public Cliente() {
		
		// TODO Auto-generated constructor stub
	}

	public Cliente(int id, String nombre, Telefono telefono, Domicilio domicilio, int nroCliente) {
		super(id, nombre, telefono, domicilio);
		this.nroCliente = nroCliente;
	}

	
	//Getters & Setters
	public int getNroCliente() {
		return nroCliente;
	}

	public void setNroCliente(int nroCliente) {
		this.nroCliente = nroCliente;
	}

	@Override
	public String toString() {
		return "Cliente [nroCliente=" + nroCliente + ", id=" + id + ", nombre=" + nombre + ", telefono=" + telefono
				+ ", domicilio=" + domicilio + "]";
	}
	
	
}
