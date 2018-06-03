package com.oasissofttech.springboot.brand;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BrandService {

	private List<Brand> brands = Arrays.asList(
			new Brand(1,"Aston Martin","(1913–present)"),
			new Brand(2,"Bentley","(1919–present)"),
			new Brand(3,"Jaguar Land Rover","(2013-present)"),
			new Brand(4,"Lotus","(1952–present)"),
			new Brand(5,"Rolls Royce","(1904–present)")
			);
	
	public List<Brand> getAllBrands(){
		return brands;
	}
	
	
	public Brand getBrand(int id) {
		return brands.stream().filter(b->b.getId()==id).findFirst().get();
	}
	
}
