package Vista;

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

import Controlador.TbUsers_Controlador;

import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

import javax.swing.JToolBar;

import java.awt.Color;

import javax.swing.UIManager;

import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

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
	private TbUsers_Controlador tbUsCont = new TbUsers_Controlador();

	/**
	 * Create the frame.
	 */
	public TbUsers() {
		setTitle("Usuarios");
		setResizable(false);
		setBackground(new Color(135, 206, 235));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 901, 467);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		textField = new JTextField();
		textField.setColumns(10);

		JLabel label = new JLabel("Nombre");

		JLabel label_1 = new JLabel("Apellidos");

		textField_1 = new JTextField();
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setColumns(10);

		JLabel label_2 = new JLabel("Correo");

		JLabel label_3 = new JLabel("Tipo de usuario");

		JRadioButton radioButton = new JRadioButton("Administrador");
		radioButton.setBackground(new Color(135, 206, 235));

		JRadioButton radioButton_1 = new JRadioButton("Tecnico");
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

		JButton button_1 = new JButton("Quitar Filtros");

		JScrollPane scrollPane = new JScrollPane();

		JButton btnDarDeAlta = new JButton("Dar de alta usuario");
		btnDarDeAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				pantalla5 = new RegUsuarios();
				pantalla5.setVisible(true);
			}
		});

		table = new JTable();
		table.setModel(new DefaultTableModel(tbUsCont.array,
				new String[] { "Correo", "Tipo de usuario", "Nombre", "Apellidos" }));
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
		
		JButton btnUsuarios = new JButton("Usuarios");
		btnUsuarios.setEnabled(false);
		toolBar.add(btnUsuarios);
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

		JButton button_2 = new JButton("Cerrar sesi\u00F3n");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(26)
					.addComponent(toolBar, GroupLayout.PREFERRED_SIZE, 345, GroupLayout.PREFERRED_SIZE)
					.addGap(222)
					.addComponent(btnDarDeAlta, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
					.addGap(20)
					.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(3)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(89)
							.addComponent(radioButton, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(89)
							.addComponent(radioButton_1, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(40)
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(23)
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)))
					.addGap(8)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 654, GroupLayout.PREFERRED_SIZE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(24)
							.addComponent(btnDarDeAlta))
						.addComponent(button_2)
						.addComponent(toolBar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(40)
							.addComponent(label)
							.addGap(4)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(label_1)
							.addGap(11)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(5)
							.addComponent(label_2)
							.addGap(11)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(radioButton)
							.addGap(6)
							.addComponent(label_3)
							.addGap(3)
							.addComponent(radioButton_1)
							.addGap(26)
							.addComponent(button)
							.addGap(19)
							.addComponent(button_1))
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 355, GroupLayout.PREFERRED_SIZE)))
		);
		contentPane.setLayout(gl_contentPane);
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
