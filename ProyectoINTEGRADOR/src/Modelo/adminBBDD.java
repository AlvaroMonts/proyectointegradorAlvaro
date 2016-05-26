package Modelo;

import java.sql.*;

import Vista.Login;
import Vista.RegUsuarios;
import Vista.TbHistorial;
import Vista.TbPrestamos;
import Vista.TbUsers;
import Vista.TbAlmacen;
import Vista.TbEquipos;


public class adminBBDD {
	private String bd, login, pwd, url;
	private Connection conection;
	private String[] ArrayContraseñas;
	private String[] ArrayEmails;
	private String[][] ArrayAlmacen;
	private String[][] ArrayEquipos;
	private String[][] ArrayHistorial;
	private String[][] ArrayPrestamos;
	private String[][] ArrayUsers;
	private Login log;
	private RegUsuarios regUsu;
	private TbAlmacen TbAlmacen;
	private TbEquipos TbEq;
	private TbHistorial TbHist;
	private TbPrestamos TbPres;
	private TbUsers TbUsers;

	public adminBBDD() {
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

	public boolean ConsultaLogin(String email, String password) {
		try {
			String query = "Select Email, contraseña from proyectointegrador.usuario";
			PreparedStatement stmt = conection.prepareStatement(query);
			ResultSet rset = stmt.executeQuery(query);

			rset.last();
			int b = rset.getRow();
			rset.beforeFirst();

			ArrayContraseñas = new String[b];
			ArrayEmails = new String[b];
			// Parte de Email
			for (int i = 0; i <= b; i++) {
				if (rset.next()) {
					ArrayEmails[i] = rset.getString((1));
				}
			}
			rset.beforeFirst();
			// Parte de Contraseñas
			for (int i = 0; i <= b; i++) {
				if (rset.next()) {
					ArrayContraseñas[i] = rset.getString((2));
				}
			}
			int contador = 0;
			for (int i = 0; i < ArrayEmails.length; i++) {
				if (ArrayEmails[i].equals(email)) {
					contador++;
					if (ArrayContraseñas[i].equals(password)) {
						contador++;
					}
				}
			}

			rset.close();
			stmt.close();
			if (contador == 2) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException s) {
			s.printStackTrace();
			return false;
		}
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

	public String[][] getArrayAlmacen() {
		return ArrayAlmacen;
	}

	public String[][] getArrayEquipos() {
		return ArrayEquipos;
	}

	public String[][] getArrayHistorial() {
		return ArrayHistorial;
	}

	public String[][] getArrayPrestamos() {
		return ArrayPrestamos;
	}

	public String[][] getArrayUsers() {
		return ArrayUsers;
	}

	public void setLogin(Login login) {
		this.log = login;
	}

	public void setRegUsuarios(RegUsuarios regUsuarios) {
		this.regUsu = regUsuarios;
	}

	public void setTbAlmacen(TbAlmacen almacen) {
		this.TbAlmacen = almacen;
	}

	public void setTbEquipos(TbEquipos equipos) {
		this.TbEq = equipos;
	}

	public void setTbHistorial(TbHistorial historial) {
		this.TbHist = historial;
	}

	public void setTbPrestamos(TbPrestamos prestamos) {
		this.TbPres = prestamos;
	}

	public void setTbUsers(TbUsers users) {
		this.TbUsers = users;
	}

	public void cargarDatosDeTablas() {
		this.Consulta_ArrayAlmacen();
		this.Consulta_ArrayEquipos();
		this.Consulta_ArrayHistorial();
		this.Consulta_ArrayPrestamos();
		this.Consulta_ArrayUsers();
		TbAlmacen.setTbAlmacen(ArrayAlmacen);
		TbEq.setTbEquipos(ArrayEquipos);
		TbHist.setTbHistorial(ArrayHistorial);
		TbPres.setTbPrestamos(ArrayPrestamos);
		TbUsers.setTbUsers(ArrayUsers);
	}
}