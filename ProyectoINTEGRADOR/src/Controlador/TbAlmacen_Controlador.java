package Controlador;

import Modelo.adminBBDD;
import Vista.TbAlmacen;

public class TbAlmacen_Controlador {
	private adminBBDD tbAlMod;
	private TbAlmacen almacen;
	//public String[][] array;

	public void AlmContAVista(TbAlmacen almacen){
		//array = tbAlMod.getArrayAlmacen();
		this.almacen = almacen;
	}
	public void AlmContAModelo(adminBBDD bbdd){
		this.tbAlMod = bbdd;
	}
}
