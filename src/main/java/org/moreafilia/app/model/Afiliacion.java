package org.moreafilia.app.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the AFILIACION database table.
 * 
 */
@Entity
@NamedQuery(name="Afiliacion.findAll", query="SELECT a FROM Afiliacion a")
@Table(name="AFILIACION", schema="MORE_AFILIA_MODEL")
public class Afiliacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_AFILIACION")
	private int idAfiliacion;

	@Column(name="FECHA_AFILIACION")
	private String fechaAfiliacion;

	private String firma;

	private String foto;

	private String seccion;

	//bi-directional many-to-one association to Elector
	@ManyToOne
	@JoinColumn(name="ID_ELECTOR")
	private Elector elector;

	public Afiliacion() {
	}

	public int getIdAfiliacion() {
		return this.idAfiliacion;
	}

	public void setIdAfiliacion(int idAfiliacion) {
		this.idAfiliacion = idAfiliacion;
	}

	public String getFechaAfiliacion() {
		return this.fechaAfiliacion;
	}

	public void setFechaAfiliacion(String fechaAfiliacion) {
		this.fechaAfiliacion = fechaAfiliacion;
	}

	public String getFirma() {
		return this.firma;
	}

	public void setFirma(String firma) {
		this.firma = firma;
	}

	public String getFoto() {
		return this.foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getSeccion() {
		return this.seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public Elector getElector() {
		return this.elector;
	}

	public void setElector(Elector elector) {
		this.elector = elector;
	}

}