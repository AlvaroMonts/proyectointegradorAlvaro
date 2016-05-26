package Controlador;

import Modelo.adminBBDD;
import Vista.TbHistorial;

public class TbHistorial_Controlador {
	private adminBBDD tbHiMod;
	private TbHistorial tbHist;
	//public String[][] array;

	public void HistAModelo(adminBBDD bbdd)  {
		this.tbHiMod = bbdd;
	}
}
