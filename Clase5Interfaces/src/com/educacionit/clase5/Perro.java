package com.educacionit.clase5;

import com.educacionit.interfaces.IAcciones;

public class Perro implements IAcciones{

	@Override
	public void caminar() {
		System.out.println("Perro: Estoy caminando");
		
	}

	@Override
	public void comer() {
		System.out.println("Perro: Estoy comiendo");
		
	}

	@Override
	public void cazar() {
		System.out.println("Perro: Estoy cazando");
		
	}

}
