package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import Controlador.TbHistorial_Controlador;

import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JToolBar;

import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class TbHistorial extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable table;
	private TbAlmacen pantalla1;
	private TbEquipos pantalla2;
	private TbPrestamos pantalla3;
	private TbUsers pantalla4;
	private TbHistorial_Controlador tbHiCont;
	private Login login;

	/**
	 * Create the frame.
	 */
	public TbHistorial() {
		setTitle("Historial");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 890, 467);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JScrollPane scrollPane = new JScrollPane();

		table = new JTable();

		scrollPane.setViewportView(table);

		textField = new JTextField();
		textField.setColumns(10);

		JLabel label = new JLabel("Usuario");

		JLabel label_1 = new JLabel("Fecha y hora de entrada");

		textField_1 = new JTextField();
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setColumns(10);

		JLabel label_2 = new JLabel("Fecha y hora de salida");

		JLabel label_3 = new JLabel("Fecha y hora de modificaci\u00F3n");

		textField_3 = new JTextField();
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setColumns(10);

		JLabel label_4 = new JLabel("Acci\u00F3n");

		JLabel label_5 = new JLabel("Equipo Modificado");

		textField_5 = new JTextField();
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setColumns(10);

		JLabel label_6 = new JLabel("C\u00F3digo del equipo");

		JButton button = new JButton("Quitar Filtros");

		JButton button_1 = new JButton("Buscar");

		JToolBar toolBar = new JToolBar();

		JButton button_2 = new JButton("Almacen");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				pantalla1.setVisible(true);
			}
		});

		JButton button_3 = new JButton("Equipos");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				pantalla2.setVisible(true);
			}
		});
		toolBar.add(button_3);

		JButton btnUsuarios = new JButton("Prestamos");
		btnUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				pantalla3.setVisible(true);
			}
		});

		JButton button_5 = new JButton("Usuarios");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				pantalla4.setVisible(true);
			}
		});
		toolBar.add(button_5);
		toolBar.add(btnUsuarios);

		JButton btnHistorial = new JButton("Historial");
		btnHistorial.setEnabled(false);
		toolBar.add(btnHistorial);
		toolBar.add(button_2);

		JButton button_4 = new JButton("Cerrar sesi\u00F3n");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				login.setVisible(true);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane
				.setHorizontalGroup(
						gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(19)
										.addComponent(toolBar, GroupLayout.PREFERRED_SIZE,
												341, GroupLayout.PREFERRED_SIZE)
										.addGap(386).addComponent(button_4, GroupLayout.PREFERRED_SIZE, 113,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(10).addGroup(gl_contentPane
										.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup().addGap(11).addComponent(label,
												GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup().addGap(11).addComponent(
												textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup().addGap(11).addComponent(
												label_1, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup().addGap(11).addComponent(
												textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup().addGap(10).addComponent(
												label_2, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup().addGap(11).addComponent(
												textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup().addGap(10).addComponent(
												label_3, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup().addGap(11).addComponent(
												textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup().addGap(11).addComponent(
												label_4, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup().addGap(11).addComponent(
												textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup().addGap(11).addComponent(
												label_5, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup().addGap(11).addComponent(
												textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup().addGap(11).addComponent(
												label_6, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup().addGap(11).addComponent(
												textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(button, GroupLayout.PREFERRED_SIZE, 113,
														GroupLayout.PREFERRED_SIZE)
												.addGap(9).addComponent(button_1, GroupLayout.PREFERRED_SIZE, 89,
														GroupLayout.PREFERRED_SIZE)))
										.addGap(10).addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 628,
												GroupLayout.PREFERRED_SIZE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(6)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(button_4)
								.addComponent(toolBar, GroupLayout.PREFERRED_SIZE, 30,
										GroupLayout.PREFERRED_SIZE))
						.addGap(15)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().addComponent(label).addGap(3)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addGap(9).addComponent(label_1).addGap(4)
										.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addGap(7).addComponent(label_2).addGap(3)
										.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addGap(1).addComponent(label_3).addGap(7)
										.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addGap(5).addComponent(label_4).addGap(7)
										.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addGap(5).addComponent(label_5).addGap(8)
										.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addGap(6).addComponent(label_6).addGap(7)
										.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addGap(16)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(button).addComponent(button_1)))
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 361,
										GroupLayout.PREFERRED_SIZE))));
		contentPane.setLayout(gl_contentPane);
	}

	public void setPantalla1(TbAlmacen Pantalla1) {
		this.pantalla1 = Pantalla1;

	}

	public void setPantalla2(TbEquipos Pantalla2) {
		this.pantalla2 = Pantalla2;
	}

	public void setPantalla3(TbPrestamos Pantalla3) {
		this.pantalla3 = Pantalla3;
	}

	public void setPantalla4(TbUsers Pantalla4) {
		this.pantalla4 = Pantalla4;
	}

	public void setHistCont(TbHistorial_Controlador historial_Controlador) {
		this.tbHiCont = historial_Controlador;
	}
	public void setLogin(Login login) {
		this.login = login;
	}

	public void setTbHistorial(Object [][] tabla) {
		table.setModel(new DefaultTableModel(tabla,
				new String[] { "Usuario_Email", "Equipo_COD", "Tipo de Accion", "Fecha", "ID_Accion" }));
		table.getColumnModel().getColumn(2).setPreferredWidth(85);
		for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
			TableColumn t = table.getColumnModel().getColumn(i);
			EditorDeTablas cellEditor = new EditorDeTablas();
			t.setCellEditor(cellEditor);
		}
	}
}
