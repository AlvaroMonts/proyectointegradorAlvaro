package Vista;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JToolBar;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;


public class TbEquipos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private TbHistorial Pantalla1;
	private TbPrestamos Pantalla2;
	private TbUsers Pantalla3;
	private TbAlmacen Pantalla4;
	private Caracteristicas_Equipo CEquipo;
	private RegEquipos REquipo;
	private RegPrestamos RPrestamo;
	private JButton btnDarDeAlta_1;
	private JButton btnDarDeAlta;
	private JButton button_1;
	private JButton button;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JButton btnCerrarSesin;
	private JLabel lblTipoDeEquipo;
	private JLabel lblCaracteristicas;
	

	/**
	 * Create the frame.
	 */
	public TbEquipos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 896, 466);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		comboBox = new JComboBox();
		comboBox.setBounds(62, 133, 75, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Equipo", "COD_Equipo", "Marca", "Modelo", "Tipo de uso", "Disponibilidad", "Prestable", "Edificio", "Almacenamiento"}));
		
		textField = new JTextField();
		textField.setBounds(62, 172, 86, 20);
		textField.setColumns(10);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(62, 203, 75, 20);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Equipo", "COD_Equipo", "Marca", "Modelo", "Tipo de uso", "Disponibilidad", "Prestable", "Edificio", "Almacenamiento"}));
		
		textField_1 = new JTextField();
		textField_1.setBounds(62, 234, 86, 20);
		textField_1.setColumns(10);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setBounds(62, 265, 75, 20);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Equipo", "COD_Equipo", "Marca", "Modelo", "Tipo de uso", "Disponibilidad", "Prestable", "Edificio", "Almacenamiento"}));
		
		textField_2 = new JTextField();
		textField_2.setBounds(62, 296, 86, 20);
		textField_2.setColumns(10);
		
		button = new JButton("Buscar");
		button.setBounds(62, 327, 75, 23);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		button_1 = new JButton("Restaurar Filtros");
		button_1.setBounds(26, 361, 138, 23);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(187, 90, 684, 326);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Sobremesa", "001", "Asus", "15K7V", "Docencia", "Si", "No", "Madrid", "1Tb"},
				{"Portatil", "002", "MSI", "12LK89Z", "Docencia", "Si", "No", "Berlin", "500Gb SDD"},
				{"Movil", "003", "Samsung", "Galaxy 6", "Ocio", "No", "Si", "Berlin", "32Gb"},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Equipo", "COD_Equipo", "Marca", "Modelo", "Tipo de uso", "Disponibilidad", "Prestable", "Edificio", "Almacenamiento"
			}
		));
		table.getColumnModel().getColumn(2).setPreferredWidth(85);
		for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
			TableColumn t = table.getColumnModel().getColumn(i);
			EditorDeTablas cellEditor = new EditorDeTablas();
			t.setCellEditor(cellEditor);
		}
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
					setVisible(false);
					CEquipo = new Caracteristicas_Equipo();
					CEquipo.setVisible(true);
				}
			}
		});
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(41, 14, 288, 30);
		
		JButton button_2 = new JButton("Prestamos");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Pantalla2 = new TbPrestamos();
				Pantalla2.setVisible(true);
			}
		});
		
		
		
		JButton btnUsuarios = new JButton("Usuarios");
		btnUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Pantalla3 = new TbUsers();
				Pantalla3.setVisible(true);
			}
		});
		toolBar.add(btnUsuarios);
		
		toolBar.add(button_2);
		
		JButton button_4 = new JButton("Almacen");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Pantalla4 = new TbAlmacen();
				Pantalla4.setVisible(true);
			}
		});
		
		
		
		JButton button_3 = new JButton("Historial");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Pantalla1 = new TbHistorial();
				Pantalla1.setVisible(true);
			}
		});
		toolBar.add(button_3);
		toolBar.add(button_4);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setBounds(62, 82, 102, 20);
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Todos", "Sobremesa", "Portatil", "Tablet/Movil", "Cintiq", "Proyector", "Tableta gr\u00E1fica", "Monitor", "Consola"}));
		comboBox_3.setBackground(UIManager.getColor("Button.background"));
		
		btnDarDeAlta = new JButton("Dar de alta equipo");
		btnDarDeAlta.setBounds(692, 52, 146, 23);
		btnDarDeAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					setVisible(false);
					REquipo = new RegEquipos();
					REquipo.setVisible(true);

			}
		});
		
		btnDarDeAlta_1 = new JButton("Dar de alta prestamo");
		btnDarDeAlta_1.setBounds(510, 52, 157, 23);
		btnDarDeAlta_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				RPrestamo = new RegPrestamos();
				RPrestamo.setVisible(true);
			}
		});
		
		btnCerrarSesin = new JButton("Cerrar sesi\u00F3n");
		btnCerrarSesin.setBounds(753, 11, 117, 23);
		
		JLabel lblEquipos = new JLabel("Equipos");
		lblEquipos.setBounds(350, 26, 69, 14);
		lblEquipos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.setLayout(null);
		
		lblTipoDeEquipo = new JLabel("Tipo de equipo");
		lblTipoDeEquipo.setBounds(62, 62, 89, 14);
		contentPane.add(lblTipoDeEquipo);
		contentPane.add(toolBar);
		contentPane.add(lblEquipos);
		contentPane.add(btnCerrarSesin);
		contentPane.add(btnDarDeAlta_1);
		contentPane.add(btnDarDeAlta);
		contentPane.add(comboBox_3);
		contentPane.add(comboBox);
		contentPane.add(textField);
		contentPane.add(comboBox_1);
		contentPane.add(textField_1);
		contentPane.add(comboBox_2);
		contentPane.add(textField_2);
		contentPane.add(button);
		contentPane.add(button_1);
		contentPane.add(scrollPane);
		
		lblCaracteristicas = new JLabel("Caracteristicas");
		lblCaracteristicas.setBounds(62, 108, 89, 14);
		contentPane.add(lblCaracteristicas);
		
	}
	public void setPantalla1(TbHistorial Historial) {
		this.Pantalla1 = Historial;
	}

	public void setPantalla2(TbPrestamos Prestamos) {
		this.Pantalla2 = Prestamos;
	}

	public void setPantalla3(TbUsers Users) {
		this.Pantalla3 = Users;
	}
	public void setPantalla4(TbAlmacen almacen) {
		this.Pantalla4 = almacen;
	}
}
