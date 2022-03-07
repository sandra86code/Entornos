package com.test.refactoring.main;

import java.util.Scanner;

import com.test.refactoring.business.Camion;
import com.test.refactoring.business.Coche;
import com.test.refactoring.utils.Utils;

public class MenuApp {
	
	/**
	 * Objeto sc que instancia a la clase Scanner, para recibir lo que el usuario introduzca por teclado
	 */
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		mostrarPresentacion();
		
		mensajeUsuario();
		

		int numCoches= leerEntero("Introduce el número de coches : ");
		Coche[] listaCoches = new Coche[numCoches];
		for (int i=0; i<numCoches; i++) {
			listaCoches[i] = new Coche("DKIJY", "rojo", "diesel", "Jorge", "17865583G", 4);
			System.out.println(listaCoches[i].acelerar(80));
		
		}
		
		int numCamiones= leerEntero("Introduce el número de camiones : ");
		Camion[] listaCamiones = new Camion[numCamiones];
		for (int i=0; i<numCamiones; i++) {
			listaCamiones[i] = new Camion("DKd35IJY", "verde", "gasolina", "Pepe", "17865863G", "B23");
			System.out.println(listaCamiones[i].acelerar(20));
		}
		
		detenerCoches(listaCoches);
		detenerCamiones(listaCamiones);
		
		sc.close();
		
	}
	

	/**
	 * Método que imprime una presentación
	 */
	private static void mostrarPresentacion () {
		System.out.println("/*******************************************************************************/\n"
						+"/***                                                                         ***/\n"
						+"/***     VAMOS A REFACTORIZAR...HAY QUE ELIMINAR LOS MALOR OLORES YA!!       ***/\n"
						+"/***                                                                         ***/\n"
						+"/*******************************************************************************/");
	}
	
	/**
	 * Método que pide nombre y primer apellido al usuario y le muestra un mensaje de bienvenida con la fecha y la hora actuales
	 */
	private static void mensajeUsuario() {
		String nombre = leerCadena("Introduce tu nombre: ");
		String primerApellido = leerCadena("Introduce tu primer apellido: ");

		System.out.println("/*******************************************************************************/\n"
				+"/***                                                                         ***/\n"
				+ "/*** BIENVENIDO/A " + nombre + " " + primerApellido + "\n"
				+ "/*** " + Utils.fechaActual() + "\n"
				+ "/*** " + Utils.horaActual() + "\n"
				+"/***                                                                         ***/\n"
				+"/*******************************************************************************/");
	}
	
	/**
	 * Método que detiene todos los coches de la lista de coches que recibe por parámetros y muestra un mensaje por consola
	 * @param la lista de coches
	 */
	private static void detenerCoches(Coche[] listaCoches) {
		for (int i=0; i<listaCoches.length; i++) {
			System.out.println(listaCoches[i].detener());
		}
	}
	
	/**
	 * Método que detiene todos los camiones de la lista de camiones que recibe por parámetros y muestra un mensaje por consola
	 * @param lista de camiones
	 */
	private static void detenerCamiones(Camion[] listaCamiones) {
		for (int i=0; i<listaCamiones.length; i++) {
			System.out.println(listaCamiones[i].detener());
		}
	}

	/**
	 * Método que muestra un mensaje por consola al usuario y lee el String que le introduzca
	 * @param texto que queremos mostrar por pantalla
	 * @return la lectura de la siguiente línea del scanner en String
	 */
	public static String leerCadena(String texto) {
		System.out.println(texto);
		return sc.nextLine();
	}
	
	/**
	 * Método que muestra un mensaje por consola al usuario y lee el número entero que le introduzca
	 * @param texto que queremos mostrar por pantalla
	 * @return la lectura de la siguiente línea del scanner en entero
	 */
	public static int leerEntero(String texto) {
		System.out.println(texto);
		return Integer.parseInt(sc.nextLine());
	}

}
