package Controlador;

import Modelo.TbPrestamos_Modelo;

public class TbPrestamos_Controlador {
	TbPrestamos_Modelo tbPreMod;
	public String[][] array;
	public TbPrestamos_Controlador() {
		tbPreMod = new TbPrestamos_Modelo();
		tbPreMod.Consulta_Array();
		array = tbPreMod.getArray();
	}
}
