import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JToolBar;
import java.awt.Color;

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


	/**
	 * Create the frame.
	 */
	public TbHistorial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 890, 467);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(236, 56, 628, 361);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Juan", "5-04-2016, 10:00:00", "05-04-2016, 10:30:00", "Login", "-", "-", "-"},
				{"Pedro", "4-04-2016, 22:00:00", "4-04-2016, 23:00:00", "Login", "-", "-", "-"},
				{"Nacho", "-", "-", "Alta de equipo", "-", "-", "K4233"},
				{"Kylo", "3-04-2016, 20:00:00", "03-04-2016, 20:30:00", "Login", "-", "-", "-"},
				{"Gale", "2-04-2016, 7:00:00", "04-04-2016, 8:30:00", "Login", "-", "-", "-"},
				{"Javier", "-", "-", "Equipo Modificado", "1-04-2016", "Monitor", "M43423"},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"Usuario", "Fecha y hora de entrada", "Fecha y hora de salida", "Acci\u00F3n", "Fecha y hora de modificacion", "Equipo modificado", "Codigo del Equipo"
			}
		));
		table.getColumnModel().getColumn(2).setPreferredWidth(85);
		for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
			TableColumn t = table.getColumnModel().getColumn(i);
			EditorDeTablas cellEditor = new EditorDeTablas();
			t.setCellEditor(cellEditor);
		}
		scrollPane.setViewportView(table);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(26, 73, 86, 20);
		contentPane.add(textField);
		
		JLabel label = new JLabel("Usuario");
		label.setBounds(26, 56, 54, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Fecha y hora de entrada");
		label_1.setBounds(26, 102, 158, 14);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(26, 120, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(26, 164, 86, 20);
		contentPane.add(textField_2);
		
		JLabel label_2 = new JLabel("Fecha y hora de salida");
		label_2.setBounds(25, 147, 146, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Fecha y hora de modificaci\u00F3n");
		label_3.setBounds(25, 185, 168, 14);
		contentPane.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(26, 206, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(26, 252, 86, 20);
		contentPane.add(textField_4);
		
		JLabel label_4 = new JLabel("Acci\u00F3n");
		label_4.setBounds(26, 231, 54, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Equipo Modificado");
		label_5.setBounds(26, 277, 108, 14);
		contentPane.add(label_5);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(26, 299, 86, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(26, 346, 86, 20);
		contentPane.add(textField_6);
		
		JLabel label_6 = new JLabel("C\u00F3digo del equipo");
		label_6.setBounds(26, 325, 102, 14);
		contentPane.add(label_6);
		
		JButton button = new JButton("Quitar Filtros");
		button.setBounds(15, 382, 113, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Buscar");
		button_1.setBounds(137, 382, 89, 23);
		contentPane.add(button_1);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(24, 11, 273, 30);
		contentPane.add(toolBar);
		
		JButton button_2 = new JButton("Almacen");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				pantalla1 = new TbAlmacen();
				pantalla1.setVisible(true);
			}
		});
		toolBar.add(button_2);
		
		JButton button_3 = new JButton("Equipos");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				pantalla2 = new TbEquipos();
				pantalla2.setVisible(true);
			}
		});
		toolBar.add(button_3);
		
		JButton btnUsuarios = new JButton("Prestamos");
		btnUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				pantalla3 = new TbPrestamos();
				pantalla3.setVisible(true);
			}
		});
		toolBar.add(btnUsuarios);
		
		JButton button_5 = new JButton("Usuarios");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				pantalla4 = new TbUsers();
				pantalla4.setVisible(true);
			}
		});
		toolBar.add(button_5);
		
		JButton button_4 = new JButton("Cerrar sesi\u00F3n");
		button_4.setBounds(751, 11, 113, 23);
		contentPane.add(button_4);
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
	

}
