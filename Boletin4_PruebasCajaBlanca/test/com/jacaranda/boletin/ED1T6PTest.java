package com.jacaranda.boletin;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class ED1T6PTest {

	@Test
	public void testExcepcionArrayVacio() {
		int[] target = null;
		try {
			assertEquals("Array vacío", ED1T6P.seleccion(target));
			fail("ERROR, debía haber lanzado excepción por array vacío");
		} catch (Exception e) {
			System.out.println("Excepción por array vacío (nulo) tal y como se esperaba: " + e.getMessage());
		}

	}

	
	@Test
	public void testArrayUnElemento() throws Exception {
		int[] target = {1};
		String actual = ED1T6P.seleccion(target);
		int[] expected = {1};
		assertEquals("Array de un elemento: ", actual, Arrays.toString(expected));
	}
	
	@Test
	public void TestArrayDosElementos() throws Exception {
		int[] target = {5,4};
		String actual = ED1T6P.seleccion(target);
		int[] expected = {4,5};
		assertEquals("Array desordenado de dos elementos: ", actual, Arrays.toString(expected));
	}
	
	@Test
	public void TestArrayDesordenado() throws Exception {
		int[] target = {5,4,3,2,1};
		String actual = ED1T6P.seleccion(target);
		int[] expected = {1,2,3,4,5};
		assertEquals("Array desordenado: ", actual, Arrays.toString(expected));
	}
}
