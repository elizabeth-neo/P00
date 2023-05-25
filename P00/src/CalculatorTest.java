import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	public void testAdd() {
		int a=1234;
		int b=8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a,b);
		
		int expected = 9999;
		assertEquals (expected,actual);
	}
	
	@Test
	public void testSubstract() {
		int a=9876;
		int b=4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a,b);
		
		int expected = 5555;
		assertEquals (actual,expected);

	}
	
	@Test
	public void testMultiply() {
		int a=10;
		int b=100;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a,b);
		
		int expected = 1000;
		
		assertEquals (actual,expected);

	}
	
	@Test
	public void testDivide() {
		int a=100;
		int b=10;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a,b);
		int expected = 10;
		
		if (b==0) {
			assertFalse("Error",(b==0));
		}else {
		assertEquals (actual,expected);
		}
		
	}
	
	@Test
	public void testPower() {
		int a=2;
		int b=3;
		
		Calculator cal = new Calculator();
		int actual = cal.power(a,b);
		
		int expected = 8;
		assertEquals (actual,expected);

	}
	
	@Test
	public void testAddThree() {
		int a=1111;
		int b=2222;
		int c=3333;
		
		Calculator cal = new Calculator();
		int actual = cal.addThree(a,b,c);
		
		int expected = 6666;
		assertEquals (actual,expected);
	}

	

}
