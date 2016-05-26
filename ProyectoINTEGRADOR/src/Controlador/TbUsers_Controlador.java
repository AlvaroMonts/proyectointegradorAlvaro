package Controlador;

import Modelo.adminBBDD;
import Vista.TbUsers;

public class TbUsers_Controlador {
	private adminBBDD tbUsMod;
	private TbUsers tbUs;
	//public String[][] array;

	public void UsAModelo(adminBBDD bbdd) {
		this.tbUsMod = bbdd;
	}

}
