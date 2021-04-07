package com.educacionit.ppal;

import com.educacionit.models.Cliente;
import com.educacionit.models.Domicilio;
import com.educacionit.models.Producto;
import com.educacionit.models.Telefono;

public class AppPrincipal {
	public static void main(String[] args) {
		Domicilio dm = new Domicilio(1,2024,"Av. Siempre Viva","Salta");
		Producto pd = new Producto(05,152,"Milk");
		Telefono tl = new Telefono(04,"Cel","82734832764");
		Cliente cl = new Cliente(6,"Axel",tl,dm,1006);
		
		System.out.println("Mostramos estado de atributos");
		System.out.println(cl.toString());
		System.out.println(pd.toString());
		
	}
}
