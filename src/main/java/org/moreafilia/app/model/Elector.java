package org.moreafilia.app.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ELECTOR database table.
 * 
 */
@Entity
@NamedQuery(name="Elector.findAll", query="SELECT e FROM Elector e")
@Table(name="ELECTOR", schema="MORE_AFILIA_MODEL")
public class Elector implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_ELECTOR")
	private int idElector;

	@Column(name="CLAVE_ELECTOR")
	private String claveElector;

	//bi-directional many-to-one association to Persona
	@ManyToOne
	@JoinColumn(name="ID_PERSONA")
	private Persona persona;

	public Elector() {
	}

	public int getIdElector() {
		return this.idElector;
	}

	public void setIdElector(int idElector) {
		this.idElector = idElector;
	}

	public String getClaveElector() {
		return this.claveElector;
	}

	public void setClaveElector(String claveElector) {
		this.claveElector = claveElector;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

}