package com.educacionit.erroresAnidados;

public class ExcDemostracion {
	
	public static void main(String[] args) {
		int nums[] = {4,8,16,32,64,128,256,512};
		int denom[] = {2,0,4,4,0,8};
		
		for (int i = 0; i < nums.length; i++) {
			try {
				System.out.println(nums[i]+"/"+denom[i]+" = "+nums[i]/denom[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("No se encontro ningun elemento");
				System.out.println(e.getMessage());
			}catch (ArithmeticException e) {
				System.out.println("Division x 0");
				System.out.println(e.getMessage());
			}
			
		}
	}
}
