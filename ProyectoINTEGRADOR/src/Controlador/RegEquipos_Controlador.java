package Controlador;

import Modelo.adminBBDD;

public class RegEquipos_Controlador {
	adminBBDD registro;

	public void AltaComunes(String cod, String tipoequipo, String almacenamineto1, String almacenamiento2,
			String notas, String marca, String disponibilidad, String tipouso, String modelo,
			String prestable, String sala, String edificio) {
		registro.RealizarAltaComunes(cod, tipoequipo, almacenamineto1, almacenamiento2, notas, marca, disponibilidad, tipouso, modelo, prestable, sala, edificio);
	}

	public void AltaSobremesa(String ssoo, String roseta, String equipocod, String ramgrafica, String marcagrafica,
			String modelografica, String modeloprocesador, String velocidadprocesador, String ramcapacidad,
			String ramvelocidad) {
		registro.RealizarAltaPC(ssoo, roseta, equipocod, ramgrafica, marcagrafica, modelografica, modeloprocesador,
				velocidadprocesador, ramcapacidad, ramvelocidad);
	}

	public void Altaportatil(String pulgadaspantallas, String equipocod, String marcagrafica, String modelografica,
			String ramgrafica, String modeloprocesador, String velocidadprocesador, String ramvelocidad, String ssoo,
			String resolucion, String capacidadram) {
		registro.RealizarAltaPortatil(pulgadaspantallas, equipocod, marcagrafica, modelografica, ramgrafica,
				modeloprocesador, velocidadprocesador, ramvelocidad, ssoo, resolucion, capacidadram);
	}

	public void AltaCintiq(String resolucion, String ramgrafica, String marcagrafica, String modelografica,
			String modeloprocesador, String velocidadprocesador, String equipocod, String equipoasociado,
			String ramcapacidad, String ramvelocidad) {
		registro.RealizarAltaCintiq(resolucion, ramgrafica, marcagrafica, modelografica, modeloprocesador,
				velocidadprocesador, equipocod, equipoasociado, ramcapacidad, ramvelocidad);
	}

	public void AltaSmartphoneTablet(String giroscopio, String resolucion, String equipocod, String nfc, String tipo,
			String resulucioncamara, String pulgadas) {
		registro.RealizarAltaSmartphoneTablet(giroscopio, resolucion, equipocod, nfc, tipo, resulucioncamara, pulgadas);
	}

	public void AltaTVoMonitor(String tipo, String conexiones, String tamaño, String codequipo, String equipoasociado,
			String resolucion) {
		registro.RealizarAltaTVoMonitor(tipo, conexiones, tamaño, codequipo, equipoasociado, resolucion);
	}

	public void AltaProyector(String resolucion, String hdmi, String equipocod) {
		registro.RealizarAltaProyector(resolucion, hdmi, equipocod);
	}

	public void AltaTabletaGrafica(String tamaño, String equipocod) {
		registro.RealizarTabletaGrafica(tamaño, equipocod);
	}
	public void setEquiposModelo(adminBBDD bbdd){
		this.registro = bbdd;
	}
	
}
