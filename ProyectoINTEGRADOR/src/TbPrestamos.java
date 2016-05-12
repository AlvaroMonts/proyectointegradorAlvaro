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
	private TbEquipos pantalla1;
	private TbHistorial pantalla2;
	private TbAlmacen pantalla3;
	private TbUsers pantalla4;
	private JScrollPane scrollPane;
	private JButton button;


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
		btnBuscar.setBounds(20, 345, 89, 23);
		contentPane.add(btnBuscar);

		btnQuitarFiltros = new JButton("Quitar filtros\r\n");
		btnQuitarFiltros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnQuitarFiltros.setBounds(9, 379, 111, 23);
		contentPane.add(btnQuitarFiltros);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(190, 53, 674, 358);
		scrollPane.setToolTipText("");
		contentPane.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Jose Garcia", "004", "15-04-2016", "25-06-2016", "Ocio"},
				{"Jose Garcia", "005", "15-04-2016", "15-04-2016", "Ocio"},
				{"Gonzalo Pe\u00F1a", "006", "15-04-2016", "-", "Docencia"},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Responsable Prestamo", "Codigo Equipo", "Fecha Inicio Prestamo", "Fecha Final Prestamo", "Destino Prestamo"
			}
		));
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

		toolBar = new JToolBar();
		toolBar.setBounds(10, 11, 288, 30);
		contentPane.add(toolBar);
		

		btnEquipos = new JButton("Equipos");
		btnEquipos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				pantalla1 = new TbEquipos();
				pantalla1.setVisible(true);

			}
		});
		toolBar.add(btnEquipos);

		btnHistorial = new JButton("Historial");
		toolBar.add(btnHistorial);
		btnHistorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				pantalla2 = new TbHistorial();
				pantalla2.setVisible(true);

			}
		});

		btnAlmacen = new JButton("Almacen");
		toolBar.add(btnAlmacen);
		btnAlmacen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				pantalla3 = new TbAlmacen();
				pantalla3.setVisible(true);

			}
		});

		btnUsuarios = new JButton("Usuarios");
		toolBar.add(btnUsuarios);
		btnUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				pantalla4 = new TbUsers();
				pantalla4.setVisible(true);

			}
		});

		lblFechainicioprestamo = new JLabel("Fecha de Inicio del Prestamo");
		lblFechainicioprestamo.setBounds(10, 161, 170, 23);
		contentPane.add(lblFechainicioprestamo);

		textField = new JTextField();
		textField.setBounds(10, 186, 110, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		lblFechafinalprestamo = new JLabel("Fecha Final Prestamo");
		lblFechafinalprestamo.setBounds(10, 223, 146, 23);
		contentPane.add(lblFechafinalprestamo);

		textField_1 = new JTextField();
		textField_1.setBounds(10, 257, 110, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		lblResponsableprestamo = new JLabel("Responsable de Prestamo\r\n");
		lblResponsableprestamo.setBounds(10, 53, 170, 23);
		contentPane.add(lblResponsableprestamo);

		lblCodequipo = new JLabel("Codigo del Equipo\r\n");
		lblCodequipo.setBounds(10, 107, 146, 23);
		contentPane.add(lblCodequipo);

		textField_3 = new JTextField();
		textField_3.setBounds(10, 130, 110, 20);
		textField_3.setColumns(10);
		contentPane.add(textField_3);

		lblDestinoprestamo = new JLabel("Destino Prestamo");
		lblDestinoprestamo.setBounds(10, 288, 146, 23);
		contentPane.add(lblDestinoprestamo);

		textField_4 = new JTextField();
		textField_4.setBounds(10, 314, 110, 20);
		textField_4.setColumns(10);
		contentPane.add(textField_4);

		textField_2 = new JTextField();
		textField_2.setBounds(10, 81, 110, 20);
		textField_2.setColumns(10);
		contentPane.add(textField_2);
		
		button = new JButton("Cerrar sesi\u00F3n");
		button.setBounds(748, 11, 116, 23);
		contentPane.add(button);
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
}