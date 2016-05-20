package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import Controlador.RegUsuarios_Controlador;

public class RegUsuarios extends JFrame {

	private JPanel contentPane;
	private JTextField tFNombre;
	private JTextField tFApellidos;
	private JTextField tFEmail;
	private JTextField tFPassword;
	private JTextField tFPassword2;
	private JButton btnCancelar;
	private JButton btnRegistrar;
	private TbUsers pantalla;
	private JRadioButton rBAdmin;
	private JRadioButton rBTecnico;
	private RegUsuarios_Controlador registro;

	/**
	 * Create the frame.
	 */
	public RegUsuarios() {
		setTitle("Registro de Usuarios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 788, 436);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel label = new JLabel("Nombre:");

		tFNombre = new JTextField();
		tFNombre.setColumns(10);

		JLabel label_1 = new JLabel("Apellidos:");

		tFApellidos = new JTextField();
		tFApellidos.setColumns(10);

		tFEmail = new JTextField();
		tFEmail.setColumns(10);

		JLabel label_2 = new JLabel("Email:");

		rBAdmin = new JRadioButton("Administrador");
		rBAdmin.setBackground(new Color(135, 206, 235));

		rBTecnico = new JRadioButton("T\u00E9cnico");
		rBTecnico.setBackground(new Color(135, 206, 235));

		ButtonGroup group1 = new ButtonGroup();
		group1.add(rBAdmin);
		group1.add(rBTecnico);

		if (rBAdmin.isSelected()) {
			rBTecnico.setEnabled(false);
		} else if (rBTecnico.isSelected()) {
			rBAdmin.setEnabled(true);
		}

		JLabel label_3 = new JLabel("Tipo de Usuario:");

		JLabel label_4 = new JLabel("Contrase\u00F1a:");

		tFPassword = new JTextField();
		tFPassword.setColumns(10);

		JLabel label_5 = new JLabel("Repetir Contrase\u00F1a:");

		tFPassword2 = new JTextField();
		tFPassword2.setColumns(10);

		btnRegistrar = new JButton("Registrar");

		btnCancelar = new JButton("Cancelar");

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane
				.setHorizontalGroup(
						gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_contentPane.createSequentialGroup().addGap(108)
														.addComponent(label, GroupLayout.PREFERRED_SIZE, 61,
																GroupLayout.PREFERRED_SIZE)
														.addGap(10)
														.addComponent(tFNombre, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addGap(195).addComponent(rBAdmin, GroupLayout.PREFERRED_SIZE,
																115, GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_contentPane.createSequentialGroup().addGap(108)
														.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 66,
																GroupLayout.PREFERRED_SIZE)
														.addGap(5)
														.addComponent(tFApellidos, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addGap(79)
														.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 95,
																GroupLayout.PREFERRED_SIZE)
														.addGap(21).addComponent(rBTecnico, GroupLayout.PREFERRED_SIZE,
																77, GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_contentPane.createSequentialGroup().addGap(344)
														.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 77,
																GroupLayout.PREFERRED_SIZE)
														.addGap(14).addComponent(tFPassword, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_contentPane.createSequentialGroup().addGap(108)
														.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 48,
																GroupLayout.PREFERRED_SIZE)
														.addGap(9)
														.addComponent(tFEmail, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addGap(93)
														.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 115,
																GroupLayout.PREFERRED_SIZE)
														.addGap(12)
														.addComponent(tFPassword2, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_contentPane.createSequentialGroup().addGap(525)
														.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 89,
																GroupLayout.PREFERRED_SIZE)
														.addGap(6).addComponent(btnRegistrar,
																GroupLayout.PREFERRED_SIZE, 89,
																GroupLayout.PREFERRED_SIZE)))
										.addGap(67)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addGap(108)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(4).addComponent(label))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(1).addComponent(tFNombre,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(rBAdmin))
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(35).addComponent(label_1))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(32).addComponent(tFApellidos,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_3)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(13).addComponent(rBTecnico)))
				.addGap(6)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(3).addComponent(label_4))
						.addComponent(tFPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addGap(9)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(3).addComponent(label_2))
						.addComponent(tFEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(16).addComponent(label_5))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(13).addComponent(tFPassword2,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
				.addGap(100).addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(btnCancelar)
						.addComponent(btnRegistrar))));
		contentPane.setLayout(gl_contentPane);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				pantalla = new TbUsers();
				pantalla.setVisible(true);
			}
		});
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (tFPassword.getText().equals(tFPassword2.getText()) && rBAdmin.isSelected()) {
					registro = new RegUsuarios_Controlador(tFEmail.getText(), tFNombre.getText(), tFApellidos.getText(),
							tFPassword.getText(), rBAdmin.getText());
				} else if (tFPassword.getText().equals(tFPassword2.getText()) && rBTecnico.isSelected()) {
					registro = new RegUsuarios_Controlador(tFEmail.getText(), tFNombre.getText(), tFApellidos.getText(),
							tFPassword.getText(), rBAdmin.getText());
				} else {
					System.out.println("Las contraseñas no coinciden");
				}
			}
		});
	}

	public void setPantalla(TbUsers user) {
		this.pantalla = user;
	}
}
