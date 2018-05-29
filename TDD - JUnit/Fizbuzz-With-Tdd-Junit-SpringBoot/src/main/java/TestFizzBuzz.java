import static org.junit.Assert.assertEquals;

import org.junit.Test;

import demo.fizzbuzz1.FizzBuzzService;

public class TestFizzBuzz {

	
	// tdd 
	//1- test - fail test
	//2- run test
	//3- 
	
	@Test
	public void testFizz1() {
		FizzBuzzService xx = new FizzBuzzService();
		
		assertEquals("expected val:","1",xx.convert1(1));
		assertEquals("expected val:","Fizz",xx.convert1(3));
		assertEquals("expected val:","Buzz",xx.convert1(5));
		assertEquals("expected val:","FizzBuzz",xx.convert1(15));
		assertEquals("expected val:","Fizz",xx.convert1(9));
	}
	
}
