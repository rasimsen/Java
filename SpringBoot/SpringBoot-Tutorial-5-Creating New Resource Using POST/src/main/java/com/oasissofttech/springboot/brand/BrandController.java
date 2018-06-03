package com.oasissofttech.springboot.brand;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrandController {
	@Autowired
	private BrandService brandService;
	
	@RequestMapping("/brands")
	public List<Brand> getAllBrands() {
		return brandService.getAllBrands();
	}
	
	@RequestMapping("/brand/{brandId}")
	public Brand getBrand(@PathVariable("brandId") int id) {
		return brandService.getBrand(id);
	
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/brands")
	public void addBrand(@RequestBody Brand brand) {
		brandService.addBrand(brand);
	}
}
