package Controlador;

import Modelo.adminBBDD;
import Vista.TbHistorial;

public class TbHistorial_Controlador {
	adminBBDD tbHiMod = new adminBBDD();
	TbHistorial tbHist;
	public String[][] array;
	public TbHistorial_Controlador() {
		array = tbHiMod.getArrayHistorial();
	}
	public void HistAVista(TbHistorial historial){
		this.tbHist = historial; 
	}
	public void HistAModelo(adminBBDD bbdd)  {
		this.tbHiMod = bbdd;
	}
}
