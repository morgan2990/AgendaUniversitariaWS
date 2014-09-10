package org.untref.agendauniversitaria.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.untref.agendauniversitaria.model.Tables;

public class AgendaUniversitariaDao {
	
	
	private Connection connection;
	
	public AgendaUniversitariaDao () throws SQLException, ClassNotFoundException{
		Class.forName("org.postgresql.Driver");
		String url="jdbc:postgresql://localhost:5432/agendaUniversitaria";
		String user="postgres";
		String password= "test";
		connection = DriverManager.getConnection(url, user, password);
	}
	
	
	public String getTestString(){
		DSLContext context = DSL.using(connection);
		return context.select().from(Tables.ALUMNOS).fetch().formatJSON();
	}
	
	public String login (String username, String pass){
		DSLContext context = DSL.using(connection);
		String result;
		result = context.select(Tables.ALUMNOS.ID.as("idAlumno"), Tables.ALUMNOS.NOMBRE.as("nombreAlumno"), Tables.ALUMNOS.EMAIL.as("emailAlumno")).from(Tables.ALUMNOS).where(Tables.ALUMNOS.NOMBRE.eq(username)).and(Tables.ALUMNOS.PASSWORD.eq(pass)).fetch().formatJSON();
		return result;
		
	}
}
