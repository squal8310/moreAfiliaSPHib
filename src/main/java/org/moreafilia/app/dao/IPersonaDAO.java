package org.moreafilia.app.dao;

import org.moreafilia.app.model.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaDAO{

	void guardaPersona(Persona persona);

}
