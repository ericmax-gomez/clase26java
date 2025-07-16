package controller;

import dao.LoginDAO;
import dao.PersonaDAO;
import modelo.Login;
import modelo.Persona;

public class SistemaController {
	
	private PersonaDAO personaDAO = new PersonaDAO();
	private LoginDAO loginDAO = new LoginDAO();
	
	public void mostrarUsuarios() {
		loginDAO.mostrarUsuarios();
	}
	
	public void resgistrarUsuario(Persona persona, Login login) {
		boolean personaInsertada = personaDAO.insertarPersona(persona);
		if(personaInsertada) {
			loginDAO.insertarLogin(login);
			System.out.println("Usuario y Login registrados correctamente");
		}else {
			System.out.println("No se pudo registrar la persona, no se crea el login");
		}
	}
	
}
