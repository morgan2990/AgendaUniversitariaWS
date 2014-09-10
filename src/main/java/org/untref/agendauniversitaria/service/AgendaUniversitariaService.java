package org.untref.agendauniversitaria.service;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.untref.agendauniversitaria.dao.AgendaUniversitariaDao;
import org.untref.agendauniversitaria.requests.LoginRequest;

@Path("/Agenda")
public class AgendaUniversitariaService {
	
	private AgendaUniversitariaDao dao ;
	
	public AgendaUniversitariaService () throws SQLException, ClassNotFoundException{
		dao = new AgendaUniversitariaDao();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getTestString(){
		return dao.getTestString();
	}
	
	@POST
	@Path("/login")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String login(LoginRequest loginRequest){
		return dao.login(loginRequest.getUsername(), loginRequest.getPass());
	}

}
