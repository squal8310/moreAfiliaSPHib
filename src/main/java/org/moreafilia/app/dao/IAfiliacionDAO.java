package org.moreafilia.app.dao;

import java.util.List;

import org.moreafilia.app.model.Afiliacion;
import org.springframework.stereotype.Repository;


public interface IAfiliacionDAO {

	public void guardaAfiliacion(Afiliacion afiliacion);

	List<Afiliacion> consultarAfiliaciones();
}
