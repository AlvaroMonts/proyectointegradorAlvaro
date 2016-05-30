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

import Controlador.TbEquipos_Controlador;

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
	private JButton btnDarDeAlta;
	private JButton button_1;
	private JButton button;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JButton btnCerrarSesin;
	private JLabel lblTipoDeEquipo;
	private TbEquipos_Controlador tbEqCont;
	private Login login;
	private JScrollPane scrollPane;
	private int lineaSeleccionada;

	/**
	 * Create the frame.
	 */
	public TbEquipos() {
		setTitle("Equipos");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 896, 466);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		comboBox = new JComboBox();
		comboBox.setBounds(62, 133, 75, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Equipo",
				"COD_Equipo", "Marca", "Modelo", "Tipo de uso",
				"Disponibilidad", "Prestable", "Edificio", "Almacenamiento" }));

		textField = new JTextField();
		textField.setBounds(62, 172, 86, 20);
		textField.setColumns(10);

		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(62, 203, 75, 20);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "Equipo",
				"COD_Equipo", "Marca", "Modelo", "Tipo de uso",
				"Disponibilidad", "Prestable", "Edificio", "Almacenamiento" }));

		textField_1 = new JTextField();
		textField_1.setBounds(62, 234, 86, 20);
		textField_1.setColumns(10);

		comboBox_2 = new JComboBox();
		comboBox_2.setBounds(62, 265, 75, 20);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "Equipo",
				"COD_Equipo", "Marca", "Modelo", "Tipo de uso",
				"Disponibilidad", "Prestable", "Edificio", "Almacenamiento" }));

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

		scrollPane = new JScrollPane();
		scrollPane.setBounds(187, 90, 684, 326);

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
					CEquipo.setVisible(true);
				}
			}
		});

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(41, 14, 346, 30);

		JButton button_2 = new JButton("Prestamos");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Pantalla2.setVisible(true);
			}
		});

		JButton btnEquipos = new JButton("Equipos");
		btnEquipos.setEnabled(false);
		toolBar.add(btnEquipos);

		JButton btnUsuarios = new JButton("Usuarios");
		btnUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Pantalla3.setVisible(true);
			}
		});
		toolBar.add(btnUsuarios);

		toolBar.add(button_2);

		JButton button_4 = new JButton("Almacen");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Pantalla4.setVisible(true);
			}
		});

		JButton button_3 = new JButton("Historial");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Pantalla1.setVisible(true);
			}
		});
		toolBar.add(button_3);
		toolBar.add(button_4);

		comboBox_3 = new JComboBox();
		comboBox_3.setBounds(62, 82, 102, 20);
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] { "Todos",
				"Sobremesa", "Portatil", "Tablet/Movil", "Cintiq", "Proyector",
				"Tableta gr\u00E1fica", "Monitor", "Consola" }));
		comboBox_3.setBackground(UIManager.getColor("Button.background"));

		btnDarDeAlta = new JButton("Dar de alta equipo");
		btnDarDeAlta.setBounds(597, 53, 146, 23);
		btnDarDeAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				REquipo.setVisible(true);
			}
		});

		btnCerrarSesin = new JButton("Cerrar sesi\u00F3n");
		btnCerrarSesin.setBounds(753, 11, 117, 23);
		contentPane.setLayout(null);
		btnCerrarSesin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				login.setVisible(true);
			}
		});

		lblTipoDeEquipo = new JLabel("Tipo de equipo");
		lblTipoDeEquipo.setBounds(62, 62, 89, 14);
		contentPane.add(lblTipoDeEquipo);
		contentPane.add(toolBar);
		contentPane.add(btnCerrarSesin);
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

	public void setEquiposCont(TbEquipos_Controlador equipos_Controlador) {
		this.tbEqCont = equipos_Controlador;
	}

	public void setCaracEquipos(Caracteristicas_Equipo equipo) {
		this.CEquipo = equipo;
	}

	public void setRegEq(RegEquipos regEquipos) {
		this.REquipo = regEquipos;
	}

	public void setSelectedRow(){
		this.lineaSeleccionada = table.getSelectedRow();
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public String getSelectedRowID() {
		String id = (String) table.getModel().getValueAt(this.lineaSeleccionada,0);
		return id;
	}
	/*public String getUsuario() {
		String usuario = login.textField-de-email.getText();
		return usuario;
	}*/

	public void setTbEquipos(Object[][] tabla) {
		String[] columnas = new String[] { "C\u00F3digo", "Tipo de Equipo",
				"Almacenamiento 1", "Almacenamiento 2", "Notas", "Marca",
				"Disponibilidad", "Tipo Uso", "Modelo", "prestable", "Sala",
				"Edificio" };

		DefaultTableModel modeloTb = new DefaultTableModel(tabla, columnas);
		table.setModel(modeloTb);
		for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
			TableColumn t = table.getColumnModel().getColumn(i);
			EditorDeTablas cellEditor = new EditorDeTablas();
			t.setCellEditor(cellEditor);
		}
	}
}