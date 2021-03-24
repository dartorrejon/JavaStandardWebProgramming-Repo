package com.educacionit.clase3;

import java.util.Calendar;

public class Fecha {
	private int dia, mes, anio;

	//Constructor
	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
		
		if(!fechaCorrecta()) {
			Calendar fechaSistema = Calendar.getInstance();
			setDia(fechaSistema.get(Calendar.DAY_OF_MONTH));
			setMes(fechaSistema.get(Calendar.MONTH)+1);
			setAnio(fechaSistema.get(Calendar.YEAR));
			
		}
	}
	
	public Fecha(int dia) {
		this.dia = dia;
		
	}
	
	public Fecha(int mes, int anio) {
		this.mes = mes;
		this.anio = anio;
	}

	
	//Getters y Setters
	public int getDia() {
		return dia;
	}



	public void setDia(int dia) {
		this.dia = dia;
	}



	public int getMes() {
		return mes;
	}



	public void setMes(int mes) {
		this.mes = mes;
	}



	public int getAnio() {
		return anio;
	}



	public void setAnio(int anio) {
		this.anio = anio;
	}



	private boolean esBisiesto() {
		
		return ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)));
			
	}
	
	public boolean fechaCorrecta() {
		boolean diaCorrecto, mesCorrecto, anioCorrecto;

		anioCorrecto = (anio > 0);
		mesCorrecto = (mes >= 1 && mes <= 12);

		switch (mes) {
			case 2:
					if(esBisiesto()) {
						diaCorrecto = (dia>=1 && dia<=29);
					}else {
						diaCorrecto = (dia>=1 && dia<=28);
					}
					break;
					
			case 4:
			case 6:
			case 9:
			case 11:
				diaCorrecto = (dia>=1 && dia<=30);
				break;
			default:
				diaCorrecto = (dia>=1 && dia<=31);
				
		}

		return diaCorrecto && mesCorrecto && anioCorrecto;
	}


	
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", anio=" + anio + "]";
	}
	
	
}
