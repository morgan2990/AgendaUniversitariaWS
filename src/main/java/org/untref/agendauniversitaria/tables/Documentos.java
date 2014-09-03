/**
 * This class is generated by jOOQ
 */
package org.untref.agendauniversitaria.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Documentos extends org.jooq.impl.TableImpl<org.untref.agendauniversitaria.tables.records.DocumentosRecord> {

	private static final long serialVersionUID = 15663793;

	/**
	 * The singleton instance of <code>agenda.documentos</code>
	 */
	public static final org.untref.agendauniversitaria.tables.Documentos DOCUMENTOS = new org.untref.agendauniversitaria.tables.Documentos();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.untref.agendauniversitaria.tables.records.DocumentosRecord> getRecordType() {
		return org.untref.agendauniversitaria.tables.records.DocumentosRecord.class;
	}

	/**
	 * The column <code>agenda.documentos.ID</code>.
	 */
	public final org.jooq.TableField<org.untref.agendauniversitaria.tables.records.DocumentosRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>agenda.documentos.Descripcion</code>.
	 */
	public final org.jooq.TableField<org.untref.agendauniversitaria.tables.records.DocumentosRecord, java.lang.String[]> DESCRIPCION = createField("Descripcion", org.jooq.impl.SQLDataType.CHAR.getArrayDataType(), this, "");

	/**
	 * The column <code>agenda.documentos.URL</code>.
	 */
	public final org.jooq.TableField<org.untref.agendauniversitaria.tables.records.DocumentosRecord, java.lang.String[]> URL = createField("URL", org.jooq.impl.SQLDataType.CHAR.getArrayDataType(), this, "");

	/**
	 * The column <code>agenda.documentos.CantDescargas</code>.
	 */
	public final org.jooq.TableField<org.untref.agendauniversitaria.tables.records.DocumentosRecord, java.lang.Integer> CANTDESCARGAS = createField("CantDescargas", org.jooq.impl.SQLDataType.INTEGER.defaulted(true), this, "");

	/**
	 * The column <code>agenda.documentos.IDUploader</code>.
	 */
	public final org.jooq.TableField<org.untref.agendauniversitaria.tables.records.DocumentosRecord, java.lang.Integer> IDUPLOADER = createField("IDUploader", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>agenda.documentos.IdMateria</code>.
	 */
	public final org.jooq.TableField<org.untref.agendauniversitaria.tables.records.DocumentosRecord, java.lang.Integer> IDMATERIA = createField("IdMateria", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>agenda.documentos.CalificacionPromedio</code>.
	 */
	public final org.jooq.TableField<org.untref.agendauniversitaria.tables.records.DocumentosRecord, java.lang.Double> CALIFICACIONPROMEDIO = createField("CalificacionPromedio", org.jooq.impl.SQLDataType.DOUBLE.defaulted(true), this, "");

	/**
	 * Create a <code>agenda.documentos</code> table reference
	 */
	public Documentos() {
		this("documentos", null);
	}

	/**
	 * Create an aliased <code>agenda.documentos</code> table reference
	 */
	public Documentos(java.lang.String alias) {
		this(alias, org.untref.agendauniversitaria.tables.Documentos.DOCUMENTOS);
	}

	private Documentos(java.lang.String alias, org.jooq.Table<org.untref.agendauniversitaria.tables.records.DocumentosRecord> aliased) {
		this(alias, aliased, null);
	}

	private Documentos(java.lang.String alias, org.jooq.Table<org.untref.agendauniversitaria.tables.records.DocumentosRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.untref.agendauniversitaria.Agenda.AGENDA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.untref.agendauniversitaria.tables.Documentos as(java.lang.String alias) {
		return new org.untref.agendauniversitaria.tables.Documentos(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.untref.agendauniversitaria.tables.Documentos rename(java.lang.String name) {
		return new org.untref.agendauniversitaria.tables.Documentos(name, null);
	}
}
