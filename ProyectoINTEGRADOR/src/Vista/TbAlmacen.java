package Vista;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import Controlador.TbAlmacen_Controlador;

import javax.swing.JToolBar;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class TbAlmacen extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblTipodeequipo;
	private JLabel lblCausa;
	private JLabel lblNotas;
	private JLabel lblPiezareutilizable;
	private JButton button_2;
	private JButton button_4;
	private JButton btnonEquipo;
	private JButton btnHistorial;
	private JButton btnPrestamos;
	private JButton btnUsuario;
	private JToolBar toolBar;
	private TbEquipos Equipos;
	private TbHistorial Historial;
	private TbPrestamos Prestamos;
	private TbUsers Users;
	private JButton button;
	private JLabel lblAlmace;
	private TbAlmacen_Controlador tbAlCont = new TbAlmacen_Controlador();

	/**
	 * Create the frame.
	 */
	public TbAlmacen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 819, 478);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setToolTipText("");

		toolBar = new JToolBar();

		button_2 = new JButton("Buscar");

		button_4 = new JButton("Quitar filtro\r\n");

		lblTipodeequipo = new JLabel("Tipo de Equipo");

		textField = new JTextField();
		textField.setColumns(10);

		lblNotas = new JLabel("Notas\r\n");

		textField_1 = new JTextField();
		textField_1.setColumns(10);

		JLabel lblCodequipo = new JLabel("Codigo del equipo\r\n");

		textField_2 = new JTextField();
		textField_2.setColumns(10);

		lblCausa = new JLabel("Causa");

		textField_3 = new JTextField();
		textField_3.setColumns(10);

		lblPiezareutilizable = new JLabel("Piezas Reutilizables");

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		button = new JButton("Cerrar sesi\u00F3n");

		btnonEquipo = new JButton("Equipos");
		toolBar.add(btnonEquipo);
		btnonEquipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				Equipos = new TbEquipos();
				Equipos.setVisible(true);
			}
		});
		
				btnUsuario = new JButton("Usuarios");
				btnUsuario.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
								setVisible(false);
								Users = new TbUsers();
								Users.setVisible(true);
					}
				});
				
						btnPrestamos = new JButton("Prestamos");
						toolBar.add(btnPrestamos);
						btnPrestamos.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg2) {
								setVisible(false);
								Prestamos = new TbPrestamos();
								Prestamos.setVisible(true);

							}
						});
				toolBar.add(btnUsuario);

		btnHistorial = new JButton("Historial");
		toolBar.add(btnHistorial);
		btnHistorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg1) {
				setVisible(false);
				Historial = new TbHistorial();
				Historial.setVisible(true);
			}
		});

		table = new JTable();
		table.setModel(new DefaultTableModel(
				tbAlCont.array
			,
			new String[] {
				"Tipo De Equipo", "Codigo equipo", "Causa", "Notas", "Piezas Reutilizables"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(92);
		table.getColumnModel().getColumn(3).setPreferredWidth(85);
		table.getColumnModel().getColumn(4).setPreferredWidth(113);
		for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
			TableColumn t = table.getColumnModel().getColumn(i);
			EditorDeTablas cellEditor = new EditorDeTablas();
			t.setCellEditor(cellEditor);
		}
		scrollPane.setViewportView(table);
		
		lblAlmace = new JLabel("Almacen");
		lblAlmace.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(toolBar, GroupLayout.PREFERRED_SIZE, 288, GroupLayout.PREFERRED_SIZE)
							.addGap(20)
							.addComponent(lblAlmace, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
							.addGap(291)
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblTipodeequipo, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNotas, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCodequipo, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCausa, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPiezareutilizable, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(10)
									.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
								.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
							.addGap(10)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 636, GroupLayout.PREFERRED_SIZE))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(toolBar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(2)
							.addComponent(lblAlmace, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(button))
					.addGap(14)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblTipodeequipo, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(lblNotas, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(lblCodequipo, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addGap(5)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(lblCausa, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(lblPiezareutilizable, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(15)
							.addComponent(button_2)
							.addGap(24)
							.addComponent(button_4))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(7)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 367, GroupLayout.PREFERRED_SIZE))))
		);
		contentPane.setLayout(gl_contentPane);
	}

	public void setEquipo(TbEquipos Equipos) {
		this.Equipos = Equipos;

	}

	public void setHistorial(TbHistorial Historial) {
		this.Historial = Historial;

	}

	public void setPrestamos(TbPrestamos Prestamos) {
		this.Prestamos = Prestamos;
	}

	public void setUsers(TbUsers Users) {
		this.Users = Users;
	}
}