package com.xpertlabbd.bluebook.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Products")
public class Product extends EntityBase{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "Id")
	private Long id;
	
	@Column(name = "Code")
	private String code;

	@Column(name = "Name")
	private String name;
	
	@Column(name = "Price")
	private double price;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="BrandId")
	private Brand brand;
	
	public Product() {
		super();
	}

	public Product(String code, String name, double price, Brand brand) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.brand = brand;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", code=" + code + ", name=" + name + ", price=" + price + ", brand=" + brand.toString()
				+ "]";
	}
	
}
