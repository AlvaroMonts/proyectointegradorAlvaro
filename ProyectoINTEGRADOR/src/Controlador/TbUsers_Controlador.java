package Controlador;

import Modelo.adminBBDD;

public class TbUsers_Controlador {
	adminBBDD tbUsMod = new adminBBDD();
	public String[][] array;
	public TbUsers_Controlador() {
		tbUsMod.Consulta_ArrayUsers();
		array = tbUsMod.getArrayUsers();
	}
}
