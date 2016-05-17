package Controlador;

import Modelo.TbEquipos_Modelo;

public class TbEquipos_Controlador {
	TbEquipos_Modelo tbEqMod;
	public String[][] array;
	public TbEquipos_Controlador() {
		tbEqMod = new TbEquipos_Modelo();
		tbEqMod.Consulta_Array();
		tbEqMod.Mostrar_Array();
		array = tbEqMod.getArray();
	}
	
}