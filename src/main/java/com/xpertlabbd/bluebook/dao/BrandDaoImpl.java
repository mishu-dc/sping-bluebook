package com.xpertlabbd.bluebook.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xpertlabbd.bluebook.entity.Brand;

@Repository
public class BrandDaoImpl implements BrandDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(Brand brand) {
		sessionFactory.getCurrentSession().save(brand);
	}

	@Override
	public List<Brand> list() {
		@SuppressWarnings("unchecked")
	    TypedQuery<Brand> query = sessionFactory.getCurrentSession().createQuery("from Brand");
	    return query.getResultList();
	}

}
