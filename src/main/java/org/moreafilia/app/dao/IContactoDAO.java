package org.moreafilia.app.dao;

import org.moreafilia.app.model.Contacto;
import org.springframework.stereotype.Repository;

@Repository
public interface IContactoDAO{

	void guardaContacto(Contacto contacto);

}
