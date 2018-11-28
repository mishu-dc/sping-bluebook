package com.xpertlabbd.bluebook.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xpertlabbd.bluebook.dao.BrandDao;
import com.xpertlabbd.bluebook.entity.*;

@Service
public class BrandServiceImpl implements BrandService {

	@Autowired
	private BrandDao brandDao; 
	 
	@Override
	@Transactional
	public void save(Brand brand) {
		brandDao.save(brand);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Brand> list() {
		return brandDao.list();
	}

}
