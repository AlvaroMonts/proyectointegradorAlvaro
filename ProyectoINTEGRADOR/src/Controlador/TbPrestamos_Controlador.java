package Controlador;

import Modelo.adminBBDD;
import Vista.TbPrestamos;

public class TbPrestamos_Controlador {
	adminBBDD tbPreMod = new adminBBDD();
	TbPrestamos tbPres;
	public String[][] array;
	public TbPrestamos_Controlador() {
		array = tbPreMod.getArrayPrestamos();
	}
	public void PresAVista(TbPrestamos prestamos){
		this.tbPres = prestamos;
	}
	public void PresAModelo(adminBBDD bbdd){
		this.tbPreMod = bbdd;
	}
}
