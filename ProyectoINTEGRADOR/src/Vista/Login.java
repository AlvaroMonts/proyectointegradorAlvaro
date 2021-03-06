package Vista;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.Color;
import Controlador.Login_Controlador;

public class Login extends JFrame {
	private JPanel contentPane;
	private JTextField txtEmail;
	private JButton btnLogin;
	private JPasswordField passwordField;
	private JLabel Imagen;
	private JLabel lblEmail;
	private JLabel lblContraseņa;
	private TbEquipos pantalla;
	private Login_Controlador logCont;
	private int intentos = 0;

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("Login");
		setResizable(false);
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 802, 578);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// int intentos;
		JFrame pop_up = new JFrame();
		btnLogin = new JButton("Log-in");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (logCont.realizarRegistro(txtEmail.getText(),
						passwordField.getText())) {
					setVisible(false);
					pantalla.setVisible(true);
				} else {
					intentos++;
					JOptionPane.showMessageDialog(pop_up,
							"El Email y la contraseņa no son correctos, te quedan " + (3 - intentos)+ " intentos", "Atencion",
							JOptionPane.WARNING_MESSAGE);
				}
				if (intentos == 3)
					System.exit(0);
			}
		});

		btnLogin.setBounds(332, 462, 116, 29);
		contentPane.add(btnLogin);

		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(249, 337, 265, 29);
		contentPane.add(txtEmail);

		passwordField = new JPasswordField();
		passwordField.setBounds(270, 406, 227, 29);
		contentPane.add(passwordField);

		lblContraseņa = new JLabel("Contrase\u00F1a");
		lblContraseņa.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblContraseņa.setBounds(340, 377, 95, 20);
		contentPane.add(lblContraseņa);

		lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblEmail.setBounds(358, 306, 50, 20);
		contentPane.add(lblEmail);

		Imagen = new JLabel("");
		Imagen.setIcon(new ImageIcon("utad.png"));
		Imagen.setBounds(42, 11, 703, 256);
		contentPane.add(Imagen);
	}

	public void setPantalla(TbEquipos pantalla) {
		this.pantalla = pantalla;
	}

	public void setLogin_Cont(Login_Controlador pantalla) {
		this.logCont = pantalla;
	}
}