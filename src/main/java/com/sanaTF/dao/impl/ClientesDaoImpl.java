package com.sanaTF.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanaTF.dao.ClientesDao;
import com.sanaTF.model.Clientes;


@Repository
public class ClientesDaoImpl implements ClientesDao {
	@Autowired
	private SessionFactory session;

	@Override
	public void add(Clientes clientes) {
		session.getCurrentSession().save(clientes);

	}

	@Override
	public void edit(Clientes clientes) {
		session.getCurrentSession().update(clientes);

	}

	@Override
	public void delete(int idClientes) {
		session.getCurrentSession().delete(getClientes(idClientes));

	}

	@Override
	public Clientes getClientes(int idClientes) {
		return (Clientes)session.getCurrentSession().createQuery("from Clientes f where f.idCliente=:idClientes")
				.setParameter("idClientes",idClientes)
				.uniqueResult();
				
	}


	@Override
	public List getAllClientes() {
		return session.getCurrentSession().createQuery("from Clientes").list();
	}

}

