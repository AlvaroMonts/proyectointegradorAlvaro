package Main;

import Controlador.Login_Controlador;
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

	public static void main(String[] args) {
		// inicializar vista
		CEquipo = new Caracteristicas_Equipo();
		CUsuario = new Caracteristicas_usuario();
		REquipos = new RegEquipos();
		RPrestamos = new RegPrestamos();
		RUsr = new RegUsuarios();
		TAlmacen = new TbAlmacen();
		TEquipo = new TbEquipos();
		THistorial = new TbHistorial();
		TPrestamos = new TbPrestamos();
		TUsers = new TbUsers();
		Login = new Login();

		// inicializar controlador
		logCont = new Login_Controlador();
		regUsuCont = new RegUsuarios_Controlador();
		TbAlmacenCont = new TbAlmacen_Controlador();
		TbEqCont = new TbEquipos_Controlador();
		TbHistCont = new TbHistorial_Controlador();
		TbPresCont = new TbPrestamos_Controlador();
		TbUsersCont	= new TbUsers_Controlador();
		
		// inicializar modelo
		modelo = new adminBBDD();
		
		// setters vista
		Login.setVisible(true);
		Login.setPantalla(TEquipo);
		TEquipo.setPantalla1(THistorial);
		TEquipo.setPantalla2(TPrestamos);
		TEquipo.setPantalla3(TUsers);
		TEquipo.setPantalla4(TAlmacen);
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
		RUsr.setPantalla(TUsers);
		TAlmacen.setEquipo(TEquipo);
		TAlmacen.setPrestamos(TPrestamos);
		TAlmacen.setHistorial(THistorial);
		TAlmacen.setUsers(TUsers);
		CEquipo.setPantalla(TEquipo);
		CEquipo.setPantalla1(RPrestamos);
		CUsuario.setPantalla(TUsers);
		REquipos.setPantalla(TEquipo);

		// setters desde vista
		Login.setLogin_Cont(logCont);
		RUsr.setRegUs(regUsuCont);
		TAlmacen.setAlmacenCont(TbAlmacenCont);
		TEquipo.setEquiposCont(TbEqCont);
		THistorial.setHistCont(TbHistCont);
		TPrestamos.setPresCont(TbPresCont);
		TUsers.setUsControlador(TbUsersCont);
		
		// setters desde controlador
		logCont.loginAModelo(modelo);
		logCont.loginAVista(Login);
		regUsuCont.RegUsAModelo(modelo);
		regUsuCont.RegUsAVista(RUsr);
		TbAlmacenCont.AlmContAModelo(modelo);
		TbAlmacenCont.AlmContAVista(TAlmacen);
		TbEqCont.EqAModelo(modelo);
		TbEqCont.EqAVista(TEquipo);
		TbHistCont.HistAModelo(modelo);
		TbHistCont.HistAVista(THistorial);
		TbPresCont.PresAModelo(modelo);
		TbPresCont.PresAVista(TPrestamos);	
		TbUsersCont.UsAModelo(modelo);
		TbUsersCont.UsAVista(TUsers);
		
		// setters controladores
		modelo.setLogin(logCont);
		modelo.setRegUsuarios(regUsuCont);
		modelo.setTbAlmacen(TbAlmacenCont);
		modelo.setTbEquipos(TbEqCont);
		modelo.setTbHistorial(TbHistCont);
		modelo.setTbPrestamos(TbPresCont);
		modelo.setTbUsers(TbUsersCont);
		
		// cargar tablas
		modelo.cargarTodoInicio();
		TAlmacen.setTbAlmacen();
		TEquipo.setTbEquipos();
		THistorial.setTbHistorial();
		TPrestamos.setTbPrestamos();
		TUsers.setTbUsers();
	}
}
