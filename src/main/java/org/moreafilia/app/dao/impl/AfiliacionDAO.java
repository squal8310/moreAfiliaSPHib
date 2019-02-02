package org.moreafilia.app.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.moreafilia.app.dao.IAfiliacionDAO;
import org.moreafilia.app.model.Afiliacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class AfiliacionDAO implements IAfiliacionDAO{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void guardaAfiliacion(Afiliacion afiliacion) {
		sessionFactory.getCurrentSession().save(afiliacion.getElector().getPersona().getContacto());
		sessionFactory.getCurrentSession().save(afiliacion.getElector().getPersona().getDomicilio());
		sessionFactory.getCurrentSession().save(afiliacion.getElector().getPersona());
		sessionFactory.getCurrentSession().save(afiliacion.getElector());
		 sessionFactory.getCurrentSession().save(afiliacion);
	}
	

	@Transactional(readOnly = true)
	@Override
   public List<Afiliacion> consultarAfiliaciones() {
		  @SuppressWarnings("unchecked")
	      TypedQuery<Afiliacion> query = sessionFactory.getCurrentSession().createQuery("from Afiliacion");
	      return query.getResultList();
   }
}
