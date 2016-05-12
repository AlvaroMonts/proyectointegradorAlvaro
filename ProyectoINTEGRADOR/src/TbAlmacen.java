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
	private JButton button;

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
		scrollPane.setBounds(162, 56, 636, 367);
		scrollPane.setToolTipText("");

		toolBar = new JToolBar();
		toolBar.setBounds(15, 5, 288, 30);

		button_2 = new JButton("Buscar");
		button_2.setBounds(25, 343, 85, 23);

		button_4 = new JButton("Quitar filtro\r\n");
		button_4.setBounds(15, 390, 106, 23);

		lblTipodeequipo = new JLabel("Tipo de Equipo");
		lblTipodeequipo.setBounds(15, 49, 110, 23);

		textField = new JTextField();
		textField.setBounds(15, 83, 110, 20);
		textField.setColumns(10);

		lblNotas = new JLabel("Notas\r\n");
		lblNotas.setBounds(15, 114, 110, 23);

		textField_1 = new JTextField();
		textField_1.setBounds(15, 143, 110, 20);
		textField_1.setColumns(10);

		JLabel lblCodequipo = new JLabel("Codigo del equipo\r\n");
		lblCodequipo.setBounds(15, 169, 110, 23);

		textField_2 = new JTextField();
		textField_2.setBounds(15, 197, 110, 20);
		textField_2.setColumns(10);

		lblCausa = new JLabel("Causa");
		lblCausa.setBounds(15, 228, 100, 23);

		textField_3 = new JTextField();
		textField_3.setBounds(15, 255, 110, 20);
		textField_3.setColumns(10);

		lblPiezareutilizable = new JLabel("Piezas Reutilizables");
		lblPiezareutilizable.setBounds(15, 279, 137, 23);

		textField_4 = new JTextField();
		textField_4.setBounds(15, 308, 110, 20);
		textField_4.setColumns(10);
		
		button = new JButton("Cerrar sesi\u00F3n");
		button.setBounds(670, 5, 118, 23);

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
						setVisible(false);
						Users = new TbUsers();
						Users.setVisible(true);
			}
		});
		toolBar.add(btnUsuario);

		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Tablet", "001", "Pantalla Rota", "La pantalla se puede arreglar", "RAM, Procesador, HDD"},
				{"Portatil", "002", "Placa base rota", "Se le puede cambiar por otra", "RAM, Tarjeta grafica, procesador, HDD y pantalla"},
				{"Sobremesa", "002", "Fuente de alimentacion y procesador roto", "Se le puede cambiar las dos piezas", "RAM, Placa base, Tarjeta grafica"},
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
		contentPane.setLayout(null);
		contentPane.add(textField);
		contentPane.add(textField_1);
		contentPane.add(textField_2);
		contentPane.add(lblNotas);
		contentPane.add(lblTipodeequipo);
		contentPane.add(lblCodequipo);
		contentPane.add(lblPiezareutilizable);
		contentPane.add(textField_4);
		contentPane.add(lblCausa);
		contentPane.add(textField_3);
		contentPane.add(button_2);
		contentPane.add(button_4);
		contentPane.add(scrollPane);
		contentPane.add(toolBar);
		contentPane.add(button);
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