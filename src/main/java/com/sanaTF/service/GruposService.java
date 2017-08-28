package com.sanaTF.service;

import java.util.List;

import com.sanaTF.model.Grupos;

public interface GruposService {
	public void add(Grupos grupo);
	public void edit(Grupos grupo);
	public void delete(int idGrupo);
	public Grupos getGrupo(int idGrupo);
	public List getAllGrupos();

}
