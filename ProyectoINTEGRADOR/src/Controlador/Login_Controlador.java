package Controlador;

import Modelo.Login_Modelo;

public class Login_Controlador {
	private Login_Modelo logMod;
	public Login_Controlador(){
		logMod = new Login_Modelo();
	}	
	
	public boolean realizarRegistro(String email, String password){
		logMod = new Login_Modelo();
		if (logMod.comprobarRegistro(email, password)) {
			return true;
		} else {
			System.out.println("El email + contraseņa no es 'admin@gmail.com' + 'admin'");
			return false;
		}
	}
}
