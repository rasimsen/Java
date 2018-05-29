package demo.fizzbuzz1;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService implements ServiceInt {
	
	public String convert1(int i) {
		
		
		if(i%15==0) return "FizzBuzz"; 
		
		if(i%5==0) return "Buzz";
		
		if(i%3==0)return "Fizz";
		
		return String.valueOf(i);
	}
	
}
