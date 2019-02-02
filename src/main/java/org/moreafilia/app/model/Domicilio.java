package org.moreafilia.app.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the DOMICILIO database table.
 * 
 */
@Entity
@NamedQuery(name="Domicilio.findAll", query="SELECT d FROM Domicilio d")
@Table(name="DOMICILIO", schema="MORE_AFILIA_MODEL")
public class Domicilio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_DIRECCION")
	private int idDireccion;

	private String calle;

	private String colonia;

	@Column(name="DELEGACION_MUNICIPIO")
	private String delegacionMunicipio;

	private String entidad;

	@Column(name="NO_EXT")
	private String noExt;

	@Column(name="NO_INT")
	private String noInt;

	public Domicilio() {
	}

	public int getIdDireccion() {
		return this.idDireccion;
	}

	public void setIdDireccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}

	public String getCalle() {
		return this.calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getColonia() {
		return this.colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getDelegacionMunicipio() {
		return this.delegacionMunicipio;
	}

	public void setDelegacionMunicipio(String delegacionMunicipio) {
		this.delegacionMunicipio = delegacionMunicipio;
	}

	public String getEntidad() {
		return this.entidad;
	}

	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}

	public String getNoExt() {
		return this.noExt;
	}

	public void setNoExt(String noExt) {
		this.noExt = noExt;
	}

	public String getNoInt() {
		return this.noInt;
	}

	public void setNoInt(String noInt) {
		this.noInt = noInt;
	}

}