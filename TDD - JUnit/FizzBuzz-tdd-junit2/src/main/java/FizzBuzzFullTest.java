import org.junit.Test;

public class FizzBuzzFullTest {
	@Test
	public void convertAll() {
		FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
		for (int i = 1; i <= 100; i++) {
			System.out.println(fizzBuzzConverter.convert(i));
		}
	}
}
