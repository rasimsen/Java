package springbootfizzbuzz3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FizzBuzzController {
	
	@Autowired
	private FizzBuzzService service;
	
	@RequestMapping("/fizzbuzz/{inputVal}")
	public String fizzBuzz(@PathVariable("inputVal") int i) {
		return service.convert(i);
	}
	@RequestMapping("/fizzbuzzall")
	public String fizzBuzz() {
		return "";//todo
	}
}
