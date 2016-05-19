package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Login_Modelo {

	private String bd, login, pwd, url;
	private Connection conection;
	private String[] ArrayContraseñas;
	private String[] ArrayEmails;
	private boolean loginCorrecto = false;

	public Login_Modelo() {
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
			//int a;
			ArrayEmails = new String[b];
			for (int i = 0; i <= b; i++) {
				if (rsetEmails.next()) {
					System.out.println(rsetEmails.getString((1)));
					ArrayEmails[i] = rsetEmails.getString((1));
				//	a = i;
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
			if(contador ==2) {
				loginCorrecto = true;
			} else if (contador ==1) {
				System.out.println("El Email y la contraseña no son compatibles");
			} else {
				System.out.println("El Email y la contraseña no son correctos");
			}
			
			
			stmt.close();
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}
	public boolean comprobarLogin(){
		return loginCorrecto;
	}
}