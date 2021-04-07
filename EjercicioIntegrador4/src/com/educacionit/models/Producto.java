package com.educacionit.models;

public class Producto {
	private int id;
	private double precio;
	private String descripcion;
	
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}


	public Producto(int id, double precio, String descripcion) {
	
		this.id = id;
		this.precio = precio;
		this.descripcion = descripcion;
	}


	@Override
	public String toString() {
		return "Producto [id=" + id + ", precio=" + precio + ", descripcion=" + descripcion + "]";
	}
	
	
	
	
}
