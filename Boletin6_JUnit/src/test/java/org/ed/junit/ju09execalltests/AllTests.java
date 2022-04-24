package org.ed.junit.ju09execalltests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/*
 * Clase que permite la ejecuci�n de casos de prueba de varias clases.
 * Se debe indicar el nombre de la clase en el array que recibe @SuiteClasses como par�metro
 */
@RunWith(Suite.class)
@SuiteClasses({EurosConversorTest.class, 
				TestRobot.class, 
				ValidatorTest.class})
public class AllTests {

}
