package Controlador;
import Modelo.adminBBDD;
import Vista.RegUsuarios;
public class RegUsuarios_Controlador  {
	adminBBDD registro;
	RegUsuarios regUs;
	public RegUsuarios_Controlador() {
		
	}
	
	public void ComprobarAlta(String email, String nombre, String apellidos, String contraseņa, String admin){
		registro.RealizarAlta(email,nombre,apellidos,contraseņa,admin);
	}
	public void RegUsAModelo(adminBBDD bbdd){
		this.registro = bbdd;
	}
}