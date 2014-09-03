/**
 * This class is generated by jOOQ
 */
package org.untref.agendauniversitaria.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DocumentosRecord extends org.jooq.impl.TableRecordImpl<org.untref.agendauniversitaria.tables.records.DocumentosRecord> implements org.jooq.Record7<java.lang.Integer, java.lang.String[], java.lang.String[], java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Double> {

	private static final long serialVersionUID = 1123473136;

	/**
	 * Setter for <code>agenda.documentos.ID</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>agenda.documentos.ID</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>agenda.documentos.Descripcion</code>.
	 */
	public void setDescripcion(java.lang.String[] value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>agenda.documentos.Descripcion</code>.
	 */
	public java.lang.String[] getDescripcion() {
		return (java.lang.String[]) getValue(1);
	}

	/**
	 * Setter for <code>agenda.documentos.URL</code>.
	 */
	public void setUrl(java.lang.String[] value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>agenda.documentos.URL</code>.
	 */
	public java.lang.String[] getUrl() {
		return (java.lang.String[]) getValue(2);
	}

	/**
	 * Setter for <code>agenda.documentos.CantDescargas</code>.
	 */
	public void setCantdescargas(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>agenda.documentos.CantDescargas</code>.
	 */
	public java.lang.Integer getCantdescargas() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>agenda.documentos.IDUploader</code>.
	 */
	public void setIduploader(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>agenda.documentos.IDUploader</code>.
	 */
	public java.lang.Integer getIduploader() {
		return (java.lang.Integer) getValue(4);
	}

	/**
	 * Setter for <code>agenda.documentos.IdMateria</code>.
	 */
	public void setIdmateria(java.lang.Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>agenda.documentos.IdMateria</code>.
	 */
	public java.lang.Integer getIdmateria() {
		return (java.lang.Integer) getValue(5);
	}

	/**
	 * Setter for <code>agenda.documentos.CalificacionPromedio</code>.
	 */
	public void setCalificacionpromedio(java.lang.Double value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>agenda.documentos.CalificacionPromedio</code>.
	 */
	public java.lang.Double getCalificacionpromedio() {
		return (java.lang.Double) getValue(6);
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Integer, java.lang.String[], java.lang.String[], java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Double> fieldsRow() {
		return (org.jooq.Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Integer, java.lang.String[], java.lang.String[], java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Double> valuesRow() {
		return (org.jooq.Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.untref.agendauniversitaria.tables.Documentos.DOCUMENTOS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String[]> field2() {
		return org.untref.agendauniversitaria.tables.Documentos.DOCUMENTOS.DESCRIPCION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String[]> field3() {
		return org.untref.agendauniversitaria.tables.Documentos.DOCUMENTOS.URL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return org.untref.agendauniversitaria.tables.Documentos.DOCUMENTOS.CANTDESCARGAS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return org.untref.agendauniversitaria.tables.Documentos.DOCUMENTOS.IDUPLOADER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field6() {
		return org.untref.agendauniversitaria.tables.Documentos.DOCUMENTOS.IDMATERIA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field7() {
		return org.untref.agendauniversitaria.tables.Documentos.DOCUMENTOS.CALIFICACIONPROMEDIO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String[] value2() {
		return getDescripcion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String[] value3() {
		return getUrl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getCantdescargas();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getIduploader();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value6() {
		return getIdmateria();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value7() {
		return getCalificacionpromedio();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DocumentosRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DocumentosRecord value2(java.lang.String[] value) {
		setDescripcion(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DocumentosRecord value3(java.lang.String[] value) {
		setUrl(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DocumentosRecord value4(java.lang.Integer value) {
		setCantdescargas(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DocumentosRecord value5(java.lang.Integer value) {
		setIduploader(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DocumentosRecord value6(java.lang.Integer value) {
		setIdmateria(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DocumentosRecord value7(java.lang.Double value) {
		setCalificacionpromedio(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DocumentosRecord values(java.lang.Integer value1, java.lang.String[] value2, java.lang.String[] value3, java.lang.Integer value4, java.lang.Integer value5, java.lang.Integer value6, java.lang.Double value7) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached DocumentosRecord
	 */
	public DocumentosRecord() {
		super(org.untref.agendauniversitaria.tables.Documentos.DOCUMENTOS);
	}

	/**
	 * Create a detached, initialised DocumentosRecord
	 */
	public DocumentosRecord(java.lang.Integer id, java.lang.String[] descripcion, java.lang.String[] url, java.lang.Integer cantdescargas, java.lang.Integer iduploader, java.lang.Integer idmateria, java.lang.Double calificacionpromedio) {
		super(org.untref.agendauniversitaria.tables.Documentos.DOCUMENTOS);

		setValue(0, id);
		setValue(1, descripcion);
		setValue(2, url);
		setValue(3, cantdescargas);
		setValue(4, iduploader);
		setValue(5, idmateria);
		setValue(6, calificacionpromedio);
	}
}