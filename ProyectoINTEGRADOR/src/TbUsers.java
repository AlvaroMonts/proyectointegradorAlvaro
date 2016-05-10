import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import java.awt.Color;

public class TbUsers extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TbUsers frame = new TbUsers();
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
	public TbUsers() {
		setBackground(new Color(135, 206, 235));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 901, 467);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		textField = new JTextField();
		textField.setBounds(99, 120, 103, 20);
		textField.setColumns(10);

		JLabel label = new JLabel("Nombre");
		label.setBounds(45, 123, 50, 14);

		JLabel label_1 = new JLabel("Apellidos");
		label_1.setBounds(45, 163, 55, 14);

		textField_1 = new JTextField();
		textField_1.setBounds(99, 160, 106, 20);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(99, 197, 102, 20);
		textField_2.setColumns(10);

		JLabel label_2 = new JLabel("Correo");
		label_2.setBounds(43, 200, 33, 14);

		JLabel label_3 = new JLabel("Tipo de usuario");
		label_3.setBounds(45, 263, 98, 14);

		JRadioButton radioButton = new JRadioButton("Administrador");
		radioButton.setBounds(141, 242, 116, 23);
		radioButton.setToolTipText("");

		JRadioButton radioButton_1 = new JRadioButton("Tecnico");
		radioButton_1.setBounds(141, 272, 77, 23);

		JButton button = new JButton("Buscar");
		button.setBounds(165, 315, 92, 23);

		JButton button_1 = new JButton("Quitar Filtros");
		button_1.setBounds(31, 315, 116, 23);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(275, 73, 574, 339);
		
		JButton btnDarDeAlta = new JButton("Dar de alta usuario");
		btnDarDeAlta.setBounds(79, 369, 123, 23);

		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Juan", "Perez", "Administrador", "juan.perez@gmail.com"},
				{"Pedro", "Martinez", "T\u00E9cnico", ""},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Nombre", "Apellidos", "Tipo de usuario", "Correo"
			}
		));
		table.getColumnModel().getColumn(2).setPreferredWidth(85);
		for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
			TableColumn t = table.getColumnModel().getColumn(i);
			EditorDeTablas cellEditor = new EditorDeTablas();
			t.setCellEditor(cellEditor);
		}
		scrollPane.setViewportView(table);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(31, 11, 273, 30);
		
		JButton btnEquipos = new JButton("Equipos");
		toolBar.add(btnEquipos);
		
		JButton btnPrestamos = new JButton("Prestamos");
		toolBar.add(btnPrestamos);
		
		JButton btnHistorial = new JButton("Historial");
		toolBar.add(btnHistorial);
		
		JButton btnAlmacen = new JButton("Almacen");
		toolBar.add(btnAlmacen);
		contentPane.setLayout(null);
		contentPane.add(label);
		contentPane.add(textField);
		contentPane.add(label_3);
		contentPane.add(radioButton_1);
		contentPane.add(radioButton);
		contentPane.add(label_2);
		contentPane.add(label_1);
		contentPane.add(textField_1);
		contentPane.add(textField_2);
		contentPane.add(btnDarDeAlta);
		contentPane.add(button_1);
		contentPane.add(button);
		contentPane.add(scrollPane);
		contentPane.add(toolBar);
		btnAlmacen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
	}
}
