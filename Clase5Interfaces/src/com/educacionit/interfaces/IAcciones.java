package com.educacionit.interfaces;

public interface IAcciones {
	//conjunto de metodos abstractos; no tienen cuerpo
	public void caminar();
	public void comer();
	public void cazar();
	
	//Solo se puede implementar desde java 8
	default void dormir() {
		System.out.println("Acciones: ZZZZZZZZZ");
	}
	
}
