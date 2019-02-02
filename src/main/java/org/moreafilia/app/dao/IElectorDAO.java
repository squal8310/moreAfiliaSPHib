package org.moreafilia.app.dao;

import org.moreafilia.app.model.Elector;
import org.springframework.stereotype.Repository;

@Repository
public interface IElectorDAO{

	void guardaElector(Elector elector);

}
