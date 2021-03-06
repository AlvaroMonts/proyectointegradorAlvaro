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

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class TbAlmacen extends JFrame {

	private JPanel contentPane;
	private JTable table;
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
	private TbAlmacen_Controlador tbAlCont;
	private Login login;

	/**
	 * Create the frame.
	 */
	public TbAlmacen() {
		setTitle("Almac\u00E9n");
		setResizable(false);
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
		button_2.setFont(new Font("SansSerif", Font.BOLD, 12));

		button_4 = new JButton("Quitar filtro\r\n");
		button_4.setFont(new Font("SansSerif", Font.BOLD, 12));

		lblTipodeequipo = new JLabel("Tipo de Equipo");
		lblTipodeequipo.setFont(new Font("SansSerif", Font.PLAIN, 12));

		lblNotas = new JLabel("Notas\r\n");
		lblNotas.setFont(new Font("SansSerif", Font.PLAIN, 12));

		textField_1 = new JTextField();
		textField_1.setColumns(10);

		JLabel lblCodequipo = new JLabel("Codigo del equipo\r\n");
		lblCodequipo.setFont(new Font("SansSerif", Font.PLAIN, 12));

		textField_2 = new JTextField();
		textField_2.setColumns(10);

		lblCausa = new JLabel("Causa");
		lblCausa.setFont(new Font("SansSerif", Font.PLAIN, 12));

		textField_3 = new JTextField();
		textField_3.setColumns(10);

		lblPiezareutilizable = new JLabel("Piezas Reutilizables");
		lblPiezareutilizable.setFont(new Font("SansSerif", Font.PLAIN, 12));

		textField_4 = new JTextField();
		textField_4.setColumns(10);

		button = new JButton("Cerrar sesi\u00F3n");
		button.setFont(new Font("SansSerif", Font.BOLD, 12));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				login.setVisible(true);
			}
		});

		btnonEquipo = new JButton("Equipos");
		btnonEquipo.setFont(new Font("SansSerif", Font.BOLD, 12));
		toolBar.add(btnonEquipo);
		btnonEquipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				Equipos.setVisible(true);
			}
		});

		btnUsuario = new JButton("Usuarios");
		btnUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				Users.setVisible(true);
			}
		});
		toolBar.add(btnUsuario);

		btnPrestamos = new JButton("Prestamos");
		toolBar.add(btnPrestamos);
		btnPrestamos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg2) {
				setVisible(false);
				Prestamos.setVisible(true);

			}
		});

		btnHistorial = new JButton("Historial");
		toolBar.add(btnHistorial);
		btnHistorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg1) {
				setVisible(false);
				Historial.setVisible(true);
			}
		});

		table = new JTable();

		scrollPane.setViewportView(table);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Todos",
				"Sobremesa", "Portatil", "Tablet/Movil", "Cintiq", "Proyector",
				"Tableta gr\u00E1fica", "Monitor", "Consola" }));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane
				.setHorizontalGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addGap(10)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addComponent(
																				toolBar,
																				GroupLayout.PREFERRED_SIZE,
																				349,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(306)
																		.addComponent(
																				button,
																				GroupLayout.PREFERRED_SIZE,
																				118,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGroup(
																				gl_contentPane
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(
																								lblTipodeequipo,
																								GroupLayout.PREFERRED_SIZE,
																								110,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								textField_1,
																								GroupLayout.PREFERRED_SIZE,
																								110,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								lblCodequipo,
																								GroupLayout.PREFERRED_SIZE,
																								110,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								textField_2,
																								GroupLayout.PREFERRED_SIZE,
																								110,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								lblCausa,
																								GroupLayout.PREFERRED_SIZE,
																								100,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								textField_3,
																								GroupLayout.PREFERRED_SIZE,
																								110,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								lblPiezareutilizable,
																								GroupLayout.PREFERRED_SIZE,
																								137,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								textField_4,
																								GroupLayout.PREFERRED_SIZE,
																								110,
																								GroupLayout.PREFERRED_SIZE)
																						.addGroup(
																								gl_contentPane
																										.createSequentialGroup()
																										.addGap(10)
																										.addComponent(
																												button_2,
																												GroupLayout.PREFERRED_SIZE,
																												85,
																												GroupLayout.PREFERRED_SIZE))
																						.addComponent(
																								button_4,
																								GroupLayout.PREFERRED_SIZE,
																								106,
																								GroupLayout.PREFERRED_SIZE)
																						.addGroup(
																								gl_contentPane
																										.createParallelGroup(
																												Alignment.TRAILING,
																												false)
																										.addGroup(
																												Alignment.LEADING,
																												gl_contentPane
																														.createSequentialGroup()
																														.addPreferredGap(
																																ComponentPlacement.RELATED)
																														.addComponent(
																																comboBox,
																																0,
																																GroupLayout.DEFAULT_SIZE,
																																Short.MAX_VALUE))
																										.addComponent(
																												lblNotas,
																												Alignment.LEADING,
																												GroupLayout.DEFAULT_SIZE,
																												110,
																												Short.MAX_VALUE)))
																		.addGap(10)
																		.addComponent(
																				scrollPane,
																				GroupLayout.PREFERRED_SIZE,
																				636,
																				GroupLayout.PREFERRED_SIZE)))));
		gl_contentPane
				.setVerticalGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
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
										.addGap(14)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addComponent(
																				lblTipodeequipo,
																				GroupLayout.PREFERRED_SIZE,
																				23,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				ComponentPlacement.UNRELATED)
																		.addComponent(
																				comboBox,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(11)
																		.addComponent(
																				lblNotas,
																				GroupLayout.PREFERRED_SIZE,
																				23,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(6)
																		.addComponent(
																				textField_1,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(6)
																		.addComponent(
																				lblCodequipo,
																				GroupLayout.PREFERRED_SIZE,
																				23,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(5)
																		.addComponent(
																				textField_2,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(11)
																		.addComponent(
																				lblCausa,
																				GroupLayout.PREFERRED_SIZE,
																				23,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(4)
																		.addComponent(
																				textField_3,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(4)
																		.addComponent(
																				lblPiezareutilizable,
																				GroupLayout.PREFERRED_SIZE,
																				23,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(6)
																		.addComponent(
																				textField_4,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(15)
																		.addComponent(
																				button_2)
																		.addGap(24)
																		.addComponent(
																				button_4))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(7)
																		.addComponent(
																				scrollPane,
																				GroupLayout.PREFERRED_SIZE,
																				367,
																				GroupLayout.PREFERRED_SIZE)))));

		JButton btnNewButton = new JButton("Almacen");
		btnNewButton.setEnabled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		toolBar.add(btnNewButton);
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

	public void setAlmacenCont(TbAlmacen_Controlador almacen_Controlador) {
		this.tbAlCont = almacen_Controlador;
	}
	public void setLogin(Login login) {
		this.login = login;
	}

	public void setTbAlmacen(Object[][] tabla) {
		table.setModel(new DefaultTableModel(tabla, new String[] {
				"Tipo De Equipo", "Notas", "Codigo equipo", "Causa",
				"Piezas Reutilizables" }));
		table.getColumnModel().getColumn(1).setPreferredWidth(92);
		table.getColumnModel().getColumn(3).setPreferredWidth(85);
		table.getColumnModel().getColumn(4).setPreferredWidth(113);
		for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
			TableColumn t = table.getColumnModel().getColumn(i);
			EditorDeTablas cellEditor = new EditorDeTablas();
			t.setCellEditor(cellEditor);
		}
	}
}