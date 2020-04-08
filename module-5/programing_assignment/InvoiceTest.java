import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InvoiceTest {
	

	@Test
	void testCompareTo() 
	{
		Address add1 = new Address("123 Sample Ave", "Anywhere", "NY", 504);
		Customer cus1 = new Customer("Jane", "Lee", "janellee@example.net", add1);
		Date dat1 = new Date(12, 24, 2019);
		Date dat2 = new Date(03, 14, 2019);
		Account acc1 = new Account(cus1, 0, 0, dat1);
		
		    Product product1 = new Product("Squid", "Cleaning Supplies", 18.95, 3918);
	        Product product2 = new Product("Salmon", "Food item", 12.50, 2810);
	        Product product3 = new Product("Baby food", "Household necessities", 14.58, 9109);
	        
		Invoice inv1 = new Invoice("JaneLee12242019", acc1, dat1);
		Invoice inv2 = new Invoice("JaneLee03142019", acc1, dat2);
		
		inv1.addProduct(product1);
		inv1.addProduct(product2);
		inv2.addProduct(product3);
		
		assertEquals(inv1.compareTo(inv2), 1);
		assertEquals(inv2.compareTo(inv1), -1);
	}
	
	
	
	@Test
	void testGetAmountDue()
	{
		Address add1 = new Address("123 Sample Ave", "Anywhere", "NY", 504);
		Customer cus1 = new Customer("Jane", "Lee", "janellee@example.net", add1);
		Date dat1 = new Date(12, 24, 2019);
		Date dat2 = new Date(03, 14, 2019);
		Account acc1 = new Account(cus1, 0, 0, dat1);
		
		    Product product1 = new Product("Squid", "Cleaning Supplies", 18.95, 3918);
	        Product product2 = new Product("Salmon", "Food item", 12.50, 2810);
	        Product product3 = new Product("Baby food", "Household necessities", 14.58, 9109);
	        
	        
		Invoice inv1 = new Invoice("JaneLee12242019", acc1, dat1);
		inv1.addProduct(product1);
		inv1.addProduct(product2);
		
		Invoice inv2 = new Invoice("JaneLee03142019", acc1, dat2);
		inv2.addProduct(product3);
		
		assertEquals(inv2.getAmountDue(), "14.58");
		
	}

}
