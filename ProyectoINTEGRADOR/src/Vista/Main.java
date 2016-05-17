package Vista;

public class Main {
	public static void main(String[] args) {
		Caracteristicas_Equipo CEquipo =  new Caracteristicas_Equipo();
		Caracteristicas_usuario CUsuario = new Caracteristicas_usuario();
		RegEquipos REquipos = new RegEquipos();
		RegPrestamos RPrestamos = new RegPrestamos();
		RegUsuarios RUsr = new RegUsuarios();
		TbAlmacen TAlmacen = new TbAlmacen();
		TbEquipos TEquipo = new TbEquipos();
		TbHistorial THistorial = new TbHistorial();
		TbPrestamos TPrestamos = new TbPrestamos();
		TbUsers TUsers = new TbUsers();
		Login Log = new Login();
		
		
		
		Log.setVisible(true);
		Log.setPantalla(TEquipo);
		
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
	}
}
