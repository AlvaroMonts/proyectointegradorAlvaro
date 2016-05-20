package Modelo;

import java.sql.*;

public class adminBBDD {
	private String bd, login, pwd, url;
	private Connection conection;
	private String[] ArrayContraseñas;
	private String[] ArrayEmails;
	private boolean loginCorrecto = false;
	private String[][] ArrayAlmacen;
	private String[][] ArrayEquipos;
	private String[][] ArrayHistorial;
	private String[][] ArrayPrestamos;
	private String[][] ArrayUsers;	

	public adminBBDD() {
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
	
	public void ConsultaLogin(String email, String password) {
		try {
			String query1 = "Select Email from proyectointegrador.usuario";
			String query2 = "Select contraseña from proyectointegrador.usuario";
			Statement stmt = conection.createStatement();
			ResultSet rsetEmails = stmt.executeQuery(query1);

			rsetEmails.last();
			int b = rsetEmails.getRow();
			rsetEmails.beforeFirst();

			// Parte de Email
			// int a;
			ArrayEmails = new String[b];
			for (int i = 0; i <= b; i++) {
				if (rsetEmails.next()) {
					System.out.println(rsetEmails.getString((1)));
					ArrayEmails[i] = rsetEmails.getString((1));
					// a = i;
				}
			}

			int contador = 0;

			for (String string : ArrayEmails) {
				if (email.equals(string)) {
					contador++;
					break;
				}
			}

			rsetEmails.close();

			// Parte de Contraseñas
			ResultSet rsetContraseñas = stmt.executeQuery(query2);
			ArrayContraseñas = new String[b];

			for (int i = 0; i <= b; i++) {
				if (rsetContraseñas.next()) {
					ArrayContraseñas[i] = rsetContraseñas.getString((1));
				}
			}

			for (String string : ArrayContraseñas) {
				if (password.equals(string)) {
					contador++;
					break;
				}
			}

			rsetContraseñas.close();

			// Comprobacion
			if (contador == 2) {
				loginCorrecto = true;
			} else if (contador == 1) {
				System.out.println("El Email y la contraseña no son compatibles");
			} else {
				System.out.println("El Email y la contraseña no son correctos");
			}

			stmt.close();
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	public boolean comprobarLogin() {
		return loginCorrecto;
	}

	public void RealizarAlta(String email, String nombre, String apellidos, String contraseña, String admin) {
		try {
			String sql = "Insert into proyectointegrador.usuario (`Email`, `nombre`, `apellidos`, `contraseña`, `TipoUsuario`) values (?, ?, ?, ?, ?);";
			PreparedStatement stmt = conection.prepareStatement(sql);
			stmt.setString(1, email);
			stmt.setString(2, nombre);
			stmt.setString(3, apellidos);
			stmt.setString(4, contraseña);
			stmt.setString(5, admin);

			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	public void Consulta_ArrayAlmacen() {
		try {
			String query = "Select * from proyectointegrador.almacen";
			Statement stmt = conection.createStatement();
			ResultSet rset = stmt.executeQuery(query);
			ResultSetMetaData rmsd = rset.getMetaData();

			rset.last();
			int a = rmsd.getColumnCount();
			int b = rset.getRow();
			rset.beforeFirst();

			ArrayAlmacen = new String[b][a];
			for (int i = 0; i < b; i++) {
				if (rset.next()) {
					for (int j = 0; j < a; j++) {
						ArrayAlmacen[i][j] = rset.getString((j + 1));
					}
				}
			}
			rset.close();
			stmt.close();
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	public String[][] getArrayAlmacen() {
		return ArrayAlmacen;
	}

	public void Consulta_ArrayEquipos() {
		try {
			String query = "Select * from proyectointegrador.equipo";
			Statement stmt = conection.createStatement();
			ResultSet rset = stmt.executeQuery(query);
			ResultSetMetaData rmsd = rset.getMetaData();

			rset.last();
			int a = rmsd.getColumnCount();
			int b = rset.getRow();
			rset.beforeFirst();

			ArrayEquipos = new String[b][a];
			for (int i = 0; i < b; i++) {
				if (rset.next()) {
					for (int j = 0; j < a; j++) {
						ArrayEquipos[i][j] = rset.getString((j + 1));
					}
				}
			}
			rset.close();
			stmt.close();
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	public String[][] getArrayEquipos() {
		return ArrayEquipos;
	}

	public void Consulta_ArrayHistorial() {
		try {
			String query = "Select * from proyectointegrador.historial";
			Statement stmt = conection.createStatement();
			ResultSet rset = stmt.executeQuery(query);
			ResultSetMetaData rmsd = rset.getMetaData();

			rset.last();
			int a = rmsd.getColumnCount();
			int b = rset.getRow();
			rset.beforeFirst();

			ArrayHistorial = new String[b][a];
			for (int i = 0; i < b; i++) {
				if (rset.next()) {
					for (int j = 0; j < a; j++) {
						ArrayHistorial[i][j] = rset.getString((j + 1));
					}
				}
			}
			rset.close();
			stmt.close();
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	public String[][] getArrayHistorial() {
		return ArrayHistorial;
	}

	public void Consulta_ArrayPrestamos() {
		try {
			String query = "Select * from proyectointegrador.prestamos";
			Statement stmt = conection.createStatement();
			ResultSet rset = stmt.executeQuery(query);
			ResultSetMetaData rmsd = rset.getMetaData();

			rset.last();
			int a = rmsd.getColumnCount();
			int b = rset.getRow();
			rset.beforeFirst();

			ArrayPrestamos = new String[b][a];
			for (int i = 0; i < b; i++) {
				if (rset.next()) {
					for (int j = 0; j < a; j++) {
						ArrayPrestamos[i][j] = rset.getString((j + 1));
					}
				}
			}
			rset.close();
			stmt.close();
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	public String[][] getArrayPrestamos() {
		return ArrayPrestamos;
	}

	public void Consulta_ArrayUsers() {
		try {
			String query = "Select Email,TipoUsuario,Nombre,Apellidos from proyectointegrador.usuario";
			Statement stmt = conection.createStatement();
			ResultSet rset = stmt.executeQuery(query);
			ResultSetMetaData rmsd = rset.getMetaData();

			rset.last();
			int a = rmsd.getColumnCount();
			int b = rset.getRow();
			rset.beforeFirst();

			ArrayUsers = new String[b][a];
			for (int i = 0; i < b; i++) {
				if (rset.next()) {
					for (int j = 0; j < a; j++) {
						ArrayUsers[i][j] = rset.getString((j + 1));
					}
				}
			}
			rset.close();
			stmt.close();
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	public String[][] getArrayUsers() {
		return ArrayUsers;
	}

}
