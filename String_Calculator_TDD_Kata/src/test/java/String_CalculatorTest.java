package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.String_Calculator;

class String_CalculatorTest {

	@Test
	void calculate() {
		String_Calculator mine = new String_Calculator();
		int expected = 3;
		int actual = String_Calculator.calculate("//;\n1;2");
		assertEquals(expected, actual);
	}

}
