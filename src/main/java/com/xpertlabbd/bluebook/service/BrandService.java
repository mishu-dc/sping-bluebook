package com.xpertlabbd.bluebook.service;

import java.util.List;

import com.xpertlabbd.bluebook.entity.*;

public interface BrandService {
	void save(Brand brand);
	List<Brand> list();
}
