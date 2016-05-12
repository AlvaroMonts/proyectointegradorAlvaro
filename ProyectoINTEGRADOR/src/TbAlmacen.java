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
import javax.swing.JToolBar;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane
				.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addContainerGap().addGroup(gl_contentPane
										.createParallelGroup(
												Alignment.TRAILING)
										.addGroup(Alignment.LEADING,
												gl_contentPane.createSequentialGroup()
														.addGroup(
																gl_contentPane.createParallelGroup(Alignment.LEADING)
																		.addGroup(gl_contentPane.createSequentialGroup()
																				.addComponent(button_2)
																				.addPreferredGap(
																						ComponentPlacement.UNRELATED)
																				.addComponent(button_4))
																		.addComponent(textField,
																				GroupLayout.PREFERRED_SIZE, 110,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				textField_1, GroupLayout.PREFERRED_SIZE,
																				110, GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				textField_2, GroupLayout.PREFERRED_SIZE,
																				110, GroupLayout.PREFERRED_SIZE)
																		.addGroup(gl_contentPane.createSequentialGroup()
																				.addGap(19).addComponent(lblNotas,
																						GroupLayout.PREFERRED_SIZE, 110,
																						GroupLayout.PREFERRED_SIZE))
																		.addGroup(gl_contentPane.createSequentialGroup()
																				.addGap(10)
																				.addComponent(lblTipodeequipo,
																						GroupLayout.PREFERRED_SIZE, 110,
																						GroupLayout.PREFERRED_SIZE))
																		.addGroup(gl_contentPane.createSequentialGroup()
																				.addGap(10).addComponent(lblCodequipo,
																						GroupLayout.PREFERRED_SIZE, 110,
																						GroupLayout.PREFERRED_SIZE))
																		.addGroup(gl_contentPane.createSequentialGroup()
																				.addGap(10)
																				.addComponent(lblPiezareutilizable,
																						GroupLayout.PREFERRED_SIZE, 110,
																						GroupLayout.PREFERRED_SIZE))
																		.addComponent(
																				textField_4, GroupLayout.PREFERRED_SIZE,
																				110, GroupLayout.PREFERRED_SIZE)
																		.addGroup(gl_contentPane
																				.createParallelGroup(Alignment.LEADING,
																						false)
																				.addGroup(gl_contentPane
																						.createSequentialGroup().addGap(
																								10)
																						.addComponent(lblCausa,
																								GroupLayout.DEFAULT_SIZE,
																								GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE))
																				.addComponent(textField_3,
																						GroupLayout.PREFERRED_SIZE, 110,
																						GroupLayout.PREFERRED_SIZE)))
														.addPreferredGap(ComponentPlacement.RELATED, 28,
																Short.MAX_VALUE)
														.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 593,
																GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(toolBar, GroupLayout.PREFERRED_SIZE, 288,
														GroupLayout.PREFERRED_SIZE)
												.addContainerGap(495, Short.MAX_VALUE)))));
		gl_contentPane
				.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(toolBar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(
										scrollPane, GroupLayout.PREFERRED_SIZE, 367,
										GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createSequentialGroup()
												.addGroup(gl_contentPane
														.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
																.createSequentialGroup()
																.addGap(27)
																.addComponent(textField, GroupLayout.PREFERRED_SIZE,
																		GroupLayout.DEFAULT_SIZE,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(12)
																.addComponent(lblNotas, GroupLayout.PREFERRED_SIZE, 23,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(5).addComponent(textField_1,
																		GroupLayout.PREFERRED_SIZE,
																		GroupLayout.DEFAULT_SIZE,
																		GroupLayout.PREFERRED_SIZE))
														.addComponent(lblTipodeequipo, GroupLayout.PREFERRED_SIZE, 23,
																GroupLayout.PREFERRED_SIZE))
												.addGap(8)
												.addComponent(lblCodequipo, GroupLayout.PREFERRED_SIZE, 23,
														GroupLayout.PREFERRED_SIZE)
												.addGap(3)
												.addComponent(textField_2, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addGap(14)
												.addComponent(lblCausa, GroupLayout.PREFERRED_SIZE, 23,
														GroupLayout.PREFERRED_SIZE)
												.addGap(1)
												.addComponent(textField_3, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addGap(4)
												.addComponent(lblPiezareutilizable, GroupLayout.PREFERRED_SIZE, 23,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(textField_4, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
														.addComponent(button_2).addComponent(button_4))))
								.addContainerGap()));

		btnonEquipo = new JButton("Equipos");
		toolBar.add(btnonEquipo);
		btnonEquipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				Equipos = new TbEquipos();
				Equipos.setVisible(true);
			}
		});

		btnHistorial = new JButton("Historial");
		toolBar.add(btnHistorial);
		btnHistorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg1) {
				setVisible(false);
				Historial = new TbHistorial();
				Historial.setVisible(true);
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

		btnUsuario = new JButton("Usuarios");
		btnUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnUsuario.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg3) {
						setVisible(false);
						Users = new TbUsers();
						Users.setVisible(true);

					}
				});

			}
		});
		toolBar.add(btnUsuario);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, },
				new String[] { "TipoDeEquipo", "Notas", "Cod_Equipo", "Causa", "PiezaReutilizable" }));
		scrollPane.setViewportView(table);
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