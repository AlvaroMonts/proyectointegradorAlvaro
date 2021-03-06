package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import Controlador.RegUsuarios_Controlador;

import javax.swing.LayoutStyle.ComponentPlacement;

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
		label.setBounds(113, 117, 61, 14);
		label.setFont(new Font("SansSerif", Font.BOLD, 12));

		tFNombre = new JTextField();
		tFNombre.setBounds(184, 114, 86, 20);
		tFNombre.setColumns(10);

		JLabel label_1 = new JLabel("Apellidos:");
		label_1.setBounds(113, 171, 66, 14);
		label_1.setFont(new Font("SansSerif", Font.BOLD, 12));

		tFApellidos = new JTextField();
		tFApellidos.setBounds(184, 168, 86, 20);
		tFApellidos.setColumns(10);

		tFEmail = new JTextField();
		tFEmail.setBounds(178, 235, 115, 20);
		tFEmail.setColumns(10);

		JLabel label_2 = new JLabel("Email:");
		label_2.setSize(61, 18);
		label_2.setLocation(113, 235);
		label_2.setFont(new Font("SansSerif", Font.BOLD, 12));

		rBAdmin = new JRadioButton("Administrador");
		rBAdmin.setLocation(450, 133);
		rBAdmin.setSize(107, 20);
		rBAdmin.setFont(new Font("SansSerif", Font.BOLD, 12));
		rBAdmin.setBackground(new Color(135, 206, 235));

		rBTecnico = new JRadioButton("T\u00E9cnico");
		rBTecnico.setBounds(570, 133, 86, 20);
		rBTecnico.setFont(new Font("SansSerif", Font.BOLD, 12));
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
		label_3.setBounds(349, 136, 95, 14);
		label_3.setFont(new Font("SansSerif", Font.BOLD, 12));

		JLabel label_4 = new JLabel("Contrase\u00F1a:");
		label_4.setBounds(367, 200, 77, 14);
		label_4.setFont(new Font("SansSerif", Font.BOLD, 12));

		tFPassword = new JPasswordField();
		tFPassword.setBounds(476, 197, 86, 20);
		tFPassword.setColumns(10);

		JLabel label_5 = new JLabel("Repetir Contrase\u00F1a:");
		label_5.setBounds(349, 251, 115, 14);
		label_5.setFont(new Font("SansSerif", Font.BOLD, 12));

		tFPassword2 = new JPasswordField();
		tFPassword2.setBounds(476, 248, 86, 20);
		tFPassword2.setColumns(10);

		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(625, 368, 89, 23);
		btnRegistrar.setFont(new Font("SansSerif", Font.BOLD, 12));

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(530, 368, 89, 23);
		btnCancelar.setFont(new Font("SansSerif", Font.BOLD, 12));
		contentPane.setLayout(null);
		contentPane.add(label);
		contentPane.add(tFNombre);
		contentPane.add(rBAdmin);
		contentPane.add(label_1);
		contentPane.add(tFApellidos);
		contentPane.add(label_3);
		contentPane.add(rBTecnico);
		contentPane.add(btnCancelar);
		contentPane.add(btnRegistrar);
		contentPane.add(label_4);
		contentPane.add(tFPassword);
		contentPane.add(label_2);
		contentPane.add(tFEmail);
		contentPane.add(label_5);
		contentPane.add(tFPassword2);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				pantalla.setVisible(true);
			}
		});
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (tFPassword.getText().equals(tFPassword2.getText())
						&& rBAdmin.isSelected()) {
					registro.ComprobarAlta(tFEmail.getText(),
							tFNombre.getText(), tFApellidos.getText(),
							tFPassword.getText(), rBAdmin.getText());
				} else if (tFPassword.getText().equals(tFPassword2.getText())
						&& rBTecnico.isSelected()) {
					registro.ComprobarAlta(tFEmail.getText(),
							tFNombre.getText(), tFApellidos.getText(),
							tFPassword.getText(), rBTecnico.getText());
				} else {
					System.out.println("Las contraseņas no coinciden");
				}
			}
		});
	}

	public void setPantalla(TbUsers user) {
		this.pantalla = user;
	}

	public void setRegUs(RegUsuarios_Controlador regUsuarios_Controlador) {
		this.registro = regUsuarios_Controlador;
	}
}
