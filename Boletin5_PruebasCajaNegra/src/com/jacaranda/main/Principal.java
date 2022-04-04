package com.jacaranda.main;


import java.util.ArrayList;

import com.jacaranda.empleados.Registro;
import com.jacaranda.empleados.RegistroException;

public class Principal {
	
	private static ArrayList<Registro> empleados = new ArrayList<>();
	
	public static void main(String[] args) {
		
		//numEmpleado: Falla por límite
		try {
			empleados.add(new Registro(0, "Pepe", 2, '+'));
			System.out.println("1. Empleado añadido");
		} catch (RegistroException e) {
			System.out.println(e.getMessage());
		}

		//numEmpleado: Falla por límite
		try {
			empleados.add(new Registro(-100, "Pepe", 2, '+'));
			System.out.println("2. Empleado añadido");
		} catch (RegistroException e) {
			System.out.println(e.getMessage());
		}

		//numEmpleado: Funciona, límite inferior
		try {
			empleados.add(new Registro(1, "Pepe", 2, '+'));
			System.out.println("3. Empleado añadido");
		} catch (RegistroException e) {
			System.out.println(e.getMessage());
		}

		//numEmpleado: Funciona, número intermedio
		try {
			empleados.add(new Registro(500, "Pepe", 3, '-'));
			System.out.println("4. Empleado añadido");
		} catch (RegistroException e) {
			System.out.println(e.getMessage());
		}

		//numEmpleado: Funciona, límite superior
		try {
			empleados.add(new Registro(999, "Pepe", 4, '+'));
			System.out.println("5. Empleado añadido");
		} catch (RegistroException e) {
			System.out.println(e.getMessage());
		}

		///numEmpleado: Falla, límite superior
		try {
			empleados.add(new Registro(1000, "Pepe", 2, '+'));
			System.out.println("6. Empleado añadido");
		} catch (RegistroException e) {
			System.out.println(e.getMessage());
		}


		//numEmpleado: Falla, extremo superior
		try {
			empleados.add(new Registro(10000, "Pepe", 2, '+'));
			System.out.println("7. Empleado añadido");
		} catch (RegistroException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		//NombreEmpleado: Falla por length mayor de 10
		try {
			empleados.add(new Registro(2, "Pepito pere palotes", 7, '+'));
			System.out.println("8. Empleado añadido");
		} catch (RegistroException e) {
			System.out.println(e.getMessage());
		}
		
		//NombreEmpleado: Falla por null
		try {
			empleados.add(new Registro(2, null, 7, '+'));
			System.out.println("9. Empleado añadido");
		} catch (RegistroException e) {
			System.out.println(e.getMessage());
		}

		//NombreEmpleado: Funciona
		try {
			empleados.add(new Registro(2, "José", 7, '+'));
			System.out.println("10. Empleado añadido");
		} catch (RegistroException e) {
			System.out.println(e.getMessage());
		}


		//MesesTrabajados: Falla por límite inferior
		try {
			empleados.add(new Registro(3, "José", -1, '+'));
			System.out.println("11. Empleado añadido");
		} catch (RegistroException e) {
			System.out.println(e.getMessage());
		}

		//MesesTrabajados: Falla por límite inferior
		try {
			empleados.add(new Registro(7, "José", -100, '+'));
			System.out.println("12. Empleado añadido");
		} catch (RegistroException e) {
			System.out.println(e.getMessage());
		}

		//MesesTrabajados: Falla por límite superior
		try {
			empleados.add(new Registro(7, "José", 1000, '+'));
			System.out.println("13. Empleado añadido");
		} catch (RegistroException e) {
			System.out.println(e.getMessage());
		}

		//MesesTrabajados: Falla por límite superior
		try {
			empleados.add(new Registro(7, "José", 2000, '+'));
			System.out.println("14. Empleado añadido");
		} catch (RegistroException e) {
			System.out.println(e.getMessage());
		}

		//MesesTrabajados: Funciona, límite inferior
		try {
			empleados.add(new Registro(7, "María", 0, '+'));
			System.out.println("15. Empleado añadido");
		} catch (RegistroException e) {
			System.out.println(e.getMessage());
		}

		//MesesTrabajados: Funciona, valor intermedio
		try {
			empleados.add(new Registro(8, "Paula", 50, '+'));
			System.out.println("16. Empleado añadido");
		} catch (RegistroException e) {
			System.out.println(e.getMessage());
		}

		//MesesTrabajados: Funciona, límite superior
		try {
			empleados.add(new Registro(8, "Paula", 999, '+'));
			System.out.println("17. Empleado añadido");
		} catch (RegistroException e) {
			System.out.println(e.getMessage());
		}

		//Directivo: Falla, valor incorrecto
		try {
			empleados.add(new Registro(8, "Paula", 50, ','));
			System.out.println("18. Empleado añadido");
		} catch (RegistroException e) {
			System.out.println(e.getMessage());
		}

		//Directivo: Funciona, valor correcto, es directivo
		try {
			empleados.add(new Registro(9, "Cintia", 50, '+'));
			System.out.println("19. Empleado añadido");
		} catch (RegistroException e) {
			System.out.println(e.getMessage());
		}

		//Directivo: Funciona, valor correcto, no es directivo
		try {
			empleados.add(new Registro(10, "Lucía", 70, '-'));
			System.out.println("20. Empleado añadido");
		} catch (RegistroException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(mostrarArray());
		
		System.out.println(mostrarPrimasEmpleados());
		
	}	
	
	
	public static String mostrarPrimasEmpleados() {
		StringBuilder mensaje = new StringBuilder();
		for(Registro e: empleados) {
			mensaje.append(e.prima() + " - " + e + "\n");
		}
		return mensaje.toString();
	}
	
	public static String mostrarArray() {
		StringBuilder mensaje = new StringBuilder();
		for(Registro e: empleados) {
			mensaje.append(e + "\n");
		}
		return mensaje.toString();
	}


}
