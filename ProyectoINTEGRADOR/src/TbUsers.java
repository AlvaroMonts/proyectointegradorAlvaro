import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

import javax.swing.JToolBar;

import java.awt.Color;
import javax.swing.UIManager;

public class TbUsers extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private TbEquipos pantalla1;
	private TbHistorial pantalla2;
	private TbAlmacen pantalla3;
	private TbPrestamos pantalla4;
	private RegUsuarios pantalla5;
	private Caracteristicas_usuario caracUsuario;
	private int contador = 0;

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
		textField.setBounds(8, 120, 103, 20);
		textField.setColumns(10);

		JLabel label = new JLabel("Nombre");
		label.setBounds(13, 102, 50, 14);

		JLabel label_1 = new JLabel("Apellidos");
		label_1.setBounds(13, 151, 55, 14);

		textField_1 = new JTextField();
		textField_1.setBounds(13, 176, 106, 20);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(13, 226, 102, 20);
		textField_2.setColumns(10);

		JLabel label_2 = new JLabel("Correo");
		label_2.setBounds(13, 201, 50, 14);

		JLabel label_3 = new JLabel("Tipo de usuario");
		label_3.setBounds(13, 286, 98, 14);

		JRadioButton radioButton = new JRadioButton("Administrador");
		radioButton.setBounds(97, 257, 116, 23);
		radioButton.setBackground(new Color(135, 206, 235));

		JRadioButton radioButton_1 = new JRadioButton("Tecnico");
		radioButton_1.setBounds(97, 303, 77, 23);
		radioButton_1.setBackground(new Color(135, 206, 235));

		ButtonGroup group1 = new ButtonGroup();
		group1.add(radioButton);
		group1.add(radioButton_1);

		if (radioButton.isSelected()) {
			radioButton_1.setEnabled(false);
		} else if (radioButton_1.isSelected()) {
			radioButton.setEnabled(true);
		}

		JButton button = new JButton("Buscar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(48, 352, 92, 23);

		JButton button_1 = new JButton("Quitar Filtros");
		button_1.setBounds(31, 394, 116, 23);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(221, 62, 654, 355);

		JButton btnDarDeAlta = new JButton("Dar de alta usuario");
		btnDarDeAlta.setBounds(598, 35, 151, 23);
		btnDarDeAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				pantalla5 = new RegUsuarios();
				pantalla5.setVisible(true);
			}
		});

		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] { { "Juan", "Perez", "Administrador", "juan.perez@gmail.com" },
						{ "Pedro", "Martinez", "T\u00E9cnico", "pedro.martinez@gmail.com" },
						{ "Isabel", "Hernandez", "Administrador", "isabel.hernandez@gmail.com" },
						{ "Miguel", "Figueroa", "T\u00E9cnico", "miguel.figueroa@gmail.com" },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, },
				new String[] { "Nombre", "Apellidos", "Tipo de usuario", "Correo" }));
		table.getColumnModel().getColumn(2).setPreferredWidth(85);
		for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
			TableColumn t = table.getColumnModel().getColumn(i);
			EditorDeTablas cellEditor = new EditorDeTablas();
			t.setCellEditor(cellEditor);
		}
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
					caracUsuario = new Caracteristicas_usuario();
					caracUsuario.setVisible(true);
				}
			}
		});

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(31, 11, 273, 30);
		toolBar.setBackground(UIManager.getColor("Button.background"));

		JButton btnEquipos = new JButton("Equipos");
		btnEquipos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				pantalla1 = new TbEquipos();
				pantalla1.setVisible(true);
			}
		});
		btnEquipos.setBackground(UIManager.getColor("Button.background"));
		toolBar.add(btnEquipos);

		JButton btnPrestamos = new JButton("Prestamos");
		btnPrestamos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				pantalla4 = new TbPrestamos();
				pantalla4.setVisible(true);
			}
		});
		btnPrestamos.setBackground(UIManager.getColor("Button.background"));
		toolBar.add(btnPrestamos);

		JButton btnHistorial = new JButton("Historial");
		btnHistorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				pantalla2 = new TbHistorial();
				pantalla2.setVisible(true);
			}
		});
		btnHistorial.setBackground(UIManager.getColor("Button.background"));
		toolBar.add(btnHistorial);

		JButton btnAlmacen = new JButton("Almacen");
		btnAlmacen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				pantalla3 = new TbAlmacen();
				pantalla3.setVisible(true);
			}
		});
		btnAlmacen.setBackground(UIManager.getColor("Button.background"));
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
		
		JButton button_2 = new JButton("Cerrar sesi\u00F3n");
		button_2.setBounds(769, 11, 106, 23);
		contentPane.add(button_2);
		btnAlmacen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
	}

	public void setEquipos(TbEquipos Pantalla1) {
		this.pantalla1 = Pantalla1;
	}

	public void setHistorial(TbHistorial Pantalla2) {
		this.pantalla2 = Pantalla2;
	}

	public void setAlmacen(TbAlmacen Pantalla3) {
		this.pantalla3 = Pantalla3;
	}

	public void setPrestamos(TbPrestamos Pantalla4) {
		this.pantalla4 = Pantalla4;
	}

	public void setPantalla5(RegUsuarios pantalla5) {
		this.pantalla5 = pantalla5;
	}
}
