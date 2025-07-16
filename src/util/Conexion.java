package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private static final String url = "jdbc:mysql://localhost:3306/cursojava";
	private static final String user = "root";
	private static final String password = "";

	public static Connection getConexion() {
		
		try {
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.out.println("Error en la conexion " + e.getMessage());
			return null;
		}
	}
}
