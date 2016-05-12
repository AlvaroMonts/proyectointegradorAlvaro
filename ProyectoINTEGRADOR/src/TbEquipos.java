import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JToolBar;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Equipo", "COD_Equipo", "Marca", "Modelo", "Tipo de uso", "Disponibilidad", "Prestable", "Edificio", "Almacenamiento"}));
		comboBox.setBounds(61, 125, 75, 20);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(61, 156, 86, 20);
		contentPane.add(textField);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Equipo", "COD_Equipo", "Marca", "Modelo", "Tipo de uso", "Disponibilidad", "Prestable", "Edificio", "Almacenamiento"}));
		comboBox_1.setBounds(61, 187, 75, 20);
		contentPane.add(comboBox_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(61, 218, 86, 20);
		contentPane.add(textField_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Equipo", "COD_Equipo", "Marca", "Modelo", "Tipo de uso", "Disponibilidad", "Prestable", "Edificio", "Almacenamiento"}));
		comboBox_2.setBounds(61, 249, 75, 20);
		contentPane.add(comboBox_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(61, 280, 86, 20);
		contentPane.add(textField_2);
		
		JButton button = new JButton("Buscar");
		button.setBounds(61, 311, 75, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Restaurar Filtros");
		button_1.setBounds(41, 345, 138, 23);
		contentPane.add(button_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(213, 86, 657, 312);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null }, },
				new String[] { "Equipo", "COD_Equipo", "Marca", "Modelo", "Tipo de uso", "Disponibilidad", "Prestable",
						"Edificio", "Almacenamiento" }));
		scrollPane.setViewportView(table);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(41, 14, 288, 30);
		contentPane.add(toolBar);
		
		
		
		JButton button_3 = new JButton("Historial");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Pantalla1 = new TbHistorial();
				Pantalla1.setVisible(true);
			}
		});
		toolBar.add(button_3);
		
		JButton button_2 = new JButton("Prestamos");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Pantalla2 = new TbPrestamos();
				Pantalla2.setVisible(true);
			}
		});
		
		toolBar.add(button_2);
		
		
		
		JButton btnUsuarios = new JButton("Usuarios");
		btnUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Pantalla3 = new TbUsers();
				Pantalla3.setVisible(true);
			}
		});
		toolBar.add(btnUsuarios);
		
		JButton button_4 = new JButton("Almacen");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Pantalla4 = new TbAlmacen();
				Pantalla4.setVisible(true);
			}
		});
		toolBar.add(button_4);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBackground(new Color(135, 206, 235));
		comboBox_3.setBounds(61, 90, 75, 20);
		contentPane.add(comboBox_3);
		
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
