package com.sanaTF.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.sanaTF.dao.PromotoresDao;
import com.sanaTF.model.Promotores;


@Repository
public class PromotoresDaoImpl implements PromotoresDao {

	@Autowired
	private SessionFactory session;
	
	@Override
	public void add(Promotores promotores) {
		session.getCurrentSession().save(promotores);
	}

	@Override
	public void edit(Promotores promotores) {
		session.getCurrentSession().update(promotores);
	}

	@Override
	public void delete(int Promotores_Id) {
		session.getCurrentSession().delete(find(Promotores_Id));

	}

	@Override
	public Promotores find(int Promotores_Id) {
		return (Promotores) session.getCurrentSession().get(Promotores.class, Promotores_Id);
	}


	@Override
	public List getAllPromotores() {
		return  session.getCurrentSession().createQuery("from promotores").list();
	}

}
