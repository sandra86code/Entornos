package com.test.refactoring.business;

/**
 * Clase Motocicleta, hija de la clase abstracta Vehiculo
 * @author sandra
 * @version 1.0
 */
public class Camion extends Vehiculo {

	String tipoCarnet;
	
	
	/**
	 * Constructor de la clase con todos los parámetros. Todos llaman al constructor del padre, salvo tipoCarnet
	 * @param matricula del camión
	 * @param color del camión
	 * @param combustible del camión
	 * @param nombreConductor del camión
	 * @param dniConductor del camión
	 * @param cilindradadel camión
	 */
	public Camion(String matricula, String color, String combustible, String nombreConductor,
			String dniConductor, String tipoCarnet) {
		super(matricula, color, combustible, nombreConductor, dniConductor);
		this.tipoCarnet = tipoCarnet;
	}

	/**
	 * Get del atributo tipo de carnet
	 * @return el tipo de carnet
	 */
	public String getTipoCarnet() {
		return tipoCarnet;
	}

	/**
	 * Set del atributo tipo de carnet
	 * @param tipoCarnet del conductor
	 */
	public void setTipoCarnet(String tipoCarnet) {
		this.tipoCarnet = tipoCarnet;
	}
	
	/**
	 * Método acelerar, que recibe la velocidad a la que acelera el camión
	 * @return Un mensaje u otro dependiendo de la velocidad.
	 *
	 */
	@Override
	public String acelerar(Integer velocidad) {
		String mensaje;
		if (velocidad > 0 && velocidad < 110) {
			mensaje="El camión está acelerando y llegará a la velocidad de " + velocidad.intValue() + " km/h";
		} else {
			mensaje="La velocidad indicada no está permitida en un camión según la DGT";
		}
		return mensaje;
	}
	
	/**
	 * Implementación del método detener, método abstracto de vehículo, para el camión
	 * @return String de que el camión se detendrá
	 */
	@Override
	public String detener() {
		return "El camión se detendrá en breve, asegúrese de buscar un lugar adecuado para estacionar";
	}
	
	/**
	 * ToString sobrescrito de la clase Camión
	 */
	@Override
	public String toString() {
		return "Camion [matricula=" + matricula + ", color=" + color + ", combustible=" + combustible + ", tipoCarnet="
				+ tipoCarnet + ", nombre_conductor=" + nombreConductor + ", dniConductor=" + dniConductor + "]";
	}
}
