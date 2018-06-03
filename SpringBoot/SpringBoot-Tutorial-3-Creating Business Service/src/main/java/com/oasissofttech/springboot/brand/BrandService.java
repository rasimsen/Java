package com.oasissofttech.springboot.brand;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BrandService {

	private List<Brand> brands = Arrays.asList(
			new Brand(1,"Aston Martin","(1913–present)"),
			new Brand(1,"Bentley","(1919–present)"),
			new Brand(1,"Jaguar Land Rover","(2013-present)"),
			new Brand(1,"Lotus","(1952–present)"),
			new Brand(1,"Rolls Royce","(1904–present)")
			);
	
	public List<Brand> getAllBrands(){
		return brands;
	}
	
}
