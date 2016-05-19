package Controlador;

import Modelo.Login_Modelo;

public class Login_Controlador {
	private Login_Modelo logMod;
	public Login_Controlador(){
		logMod = new Login_Modelo();
	}	
	
	public boolean realizarRegistro(String email, String password){
		logMod.ConsultaLogin(email, password);
		if (logMod.comprobarLogin()) {
			return true;
		} else {
			return false;
		}
	}
}
