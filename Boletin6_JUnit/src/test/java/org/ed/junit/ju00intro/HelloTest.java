package org.ed.junit.ju00intro;

import static org.junit.Assert.*;
import org.junit.Test;

public class HelloTest {

	@Test
	public void testSayHello() {
		Hello target = new Hello(); //pruebo objeto target, que es mi objetivo
		String expected = "hello";	//expected: lo que espero
		String actual = target.sayHello();	//actual, es el resultado
		
		assertEquals("Returns hello",expected, actual); //assertEquals, lo usamos para comparar dos objetos y que sean iguales
	}
	
	
	//Error: error de ejecución, por lo que el test no ha terminado. por null pointer exception, por ejemplo
	//Failure: prueba no exitosa, pero ha terminado su ejecución.

}
