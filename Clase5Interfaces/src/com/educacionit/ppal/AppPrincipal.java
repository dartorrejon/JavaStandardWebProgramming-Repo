package com.educacionit.ppal;

import com.educacionit.clase5.Camello;
import com.educacionit.clase5.Elefante;
import com.educacionit.clase5.Perro;

public class AppPrincipal {
	public static void main(String[] args) {
		Perro pe = new Perro();
		Camello cm = new Camello();
		Elefante el = new Elefante();

		pe.caminar();
		pe.cazar();
		pe.comer();
		pe.dormir();

		cm.caminar();
		cm.cazar();
		cm.comer();
		cm.dormir();

		el.caminar();
		el.cazar();
		el.comer();
		el.dormir();
	}
}
