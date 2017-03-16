package com.sanaTF.dao;

import java.util.List;

import com.sanaTF.model.Promotores;

public interface PromotoresDao {
	void add(Promotores promotores);
	void edit(Promotores promotores);
	void delete(int promotores_Id);
	Promotores find(int promotores_Id);
	List<Promotores> getAllPromotores();
}