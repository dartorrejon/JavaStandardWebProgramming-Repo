package com.educacionit.aerolinea;

//Clase hija de Vuelo
public class VueloCarga extends Vuelo {
	public int asientos =12;
	public float espacioMaxDeCarga=1000;//pies cubico de espacio en la bodega
	public float espacioCargaUsado; //Usamos esta variable para ver el espacio usado
	
	public void agregarPaquete(float altura, float ancho, float profundidad) {
		double size = altura*ancho*profundidad;
		if(espacioDeCargaDisponible(size)) {
			espacioCargaUsado += size;
			System.out.println("Se agrego tu paquete al avion");
			
		}else {
			faltaEspacio();
		}
	}
		
	private boolean espacioDeCargaDisponible(double tamanio) {
			return espacioCargaUsado+tamanio <= espacioMaxDeCarga;
					
	}
	
	private void faltaEspacio() {
		System.out.println("No tenemos mas espacio en la bodega, busque otro avion!");
	}
	
	@Override
	public int getAsiento() {//Polimorfismo con redefinicion de metodo
		return 12;
	}
}
