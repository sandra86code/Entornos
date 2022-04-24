package com.jacaranda.empleados;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.jupiter.api.Test;

class RegistroTest {
	
	@Test
	void TestRegistroEmpleadoFallaNumEmpleadoLimiteInferior() {
		try {
			Registro r1 = new Registro(0, "Pepe", 2, '+');
			assertEquals("Empleado",r1.prima(), "P1");
			fail("ERROR, debía haber lanzado excepción por número empleado incorrecto.");
		} catch (Exception e) {
			System.out.println("Excepción por número de empleado incorrecto tal y como se esperaba: " + e.getMessage());
		}
	}
	
	@Test
	void TestRegistroEmpleadoFallaNumEmpleadoLimiteSuperior() {
		try {
			Registro r2 = new Registro(1000, "Pepe", 2, '+');
			assertEquals("Empleado",r2.prima(), "P1");
			fail("ERROR, debía haber lanzado excepción por número empleado incorrecto.");
		} catch (Exception e) {
			System.out.println("Excepción por número de empleado incorrecto tal y como se esperaba: " + e.getMessage());
		}
	}
	
	@Test
	void TestRegistroEmpleadoFuncionaNumEmpleadoLimiteInferior() throws RegistroException {
		Registro r3 = new Registro(1, "Pepe", 12, '+');
		assertEquals("Empleado",r3.prima(), "P1");
	}
	
	@Test
	void TestRegistroEmpleadoFuncionaNumEmpleadoLimiteSuperior() throws RegistroException {
		Registro r4 = new Registro(999, "Pepe", 13, '+');
		assertEquals("Empleado",r4.prima(), "P1");
	}

	@Test
	void TestRegistroEmpleadoFallaLenghtNombre() {
		try {
			Registro r5 = new Registro(2, "Pepito pere palotes", 7, '+');	
			assertEquals("Empleado",r5.prima(), "P1");
			fail("ERROR, debía haber lanzado excepción por nombre de empleado demasiado largo.");
		} catch (Exception e) {
			System.out.println("Excepción por longitud de nombre de empleado tal y como se esperaba: " + e.getMessage());
		}
	}

	@Test
	void TestRegistroEmpleadoFallaNombreNulo() {
		try {
			Registro r6 = new Registro(2, null, 7, '+');
			assertEquals("Empleado",r6.prima(), "P1");
			fail("ERROR, debía haber lanzado excepción por nombre de empleado nulo.");
		} catch (Exception e) {
			System.out.println("Excepción por nombre de empleado nulo tal y como se esperaba: " + e.getMessage());
		}
	}

	@Test
	void TestRegistroEmpleadoFuncionaNombre() throws RegistroException {
		Registro r7 = new Registro(2, "José", 10, '+');
		assertEquals("Empleado",r7.prima(), "P3");
	}

	@Test
	void TestRegistroEmpleadoFallaMesesLimiteInferior() {
		try {
			Registro r8 = new Registro(3, "José", -1, '+');
			assertEquals("Empleado",r8.prima(), "P1");
			fail("ERROR, debía haber lanzado excepción por meses trabajados negativo (límite inferior).");
		} catch (Exception e) {
			System.out.println("Excepción por meses trabajados negativo (límite inferior) tal y como se esperaba: " + e.getMessage());
		}
	}
	
	@Test
	void TestRegistroEmpleadoFallaMesesLimiteSuperior() {
		try {
			Registro r9 = new Registro(7, "José", 1000, '+');
			assertEquals("Empleado",r9.prima(), "P1");
			fail("ERROR, debía haber lanzado excepción por meses trabajados incorrecto (límite superior).");
		} catch (Exception e) {
			System.out.println("Excepción por meses trabajados incorrectos (límite superior) tal y como se esperaba: " + e.getMessage());
		}
	}
	
	@Test
	void TestRegistroEmpleadoFuncionaMesesLimiteInferior() throws RegistroException {
		Registro r10 = new Registro(7, "María", 11, '-');
		assertEquals("Empleado",r10.prima(), "P4");
	}
	
	@Test
	void TestRegistroEmpleadoFuncionaMesesLimiteSuperior() throws RegistroException {
		Registro r11 = new Registro(8, "Paula", 12, '-');
		assertEquals("Empleado",r11.prima(), "P2");
	}
	
	@Test
	void TestRegistroEmpleadoFallaDirectivo() {
		try {
			Registro r12 = new Registro(8, "Paula", 50, ',');
			assertEquals("Empleado",r12.prima(), "P1");
			fail("ERROR, debía haber lanzado excepción por signo de directivo inválido.");
		} catch (Exception e) {
			System.out.println("Excepción por signo de directivo inválido tal y como se esperaba: " + e.getMessage());
		}
	}

	@Test
	void TestRegistroEmpleadoFuncionaNoDirectivo() throws RegistroException {
		Registro r13 = new Registro(10, "Lucía", 13, '-');
		assertEquals("Empleado",r13.prima(), "P2");

	}
	
}
