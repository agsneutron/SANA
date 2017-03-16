
package com.sanaTF.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sanaTF.dao.PromotoresDao;
import com.sanaTF.model.Promotores;
import com.sanaTF.service.PromotoresService;

@Service
public class PromotoresServiceImpl implements PromotoresService {
	@Autowired
	private PromotoresDao promotoresDao;
	
	@Transactional
	public void add(Promotores promotores) {
		promotoresDao.add(promotores);

	}

	@Transactional
	public void edit(Promotores promotores) {
		promotoresDao.edit(promotores);

	}

	@Transactional
	public void delete(int idPromotor) {
		promotoresDao.delete(idPromotor);

	}

	@Transactional
	public Promotores find(int idPromotor) {
		return promotoresDao.find(idPromotor);
	}


	

	@Transactional
	public List getAllPromotores() {
		return promotoresDao.getAllPromotores();
	}

}
