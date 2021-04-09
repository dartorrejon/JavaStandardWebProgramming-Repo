package com.educacionit.ppal;

import java.util.Iterator;

import com.educacionit.interfaces.IConstantes;

public class ConstantesImplementacion implements IConstantes {
	public static void main(String[] args) {
		int numeros [] = new int[MAX];
		for (int i = MIN; i < 20; i++) {
				if (i>=MAX) {
					System.out.println(MSJERROR);
				}else {
					numeros[i] = i;
					System.out.println(numeros[i]);
				}
		}
	}
}
