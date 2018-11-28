package com.xpertlabbd.bluebook.dao;

import java.util.List;

import com.xpertlabbd.bluebook.entity.Brand;

public interface BrandDao {
	void save(Brand brand);
	List<Brand> list();
}
