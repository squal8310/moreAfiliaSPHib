package org.moreafilia.app.service.impl;

import javax.transaction.Transactional;

import org.moreafilia.app.dao.IAfiliacionDAO;
import org.moreafilia.app.model.Afiliacion;
import org.moreafilia.app.service.IAfiliacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AfiliacionService implements IAfiliacionService{

	
	@Autowired
	private IAfiliacionDAO afiliaDAO;
	
	@Transactional
	@Override
	public void afiliacion(Afiliacion afiliacion) {
		afiliaDAO.guardaAfiliacion(afiliacion);
	}

	
}
