import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureTest {

	@Test
	void test1()
	{
		//valid data
		Temperature temp = new Temperature();
		temp.setTempAndScale(0.0f, 'C');
		float degreesC = temp.getCelsius();
		assertEquals(degreesC, 0.0f);
		
		//invalid data
		Temperature temp2 = new Temperature();
		temp.setTempAndScale(32.0f, 'F');
		float degreesF = temp.getFahrenheit();
		assertEquals(degreesF, 32.0f);
		}

	@Test
	void test2()
	{
		//valid data
		Temperature temp = new Temperature();
		temp.setTempAndScale(-40.0f, 'C');
		float degreesC = temp.getCelsius();
		assertEquals(degreesC, -40.0f);
		
		//invalid data
		Temperature temp2 = new Temperature();
		temp.setTempAndScale(-40.0f, 'F');
		float degreesF = temp.getFahrenheit();
		assertEquals(degreesF, -40.0f);
		
		}
	
	@Test
	void test3()
	{
		//valid data
		Temperature temp = new Temperature();
		temp.setTempAndScale(100.0f, 'C');
		float degreesC = temp.getCelsius();
		assertEquals(degreesC, 100.0f);
		
		//invalid data
		Temperature temp2 = new Temperature();
		temp.setTempAndScale(212.0f, 'F');
		float degreesF = temp.getFahrenheit();
		assertEquals(degreesF, 212.0f);
		
	}
}

