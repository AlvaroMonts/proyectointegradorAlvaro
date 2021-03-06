package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import Controlador.TbPrestamos_Controlador;

import javax.swing.JScrollPane;
import javax.swing.JToolBar;

import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class TbPrestamos extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_2;
	private JButton btnEquipos;
	private JButton btnHistorial;
	private JButton btnAlmacen;
	private JButton btnUsuarios;
	private JToolBar toolBar;
	private JLabel lblResponsableprestamo;
	private JLabel lblCodequipo;
	private JLabel lblFechainicioprestamo;
	private JLabel lblFechafinalprestamo;
	private JLabel lblDestinoprestamo;
	private JButton btnBuscar;
	private JButton btnQuitarFiltros;
	private TbEquipos pantalla1;
	private TbHistorial pantalla2;
	private TbAlmacen pantalla3;
	private TbUsers pantalla4;
	private JScrollPane scrollPane;
	private JButton button;
	private TbPrestamos_Controlador tbPreCont;
	private JButton btnPrestamos;
	private Login login;
	private Caracteristicas_Prestamo prestamo;
	private int lineaSeleccionada;

	/**
	 * Create the frame.
	 */
	public TbPrestamos() {
		setTitle("Pr\u00E9stamos");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 890, 461);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		btnBuscar = new JButton("Buscar");

		btnQuitarFiltros = new JButton("Quitar filtros\r\n");
		btnQuitarFiltros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});

		scrollPane = new JScrollPane();
		scrollPane.setToolTipText("");

		table = new JTable();
		scrollPane.setViewportView(table);
		
		table.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					setSelectedRow();
					setVisible(false);
					prestamo.setID();
					prestamo.setVisible(true);
				}
			}
		});

		toolBar = new JToolBar();

		btnEquipos = new JButton("Equipos");
		btnEquipos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				pantalla1.setVisible(true);
			}
		});
		toolBar.add(btnEquipos);

		btnUsuarios = new JButton("Usuarios");
		toolBar.add(btnUsuarios);
		btnUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				pantalla4.setVisible(true);
			}
		});

		btnPrestamos = new JButton("Prestamos");
		btnPrestamos.setEnabled(false);
		toolBar.add(btnPrestamos);

		btnHistorial = new JButton("Historial");
		toolBar.add(btnHistorial);
		btnHistorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				pantalla2.setVisible(true);
			}
		});

		btnAlmacen = new JButton("Almacen");
		toolBar.add(btnAlmacen);
		btnAlmacen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				pantalla3.setVisible(true);
			}
		});

		lblFechainicioprestamo = new JLabel("Fecha de Inicio del Prestamo");

		textField = new JTextField();
		textField.setColumns(10);

		lblFechafinalprestamo = new JLabel("Fecha Final Prestamo");

		textField_1 = new JTextField();
		textField_1.setColumns(10);

		lblResponsableprestamo = new JLabel("Responsable de Prestamo\r\n");

		lblCodequipo = new JLabel("Codigo del Equipo\r\n");

		textField_3 = new JTextField();
		textField_3.setColumns(10);

		lblDestinoprestamo = new JLabel("Destino Prestamo");

		textField_4 = new JTextField();
		textField_4.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setColumns(10);

		button = new JButton("Cerrar sesi\u00F3n");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				login.setVisible(true);
			}
		});

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane
				.setHorizontalGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addGap(5)
										.addComponent(toolBar,
												GroupLayout.PREFERRED_SIZE,
												338, GroupLayout.PREFERRED_SIZE)
										.addGap(400)
										.addComponent(button,
												GroupLayout.PREFERRED_SIZE,
												116, GroupLayout.PREFERRED_SIZE))
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addGap(4)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(1)
																		.addComponent(
																				lblResponsableprestamo,
																				GroupLayout.PREFERRED_SIZE,
																				170,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(1)
																		.addComponent(
																				textField_2,
																				GroupLayout.PREFERRED_SIZE,
																				110,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(1)
																		.addComponent(
																				lblCodequipo,
																				GroupLayout.PREFERRED_SIZE,
																				146,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(1)
																		.addComponent(
																				textField_3,
																				GroupLayout.PREFERRED_SIZE,
																				110,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(1)
																		.addComponent(
																				lblFechainicioprestamo,
																				GroupLayout.PREFERRED_SIZE,
																				170,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(1)
																		.addComponent(
																				textField,
																				GroupLayout.PREFERRED_SIZE,
																				110,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(1)
																		.addComponent(
																				lblFechafinalprestamo,
																				GroupLayout.PREFERRED_SIZE,
																				146,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(1)
																		.addComponent(
																				textField_1,
																				GroupLayout.PREFERRED_SIZE,
																				110,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(1)
																		.addComponent(
																				lblDestinoprestamo,
																				GroupLayout.PREFERRED_SIZE,
																				146,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(1)
																		.addComponent(
																				textField_4,
																				GroupLayout.PREFERRED_SIZE,
																				110,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(11)
																		.addComponent(
																				btnBuscar,
																				GroupLayout.PREFERRED_SIZE,
																				89,
																				GroupLayout.PREFERRED_SIZE))
														.addComponent(
																btnQuitarFiltros,
																GroupLayout.PREFERRED_SIZE,
																111,
																GroupLayout.PREFERRED_SIZE))
										.addGap(10)
										.addComponent(scrollPane,
												GroupLayout.PREFERRED_SIZE,
												674, GroupLayout.PREFERRED_SIZE)));
		gl_contentPane
				.setVerticalGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addGap(6)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(button)
														.addComponent(
																toolBar,
																GroupLayout.PREFERRED_SIZE,
																30,
																GroupLayout.PREFERRED_SIZE))
										.addGap(12)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addComponent(
																				lblResponsableprestamo,
																				GroupLayout.PREFERRED_SIZE,
																				23,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(5)
																		.addComponent(
																				textField_2,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(6)
																		.addComponent(
																				lblCodequipo,
																				GroupLayout.PREFERRED_SIZE,
																				23,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				textField_3,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(11)
																		.addComponent(
																				lblFechainicioprestamo,
																				GroupLayout.PREFERRED_SIZE,
																				23,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(2)
																		.addComponent(
																				textField,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(17)
																		.addComponent(
																				lblFechafinalprestamo,
																				GroupLayout.PREFERRED_SIZE,
																				23,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(11)
																		.addComponent(
																				textField_1,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(11)
																		.addComponent(
																				lblDestinoprestamo,
																				GroupLayout.PREFERRED_SIZE,
																				23,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(3)
																		.addComponent(
																				textField_4,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(11)
																		.addComponent(
																				btnBuscar)
																		.addGap(11)
																		.addComponent(
																				btnQuitarFiltros))
														.addComponent(
																scrollPane,
																GroupLayout.PREFERRED_SIZE,
																358,
																GroupLayout.PREFERRED_SIZE))));
		contentPane.setLayout(gl_contentPane);
	}

	public void setEquipos(TbEquipos Pantalla1) {
		this.pantalla1 = Pantalla1;
	}

	public void setHistorial(TbHistorial Pantalla2) {
		this.pantalla2 = Pantalla2;
	}

	public void setAlmacen(TbAlmacen Pantalla3) {
		this.pantalla3 = Pantalla3;
	}

	public void setUsers(TbUsers Pantalla4) {
		this.pantalla4 = Pantalla4;
	}

	public void setPresCont(TbPrestamos_Controlador prestamos) {
		this.tbPreCont = prestamos;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public void setCPrestamos(Caracteristicas_Prestamo prestamo) {
		this.prestamo = prestamo;
	}
	public void setSelectedRow() {
		this.lineaSeleccionada = table.getSelectedRow();
	}

	public String getSelectedRowID() {
		// pilla la id de la linea seleccionada y devuelve su valor para usarla
		// en la sig pantalla (select)
		String id = (String) table.getModel().getValueAt(this.lineaSeleccionada, 1);
		return id;
	}

	public void setTbPrestamos(Object[][] tabla) {
		table.setModel(new DefaultTableModel(tabla, new String[] {
				"Responsable Prestamo", "Codigo Equipo",
				"Fecha Inicio Prestamo", "Fecha Final Prestamo",
				"Equipo Prestado", "Destino Prestamo" }));

		table.getColumnModel().getColumn(0).setPreferredWidth(125);
		table.getColumnModel().getColumn(1).setPreferredWidth(87);
		table.getColumnModel().getColumn(2).setPreferredWidth(122);
		table.getColumnModel().getColumn(3).setPreferredWidth(121);
		table.getColumnModel().getColumn(4).setPreferredWidth(109);
		for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
			TableColumn t = table.getColumnModel().getColumn(i);
			EditorDeTablas cellEditor = new EditorDeTablas();
			t.setCellEditor(cellEditor);
		}

	}
}