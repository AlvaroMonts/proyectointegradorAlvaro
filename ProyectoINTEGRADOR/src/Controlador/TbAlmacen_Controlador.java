package Controlador;

import Modelo.adminBBDD;
import Vista.TbAlmacen;

public class TbAlmacen_Controlador {
	adminBBDD tbAlMod = new adminBBDD();
	TbAlmacen almacen;
	public String[][] array;
	public TbAlmacen_Controlador() {
		array = tbAlMod.getArrayAlmacen();
	}
	public void AlmContAVista(TbAlmacen almacen){
		this.almacen = almacen;
	}
	public void AlmContAModelo(adminBBDD bbdd){
		this.tbAlMod = bbdd;
	}
}
