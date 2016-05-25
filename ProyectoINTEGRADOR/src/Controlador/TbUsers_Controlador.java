package Controlador;

import Modelo.adminBBDD;
import Vista.TbUsers;

public class TbUsers_Controlador {
	adminBBDD tbUsMod;
	TbUsers tbUs;
	public String[][] array;

	public TbUsers_Controlador() {
	}

	public void UsAModelo(adminBBDD bbdd) {
		this.tbUsMod = bbdd;
	}

	public void UsAVista(TbUsers users) {
		array=tbUsMod.getArrayUsers();
		this.tbUs = users;
	}
}
