package com.sanaTF.dao;

import java.util.List;

import com.sanaTF.model.Grupos;

public interface GruposDao {
	public void add(Grupos grupo);
	public void edit(Grupos grupo);
	public void delete(int idGrupo);
	public Grupos getGrupo(int idGrupo);
	public List getAllGrupos();
}
