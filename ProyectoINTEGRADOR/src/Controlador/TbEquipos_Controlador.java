package Controlador;

import Modelo.adminBBDD;

public class TbEquipos_Controlador {
	adminBBDD tbEqMod = new adminBBDD();
	public String[][] array;
	public TbEquipos_Controlador() {
		tbEqMod.Consulta_ArrayEquipos();
		array = tbEqMod.getArrayEquipos();
	}
	
}