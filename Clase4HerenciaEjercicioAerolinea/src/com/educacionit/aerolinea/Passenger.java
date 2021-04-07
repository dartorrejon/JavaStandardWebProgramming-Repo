package com.educacionit.aerolinea;

public class Passenger {
	private int bolsos;
	private int bolsosPagos;
	private double tarifaXBolso;
	private double totalAPagar;
	private int totalEquipaje;
	
	//Constructor 1 vacio
	public Passenger() {}

	//Constructor 2 con un parametro(llama al constructor private)
	public Passenger(int bolsos) {
		this(bolsos > 1 ? 50.0d : 25.0);//invocamos al constructor que tenga un parametro double
		this.bolsos = bolsos;
		totalAPagar = bolsos * tarifaXBolso;
		totalEquipaje = bolsos;
	}
	
	//Constructor 3 con dos parametros(llama al constructor 2)
	public Passenger(int bolsos, int bolsosPagos) {
		this(bolsos);
		this.bolsosPagos = bolsosPagos;
		totalEquipaje = bolsos + bolsosPagos;
		totalAPagar = bolsos * tarifaXBolso;
	}
		
	private Passenger(double tarifaXBolso) {
		this.tarifaXBolso = tarifaXBolso;
	}
	
	public int getBolsosGratis() {
		return bolsos;
	}
	
	public int getBolsosPagos() {
		return bolsosPagos;
	}
	
	public double gettarifaXBolso() {
		return tarifaXBolso;
	}
	
	public int getTotalEquipaje() {
		return totalEquipaje;
	}
	
	public double getTotalAPagar() {
		return totalAPagar;
	}
	
	public static void mostrarListaDePasajeros(Passenger listaPasajeros[]) {
		for (Passenger p1 : listaPasajeros) {
			System.out.println("*********************************************");
			System.out.println("Pasajero tarifa por bolso $ " + p1.gettarifaXBolso());
			System.out.println("Pasajero total a pagar $ "+p1.getTotalAPagar());
			System.out.println("Pasajero Total de bolsos: "+p1.getTotalEquipaje());
		}
	}
}
