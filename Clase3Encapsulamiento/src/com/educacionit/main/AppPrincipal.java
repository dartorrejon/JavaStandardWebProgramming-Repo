package com.educacionit.main;

import javax.swing.JOptionPane;

import com.educacionit.clases.Persona;

public class AppPrincipal {
	public static void main(String[] args) {
		Persona p1 = new Persona();
		
		int edadIngresada;
		String nombreIngresado;
		
		nombreIngresado = JOptionPane.showInputDialog("Ingrese un nombre: ");
		edadIngresada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
		
		p1.setEdad(edadIngresada);
		p1.setNombre(nombreIngresado);
		
		JOptionPane.showMessageDialog(null, p1.toString());
		
		
	}
}
