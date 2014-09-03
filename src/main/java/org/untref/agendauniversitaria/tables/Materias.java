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
public class Materias extends org.jooq.impl.TableImpl<org.untref.agendauniversitaria.tables.records.MateriasRecord> {

	private static final long serialVersionUID = -2003562969;

	/**
	 * The singleton instance of <code>agenda.Materias</code>
	 */
	public static final org.untref.agendauniversitaria.tables.Materias MATERIAS = new org.untref.agendauniversitaria.tables.Materias();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.untref.agendauniversitaria.tables.records.MateriasRecord> getRecordType() {
		return org.untref.agendauniversitaria.tables.records.MateriasRecord.class;
	}

	/**
	 * The column <code>agenda.Materias.IdMateria</code>.
	 */
	public final org.jooq.TableField<org.untref.agendauniversitaria.tables.records.MateriasRecord, java.lang.Integer> IDMATERIA = createField("IdMateria", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>agenda.Materias.DescripMateria</code>.
	 */
	public final org.jooq.TableField<org.untref.agendauniversitaria.tables.records.MateriasRecord, java.lang.String[]> DESCRIPMATERIA = createField("DescripMateria", org.jooq.impl.SQLDataType.CHAR.getArrayDataType(), this, "");

	/**
	 * Create a <code>agenda.Materias</code> table reference
	 */
	public Materias() {
		this("Materias", null);
	}

	/**
	 * Create an aliased <code>agenda.Materias</code> table reference
	 */
	public Materias(java.lang.String alias) {
		this(alias, org.untref.agendauniversitaria.tables.Materias.MATERIAS);
	}

	private Materias(java.lang.String alias, org.jooq.Table<org.untref.agendauniversitaria.tables.records.MateriasRecord> aliased) {
		this(alias, aliased, null);
	}

	private Materias(java.lang.String alias, org.jooq.Table<org.untref.agendauniversitaria.tables.records.MateriasRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.untref.agendauniversitaria.Agenda.AGENDA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.untref.agendauniversitaria.tables.Materias as(java.lang.String alias) {
		return new org.untref.agendauniversitaria.tables.Materias(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.untref.agendauniversitaria.tables.Materias rename(java.lang.String name) {
		return new org.untref.agendauniversitaria.tables.Materias(name, null);
	}
}