package org.ed.junit.ju01testdecimal;

import static org.junit.Assert.*;
import org.junit.Test;


public class EurosConversorTest  {

	@Test
	public void testEuros2Pesetas() {
		EurosConversor target = new EurosConversor();
		
		double expected = 998.316d;  //la d es de double
		double actual = target.euros2Pesetas(6); //Que pase 6 euros a pesetas
		
		assertEquals("Euros 2 pesetas conversion", expected, actual, 0.01);  //El 0.01 es el double delta, es el rango más/menos el 
		//El mensaje del assertEquals solo vale para cuando falla			//que no me va a fallar me permite valores desde 998.306 y 998.326, 
																			//es decir, le sumo 0.01 y le resto 0.01
	}

	@Test
	public void testPesetas2Euros() {
		EurosConversor target = new EurosConversor();
		
		double expected = 6.01d;
		double actual = target.pesetas2Euros(1000);
		
		assertEquals("Pesetas 2 euros conversion", expected, actual, 0.01); //El 0.01 es el double delta, es el rango más/menos el 
																			//que no me va a fallar me permite valores desde 6.00 y 6.02
																			//es decir, le sumo 0.01 y le resto 0.01
	}

}
