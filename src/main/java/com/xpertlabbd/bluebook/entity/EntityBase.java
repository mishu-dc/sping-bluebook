package com.xpertlabbd.bluebook.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class EntityBase {
	
	@Column(name = "CreatedDate")
	private Date createdDate;
	
	@Column(name = "UpdatedDate")
	private Date updatedDate;
	
	@Column(name = "CreatedBy")
	private String createdBy;
	
	@Column(name = "UpdatedBy")
	private String updatedBy;
	
	public EntityBase() {
		createdDate = new Date();
	}

	public EntityBase(Date createdDate, Date updatedDate, String createdBy, String updatedBy) {
		super();
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Override
	public String toString() {
		return "EntityBase [createdDate=" + createdDate + ", updatedDate=" + updatedDate + ", createdBy=" + createdBy
				+ ", updatedBy=" + updatedBy + "]";
	}
	
}
