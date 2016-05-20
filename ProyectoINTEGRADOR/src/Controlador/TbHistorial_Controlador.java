package Controlador;

import Modelo.adminBBDD;

public class TbHistorial_Controlador {
	adminBBDD tbHiMod = new adminBBDD();
	public String[][] array;
	public TbHistorial_Controlador() {
		tbHiMod.Consulta_ArrayHistorial();
		array = tbHiMod.getArrayHistorial();
	}
}
