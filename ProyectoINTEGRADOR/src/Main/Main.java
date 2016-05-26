package Main;

import Controlador.Login_Controlador;
import Controlador.RegEquipos_Controlador;
import Controlador.RegUsuarios_Controlador;
import Controlador.TbAlmacen_Controlador;
import Controlador.TbEquipos_Controlador;
import Controlador.TbHistorial_Controlador;
import Controlador.TbPrestamos_Controlador;
import Controlador.TbUsers_Controlador;
import Modelo.adminBBDD;
import Vista.Caracteristicas_Equipo;
import Vista.Caracteristicas_usuario;
import Vista.Login;
import Vista.RegEquipos;
import Vista.RegPrestamos;
import Vista.RegUsuarios;
import Vista.TbAlmacen;
import Vista.TbEquipos;
import Vista.TbHistorial;
import Vista.TbPrestamos;
import Vista.TbUsers;

public class Main {
	// vista
	static Caracteristicas_Equipo CEquipo;
	static Caracteristicas_usuario CUsuario;
	static RegEquipos REquipos;
	static RegPrestamos RPrestamos;
	static RegUsuarios RUsr;
	static TbAlmacen TAlmacen;
	static TbEquipos TEquipo;
	static TbHistorial THistorial;
	static TbPrestamos TPrestamos;
	static TbUsers TUsers;
	static Login Login;

	static adminBBDD modelo;
	// controlador
	static Login_Controlador logCont;
	static RegUsuarios_Controlador regUsuCont;
	static TbAlmacen_Controlador TbAlmacenCont;
	static TbEquipos_Controlador TbEqCont;
	static TbHistorial_Controlador TbHistCont;
	static TbPrestamos_Controlador TbPresCont;
	static TbUsers_Controlador TbUsersCont;
	static RegEquipos_Controlador RegEqCont;

	public static void main(String[] args) {
		Login = new Login();
		TEquipo = new TbEquipos();
		CEquipo = new Caracteristicas_Equipo();
		TAlmacen = new TbAlmacen();
		THistorial = new TbHistorial();
		TPrestamos = new TbPrestamos();
		TUsers = new TbUsers();
		CUsuario = new Caracteristicas_usuario();
		REquipos = new RegEquipos();
		RPrestamos = new RegPrestamos();
		RUsr = new RegUsuarios();
		modelo = new adminBBDD();
		logCont = new Login_Controlador();
		regUsuCont = new RegUsuarios_Controlador();
		TbAlmacenCont = new TbAlmacen_Controlador();
		TbEqCont = new TbEquipos_Controlador();
		TbHistCont = new TbHistorial_Controlador();
		TbPresCont = new TbPrestamos_Controlador();
		TbUsersCont	= new TbUsers_Controlador();
		RegEqCont = new RegEquipos_Controlador();
		Login.setVisible(true);
		Login.setPantalla(TEquipo);
		TEquipo.setPantalla1(THistorial);
		TEquipo.setPantalla2(TPrestamos);
		TEquipo.setPantalla3(TUsers);
		TEquipo.setPantalla4(TAlmacen);
		TEquipo.setRegEq(REquipos);
		TEquipo.setCaracEquipos(CEquipo);
		CEquipo.setPantalla(TEquipo);
		CEquipo.setPantalla1(RPrestamos);
		REquipos.setPantalla(TEquipo);
		
		THistorial.setPantalla1(TAlmacen);
		THistorial.setPantalla2(TEquipo);
		THistorial.setPantalla3(TPrestamos);
		THistorial.setPantalla4(TUsers);
		
		TPrestamos.setEquipos(TEquipo);
		TPrestamos.setAlmacen(TAlmacen);
		TPrestamos.setHistorial(THistorial);
		TPrestamos.setUsers(TUsers);	
		
		TUsers.setEquipos(TEquipo);
		TUsers.setAlmacen(TAlmacen);
		TUsers.setHistorial(THistorial);
		TUsers.setPrestamos(TPrestamos);
		TUsers.setPantalla5(RUsr);
		TUsers.setCaracUsuarios(CUsuario);
		
		CUsuario.setPantalla(TUsers);
		RUsr.setPantalla(TUsers);
		
		TAlmacen.setEquipo(TEquipo);
		TAlmacen.setPrestamos(TPrestamos);
		TAlmacen.setHistorial(THistorial);
		TAlmacen.setUsers(TUsers);
		
		Login.setLogin_Cont(logCont);
		RUsr.setRegUs(regUsuCont);
		REquipos.setRegEquipos(RegEqCont);
		TAlmacen.setAlmacenCont(TbAlmacenCont);
		TEquipo.setEquiposCont(TbEqCont);
		THistorial.setHistCont(TbHistCont);
		TPrestamos.setPresCont(TbPresCont);
		TUsers.setUsControlador(TbUsersCont);
		
		logCont.loginAModelo(modelo);
		regUsuCont.RegUsAModelo(modelo);
		TbAlmacenCont.AlmContAModelo(modelo);
		TbEqCont.EqAModelo(modelo);
		TbHistCont.HistAModelo(modelo);
		TbPresCont.PresAModelo(modelo);
		TbUsersCont.UsAModelo(modelo);
		RegEqCont.setEquiposModelo(modelo);
		
		modelo.setLogin(Login);
		modelo.setRegUsuarios(RUsr);
		modelo.setTbAlmacen(TAlmacen);
		modelo.setTbEquipos(TEquipo);
		modelo.setTbHistorial(THistorial);
		modelo.setTbPrestamos(TPrestamos);
		modelo.setTbUsers(TUsers);
		modelo.setRegEquipos(REquipos);
		
		modelo.cargarDatosDeTablas();
		// setters desde controlador a vista
		/*logCont.loginAVista(Login);
		regUsuCont.RegUsAVista(RUsr);
		TbAlmacenCont.AlmContAVista(TAlmacen);
		TbEqCont.EqAVista(TEquipo);
		TbHistCont.HistAVista(THistorial);
		TbPresCont.PresAVista(TPrestamos);
		TbUsersCont.UsAVista(TUsers);*/
	}
}