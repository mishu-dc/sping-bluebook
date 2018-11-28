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
@Table(name="FieldForces")
public class FieldForce extends EntityBase{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;
	
	@Column(name="Code")
	private String code;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="Phone")
	private String phone;
	
	@JoinColumn(name="MarketHierarchyId")
	@OneToOne(cascade=CascadeType.ALL)
	private MarketHierarchy marketHierarchy;

	public FieldForce() {
		super();
	}

	public FieldForce(String code, String name, String email, String phone, MarketHierarchy marketHierarchy) {
		super();
		this.code = code;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.marketHierarchy = marketHierarchy;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public MarketHierarchy getMarketHierarchy() {
		return marketHierarchy;
	}

	public void setMarketHierarchy(MarketHierarchy marketHierarchy) {
		this.marketHierarchy = marketHierarchy;
	}

	@Override
	public String toString() {
		return "FieldForce [id=" + id + ", code=" + code + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", marketHierarchy=" + marketHierarchy + "]";
	}
}
