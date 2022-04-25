package com.jacaranda.boletin;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class ED1T5PTest {

	@Test
	public void numMayorATest() {
		int actual = ED1T5P.numMayor(3, 2, 1);
		int expected = 3;
		assertEquals("Número mayor: ", expected, actual);
	}
	
	@Test
	public void numMayorCTest() {
		int actual = ED1T5P.numMayor(1, 2, 3);
		int expected = 3;
		assertEquals("Número mayor: ", expected, actual);
	}
	
	@Test
	public void numMayorBTest() {
		int actual = ED1T5P.numMayor(2, 3, 1);
		int expected = 3;
		assertEquals("Número mayor: ", expected, actual);
	}

}
