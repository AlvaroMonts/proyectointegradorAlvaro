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
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Equipo", "COD_Equipo", "Marca", "Modelo", "Tipo de uso", "Disponibilidad", "Prestable", "Edificio", "Almacenamiento"}));
		comboBox.setBounds(61, 125, 75, 20);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(61, 156, 86, 20);
		contentPane.add(textField);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Equipo", "COD_Equipo", "Marca", "Modelo", "Tipo de uso", "Disponibilidad", "Prestable", "Edificio", "Almacenamiento"}));
		comboBox_1.setBounds(61, 187, 75, 20);
		contentPane.add(comboBox_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(61, 218, 86, 20);
		contentPane.add(textField_1);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Equipo", "COD_Equipo", "Marca", "Modelo", "Tipo de uso", "Disponibilidad", "Prestable", "Edificio", "Almacenamiento"}));
		comboBox_2.setBounds(61, 249, 75, 20);
		contentPane.add(comboBox_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(61, 280, 86, 20);
		contentPane.add(textField_2);
		
		button = new JButton("Buscar");
		button.setBounds(61, 311, 75, 23);
		contentPane.add(button);
		
		button_1 = new JButton("Restaurar Filtros");
		button_1.setBounds(41, 345, 138, 23);
		contentPane.add(button_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(186, 90, 684, 326);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
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
		
		comboBox_3 = new JComboBox();
		comboBox_3.setBackground(new Color(135, 206, 235));
		comboBox_3.setBounds(61, 90, 75, 20);
		contentPane.add(comboBox_3);
		
		btnDarDeAlta = new JButton("Dar de alta equipo");
		btnDarDeAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					setVisible(false);
					REquipo = new RegEquipos();
					REquipo.setVisible(true);

			}
		});
		btnDarDeAlta.setBounds(692, 52, 146, 23);
		contentPane.add(btnDarDeAlta);
		
		btnDarDeAlta_1 = new JButton("Dar de alta prestamo");
		btnDarDeAlta_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				RPrestamo = new RegPrestamos();
				RPrestamo.setVisible(true);
			}
		});
		btnDarDeAlta_1.setBounds(510, 52, 157, 23);
		contentPane.add(btnDarDeAlta_1);
		
		btnCerrarSesin = new JButton("Cerrar sesi\u00F3n");
		btnCerrarSesin.setBounds(753, 11, 117, 23);
		contentPane.add(btnCerrarSesin);
		
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
