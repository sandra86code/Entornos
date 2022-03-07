package com.test.refactoring.business;

/**
 * Clase Motocicleta, hija de la clase abstracta Vehiculo
 * @author sandra
 * @version 1.0
 */
public class Motocicleta extends Vehiculo {
	
	
	private Integer cilindrada;
	
	/**
	 * Constructor de la clase con todos los parámetros. Todos llaman al constructor del padre salvo cilindrada
	 * @param matricula de la motocicleta
	 * @param color de la motocicleta
	 * @param combustible de la motocicleta
	 * @param nombreConductor de la motocicleta
	 * @param dniConductor de la motocicleta
	 * @param cilindrada de la motocicleta
	 */
	public Motocicleta(String matricula, String color, String combustible, String nombreConductor,
			String dniConductor, Integer cilindrada) {
		super(matricula, color, combustible, nombreConductor, dniConductor);
		this.cilindrada = cilindrada;
	}
	
	/**
	 * Get del atributo cilindrada
	 * @return la cilindrada
	 */
	public Integer getCilindrada() {
		return cilindrada;
	}
	
	/**
	 * Set del atributo cilindrada
	 * @param cilindrada
	 */
	public void setCilindrada(Integer cilindrada) {
		this.cilindrada = cilindrada;
	}

	/**
	 * Método acelerar, que recibe la velocidad a la que acelera la motocicleta
	 * @return Un mensaje u otro dependiendo de la velocidad.
	 *
	 */
	public String acelerar(Integer velocidad) {
		String mensaje;
		if (velocidad > 0 && velocidad < 130) {
			mensaje="La motocicleta está acelerando y llegará a la velocidad de " + velocidad.intValue() + " km/h";
		} else {
			mensaje="La velocidad indicada no está permitida en una motocicleta según la DGT";
		}
		return mensaje;
	}
	
	/**
	 * Implementación del método detener, método abstracto de vehículo, para la motocicleta
	 * @return String de que la motocicleta se detendrá
	 */
	public String detener() {
		return "La motocicleta se detendrá en breve, asegúrese de buscar un lugar adecuado para estacionar";
	}
	
	/**
	 * ToString sobrescrito de la clase motocicleta
	 */
	@Override
	public String toString() {
		return "motocicleta [matricula=" + matricula + ", color=" + color + ", combustible=" + combustible
				+ ", cilindrada=" + cilindrada + ", nombre_conductor=" + conductor.getNombreConductor() + ", dniConductor="
				+ conductor.getDniConductor() + "]";
	}	

}
