package demo.fizzbuzz1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.fizzbuzz1.FizzBuzzService;

@RestController
public class FizzBuzzController {
	@Autowired
	private ServiceInt xx;
	
	
	@RequestMapping("/fb/{i}")
	public String getFizzBuzz(@PathVariable("i") int i) {
		return xx.convert1(i);
	}
	
	
}
