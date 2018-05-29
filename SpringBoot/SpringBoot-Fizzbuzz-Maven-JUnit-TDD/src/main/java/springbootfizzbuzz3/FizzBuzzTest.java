package springbootfizzbuzz3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {
	@Test
	public void fizzBuzz() {
		FizzBuzzService fizzBuzzService = new FizzBuzzService();
		assertEquals("expected:","1",fizzBuzzService.convert(1));
		assertEquals("expected:","Fizz",fizzBuzzService.convert(3));
		assertEquals("expected:","Buzz",fizzBuzzService.convert(5));
		assertEquals("expected:","FizzBuzz",fizzBuzzService.convert(15));
		assertEquals("expected:","Fizz",fizzBuzzService.convert(42));
	}
}
