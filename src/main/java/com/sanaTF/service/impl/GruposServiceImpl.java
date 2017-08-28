package com.sanaTF.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sanaTF.dao.GruposDao;
import com.sanaTF.model.Grupos;
import com.sanaTF.service.GruposService;

@Service
public class GruposServiceImpl implements GruposService{
	@Autowired
	private GruposDao gruposDao;
	
	@Transactional
	public void add(Grupos grupo) {
		gruposDao.add(grupo);

	}

	@Transactional
	public void edit(Grupos grupo) {
		gruposDao.edit(grupo);

	}

	@Transactional
	public void delete(int idGrupo) {
		gruposDao.delete(idGrupo);

	}

	@Transactional
	public Grupos getGrupo(int idGrupo) {
		return gruposDao.getGrupo(idGrupo);
	}
	

	@Transactional
	public List getAllGrupos() {
		return gruposDao.getAllGrupos();
	}

}
