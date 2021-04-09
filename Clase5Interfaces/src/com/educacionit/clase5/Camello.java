package com.educacionit.clase5;

import com.educacionit.interfaces.IAcciones;

public class Camello implements IAcciones{

	@Override
	public void caminar() {
		System.out.println("Camello: Estoy caminando");
		
	}

	@Override
	public void comer() {
		System.out.println("Camello: Estoy comiendo");
		
	}

	@Override
	public void cazar() {
		System.out.println("Camello: Estoy cazando");
		
	}
	
}
