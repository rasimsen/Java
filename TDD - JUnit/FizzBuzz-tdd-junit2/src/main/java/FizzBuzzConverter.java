
public class FizzBuzzConverter {

	public String convert(int i) {

		return i%15==0?"FizzBuzz":i%5==0?"Buzz":i%3==0?"Fizz":String.valueOf(i);
		
		/*if(i%15==0) {
			return "FizzBuzz";
		}
		
		if(i%5==0) {
			return "Buzz";
		}
		
		if(i%3==0) {
			return "Fizz";
		}
		
		return String.valueOf(i);*/
	}

}
