package com.test.refactoring.business;

/**
 * Clase abstracta Vehiculo, de la que extienden las clases hijas Motocicleta, Camion y Coche
 * @author sandra
 * @version 1.0
 */
public abstract class Vehiculo {
	
	
	protected String matricula;
	protected String color;
	protected String combustible;
	protected Conductor conductor = new Conductor();



	/**
	 * Constructor 
	 * @param matrícula del vehículo
	 * @param color del vehículo
	 * @param combustible del vehículo
	 * @param nombre del conductor del vehículo
	 * @param DNI del conductor del vehículo
	 */
	public Vehiculo(String matricula, String color, String combustible, String nombreConductor, String dniConductor) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.combustible = combustible;
		this.conductor.setNombreConductor(nombreConductor);
		this.conductor.setDniConductor(dniConductor);
	}
	
	/**
	 * Get de la matrícula del vehículo
	 * @return la matrícula del vehículo.
	 */
	public String getMatricula() {
		return matricula;
	}
	
	/**
	 * Set de la matrícula del vehículo
	 * @param matricula del vehículo
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	/**
	 * Get del color del vehículo
	 * @return el color del vehículo.
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * Set del color del vehíuclo
	 * @param color del vehículo
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * Get del combustible del vehículo
	 * @return combustible del vehículo
	 */
	public String getCombustible() {
		return combustible;
	}
	
	/**
	 * Set del combustible del vehículo
	 * @param combustible del vehículo
	 */
	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	
		
	/**
	 * Método abstracto detener que sobrescriben las clases hijas
	 */
	protected abstract String detener();

	/**
	 * Método abstracto acelerar que sobrescriben las clases hijas
	 */
	protected abstract String acelerar(Integer velocidad);

	/**
	 * Método toString que sobrescribirán las clases hijas
	 */
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", color=" + color + ", combustible=" + combustible
				+ ", nombre_conductor=" + conductor.getNombreConductor() + ", dniConductor=" + conductor.getDniConductor() + "]";
	}

	
	
	

}