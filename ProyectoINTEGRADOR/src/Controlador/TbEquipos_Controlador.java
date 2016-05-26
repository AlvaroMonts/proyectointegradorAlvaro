package Controlador;

import Modelo.adminBBDD;
import Vista.TbEquipos;

public class TbEquipos_Controlador {
	private adminBBDD tbEqMod;
	private TbEquipos tbEq;
	//public String[][] arrayEquipos;

	public void EqAModelo(adminBBDD bbdd) {
		this.tbEqMod = bbdd;
	}
}