package com.oasissofttech.springboot.brand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandService {
	@Autowired
	private BrandRepository brandRepository;
	
	public List<Brand> getAllBrands(){
		List<Brand> brands = new ArrayList<>();
		brandRepository.findAll()
		.forEach(brands::add);
		
		return brands;
	}
	
	
	public Optional<Brand> getBrand(int id) {
		return brandRepository.findById(id);
	}


	public void addBrand(Brand brand) {
		brandRepository.save(brand);
	}


	public void updateBrand(Brand brand, int id) {
		brandRepository.save(brand);
	}


	public void deleteBrand(int id) {
		brandRepository.deleteById(id);
	}
	
}
