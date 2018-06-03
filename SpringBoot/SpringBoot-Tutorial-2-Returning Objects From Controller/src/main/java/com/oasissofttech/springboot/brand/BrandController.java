package com.oasissofttech.springboot.brand;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrandController {
	
	@RequestMapping("/brands")
	public List<Brand> getAllBrands() {
		return Arrays.asList(
				new Brand(1,"Aston Martin","(1913–present)"),
				new Brand(1,"Bentley","(1919–present)"),
				new Brand(1,"Jaguar Land Rover","(2013-present)"),
				new Brand(1,"Lotus","(1952–present)"),
				new Brand(1,"Rolls Royce","(1904–present)")
				);
	}
}
