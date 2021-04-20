package com.bitacademy.aoptest;

public class ProductVo {
	//field
	private String name;
	
	//constructors
	public ProductVo(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// toString
	@Override
	public String toString() {
		return "ProductVo [name=" + name + "]";
	}
	
	

}
