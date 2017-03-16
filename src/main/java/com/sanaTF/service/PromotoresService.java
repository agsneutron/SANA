
package com.sanaTF.service;

import java.util.List;

import com.sanaTF.model.Promotores;

public interface PromotoresService {
	void add(Promotores promotores);
	void edit(Promotores promotores);
	void delete(int promotores_Id);
	Promotores find(int promotores_Id);

	List<Promotores> getAllPromotores();
}