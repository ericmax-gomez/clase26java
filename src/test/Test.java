package test;

import controller.SistemaController;
import modelo.Login;
import modelo.Persona;

public class Test {

	public static void main(String[] args) {
		
		SistemaController controller = new SistemaController();
		
		Persona persona = new Persona(25487962, "Ana", "Perez", 45);
		Login login = new Login("anap","1234",25487962);
		
		controller.resgistrarUsuario(persona, login);
		
		System.out.println("\n Usuarios registrados\n");
		controller.mostrarUsuarios();
		
		
	}

}
