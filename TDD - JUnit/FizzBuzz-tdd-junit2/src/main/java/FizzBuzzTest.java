import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {
	
	/**
	 * write a program that print the numbers from 1 to 100
	 * 1==1
	 * 2==2
	 * 3==Fizz
	 * 4==4
	 * 5==Buzz
	 * ..
	 * ..
	 * 15 = FizzBuzz
	 * 
	 */
	
	@Test
	public void fizzBuzzConverter1() {
		FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
		assertEquals("expected val:", "1",fizzBuzzConverter.convert(1));
		assertEquals("expected val:", "2",fizzBuzzConverter.convert(2));
	}
	
	@Test
	public void fizzBuzzConverterForFizz() {
		FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
		assertEquals("expected val:", "Fizz",fizzBuzzConverter.convert(3));
	}
	
	@Test
	public void fizzBuzzConverterForBuzz() {
		FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
		assertEquals("expected val:", "Buzz",fizzBuzzConverter.convert(5));
	}
	
	@Test
	public void fizzBuzzConverterForFizzBuzz() {
		FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
		assertEquals("expected val:", "FizzBuzz",fizzBuzzConverter.convert(15));
	}
	
	
	
	
	
}
