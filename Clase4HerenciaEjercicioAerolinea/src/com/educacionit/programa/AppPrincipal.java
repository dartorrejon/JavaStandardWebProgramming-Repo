package com.educacionit.programa;

import com.educacionit.aerolinea.Passenger;
import com.educacionit.aerolinea.Vuelo;
import com.educacionit.aerolinea.VueloCarga;

public class AppPrincipal {
	public static void main(String[] args) {
		
		Passenger [] listaPasajeros = new Passenger[4];
		//invocamos al constructor 2
		listaPasajeros[0] = new Passenger(1);
		listaPasajeros[1] = new Passenger(4);
		//invocamos al constructor 3
		listaPasajeros[2] = new Passenger(1,6);
		listaPasajeros[3] = new Passenger(3,2);
		
		//Passenger.mostrarListaDePasajeros(listaPasajeros);
		Passenger matias = new Passenger(5);
//		VueloCarga vc = new VueloCarga();
//		vc.agregarPasajero(matias);
		
		Vuelo f = new Vuelo();
		f.agregarPasajero(matias);
			
	}
}
