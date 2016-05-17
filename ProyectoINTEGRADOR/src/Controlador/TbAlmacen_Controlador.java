package Controlador;

import Modelo.TbAlmacen_Modelo;

public class TbAlmacen_Controlador {
	TbAlmacen_Modelo tbAlMod;
	public String[][] array;
	public TbAlmacen_Controlador() {
		tbAlMod = new TbAlmacen_Modelo();
		tbAlMod.Consulta_Array();
		array = tbAlMod.getArray();
	}
}
