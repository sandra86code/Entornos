package com.jacaranda.boletin;

import java.util.Arrays;

public class ED1T6P {

	public static void main(String[] args) {
		
		int A[] = null;
		try {
			System.out.println(seleccion(A));
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
		
		
		int B[] = {1};
		try {
			System.out.println(seleccion(B));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		int C[] = {1, 14};
		try {
			System.out.println(seleccion(C));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		int D[] = {1,2,4,3,5};
		try {
			System.out.println(seleccion(D));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		int E[] = {2,1,4,3,5};
		try {
			System.out.println(seleccion(E));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		int F[] = {5, 2, 1, 4, 3};
		try {
			System.out.println(seleccion(F));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		

	}

	public static String seleccion(int[] array) throws Exception {
		if(array==null) {
			throw new Exception("La lista no puede estar vacía.");
		}
		int aux;
		for (int i = 0; i < array.length - 1; i++) {      	// tomamos como menor el primero                       	// y guardamos su posición
			for (int j = i + 1; j < array.length; j++){ 	// buscamos en el resto
				if (array[j] < array[i]) {           		// del array algún elemento
					aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}
		return Arrays.toString(array);
	}
}
	
