package Controlador;

import Modelo.adminBBDD;

public class TbPrestamos_Controlador {
	adminBBDD tbPreMod = new adminBBDD();
	public String[][] array;
	public TbPrestamos_Controlador() {
		tbPreMod.Consulta_ArrayPrestamos();
		array = tbPreMod.getArrayPrestamos();
	}
}
