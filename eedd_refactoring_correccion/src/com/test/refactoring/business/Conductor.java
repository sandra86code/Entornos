package com.test.refactoring.business;

/**
 * Clase que crea un conductor a partir de su nombre y apellidos
 * @author sandra
 *
 */
public class Conductor {
	
	private String nombreConductor;
	private String dniConductor;
	
	/**
	 * Constructor vacío
	 */
	public Conductor() {
		super();
	}
	
	/**
	 * Constructor de la clase con los parámetros
	 * @param nombre del conductor
	 * @param dni del conductor
	 */
	public Conductor(String nombreConductor, String dniConductor) {
		super();
		this.nombreConductor = nombreConductor;
		this.dniConductor = dniConductor;
	}

	/**
	 * Get del nombre del condcutor
	 * @return nombre del conductor
	 */
	public String getNombreConductor() {
		return nombreConductor;
	}
	
	/**
	 * Set del nombre del conductor
	 * @param nombre del conductor
	 */
	public void setNombreConductor(String nombreConductor) {
		this.nombreConductor = nombreConductor;
	}
	
	/**
	 * Get del DNI del conductor
	 * @return DNI del conductor
	 */
	public String getDniConductor() {
		return dniConductor;
	}
	
	/**
	 * Set del DNI del condcutor
	 * @param DNI del conductor
	 */
	public void setDniConductor(String dniConductor) {
		this.dniConductor = dniConductor;
	}
	
	
}