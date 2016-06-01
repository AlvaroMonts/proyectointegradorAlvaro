package Controlador;

import Modelo.adminBBDD;
import Vista.TbEquipos;

public class TbEquipos_Controlador {
	private adminBBDD tbEqMod;
	private TbEquipos tbEq;

	public void EqAModelo(adminBBDD bbdd) {
		this.tbEqMod = bbdd;
	}
	
	public void busqueda(){
		tbEqMod.realizarBusquedaEquipos();
	}
	
	public void restaurar() {
		tbEqMod.cargarDatosDeTablas();
	}
}