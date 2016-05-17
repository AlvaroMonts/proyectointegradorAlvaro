package Modelo;

import java.sql.*;

public class TbAlmacen_Modelo {

	private String bd, login, pwd, url;
	private Connection conection;
	private String[][] Array;

	public TbAlmacen_Modelo() {
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
			System.out.println("Error de Conexión con MySQL");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Consulta_Array() {
		try {
			String query = "Select * from proyectointegrador.almacen";
			// cambiar query. solo liga por proyectointegrador
			Statement stmt = conection.createStatement();
			ResultSet rset = stmt.executeQuery(query);
			ResultSetMetaData rmsd = rset.getMetaData();

			rset.last();
			int a = rmsd.getColumnCount();
			int b = rset.getRow();
			rset.beforeFirst();

			Array = new String[b][a];
			for (int i = 0; i < 10; i++) {
				if (rset.next()) {
					for (int j = 0; j < a; j++) {
						Array[i][j] = rset.getString((j + 1));
					}
				}
			}
			rset.close();
			stmt.close();
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	public void Mostrar_Array() {
		System.out.print("ID\tNombre\t\tCiudad\tWeb\tPuntos");
		for (int i = 0; i < Array.length; i++) {
			System.out.print(
					Array[i][0] + "\t" + Array[i][1] + "\t" + Array[i][2] + "\t" + Array[i][3] + "\t" + Array[i][4]);
			System.out.println();
		}
	}

	public String[][] getArray() {
		return Array;
	}
}