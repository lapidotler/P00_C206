import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
	}

	@Test
	public void testSubtract() {
		int a = 9876;
		int b = 4321;
			
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
	}

	@Test
	public void testMultiply() {
		int a = 1111;
		int b = 5;
			
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testDivide() {
		int a = 11110;
		int b = 2;
			
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b); 
		int c = a % b;
			 
		int expected = 5555;
		assertEquals (expected, actual);

		int denominator = 0;
		assertEquals (c, denominator);

	}

}
