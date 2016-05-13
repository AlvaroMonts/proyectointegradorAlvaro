package Modelo;

public class Login_Modelo {
	
	public boolean comprobarRegistro(String email, String password) {
		if(email.equals("admin@gmail.com") && password.equals("admin")){
			return true;
		} else {
			return false;
		}
	}
	
}