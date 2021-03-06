package com.test.refactoring.business;

/**
 * Clase Coche, hija de la clase abstracta Vehiculo
 * @author sandra
 * @version 1.0
 */
public class Coche extends Vehiculo {
	

	private Integer numPlazas;
	
	
	/**
	 * Constructor de la clase con todos los parámetros. Todos llaman al constructor del padre, salvo numPlazas
	 * @param matricula del coche
	 * @param color del coche
	 * @param combustible del coche
	 * @param nombreConductor del coche
	 * @param dniConductor del coche
	 * @param numero de plazas del coche
	 */
	public Coche(String matricula, String color, String combustible, String nombreConductor,
			String dniConductor, Integer numPlazas) {
		super(matricula, color, combustible, nombreConductor, dniConductor);
		this.numPlazas = numPlazas;
	}
	
	/**
	 * Get del número de plazas del coche
	 * @return número de plazas del coche
	 */
	public Integer getNumPlazas() {
		return numPlazas;
	}
	
	/**
	 * Set del número de plazas coche
	 * @param número de plazas del coche
	 */
	public void setNumPlazas(Integer numPlazas) {
		this.numPlazas = numPlazas;
	}


	/**
	 * Método acelerar, que recibe la velocidad a la que acelera el coche.
	 * @return Un mensaje u otro dependiendo de la velocidad.
	 *
	 */
	@Override
	public String acelerar(Integer velocidad) {
		String mensaje;
		if (velocidad > 0 && velocidad < 120) {
			mensaje="El coche está acelerando y llegara la velocidad de " + velocidad.intValue() + " km/h";
		} else {
			mensaje="La velocidad indicada no está permitida en un coche según la DGT";
		}
		return mensaje;
	}
	
	/**
	 * Implementación del método detener, método abstracto de vehículo, para el coche
	 * @return String de que el coche se detendrá
	 */
	@Override
	public String detener() {
		return "El coche se detendrá en breve, asegúrese de buscar un lugar adecuado para estacionar";
	}
	
	/**
	 * ToString sobrescrito de la clase coche
	 */
	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", color=" + color + ", combustible=" + combustible + ", numPlazas="
				+ numPlazas + ", nombre_conductor=" + nombreConductor + ", dniConductor=" + dniConductor + "]";
	}

}
