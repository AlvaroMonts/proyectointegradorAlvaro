package Controlador;

import Modelo.adminBBDD;
import Vista.TbPrestamos;

public class TbPrestamos_Controlador {
	private adminBBDD tbPreMod;
	private TbPrestamos tbPres;
	//public String[][] array;

	public void PresAModelo(adminBBDD bbdd){
		this.tbPreMod = bbdd;
	}
}
