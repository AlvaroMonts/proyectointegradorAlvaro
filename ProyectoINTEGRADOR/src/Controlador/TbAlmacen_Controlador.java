package Controlador;

import Modelo.adminBBDD;

public class TbAlmacen_Controlador {
	adminBBDD tbAlMod = new adminBBDD();
	public String[][] array;
	public TbAlmacen_Controlador() {
		tbAlMod.Consulta_ArrayAlmacen();
		array = tbAlMod.getArrayAlmacen();
	}
}
