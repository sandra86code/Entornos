package com.test.refactoring.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Clase que contiene distintos métodos que va a usar nuestro programa
 * @author sandra
 * @version 1.0
 */
public class Utils {
	
	private static final int PRECIO_RENTING_MES = 750;
	private static final int PRECIO_ALQUILER_DIA = 50;
	private static final float IVA = 1.21f;

	/**
	 * Método que muestra la hora actual
	 * @return hora actual en formato HH:mm:ss
	 */
	public static String horaActual() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        //System.out.println("HH:mm:ss-> "+dtf.format(LocalDateTime.now()));
        
        return dtf.format(LocalDateTime.now());
	}
	
	/**
	 * Método que muestra la fecha actual
	 * @return hora actual en formato yyyy/MM/dd
	 */
	public static String fechaActual() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        //System.out.println("yyyy/MM/dd-> "+dtf.format(LocalDateTime.now()));
        
        return dtf.format(LocalDateTime.now());
	}
	
	/**
	 * Método que calcular el precio del alquiler según los días y el IVA
	 * @param número de días del alquiler
	 * @return el precio del alquiler
	 */
	public static float calcularPrecioAlquiler (Integer dias) {
		float result = 0;
		//El coste de un d�a de alquiler son 50� + 21% de IVA
		result = dias * PRECIO_ALQUILER_DIA * IVA;
		return result;
	}
	
	/**
	 * Método que calcula el precio del renting de un vehículo según los meses y el IVA
	 * @param el número de meses de duración del alquiler
	 * @return el precio del renting
	 */
	public static float calcularPrecioRenting (Integer meses) {
		//El coste de un mes de renting son 750� + 21% IVA
		return meses * PRECIO_RENTING_MES * 1.21f;
	}

}

