package com.educacionit.erroresAnidados;

public class TryAnidado {
	public static void main(String[] args) {
		int nums[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int denom[] = { 2, 0, 4, 4, 0, 8 };

		try {
			for (int i = 0; i < nums.length; i++) {
				try {
					System.out.println(nums[i] + "/" + denom[i] + " = " + nums[i] / denom[i]);
				} catch (ArithmeticException e) {
					System.out.println("No se puede dividir por 0");
					System.out.println(e.getMessage());
				} 

			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Fuera de rango");
			System.out.println(e.getMessage());
			System.out.println("ERROR: END APP");
		}
		
	}
}
