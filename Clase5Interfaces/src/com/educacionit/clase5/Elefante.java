package com.educacionit.clase5;

import com.educacionit.interfaces.IAcciones;

public class Elefante implements IAcciones{

	@Override
	public void caminar() {
		System.out.println("Elefante: Estoy caminando");
		
	}

	@Override
	public void comer() {
		System.out.println("Elefante: Estoy comiendo");
		
	}

	@Override
	public void cazar() {
		System.out.println("Elefante: Estoy cazando");
		
	}

}
