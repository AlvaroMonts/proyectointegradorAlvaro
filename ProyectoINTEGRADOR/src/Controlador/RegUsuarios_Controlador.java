package Controlador;
import Modelo.RegUsuarios_Modelo;
public class RegUsuarios_Controlador  {
	RegUsuarios_Modelo registro;
	public RegUsuarios_Controlador(String email, String nombre, String apellidos, String contraseņa, String admin) {
		registro = new RegUsuarios_Modelo();
		registro.RealizarAlta(email,nombre,apellidos,contraseņa,admin);
	}
}