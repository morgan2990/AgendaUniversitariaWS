/**
 * This class is generated by jOOQ
 */
package org.untref.agendauniversitaria.model.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Cincomasdescargados implements java.io.Serializable {

	private static final long serialVersionUID = 929652626;

	private java.lang.String  documento;
	private java.lang.String  materia;
	private java.lang.String  subido;
	private java.lang.Integer descargas;
	private java.lang.Double  calificacion;

	public Cincomasdescargados() {}

	public Cincomasdescargados(
		java.lang.String  documento,
		java.lang.String  materia,
		java.lang.String  subido,
		java.lang.Integer descargas,
		java.lang.Double  calificacion
	) {
		this.documento = documento;
		this.materia = materia;
		this.subido = subido;
		this.descargas = descargas;
		this.calificacion = calificacion;
	}

	public java.lang.String getDocumento() {
		return this.documento;
	}

	public void setDocumento(java.lang.String documento) {
		this.documento = documento;
	}

	public java.lang.String getMateria() {
		return this.materia;
	}

	public void setMateria(java.lang.String materia) {
		this.materia = materia;
	}

	public java.lang.String getSubido() {
		return this.subido;
	}

	public void setSubido(java.lang.String subido) {
		this.subido = subido;
	}

	public java.lang.Integer getDescargas() {
		return this.descargas;
	}

	public void setDescargas(java.lang.Integer descargas) {
		this.descargas = descargas;
	}

	public java.lang.Double getCalificacion() {
		return this.calificacion;
	}

	public void setCalificacion(java.lang.Double calificacion) {
		this.calificacion = calificacion;
	}
}
