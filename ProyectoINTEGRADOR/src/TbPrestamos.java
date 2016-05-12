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
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

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
	private TbEquipos Equipos;
	private TbHistorial Historial;
	private TbAlmacen Almacen;
	private TbUsers Users;


	/**
	 * Create the frame.
	 */
	public TbPrestamos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 890, 461);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(10, 375, 89, 23);
		contentPane.add(btnBuscar);

		btnQuitarFiltros = new JButton("Quitar filtro\r\n");
		btnQuitarFiltros.setBounds(109, 375, 89, 23);
		contentPane.add(btnQuitarFiltros);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(233, 53, 631, 358);
		scrollPane.setToolTipText("");
		contentPane.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null },
				{ null, null, null, null, null }, }, new String[] {
				"ResponsablePrestamo", "CodEquipo", "Fecha_InicioPrestamo",
				"Fecha_FinalPrestamo", "DestinoPrestamo" }));

		toolBar = new JToolBar();
		toolBar.setBounds(10, 11, 288, 30);
		contentPane.add(toolBar);

		btnEquipos = new JButton("Equipos");
		btnEquipos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				Equipos = new TbEquipos();
				Equipos.setVisible(true);

			}
		});
		toolBar.add(btnEquipos);

		btnHistorial = new JButton("Historial");
		toolBar.add(btnHistorial);
		btnHistorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Historial = new TbHistorial();
				Historial.setVisible(true);

			}
		});

		btnAlmacen = new JButton("Almacen");
		toolBar.add(btnAlmacen);
		btnAlmacen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Almacen = new TbAlmacen();
				Almacen.setVisible(true);

			}
		});

		btnUsuarios = new JButton("Usuarios");
		toolBar.add(btnUsuarios);
		btnUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Users = new TbUsers();
				Users.setVisible(true);

			}
		});

		lblFechainicioprestamo = new JLabel("Fecha de Inicio del Prestamo");
		lblFechainicioprestamo.setBounds(10, 161, 146, 23);
		contentPane.add(lblFechainicioprestamo);

		textField = new JTextField();
		textField.setBounds(10, 186, 110, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		lblFechafinalprestamo = new JLabel("Fecha Final Prestamo");
		lblFechafinalprestamo.setBounds(10, 223, 110, 23);
		contentPane.add(lblFechafinalprestamo);

		textField_1 = new JTextField();
		textField_1.setBounds(10, 257, 110, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		lblResponsableprestamo = new JLabel("Responsable de Prestamo\r\n");
		lblResponsableprestamo.setBounds(10, 53, 124, 23);
		contentPane.add(lblResponsableprestamo);

		lblCodequipo = new JLabel("Codigo del Equipo\r\n");
		lblCodequipo.setBounds(10, 107, 110, 23);
		contentPane.add(lblCodequipo);

		textField_3 = new JTextField();
		textField_3.setBounds(10, 130, 110, 20);
		textField_3.setColumns(10);
		contentPane.add(textField_3);

		lblDestinoprestamo = new JLabel("Destino Prestamo");
		lblDestinoprestamo.setBounds(10, 288, 110, 23);
		contentPane.add(lblDestinoprestamo);

		textField_4 = new JTextField();
		textField_4.setBounds(10, 314, 110, 20);
		textField_4.setColumns(10);
		contentPane.add(textField_4);

		textField_2 = new JTextField();
		textField_2.setBounds(10, 81, 110, 20);
		textField_2.setColumns(10);
		contentPane.add(textField_2);
	}

	public void setEquipos(TbEquipos Equipos) {
		this.Equipos = Equipos;
	}

	public void setHistorial(TbHistorial Historial) {
		this.Historial = Historial;
	}

	public void setAlmacen(TbAlmacen Almacen) {
		this.Almacen = Almacen;
	}

	public void setUsers(TbUsers Users) {
		this.Users = Users;
	}
}