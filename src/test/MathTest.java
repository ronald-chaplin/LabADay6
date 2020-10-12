package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.MathUtil;
@DisplayName("Math Testing")
class MathTest {
	MathUtil calc;
//annotation
// identifies what methods are to be run as a test.


	@BeforeEach
	void init() {
		System.out.println("Starting to create object");
		calc = new MathUtil();
		System.out.println("Created object");
	}
	
	@Test
	void testAdd() {
	
	// expected
	int expected = 2;
	// actual
	int actual = calc.add(1, 1);
	// verify
	//assertEquals(actual, expected);
	assertEquals(calc.add(1,  1), 2, "add should return 1");
	
	}

	@Test
	void testDivide() {
		double expected = 2.5;
		
		double actual = calc.divide(5, 2);
		
		assertEquals(calc.divide(5, 2), expected, "divide should return 2.5");
	}
	
	@Test
	void testMultiply() {
		int expected = 10;
		
		int actual = calc.multiply(5, 2);
		
		assertEquals(calc.multiply(5, 2), 10, "multiply should return 10");
	}
	
	@Test
	void testCircumference() {
		double expected = 31.41592653589793;
		
		double actual = calc.circumference(5);
		
		assertEquals(calc.circumference(5), expected, "Cirumference should return " + expected);
	}
		
}



