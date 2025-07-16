package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.Persona;
import util.Conexion;

public class PersonaDAO {
	
	public boolean insertarPersona(Persona persona) {
		String sql = "INSERT INTO persona(dni, nombre, apellido, edad) values(?, ?, ?, ?)";
		try(Connection conn = Conexion.getConexion();
				PreparedStatement ps = conn.prepareStatement(sql)
				){
			ps.setInt(1, persona.getDni());
			ps.setString(2, persona.getNombre());
			ps.setString(3, persona.getApellido());
			ps.setInt(4, persona.getDni());
			ps.executeUpdate();
			return true;
		}catch(SQLException e) {
			System.out.println("Error al insertar Persona: " + e.getMessage());
			return false;
		}
	}
}
