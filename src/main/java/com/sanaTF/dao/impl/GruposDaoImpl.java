package com.sanaTF.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanaTF.dao.GruposDao;
import com.sanaTF.model.Grupos;


@Repository
public class GruposDaoImpl implements GruposDao{
	@Autowired
	private SessionFactory session;

	@Override
	public void add(Grupos grupo) {
		session.getCurrentSession().save(grupo);

	}

	@Override
	public void edit(Grupos grupo) {
		session.getCurrentSession().update(grupo);

	}

	@Override
	public void delete(int idGrupo) {
		session.getCurrentSession().delete(getGrupo(idGrupo));

	}

	@Override
	public Grupos getGrupo(int idGrupo) {
		return (Grupos)session.getCurrentSession().createQuery("from grupos where idGrupo=:idGrupo")
				.setParameter("idGrupo",idGrupo)
				.uniqueResult();
				
	}


	@Override
	public List getAllGrupos() {
		return session.getCurrentSession().createQuery("from grupos").list();
	}

}
