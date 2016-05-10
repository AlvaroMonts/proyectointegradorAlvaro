import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TbHistorial frame = new TbHistorial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

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
		scrollPane.setBounds(329, 56, 502, 361);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] { { "Juan", "5-04-2016, 10:00:00", "05-04-2016, 10:30:00", "Login", "-", "-", "-" },
						{ "Pedro", "4-04-2016, 22:00:00", "4-04-2016, 23:00:00", "Login", "-", "-", "-" },
						{ "Nacho", "-", "-", "Alta de equipo", "-", "-", "K4233" },
						{ "Kylo", "3-04-2016, 20:00:00", "03-04-2016, 20:30:00", "Login", "-", "-", "-" },
						{ "Gale", "2-04-2016, 7:00:00", "04-04-2016, 8:30:00", "Login", "-", "-", "-" },
						{ "Javier", "-", "-", "Equipo Modificado", "1-04-2016", "Monitor", "M43423" },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, { null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null }, },
				new String[] { "Usuario", "Fecha y hora de entrada", "Fecha y hora de salida", "Acci\u00F3n",
						"Fecha y hora de modificacion", "Equipo modificado", "Codigo del Equipo" }));
		scrollPane.setViewportView(table);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(206, 100, 86, 20);
		contentPane.add(textField);
		
		JLabel label = new JLabel("Usuario");
		label.setBounds(38, 103, 54, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Fecha y hora de entrada");
		label_1.setBounds(38, 128, 158, 14);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(206, 125, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(206, 149, 86, 20);
		contentPane.add(textField_2);
		
		JLabel label_2 = new JLabel("Fecha y hora de salida");
		label_2.setBounds(38, 152, 146, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Fecha y hora de modificaci\u00F3n");
		label_3.setBounds(38, 177, 168, 14);
		contentPane.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(206, 171, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(206, 196, 86, 20);
		contentPane.add(textField_4);
		
		JLabel label_4 = new JLabel("Acci\u00F3n");
		label_4.setBounds(38, 199, 54, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Equipo Modificado");
		label_5.setBounds(38, 227, 108, 14);
		contentPane.add(label_5);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(206, 221, 86, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(206, 249, 86, 20);
		contentPane.add(textField_6);
		
		JLabel label_6 = new JLabel("C\u00F3digo del equipo");
		label_6.setBounds(38, 252, 102, 14);
		contentPane.add(label_6);
		
		JButton button = new JButton("Quitar Filtros");
		button.setBounds(38, 330, 113, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Buscar");
		button_1.setBounds(182, 330, 89, 23);
		contentPane.add(button_1);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(24, 11, 273, 30);
		contentPane.add(toolBar);
		
		JButton button_2 = new JButton("Equipos");
		toolBar.add(button_2);
		
		JButton button_3 = new JButton("Prestamos");
		toolBar.add(button_3);
		
		JButton btnUsuarios = new JButton("Usuarios");
		toolBar.add(btnUsuarios);
		
		JButton button_5 = new JButton("Almacen");
		toolBar.add(button_5);
	}

}
