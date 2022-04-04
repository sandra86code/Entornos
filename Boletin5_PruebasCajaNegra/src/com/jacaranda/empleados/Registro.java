package com.jacaranda.empleados;

public class Registro {
	
	private int numEmpleado;
	private String nombreEmpleado;
	private int mesesTrabajados;
	private char directivo;
	
	
	public Registro(int numEmpleado, String nombreEmpleado, int mesesTrabajados, char directivo) throws RegistroException {
		super();
		this.setNumEmpleado(numEmpleado);
		this.setNombreEmpleado(nombreEmpleado);
		this.setMesesTrabajados(mesesTrabajados);
		this.setDirectivo(directivo);
	}


	public int getNumEmpleado() {
		return numEmpleado;
	}


	private void setNumEmpleado(int numEmpleado) throws RegistroException {
		if(numEmpleado<1 || numEmpleado>999) {
			throw new RegistroException("El número de empleado debe ser un entero positivo comprendido entre 001 y 999, ambos inclusive.");
		}
		this.numEmpleado = numEmpleado;
	}


	public String getNombreEmpleado() {
		return nombreEmpleado;
	}


	private void setNombreEmpleado(String nombreEmpleado) throws RegistroException {
		if(nombreEmpleado==null) {
			throw new RegistroException("El nombre del empleado no puede ser nulo.");
		}
		if(nombreEmpleado.length()>10) {
			throw new RegistroException("El nombre del empleado no puede tener más de 10 caracteres.");
		}
		this.nombreEmpleado = nombreEmpleado;
	}


	public int getMesesTrabajados() {
		return mesesTrabajados;
	}


	private void setMesesTrabajados(int mesesTrabajados) throws RegistroException {
		if(mesesTrabajados<0 || mesesTrabajados>999) {
			throw new RegistroException("Los meses trabajados deben ser un entero positivo comprendido entre 000 y 999, ambos inclusive.");
		}
		this.mesesTrabajados = mesesTrabajados;
	}


	public char getDirectivo() {
		return directivo;
	}


	private void setDirectivo(char directivo) throws RegistroException {
		if(directivo!='+' && directivo!='-') {
			throw new RegistroException("Los valores permitidos son + si es directivo y - si no lo es.");
		}
		this.directivo = directivo;
	}
	
	public String prima() {
		String resultado;
		if(directivo=='+') {
			if(mesesTrabajados>=12) {
				resultado="P1";
			}else {
				resultado="P3";
			}
		}else {
			if(mesesTrabajados>=12) {
				resultado="P2";
			}else {
				resultado="P4";
			}
		}
		return resultado;
	}


	@Override
	public String toString() {
		return "Registro [numEmpleado=" + numEmpleado + ", nombreEmpleado=" + nombreEmpleado + ", mesesTrabajados="
				+ mesesTrabajados + ", directivo=" + directivo + "]";
	}
	
	
	
}
