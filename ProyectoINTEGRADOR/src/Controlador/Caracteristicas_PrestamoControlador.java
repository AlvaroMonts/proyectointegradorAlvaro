package Controlador;

import Modelo.adminBBDD;

public class Caracteristicas_PrestamoControlador {
	adminBBDD bbdd;
	
	public void setCPresMod(adminBBDD bbdd) {
		this.bbdd = bbdd;
	}
	
	public void actualizarTfs(int id) {
		bbdd.iniciarCaracPresPantalla(id);
	}
}
