package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import modelo.Login;
import util.Conexion;

public class LoginDAO {

	public boolean insertarLogin(Login login) {
		String sql = "INSERT INTO login(usuario, clave, dni_persona) values(?, ?, ?)";
		try (Connection conn = Conexion.getConexion(); 
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, login.getUsuario());
			ps.setString(2, login.getClave());
			ps.setInt(3, login.getDniPersona());

			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			System.out.println("Error al insertar login: " + e.getMessage());
			return false;
		}
	}
	
	public void mostrarUsuarios() {
		String sql = "SELECT l.usuario, p.nombre, p.apellido FROM login l INNER JOIN persona p ON l.dni_persona = p.dni";
		try (Connection conn = Conexion.getConexion(); 
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(sql)
				) {
			while(rs.next()) {
				System.out.println("Usuario: " + rs.getString("usuario") + " | Nombre Completo: " + rs.getString("nombre") + " " + rs.getString("apellido"));
			}

		} catch (SQLException e) {
			System.out.println("Error al insertar login: " + e.getMessage());
		}
	}
	
	
}
