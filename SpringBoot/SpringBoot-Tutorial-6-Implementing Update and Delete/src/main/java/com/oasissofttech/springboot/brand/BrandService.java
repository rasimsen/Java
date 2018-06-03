package com.oasissofttech.springboot.brand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BrandService {

	private List<Brand> brands = new ArrayList<>(Arrays.asList(
			new Brand(1,"Aston Martin","(1913–present)"),
			new Brand(2,"Bentley","(1919–present)"),
			new Brand(3,"Jaguar Land Rover","(2013-present)"),
			new Brand(4,"Lotus","(1952–present)"),
			new Brand(5,"Rolls Royce","(1904–present)")
			));
	
	public List<Brand> getAllBrands(){
		return brands;
	}
	
	
	public Brand getBrand(int id) {
		return brands.stream().filter(b->b.getId()==id).findFirst().get();
	}


	public void addBrand(Brand brand) {
		brands.add(brand);
	}


	public void updateBrand(Brand brand, int id) {
		int c = brands.size();
		for(int i=0;i<c;i++) {
			if(brands.get(i).getId()==id) {
				brands.set(i, brand);
				return;
			}
		}
	}


	public void deleteBrand(int id) {
		brands.removeIf(t->t.getId()==id);
	}
	
}
