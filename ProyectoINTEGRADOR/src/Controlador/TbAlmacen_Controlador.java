package Controlador;

import Modelo.adminBBDD;
import Vista.TbAlmacen;

public class TbAlmacen_Controlador {
	private adminBBDD tbAlMod;
	private TbAlmacen almacen;
	//public String[][] array;

	public void AlmContAModelo(adminBBDD bbdd){
		this.tbAlMod = bbdd;
	}
}
