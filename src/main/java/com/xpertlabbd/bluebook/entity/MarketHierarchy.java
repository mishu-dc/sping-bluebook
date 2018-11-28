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
@Table(name="MarketHierarchies")
public class MarketHierarchy extends EntityBase{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;
	
	@Column(name="Code")
	private String code;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Type")
	private int type;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ParentId")
	private MarketHierarchy parent;
	
	public MarketHierarchy() {
		super();
	}
	
	public MarketHierarchy(String code, String name, int type, MarketHierarchy parent) {
		super();
		this.code = code;
		this.name = name;
		this.type = type;
		this.parent = parent;
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

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public MarketHierarchy getParent() {
		return parent;
	}

	public void setParent(MarketHierarchy parent) {
		this.parent = parent;
	}

	@Override
	public String toString() {
		return "MarketHierarchy [id=" + id + ", code=" + code + ", name=" + name + ", type=" + type + ", parent="
				+ parent + "]";
	}
}
