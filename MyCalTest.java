package BT_Buoi1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyCalTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSetNumber() {
	}

	@Test
	void testAdd() {
		int a = 20;
		int b = 33;
		int result = 53;
		
		MyCal mc = new MyCal();
		mc.setNumber(a, b);
		
		assertEquals(result, mc.add());
	}

	@Test
	void testMinus() {
		int a = 340;
		int b = 33;
		int result = a - b;
		
		MyCal mc = new MyCal();
		mc.setNumber(a, b);
		
		assertEquals(result, mc.minus());
	}

	@Test
	void testMultiplication() {
		int a = 340;
		int b = 33;
		int result = a * b;
		
		MyCal mc = new MyCal();
		mc.setNumber(a, b);
		
		assertEquals(result, mc.multiplication());
	}

	@Test
	void testDevide() {
		int a = 340;
		int b = 2;
		float result = a / b;
		
		MyCal mc = new MyCal();
		mc.setNumber(a, b);
		
		assertEquals(result, mc.devide());
	}

	@Test
	void testMax() {
		int a = 340;
		int b = 34;
		float result = a;
		
		MyCal mc = new MyCal();
		mc.setNumber(a, b);
		
		assertEquals(result, mc.max());
		
	}

	@Test
	void testMin() {
		int a = 340;
		int b = 34;
		float result = b;
		
		MyCal mc = new MyCal();
		mc.setNumber(a, b);
		
		assertEquals(result, mc.min());
	}

}
