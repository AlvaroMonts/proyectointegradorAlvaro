package Controlador;

import Modelo.adminBBDD;
import Vista.TbPrestamos;

public class TbPrestamos_Controlador {
	private adminBBDD tbPreMod;
	private TbPrestamos tbPres;
	//public String[][] array;

	public void PresAVista(TbPrestamos prestamos){
		//array = tbPreMod.getArrayPrestamos();
		this.tbPres = prestamos;
	}
	public void PresAModelo(adminBBDD bbdd){
		this.tbPreMod = bbdd;
	}
}
