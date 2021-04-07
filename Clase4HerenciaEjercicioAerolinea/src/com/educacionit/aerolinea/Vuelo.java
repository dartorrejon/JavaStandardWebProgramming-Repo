package com.educacionit.aerolinea;

import java.util.Iterator;

public class Vuelo {
	public int numVuelvo;
	public int pasajeros;
	public char claseVuelo;
	public boolean[] asientosDisponibles;

// inicializador de bloque
	{
		asientosDisponibles = new boolean[150];
		for (int i = 0; i < getAsiento(); i++) {
			asientosDisponibles[i] = true;
		}
	}

	public int getAsiento() {
		return 150;
	}

	public int getAsientos() {
		return getAsiento();
	}

	public Vuelo() {

	}

	public Vuelo(char claseVuelo) {
		this.claseVuelo = claseVuelo;
	}

	public Vuelo(int numVuelo) {
		this.numVuelvo = numVuelo;
	}
	
	public void agregarPasajero(Passenger p1) {
		if(asientoDisponible()) {
			pasajeros++;
			System.out.println("Ya estas arriba del avion con tus "+p1.getTotalEquipaje()+" bolsos.");
		}else {
			faltaAsiento();
		}
	}
	
	private boolean asientoDisponible() {
		return pasajeros < getAsiento();
	}
	
	private void faltaAsiento() {
		System.out.println("YA NO QUEDAN ASIENTOS, busque otra aerolinea por favor.");
	}
}
