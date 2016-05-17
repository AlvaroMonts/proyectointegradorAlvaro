package Controlador;

import Modelo.TbHistorial_Modelo;

public class TbHistorial_Controlador {
	TbHistorial_Modelo tbHiMod;
	public String[][] array;
	public TbHistorial_Controlador() {
		tbHiMod = new TbHistorial_Modelo();
		tbHiMod.Consulta_Array();
		tbHiMod.Mostrar_Array();
		array = tbHiMod.getArray();
	}
}
