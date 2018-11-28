package com.xpertlabbd.bluebook.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Distributors")
public class Distributor extends EntityBase{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "Id")
	private Long id;
	
	@Column(name = "Code")
	private String code;

	@Column(name = "Name")
	private String name;
	
	@Column(name = "Address")
	private String address;
	
	public Distributor() {
		super();
	}

	public Distributor(String code, String name, String address) {
		super();
		this.code = code;
		this.name = name;
		this.address = address;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Distributor [id=" + id + ", code=" + code + ", name=" + name + ", address=" + address + "]";
	}
	
}
