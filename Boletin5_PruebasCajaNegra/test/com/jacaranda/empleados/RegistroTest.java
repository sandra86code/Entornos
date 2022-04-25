package com.jacaranda.empleados;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.jupiter.api.Test;

class RegistroTest {
	
	@Test
	public void TestRegistroEmpleadoFallaNumEmpleadoLimiteInferior() {
		try {
			Registro r1 = new Registro(0, "Pepe", 2, '+');
			assertEquals("Empleado","P1", r1.prima());
			fail("ERROR, debía haber lanzado excepción por número empleado incorrecto.");
		} catch (Exception e) {
			System.out.println("Excepción por número de empleado incorrecto tal y como se esperaba: " + e.getMessage());
		}
	}
	
	@Test
	public void TestRegistroEmpleadoFallaNumEmpleadoLimiteSuperior() {
		try {
			Registro r2 = new Registro(1000, "Pepe", 2, '+');
			assertEquals("Empleado","P1", r2.prima());
			fail("ERROR, debía haber lanzado excepción por número empleado incorrecto.");
		} catch (Exception e) {
			System.out.println("Excepción por número de empleado incorrecto tal y como se esperaba: " + e.getMessage());
		}
	}
	
	@Test
	public void TestRegistroEmpleadoFuncionaNumEmpleadoLimiteInferior() throws RegistroException {
		Registro r3 = new Registro(1, "Pepe", 12, '+');
		assertEquals("Empleado","P1", r3.prima());
	}
	
	@Test
	public void TestRegistroEmpleadoFuncionaNumEmpleadoLimiteSuperior() throws RegistroException {
		Registro r4 = new Registro(999, "Pepe", 13, '+');
		assertEquals("Empleado", "P1", r4.prima());
	}

	@Test
	public void TestRegistroEmpleadoFallaLenghtNombre() {
		try {
			Registro r5 = new Registro(2, "Pepito pere palotes", 7, '+');	
			assertEquals("Empleado", "P1", r5.prima());
			fail("ERROR, debía haber lanzado excepción por nombre de empleado demasiado largo.");
		} catch (Exception e) {
			System.out.println("Excepción por longitud de nombre de empleado tal y como se esperaba: " + e.getMessage());
		}
	}

	@Test
	public void TestRegistroEmpleadoFallaNombreNulo() {
		try {
			Registro r6 = new Registro(2, null, 7, '+');
			assertEquals("Empleado","P1", r6.prima());
			fail("ERROR, debía haber lanzado excepción por nombre de empleado nulo.");
		} catch (Exception e) {
			System.out.println("Excepción por nombre de empleado nulo tal y como se esperaba: " + e.getMessage());
		}
	}

	@Test
	public void TestRegistroEmpleadoFuncionaNombre() throws RegistroException {
		Registro r7 = new Registro(2, "José", 10, '+');
		assertEquals("Empleado", "P3", r7.prima());
	}

	@Test
	public void TestRegistroEmpleadoFallaMesesLimiteInferior() {
		try {
			Registro r8 = new Registro(3, "José", -1, '+');
			assertEquals("Empleado","P1", r8.prima());
			fail("ERROR, debía haber lanzado excepción por meses trabajados negativo (límite inferior).");
		} catch (Exception e) {
			System.out.println("Excepción por meses trabajados negativo (límite inferior) tal y como se esperaba: " + e.getMessage());
		}
	}
	
	@Test
	public void TestRegistroEmpleadoFallaMesesLimiteSuperior() {
		try {
			Registro r9 = new Registro(7, "José", 1000, '+');
			assertEquals("Empleado","P1", r9.prima());
			fail("ERROR, debía haber lanzado excepción por meses trabajados incorrecto (límite superior).");
		} catch (Exception e) {
			System.out.println("Excepción por meses trabajados incorrectos (límite superior) tal y como se esperaba: " + e.getMessage());
		}
	}
	
	@Test
	public void TestRegistroEmpleadoFuncionaMesesLimiteInferior() throws RegistroException {
		Registro r10 = new Registro(7, "María", 11, '-');
		assertEquals("Empleado", "P4", r10.prima());
	}
	
	@Test
	public void TestRegistroEmpleadoFuncionaMesesLimiteSuperior() throws RegistroException {
		Registro r11 = new Registro(8, "Paula", 12, '-');
		assertEquals("Empleado","P2", r11.prima());
	}
	
	@Test
	public void TestRegistroEmpleadoFallaDirectivo() {
		try {
			Registro r12 = new Registro(8, "Paula", 50, ',');
			assertEquals("Empleado","P1", r12.prima());
			fail("ERROR, debía haber lanzado excepción por signo de directivo inválido.");
		} catch (Exception e) {
			System.out.println("Excepción por signo de directivo inválido tal y como se esperaba: " + e.getMessage());
		}
	}

	@Test
	public void TestRegistroEmpleadoFuncionaNoDirectivo() throws RegistroException {
		Registro r13 = new Registro(10, "Lucía Mari", 13, '-');
		assertEquals("Empleado","P2", r13.prima());
	}
	
}
