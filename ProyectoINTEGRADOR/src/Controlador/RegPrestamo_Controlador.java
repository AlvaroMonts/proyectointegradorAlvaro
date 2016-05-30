package Controlador;

import java.sql.Date;

import Modelo.adminBBDD;

public class RegPrestamo_Controlador {
	adminBBDD registroprestamo;

	public void AltaPrestamos(String Responsable, int cod, String fechainicio, String fechafin, String equipoprestado,
			String destinoprestamo) {
		registroprestamo.RealizarAltaPrestamos(Responsable, cod, fechainicio, fechafin, equipoprestado,
				destinoprestamo);
	}

	public void setEquiposModelo(adminBBDD bbdd) {
		this.registroprestamo = bbdd;
	}
}