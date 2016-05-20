package Modelo;

import java.sql.*;

public class RegUsuarios_Modelo {

	private String bd, login, pwd, url;
	private Connection conection;
	private String[][] Array;

	public RegUsuarios_Modelo() {
		try {
			bd = "proyectointegrador";
			login = "root";
			pwd = "root";
			url = "jdbc:mysql://localhost/" + bd;
			Class.forName("com.mysql.jdbc.Driver");
			conection = DriverManager.getConnection(url, login, pwd);
			System.out.println("todo ok");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver no cargado");
		} catch (SQLException e) {
			System.out.println("Error de Conexi�n con MySQL");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void RealizarAlta(String email, String nombre, String apellidos, String contrase�a, String admin) {
		try {
			String sql = "Insert into proyectointegrador.usuario (`Email`, `nombre`, `apellidos`, `contrase�a`, `TipoUsuario`) values (?, ?, ?, ?, ?);";
			PreparedStatement stmt = conection.prepareStatement(sql);
			stmt.setString(1, email);
			stmt.setString(2, nombre);
			stmt.setString(3, apellidos);
			stmt.setString(4, contrase�a);
			stmt.setString(5, admin);

			stmt.executeUpdate();

			/*
			 * /* Statement stmt = conection.prepareStatement(
			 * "Insert into usuario (Email, nombre, apellidos, contrase�a, tipo) values (?,?,?,?,?);"
			 * );
			 * 
			 * ((PreparedStatement) stmt).setString(1, email);
			 * ((PreparedStatement) stmt).setString(2, nombre);
			 * ((PreparedStatement) stmt).setString(3, apellidos);
			 * ((PreparedStatement) stmt).setString(4, contrase�a);
			 * ((PreparedStatement) stmt).setString(5, admin);
			 */
			stmt.close();
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}
}
