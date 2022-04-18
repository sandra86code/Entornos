package org.ed.junit.ju09execalltests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({EurosConversorTest.class, 
				RobotTest.class, 
				ValidatorTest.class})
public class AllTests {

}
