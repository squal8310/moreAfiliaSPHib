package org.moreafilia.app.dao;

import org.moreafilia.app.model.Domicilio;
import org.springframework.stereotype.Repository;

@Repository
public interface IDireccionDAO{

	void guardaDireecion(Domicilio domicilio);

}
