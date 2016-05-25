package Controlador;

import Modelo.adminBBDD;
import Vista.TbEquipos;

public class TbEquipos_Controlador {
	adminBBDD tbEqMod = new adminBBDD();
	TbEquipos tbEq;
	public String[][] arrayEquipos;

	public TbEquipos_Controlador() {
	}

	public void EqAVista(TbEquipos equipos) {
		this.tbEq = equipos;
	}

	public void EqAModelo(adminBBDD bbdd) {
		this.tbEqMod = bbdd;
	}
}