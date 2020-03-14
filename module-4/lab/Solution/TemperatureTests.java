
/*
 	CSCI 2
 	3/5/2020
 	Tests for temperature class
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureTests {
	Temperature temp;

	@Test
	void testEmptyConstructor() {
		temp = new Temperature();
		assertEquals(temp.getCelsius(), 0);
		assertEquals(temp.getScale(), 'C');
	}

	@Test
	void testOverloadedConstructor() {
		temp = new Temperature(100, 'F');
		assertEquals(temp.getFarenheit(), 100);
		assertEquals(temp.getScale(), 'F');
	}

	@Test
	void testSettingScale() {
		// Check valid input
		temp = new Temperature(0, 'C');
		assertEquals(temp.getScale(), 'C');
		temp = new Temperature(0, 'F');
		assertEquals(temp.getScale(), 'F');
		temp = new Temperature(0, 'c');
		assertEquals(temp.getScale(), 'C');
		temp = new Temperature(0, 'f');
		assertEquals(temp.getScale(), 'F');

		// Check invalid input
		temp = new Temperature(0, '\n');
		assertEquals(temp.getScale(), 'C');
		temp = new Temperature(0, '4');
		assertEquals(temp.getScale(), 'C');
		temp = new Temperature(0, 'q');
		assertEquals(temp.getScale(), 'C');
	}

	@Test
	void testSettingTemp() {
		// Check valid input
		temp = new Temperature();
		temp.setTemp(100);
		assertEquals(temp.getCelsius(), 100);
		temp.setTemp(200);
		assertEquals(temp.getCelsius(), 200);
		temp.setTemp(-200);
		assertEquals(temp.getCelsius(), -200);
		temp.setTemp(0.01f);
		assertEquals(temp.getCelsius(), 0.01f);
		temp.setTemp(-9.2142f);
		assertEquals(temp.getCelsius(), -9.2142f);
		temp.setTemp(Float.MIN_VALUE);
		assertEquals(temp.getCelsius(), Float.MIN_VALUE);

		// Check invalid input
		temp.setTemp(-200.0001f);
		assertEquals(temp.getCelsius(), 0);
		temp.setTemp(200.0001f);
		assertEquals(temp.getCelsius(), 0);
		temp.setTemp(-2000);
		assertEquals(temp.getCelsius(), 0);
		temp.setTemp(2000);
		assertEquals(temp.getCelsius(), 0);
		temp.setTemp(Float.MAX_VALUE);
		assertEquals(temp.getCelsius(), 0);
		temp.setTemp(-Float.MAX_VALUE);
		assertEquals(temp.getCelsius(), 0);
		temp.setTemp(Float.POSITIVE_INFINITY);
		assertEquals(temp.getCelsius(), 0);
		temp.setTemp(Float.NEGATIVE_INFINITY);
		assertEquals(temp.getCelsius(), 0);

	}

	@Test
	void testConversions() {
		// Celsius to Farenheit
		temp = new Temperature(100, 'C');
		assertEquals(temp.getFarenheit(), 212);
		temp.setTemp(0);
		assertEquals(temp.getFarenheit(), 32);
		temp.setTemp(10.876f);
		assertEquals(temp.getFarenheit(), 51.5768f);
		temp.setTemp(0.00001f);
		assertEquals(temp.getFarenheit(), 32.000018f);
		temp.setTemp(-96.330f);
		assertEquals(temp.getFarenheit(), -141.39401f);

		// Farenheit to Celsius
		temp.setScale('F');
		temp.setTemp(32);
		assertEquals(temp.getCelsius(), 0);
		temp.setTemp(200);
		assertEquals(temp.getCelsius(), 93.3333336f);
		temp.setTemp(10.4f);
		assertEquals(temp.getCelsius(), -12);
		temp.setTemp(-86.8f);
		assertEquals(temp.getCelsius(), -66);
	}

	@Test
	void testComparasions() {
		Temperature temp1 = new Temperature();
		Temperature temp2 = new Temperature();

		boolean bResult;
		int iResult;

		// Check equal temperatures
		bResult = temp1.equals(temp2);
		iResult = temp1.compareTo(temp2);
		assertEquals(bResult, true);
		assertEquals(iResult, 0);

		temp1.setTempAndScale(32, 'F');

		bResult = temp1.equals(temp2);
		iResult = temp1.compareTo(temp2);
		assertEquals(bResult, true);
		assertEquals(iResult, 0);

		// Check unequal temperatures
		temp1.setTemp(10.4f); // Farenheit = -12c
		temp2.setTemp(-13); // Celsius

		bResult = temp1.equals(temp2);
		iResult = temp1.compareTo(temp2);
		assertEquals(bResult, false);
		assertEquals(iResult, 1);

		iResult = temp2.compareTo(temp1);
		assertEquals(iResult, -1);

		temp2.setTemp(-12.000001f);

		bResult = temp1.equals(temp2);
		iResult = temp1.compareTo(temp2);
		assertEquals(bResult, false);
		assertEquals(iResult, 1);

		iResult = temp2.compareTo(temp1);
		assertEquals(iResult, -1);

	}

	@Test
	void testToString() {
		temp = new Temperature(100, 'F');
		String testString = temp.toString();
		assertEquals(testString, "F: 100.00");

		temp.setTemp(50.1292351f);
		testString = temp.toString();
		assertEquals(testString, "F: 50.13");

		temp.setTemp(50.1242351f);
		testString = temp.toString();
		assertEquals(testString, "F: 50.12");

		temp.setScale('C');
		testString = temp.toString();
		assertEquals(testString, "C: 50.12");
	}

}
