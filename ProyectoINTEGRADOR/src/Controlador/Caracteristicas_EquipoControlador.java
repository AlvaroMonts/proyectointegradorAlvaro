package Controlador;

import Modelo.adminBBDD;

public class Caracteristicas_EquipoControlador {
	private adminBBDD modelo;

	public void actualizarTfs(int id) {
		modelo.iniciarCaracEqPantalla(id);
	}
	
	public void updatesEquipos() {
		modelo.actualizar();
	}

	public void setCaracEqModelo(adminBBDD bbdd) {
		this.modelo = bbdd;
	}

}
