package Controlador;
import Modelo.adminBBDD;
public class RegUsuarios_Controlador  {
	adminBBDD registro = new adminBBDD();
	public RegUsuarios_Controlador(String email, String nombre, String apellidos, String contrase�a, String admin) {
		registro.RealizarAlta(email,nombre,apellidos,contrase�a,admin);
	}
}