package hansun.N.SG;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		SimpleCalculatorTest calc = new SimpleCalculatorTest();
		calc.add(10, 20);
		assertEquals(30, calc.getResult());
	}
	
	
		

}
