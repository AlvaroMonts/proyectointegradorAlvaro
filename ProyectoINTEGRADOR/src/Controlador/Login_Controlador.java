package Controlador;

import Modelo.adminBBDD;
import Vista.Login;

public class Login_Controlador {
	adminBBDD logMod;
	Login log;

	public boolean realizarRegistro(String email, String password){	
		if (logMod.ConsultaLogin(email, password)) {
			return true;
		} else {
			return false;
		}
	}
	public void loginAModelo(adminBBDD modelo){
		this.logMod = modelo;
	}
	
}
