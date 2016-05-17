package Vista;

import java.sql.*;
import java.util.ArrayList;

public class conexion {
	private String bd, login, pwd, url;
	private Connection conection;

	public conexion() {
		try {
			bd = "liga";
			login = "root";
			pwd = "root";
			url = "jdbc:mysql://localhost/" + bd;
			Class.forName("com.mysql.jdbc.Driver");
			conection = DriverManager.getConnection(url, login, pwd);
			System.out.println("todo ok");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver no cargado");
		} catch (SQLException e) {
			System.out.println("Error de Conexión con MySQL");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String[][] Consulta(String query) {
		try {
			Statement stmt = conection.createStatement();
			ResultSet rset = stmt.executeQuery(query);
			String array [][] = new String[5][6];
			for (int i = 1; i < 5; i++) {
				if (rset.next()) {
					for (int j = 1; j < 6; j++) {
						array[i][j]=rset.getString(j);
					}
				}
			}
			rset.close();
			stmt.close();
			return array;
		} catch (SQLException s) {
			s.printStackTrace();
			return null;
		}
	}
}