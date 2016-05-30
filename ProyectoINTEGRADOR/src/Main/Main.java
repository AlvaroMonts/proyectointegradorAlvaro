package Main;

import Controlador.Caracteristicas_EquipoControlador;
import Controlador.Login_Controlador;
import Controlador.RegEquipos_Controlador;
import Controlador.RegPrestamo_Controlador;
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
	static RegPrestamo_Controlador RPrestamosCont;
	static TbHistorial_Controlador TbHistCont;
	static TbPrestamos_Controlador TbPresCont;
	static TbUsers_Controlador TbUsersCont;
	static RegEquipos_Controlador RegEqCont;
	static Caracteristicas_EquipoControlador caracEqCont;

	public static void main(String[] args) {
		// news
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
		TbUsersCont = new TbUsers_Controlador();
		RegEqCont = new RegEquipos_Controlador();
		caracEqCont = new Caracteristicas_EquipoControlador();
		RPrestamosCont = new RegPrestamo_Controlador();
		Login.setVisible(true);
		// sets
		Login.setPantalla(TEquipo);
		TEquipo.setPantalla1(THistorial);
		TEquipo.setPantalla2(TPrestamos);
		TEquipo.setPantalla3(TUsers);
		TEquipo.setPantalla4(TAlmacen);
		TEquipo.setRegEq(REquipos);
		TEquipo.setCaracEquipos(CEquipo);
		TEquipo.setLogin(Login);
		CEquipo.setPantalla(TEquipo);
		CEquipo.setPantalla1(RPrestamos);
		RPrestamos.setEquipo(CEquipo);
		REquipos.setPantalla(TEquipo);
		THistorial.setPantalla1(TAlmacen);
		THistorial.setPantalla2(TEquipo);
		THistorial.setPantalla3(TPrestamos);
		THistorial.setPantalla4(TUsers);
		THistorial.setLogin(Login);
		TPrestamos.setEquipos(TEquipo);
		TPrestamos.setAlmacen(TAlmacen);
		TPrestamos.setHistorial(THistorial);
		TPrestamos.setUsers(TUsers);
		TPrestamos.setLogin(Login);
		TUsers.setEquipos(TEquipo);
		TUsers.setAlmacen(TAlmacen);
		TUsers.setHistorial(THistorial);
		TUsers.setPrestamos(TPrestamos);
		TUsers.setPantalla5(RUsr);
		TUsers.setCaracUsuarios(CUsuario);
		TUsers.setLogin(Login);
		CUsuario.setPantalla(TUsers);
		RUsr.setPantalla(TUsers);
		TAlmacen.setEquipo(TEquipo);
		TAlmacen.setPrestamos(TPrestamos);
		TAlmacen.setHistorial(THistorial);
		TAlmacen.setUsers(TUsers);
		TAlmacen.setLogin(Login);
		Login.setLogin_Cont(logCont);
		CEquipo.setCaracEqCont(caracEqCont);
		RUsr.setRegUs(regUsuCont);
		REquipos.setRegEquipos(RegEqCont);
		RPrestamos.setRPrestamos(RPrestamosCont);
		TAlmacen.setAlmacenCont(TbAlmacenCont);
		TEquipo.setEquiposCont(TbEqCont);
		THistorial.setHistCont(TbHistCont);
		TPrestamos.setPresCont(TbPresCont);
		TUsers.setUsControlador(TbUsersCont);
		logCont.loginAModelo(modelo);
		caracEqCont.setCaracEqModelo(modelo);
		regUsuCont.RegUsAModelo(modelo);
		TbAlmacenCont.AlmContAModelo(modelo);
		TbEqCont.EqAModelo(modelo);
		TbHistCont.HistAModelo(modelo);
		TbPresCont.PresAModelo(modelo);
		TbUsersCont.UsAModelo(modelo);
		RegEqCont.setEquiposModelo(modelo);
		RPrestamosCont.setPrestamosModelo(modelo);
		
		modelo.setLogin(Login);
		modelo.setRegUsuarios(RUsr);
		modelo.setTbAlmacen(TAlmacen);
		modelo.setTbEquipos(TEquipo);
		modelo.setTbHistorial(THistorial);
		modelo.setTbPrestamos(TPrestamos);
		modelo.setTbUsers(TUsers);
		modelo.setRPrestamos(RPrestamos);
		modelo.setRegEquipos(REquipos);
		modelo.setCaracEquipos(CEquipo);
		modelo.cargarDatosDeTablas();
	}
}