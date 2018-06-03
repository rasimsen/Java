package com.oasissofttech.springboot.brand;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Brand {
	@Id
	private int id;
	private String brandName;
	private String description;

	public Brand() {
	}

	public Brand(int id, String brandName, String description) {
		super();
		this.id = id;
		this.brandName = brandName;
		this.description = description;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
