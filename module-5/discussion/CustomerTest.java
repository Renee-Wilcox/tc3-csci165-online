package discussionmodule5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerTest {

			Address addr1 = new Address("Sample St", 40092); /*similar to employee.java */
			Customer janeLee = new Customer("Jane", "Lee", "janellee@example.net", addr1);
			
		@Test
		void testCustomerStringStringStringAddress()
		{
			String str1 = addr1.getStreet();
			assertEquals(str1, "Sample St");
		}
		
		@Test
		void testSetAddress()
		{
			addr1.setStreet("Random Ln");
			addr1.setZip(12391);
			janeLee.setAddress(addr1);
			
			String str1 = addr1.toString();
			String str2 = janeLee.getAddress().toString();
			
			assertEquals(str1, str2);
		}
		
		@Test 
		void testGetAddress()
		{
			String str1 = janeLee.getAddress().toString();
			assertEquals(str1, "Sample St null null 40092");
			
		}
		
}