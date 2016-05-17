package Controlador;

import Modelo.TbUsers_Modelo;

public class TbUsers_Controlador {
	TbUsers_Modelo tbUsMod;
	public String[][] array;
	public TbUsers_Controlador() {
		tbUsMod = new TbUsers_Modelo();
		tbUsMod.Consulta_Array();
		array = tbUsMod.getArray();
	}
}
