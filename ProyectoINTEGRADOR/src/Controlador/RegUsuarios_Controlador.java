package Controlador;
import Modelo.adminBBDD;
import Vista.RegUsuarios;
public class RegUsuarios_Controlador  {
	adminBBDD registro;
	RegUsuarios regUs;
	public RegUsuarios_Controlador() {
		
	}
	
	public void ComprobarAlta(String email, String nombre, String apellidos, String contrase�a, String admin){
		registro.RealizarAlta(email,nombre,apellidos,contrase�a,admin);
	}
	public void RegUsAModelo(adminBBDD bbdd){
		this.registro = bbdd;
	}
}