package org.moreafilia.app.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the PERSONA database table.
 * 
 */
@Entity
@NamedQuery(name="Persona.findAll", query="SELECT p FROM Persona p")
@Table(name="PERSONA", schema="MORE_AFILIA_MODEL")
public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_PERSONA")
	private int idPersona;

	@Column(name="AP_MATERNO")
	private String apMaterno;

	@Column(name="AP_PATERNO")
	private String apPaterno;

	private String nombre;

	//bi-directional many-to-one association to Contacto
	@ManyToOne
	@JoinColumn(name="ID_CONTACTO")
	private Contacto contacto;

	//bi-directional many-to-one association to Domicilio
	@ManyToOne
	@JoinColumn(name="ID_DIRECCION")
	private Domicilio domicilio;

	public Persona() {
	}

	public int getIdPersona() {
		return this.idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getApMaterno() {
		return this.apMaterno;
	}

	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}

	public String getApPaterno() {
		return this.apPaterno;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Contacto getContacto() {
		return this.contacto;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}

	public Domicilio getDomicilio() {
		return this.domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

}