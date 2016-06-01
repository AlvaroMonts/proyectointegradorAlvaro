package Modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.HashMap;

import Vista.Caracteristicas_Equipo;
import Vista.Login;
import Vista.RegEquipos;
import Vista.RegPrestamos;
import Vista.RegUsuarios;
import Vista.TbHistorial;
import Vista.TbPrestamos;
import Vista.TbUsers;
import Vista.TbAlmacen;
import Vista.TbEquipos;

public class adminBBDD {
	private String bd, login, pwd, url;
	private Connection conection;
	private String[] ArrayContraseñas;
	private String[] ArrayEmails;
	private String[][] ArrayAlmacen;
	private String[][] ArrayEquipos;
	private String[][] ArrayHistorial;
	private String[][] ArrayPrestamos;
	private String[][] ArrayUsers;
	private Login log;
	private RegUsuarios regUsu;
	private RegEquipos regEquipo;
	private TbAlmacen TbAlmacen;
	private TbEquipos TbEq;
	private TbHistorial TbHist;
	private TbPrestamos TbPres;
	private TbUsers TbUsers;
	private Caracteristicas_Equipo caracEq;
	private RegPrestamos Rprestamos;

	public adminBBDD() {
		try {
			HashMap<String, String> hmret = loadFichero("bbdd.ini");
			Class.forName("com.mysql.jdbc.Driver");
			conection = DriverManager.getConnection(hmret.get("url"), hmret.get("login"), hmret.get("pwd"));
			System.out.println("todo ok");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver no cargado");
		} catch (SQLException e) {
			System.out.println("Error de Conexión con MySQL");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public HashMap<String, String> loadFichero(String nomFichero) throws IOException {
		HashMap<String, String> hmDatos = new HashMap<String, String>();
		FileReader fr = new FileReader(nomFichero);
		BufferedReader bf = new BufferedReader(fr);
		String lineaLeida = bf.readLine();
		while (lineaLeida != null) {
			String sar[] = lineaLeida.split("=");
			hmDatos.put(sar[0], sar[1]);
			lineaLeida = bf.readLine();
		}
		bf.close();
		fr.close();
		return hmDatos;
	}

	public boolean ConsultaLogin(String email, String password) {
		try {
			String query = "Select Email, contraseña from proyectointegrador.usuario";
			PreparedStatement stmt = conection.prepareStatement(query);
			ResultSet rset = stmt.executeQuery(query);

			rset.last();
			int b = rset.getRow();
			rset.beforeFirst();

			ArrayContraseñas = new String[b];
			ArrayEmails = new String[b];
			// Parte de Email
			for (int i = 0; i <= b; i++) {
				if (rset.next()) {
					ArrayEmails[i] = rset.getString((1));
				}
			}
			rset.beforeFirst();
			// Parte de Contraseñas
			for (int i = 0; i <= b; i++) {
				if (rset.next()) {
					ArrayContraseñas[i] = rset.getString((2));
				}
			}
			int contador = 0;
			for (int i = 0; i < ArrayEmails.length; i++) {
				if (ArrayEmails[i].equals(email)) {
					contador++;
					if (ArrayContraseñas[i].equals(password)) {
						contador++;
					}
				}
			}

			rset.close();
			stmt.close();
			if (contador == 2) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException s) {
			s.printStackTrace();
			return false;
		}
	}

	public void RealizarAlta(String email, String nombre, String apellidos, String contraseña, String admin) {
		try {
			String sql = "Insert into proyectointegrador.usuario (`Email`, `nombre`, `apellidos`, `contraseña`, `TipoUsuario`) values (?, ?, ?, ?, ?);";
			PreparedStatement stmt = conection.prepareStatement(sql);
			stmt.setString(1, email);
			stmt.setString(2, nombre);
			stmt.setString(3, apellidos);
			stmt.setString(4, contraseña);
			stmt.setString(5, admin);

			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	public void Consulta_ArrayAlmacen() {
		try {
			String query = "Select * from proyectointegrador.almacen";
			Statement stmt = conection.createStatement();
			ResultSet rset = stmt.executeQuery(query);
			ResultSetMetaData rmsd = rset.getMetaData();

			rset.last();
			int a = rmsd.getColumnCount();
			int b = rset.getRow();
			rset.beforeFirst();

			ArrayAlmacen = new String[b][a];
			for (int i = 0; i < b; i++) {
				if (rset.next()) {
					for (int j = 0; j < a; j++) {
						ArrayAlmacen[i][j] = rset.getString((j + 1));
					}
				}
			}
			rset.close();
			stmt.close();
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	public void Consulta_ArrayEquipos() {
		try {
			String query = "Select * from proyectointegrador.equipo";
			Statement stmt = conection.createStatement();
			ResultSet rset = stmt.executeQuery(query);
			ResultSetMetaData rmsd = rset.getMetaData();

			rset.last();
			int a = rmsd.getColumnCount();
			int b = rset.getRow();
			rset.beforeFirst();

			ArrayEquipos = new String[b][a];
			for (int i = 0; i < b; i++) {
				if (rset.next()) {
					for (int j = 0; j < a; j++) {
						ArrayEquipos[i][j] = rset.getString((j + 1));
					}
				}
			}
			rset.close();
			stmt.close();
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	public void Consulta_ArrayHistorial() {
		try {
			String query = "Select * from proyectointegrador.historial";
			Statement stmt = conection.createStatement();
			ResultSet rset = stmt.executeQuery(query);
			ResultSetMetaData rmsd = rset.getMetaData();

			rset.last();
			int a = rmsd.getColumnCount();
			int b = rset.getRow();
			rset.beforeFirst();

			ArrayHistorial = new String[b][a];
			for (int i = 0; i < b; i++) {
				if (rset.next()) {
					for (int j = 0; j < a; j++) {
						ArrayHistorial[i][j] = rset.getString((j + 1));
					}
				}
			}
			rset.close();
			stmt.close();
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	public void Consulta_ArrayPrestamos() {
		try {
			String query = "Select * from proyectointegrador.prestamos";
			Statement stmt = conection.createStatement();
			ResultSet rset = stmt.executeQuery(query);
			ResultSetMetaData rmsd = rset.getMetaData();

			rset.last();
			int a = rmsd.getColumnCount();
			int b = rset.getRow();
			rset.beforeFirst();

			ArrayPrestamos = new String[b][a];
			for (int i = 0; i < b; i++) {
				if (rset.next()) {
					for (int j = 0; j < a; j++) {
						ArrayPrestamos[i][j] = rset.getString((j + 1));
					}
				}
			}
			rset.close();
			stmt.close();
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	public void Consulta_ArrayUsers() {
		try {
			String query = "Select Email,TipoUsuario,Nombre,Apellidos from proyectointegrador.usuario";
			Statement stmt = conection.createStatement();
			ResultSet rset = stmt.executeQuery(query);
			ResultSetMetaData rmsd = rset.getMetaData();

			rset.last();
			int a = rmsd.getColumnCount();
			int b = rset.getRow();
			rset.beforeFirst();

			ArrayUsers = new String[b][a];
			for (int i = 0; i < b; i++) {
				if (rset.next()) {
					for (int j = 0; j < a; j++) {
						ArrayUsers[i][j] = rset.getString((j + 1));
					}
				}
			}
			rset.close();
			stmt.close();
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	public void RealizarAltaComunes(String cod, String tipoequipo, String almacenamineto1, String almacenamiento2,
			String notas, String marca, String disponibilidad, String tipouso, String modelo, String prestable,
			String sala, String edificio) {
		try {
			String sql = "Insert into proyectointegrador.equipo (`COD`, `Tipo_Equipo`, `Almacenamiento1`, `Almacenamiento2`, `notas`, `marca`, `disponibilidad`, `TipoUso`, `modelo`, `prestable`, `Sala`, `Edificio`) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement stmt = conection.prepareStatement(sql);
			stmt.setString(1, cod);
			stmt.setString(2, tipoequipo);
			stmt.setString(3, almacenamineto1);
			stmt.setString(4, almacenamiento2);
			stmt.setString(5, notas);
			stmt.setString(6, marca);
			stmt.setString(7, disponibilidad);
			stmt.setString(8, tipouso);
			stmt.setString(9, modelo);
			stmt.setString(10, prestable);
			stmt.setString(11, sala);
			stmt.setString(12, edificio);
			stmt.executeUpdate();
			stmt.close();
			cargarDatosDeTablas();
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	public void RealizarAltaPC(String ssoo, String roseta, String equipocod, String ramgrafica, String marcagrafica,
			String modelografica, String modeloprocesador, String velocidadprocesador, String ramcapacidad,
			String ramvelocidad) {
		try {
			String sql = "Insert into proyectointegrador.sobremesa (SSOO, Roseta, Equipo_COD, RamGrafica, MarcaGrafica, ModeloGrafica, ModeloProcesador, VelocidadProcesador, RamCapacidad, RamVelocidad) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
			PreparedStatement stmt = conection.prepareStatement(sql);
			stmt.setString(1, ssoo);
			stmt.setString(2, roseta);
			stmt.setString(3, equipocod);
			stmt.setString(4, ramgrafica);
			stmt.setString(5, marcagrafica);
			stmt.setString(6, modelografica);
			stmt.setString(7, modeloprocesador);
			stmt.setString(8, velocidadprocesador);
			stmt.setString(9, ramcapacidad);
			stmt.setString(10, ramvelocidad);
			stmt.executeUpdate();
			stmt.close();
			cargarDatosDeTablas();
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	public void RealizarAltaPortatil(String pulgadaspantalla, String equipocod, String marcagrafica,
			String modelografica, String ramgrafica, String modeloprocesador, String velocidadprocesador,
			String ramvelocidad, String ssoo, String resolucion, String capacidadram) {
		try {
			String sql = "INSERT into proyectointegrador.portatil (PulgadasPantalla, Equipo_COD, MarcaGrafica, ModeloGrafica, RamGrafica, ModeloProcesador, VelocidadProcesador, RamVelocidad, SSOO, Resolucion, RamCapacidad) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
			PreparedStatement stmt = conection.prepareStatement(sql);
			stmt.setString(1, pulgadaspantalla);
			stmt.setString(2, equipocod);
			stmt.setString(3, marcagrafica);
			stmt.setString(4, modelografica);
			stmt.setString(5, ramgrafica);
			stmt.setString(6, modeloprocesador);
			stmt.setString(7, velocidadprocesador);
			stmt.setString(8, ramvelocidad);
			stmt.setString(9, ssoo);
			stmt.setString(10, resolucion);
			stmt.setString(11, capacidadram);
			stmt.executeUpdate();
			stmt.close();
			cargarDatosDeTablas();
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	public void RealizarAltaCintiq(String resolucion, String ramgrafica, String marcagrafica, String modelografica,
			String modeloprocesador, String velocidadprocesador, String equipocod, String equipoasociado,
			String ramcapacidad, String ramvelocidad) {
		try {
			String sql = "INSERT into proyectointegrador.cintiq (Resolucion, RamGrafica, MarcaGrafica, ModeloGrafica, ModeloProcesador, VelocidadProcesador, Equipo_COD1, EquipoAsociado, RamCapacidad, RamVelocidad) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
			PreparedStatement stmt = conection.prepareStatement(sql);
			stmt.setString(1, resolucion);
			stmt.setString(2, ramgrafica);
			stmt.setString(3, marcagrafica);
			stmt.setString(4, modelografica);
			stmt.setString(5, modeloprocesador);
			stmt.setString(6, velocidadprocesador);
			stmt.setString(7, equipocod);
			stmt.setString(8, equipoasociado);
			stmt.setString(9, ramcapacidad);
			stmt.setString(10, ramvelocidad);
			stmt.executeUpdate();
			stmt.close();
			cargarDatosDeTablas();
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	public void RealizarAltaSmartphoneTablet(String giroscopio, String resolucion, String equipocod, String nfc,
			String tipo, String resulucioncamara, String pulgadas) {
		try {
			String sql = "INSERT into proyectointegrador.tabletmovil (Giroscopio, Resolucion, Equipo_COD, NFC, Tipo, ResolucionCamara, Pulgadas) values (?, ?, ?, ?, ?, ?, ?);";
			PreparedStatement stmt = conection.prepareStatement(sql);
			stmt.setString(1, giroscopio);
			stmt.setString(2, resolucion);
			stmt.setString(3, equipocod);
			stmt.setString(4, nfc);
			stmt.setString(5, tipo);
			stmt.setString(6, resulucioncamara);
			stmt.setString(7, pulgadas);
			stmt.executeUpdate();
			stmt.close();
			cargarDatosDeTablas();
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	public void RealizarAltaTVoMonitor(String tipo, String conexiones, String tamaño, String codequipo,
			String equipoasociado, String resolucion) {
		try {
			String sql = "INSERT into proyectointegrador.televisionmonitor (Tipo, Conexiones, Tamaño, Equipo_COD, EquipoAsociado, Resolucion) values (?, ?, ?, ?, ?, ?);";
			PreparedStatement stmt = conection.prepareStatement(sql);
			stmt.setString(1, tipo);
			stmt.setString(2, conexiones);
			stmt.setString(3, tamaño);
			stmt.setString(4, codequipo);
			stmt.setString(5, equipoasociado);
			stmt.setString(6, resolucion);
			stmt.executeUpdate();
			stmt.close();
			cargarDatosDeTablas();
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	public void RealizarAltaProyector(String resolucion, String hdmi, String equipocod) {
		try {
			String sql = "INSERT into proyectointegrador.proyector (Resolucion, Hdmi, Equipo_COD) values (?, ?, ?);";
			PreparedStatement stmt = conection.prepareStatement(sql);
			stmt.setString(1, resolucion);
			stmt.setString(2, hdmi);
			stmt.setString(3, equipocod);
			stmt.executeUpdate();
			stmt.close();
			cargarDatosDeTablas();
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	public void RealizarTabletaGrafica(String tamaño, String equipocod) {
		try {
			String sql = "INSERT into proyectointegrador.tabletagrafica (Tamaño, Equipo_COD) values (?, ?);";
			PreparedStatement stmt = conection.prepareStatement(sql);
			stmt.setString(1, tamaño);
			stmt.setString(2, equipocod);
			stmt.executeUpdate();
			stmt.close();
			cargarDatosDeTablas();
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	public void RealizarAltaPrestamos(String Responsable, int cod, String fechainicio, String fechafin,
			String equipoprestado, String destinoprestamo) {
		try {
			String sql = "INSERT into proyectointegrador.prestamos (Responsable, Equipo_COD, FechadeInicio, FechaFin, EquipoPrestado, DestinodelPrestamo) values (?, ?, ?,?,?,?);";
			PreparedStatement stmt = conection.prepareStatement(sql);
			stmt.setString(1, Responsable);
			stmt.setInt(2, cod);
			stmt.setString(3, fechainicio);
			stmt.setString(4, fechafin);
			stmt.setString(5, equipoprestado);
			stmt.setString(6, destinoprestamo);
			stmt.executeUpdate();
			stmt.close();
			cargarDatosDeTablas();
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	public void iniciarCaracEqPantalla(int cod) {
		try {
			String sql = "SELECT COD, Tipo_Equipo, Almacenamiento1, Almacenamiento2, notas, marca, disponibilidad, TipoUso, modelo, prestable, Sala, Edificio from proyectointegrador.equipo where COD = "
					+ cod + ";";
			Statement stmt = conection.createStatement();
			ResultSet rset = stmt.executeQuery(sql);
			if (rset.next()) {
				caracEq.setTextField(rset.getString((1)));
				caracEq.setTextField_29(rset.getString((3)));
				caracEq.setTextField_30(rset.getString((4)));
				caracEq.setTextNotas(rset.getString((5)));
				caracEq.setTextField_2(rset.getString((6)));
				caracEq.setGrupo1RB(rset.getString((7)));
				caracEq.setTipoUso(rset.getString((8)));
				caracEq.setTextField_3(rset.getString((9)));
				caracEq.setGrupo2RB(rset.getString((10)));
				caracEq.setTextField_26(rset.getString((11)));
				caracEq.setEdificio(rset.getString((12)));
				String tipoEquipo = rset.getString((2));
				System.out.println("select generico realizado con exito");
				if (tipoEquipo.equals("Sobremesa")) {
					iniciarCaracEqPantallaSobremesa(cod);
				} else if (tipoEquipo.equals("Portatil")) {
					iniciarCaracEqPantallaPortatil(cod);
				} else if (tipoEquipo.equals("Movil") || tipoEquipo.equals("Tablet")) {
					iniciarCaracEqPantallaSmartphoneOTablet(cod);
				} else if (tipoEquipo.equals("Tableta Grafica")) {
					iniciarCaracEqPantallaTabletaGrafica(cod);
				} else if (tipoEquipo.equals("Cintiq")) {
					iniciarCaracEqPantallaCintiq(cod);
				} else if (tipoEquipo.equals("Television") || tipoEquipo.equals("Monitor")) {
					iniciarCaracEqPantallaTvOMonitor(cod);
				} else if (tipoEquipo.equals("Proyector")) {
					iniciarCaracEqPantallaProyector(cod);
				} else if (tipoEquipo.equals("Consola")) {
					System.out.println("Consola no tiene datos especificos");
				} else {
					System.out.println("select especifico NO realizado con exito");;
				}
				System.out.println("select especifico realizado con exito");
			}
			rset.close();
			stmt.close();
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	public void iniciarCaracEqPantallaSobremesa(int cod) throws SQLException {
		String sql = "SELECT SSOO, Roseta, RamGrafica, MarcaGrafica, ModeloGrafica, ModeloProcesador, VelocidadProcesador, RamCapacidad, RamVelocidad from proyectointegrador.sobremesa where Equipo_COD = "
				+ cod + ";";
		Statement stmt1 = conection.createStatement();
		ResultSet rset = stmt1.executeQuery(sql);
		if (rset.next()) {
			caracEq.setTextField_18(rset.getString((5)));
			caracEq.setTextField_17(rset.getString((4)));
			caracEq.setTextField_16(rset.getString((3)));
			caracEq.setTextField_13(rset.getString((2)));
			caracEq.setTextField_12(rset.getString((1)));
			caracEq.setTextField_20(rset.getString((8)));
			caracEq.setTextField_19(rset.getString((9)));
			caracEq.setTextField_22(rset.getString((6)));
			caracEq.setTextField_21(rset.getString((7)));
		}
		caracEq.setPanelSobremesa();
		rset.close();
		stmt1.close();
	}

	public void iniciarCaracEqPantallaPortatil(int cod) throws SQLException {
		String sql = "SELECT PulgadasPantalla, MarcaGrafica, ModeloGrafica, RamGrafica, ModeloProcesador, VelocidadProcesador, RamVelocidad, SSOO, Resolucion, RamCapacidad from proyectointegrador.portatil where Equipo_COD = "
				+ cod + ";";
		Statement stmt1 = conection.createStatement();
		ResultSet rset = stmt1.executeQuery(sql);
		if (rset.next()) {
			caracEq.setTextField_32(rset.getString((1)));
			caracEq.setTextField_6(rset.getString((2)));
			caracEq.setTextField_5(rset.getString((3)));
			caracEq.setTextField_4(rset.getString((4)));
			caracEq.setTextField_10(rset.getString((5)));
			caracEq.setTextField_11(rset.getString((6)));
			caracEq.setTextField_9(rset.getString((7)));
			caracEq.setTextField_7(rset.getString((8)));
			caracEq.setTextField_31(rset.getString((9)));
			caracEq.setTextField_8(rset.getString((10)));
		}
		caracEq.setPanelPortatil();
		rset.close();
		stmt1.close();
	}

	public void iniciarCaracEqPantallaSmartphoneOTablet(int cod) throws SQLException {
		String sql = "SELECT Giroscopio, Resolucion, NFC, Tipo, ResolucionCamara, Pulgadas from proyectointegrador.tabletmovil where Equipo_COD = "
				+ cod + ";";
		Statement stmt1 = conection.createStatement();
		ResultSet rset = stmt1.executeQuery(sql);
		if (rset.next()) {
			caracEq.setTextField_15(rset.getString((2)));
			caracEq.setTextField_27(rset.getString((5)));
			caracEq.setTextField_14(rset.getString((6)));
			caracEq.setGrupo6RB(rset.getString((1)));
			caracEq.setGrupo7RB(rset.getString((3)));
			caracEq.setGrupo3RB(rset.getString((4)));
		}
		caracEq.setPanelSmartTablet();
		rset.close();
		stmt1.close();
	}

	public void iniciarCaracEqPantallaTabletaGrafica(int cod) throws SQLException {
		String sql = "SELECT Tamaño from proyectointegrador.tabletagrafica where Equipo_COD = " + cod + ";";
		Statement stmt1 = conection.createStatement();
		ResultSet rset = stmt1.executeQuery(sql);
		if (rset.next()) {
			caracEq.setTextField_35(rset.getString((1)));
		}
		caracEq.setPanelTabletaGrafica();
		rset.close();
		stmt1.close();
	}

	public void iniciarCaracEqPantallaCintiq(int cod) throws SQLException {
		String sql = "SELECT Resolucion, RamGrafica, MarcaGrafica, ModeloGrafica, ModeloProcesador, VelocidadProcesador, EquipoAsociado, RamCapacidad, RamVelocidad from proyectointegrador.cintiq where Equipo_COD1 = "
				+ cod + ";";
		Statement stmt1 = conection.createStatement();
		ResultSet rset = stmt1.executeQuery(sql);
		if (rset.next()) {
			caracEq.setTextField_44(rset.getString((1)));
			caracEq.setTextField_39(rset.getString((2)));
			caracEq.setTextField_37(rset.getString((3)));
			caracEq.setTextField_38(rset.getString((4)));
			caracEq.setTextField_42(rset.getString((5)));
			caracEq.setTextField_43(rset.getString((6)));
			caracEq.setTextField_45(rset.getString((7)));
			caracEq.setTextField_40(rset.getString((8)));
			caracEq.setTextField_41(rset.getString((9)));
		}
		caracEq.setPanelCintiq();
		rset.close();
		stmt1.close();
	}

	public void iniciarCaracEqPantallaTvOMonitor(int cod) throws SQLException {
		String sql = "SELECT Tipo, Conexiones, Tamaño, EquipoAsociado, Resolucion from proyectointegrador.televisionmonitor where Equipo_COD = "
				+ cod + ";";
		Statement stmt1 = conection.createStatement();
		ResultSet rset = stmt1.executeQuery(sql);
		if (rset.next()) {
			caracEq.setGrupo4RB(rset.getString((1)));
			caracEq.setTextField_46(rset.getString((2)));
			caracEq.setTextField_51(rset.getString((3)));
			caracEq.setTextField_47(rset.getString((4)));
			caracEq.setTextField_49(rset.getString((5)));
		}
		caracEq.setPanelTvMonitor();
		rset.close();
		stmt1.close();
	}

	public void iniciarCaracEqPantallaProyector(int cod) {
		try {
			String sql = "SELECT Hdmi, Resolucion from proyectointegrador.proyector where Equipo_COD = " + cod + ";";
			Statement stmt1 = conection.createStatement();
			ResultSet rset = stmt1.executeQuery(sql);
			if (rset.next()) {
				caracEq.setTextField_36(rset.getString((2)));
				caracEq.setGrupo5RB(rset.getString((1)));
			}
			caracEq.setPanelProyector();
			rset.close();
			stmt1.close();
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	public void actualizar() {
		try {
			int cod = Integer.parseInt(caracEq.getTextField());
			String sql = "SELECT COD, Tipo_Equipo from proyectointegrador.equipo where COD = " + cod + ";";
			Statement stmt = conection.createStatement();
			ResultSet rset = stmt.executeQuery(sql);
			if (rset.next()) {
				int codigo = Integer.parseInt(rset.getString(1));
				String tipoEquipo = rset.getString(2);
				String alm1 = caracEq.getTextField_29();
				String alm2 = caracEq.getTextField_30();
				String notas = caracEq.getTextAreaNotas();
				String marca = caracEq.getTextField_2();
				String dispo = caracEq.getGroup1();
				String tipoUso = caracEq.getTipoUso();
				String modelo = caracEq.getTextField_3();
				String prestable = caracEq.getGroup2();
				String sala = caracEq.getTextField_26();
				String edificio = caracEq.getEdificio();

				if (tipoEquipo.equals("Sobremesa")) {
					actualizarSobremesa(codigo);
				} else if (tipoEquipo.equals("Portatil")) {
					// actualizarPortatil(codigo);
				} else if (tipoEquipo.equals("Movil") || tipoEquipo.equals("Tablet")) {
					// actualizarSmartphoneOTablet(codigo);
				} else if (tipoEquipo.equals("Tableta Grafica")) {
					// actualizarTabletaGrafica(codigo);
				} else if (tipoEquipo.equals("Cintiq")) {
					// actualizarCintiq(codigo);
				} else if (tipoEquipo.equals("Television") || tipoEquipo.equals("Monitor")) {
					// actualizarTvOMonitor(codigo);
				} else if (tipoEquipo.equals("Proyector")) {
					// actualizarProyector(codigo);
				} else {
					;
				}
				rset.close();
				stmt.close();
				String sql1 = "UPDATE equipo SET Almacenamiento1 = '" + alm1 + "', Almacenamiento2 = '" + alm2
						+ "', notas = '" + notas + "', marca = '" + marca + "', disponibilidad  = '" + dispo
						+ "', TipoUso = '" + tipoUso + "', modelo  = '" + modelo + "', prestable = '" + prestable
						+ "', Sala  = '" + sala + "', Edificio = '" + edificio + "' WHERE COD = " + codigo + ";";
				PreparedStatement stmt2 = conection.prepareStatement(sql1);
				stmt2.executeUpdate();
				stmt2.close();
				System.out.println("update generico realizado con exito");
				cargarDatosDeTablas();
			}
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	public void actualizarSobremesa(int cod) {
		try {
			String ssoo = caracEq.getTextField_12();
			String roseta = caracEq.getTextField_13();
			String ramGrafica = caracEq.getTextField_16();
			String marcaGrafica = caracEq.getTextField_17();
			String modeloGrafica = caracEq.getTextField_18();
			String modeloProcesador = caracEq.getTextField_22();
			String velocidadProcesador = caracEq.getTextField_21();
			String ramCapacidad = caracEq.getTextField_20();
			String ramVelocidad = caracEq.getTextField_19();
			String sql = "UPDATE sobremesa SET SSOO = '" + ssoo + "', Roseta = '" + roseta + "', RamGrafica = '"
					+ ramGrafica + "', MarcaGrafica = '" + marcaGrafica + "', ModeloGrafica  = '" + modeloGrafica
					+ "', ModeloProcesador = '" + modeloProcesador + "', VelocidadProcesador  = '" + velocidadProcesador
					+ "', RamCapacidad = '" + ramCapacidad + "', RamVelocidad  = '" + ramVelocidad
					+ "' WHERE Equipo_COD = " + cod + ";";
			PreparedStatement stmt2 = conection.prepareStatement(sql);
			stmt2.executeUpdate();
			stmt2.close();
			System.out.println("update especifico realizado con exito");
			cargarDatosDeTablas();
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	public void eliminarEquipo() throws SQLException {
		int cod = Integer.parseInt(caracEq.getTextField());
		String sql = "DELETE FROM equipo WHERE COD = " + cod + ";";
		PreparedStatement stmt2 = conection.prepareStatement(sql);
		stmt2.executeUpdate();
		stmt2.close();
		System.out.println("Delete generico exito  ---- on cascade");
		cargarDatosDeTablas();
	}

	public String[][] getArrayAlmacen() {
		return ArrayAlmacen;
	}

	public String[][] getArrayEquipos() {
		return ArrayEquipos;
	}

	public String[][] getArrayHistorial() {
		return ArrayHistorial;
	}

	public String[][] getArrayPrestamos() {
		return ArrayPrestamos;
	}

	public String[][] getArrayUsers() {
		return ArrayUsers;
	}

	public void setLogin(Login login) {
		this.log = login;
	}

	public void setRegUsuarios(RegUsuarios regUsuarios) {
		this.regUsu = regUsuarios;
	}

	public void setTbAlmacen(TbAlmacen almacen) {
		this.TbAlmacen = almacen;
	}

	public void setTbEquipos(TbEquipos equipos) {
		this.TbEq = equipos;
	}

	public void setTbHistorial(TbHistorial historial) {
		this.TbHist = historial;
	}

	public void setTbPrestamos(TbPrestamos prestamos) {
		this.TbPres = prestamos;
	}

	public void setTbUsers(TbUsers users) {
		this.TbUsers = users;
	}

	public void setRegEquipos(RegEquipos reqEquipo) {
		this.regEquipo = reqEquipo;
	}

	public void setCaracEquipos(Caracteristicas_Equipo caracteristicas_Equipo) {
		this.caracEq = caracteristicas_Equipo;
	}

	public void setRPrestamos(RegPrestamos prestamos) {
		this.Rprestamos = prestamos;
	}

	public void cargarDatosDeTablas() {
		this.Consulta_ArrayAlmacen();
		this.Consulta_ArrayEquipos();
		this.Consulta_ArrayHistorial();
		this.Consulta_ArrayPrestamos();
		this.Consulta_ArrayUsers();
		TbAlmacen.setTbAlmacen(ArrayAlmacen);
		TbEq.setTbEquipos(ArrayEquipos);
		TbHist.setTbHistorial(ArrayHistorial);
		TbPres.setTbPrestamos(ArrayPrestamos);
		TbUsers.setTbUsers(ArrayUsers);
	}
}