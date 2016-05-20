package Controlador;

import Modelo.adminBBDD;

public class Login_Controlador {
	private adminBBDD logMod = new adminBBDD();
	
	public boolean realizarRegistro(String email, String password){
		logMod.ConsultaLogin(email, password);
		if (logMod.comprobarLogin()) {
			return true;
		} else {
			return false;
		}
	}
}
