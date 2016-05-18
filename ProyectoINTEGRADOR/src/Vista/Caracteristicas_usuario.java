package Vista;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Caracteristicas_usuario extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre_Cusuario;
	private JTextField textApellidos_Cusuario;
	private JTextField textEmail_Cusuario;
	private JTextField textContraseña_Cusuario;
	private JTextField textReContraseña_Cusuario;
	private TbUsers pantalla;


	/**
	 * Create the frame.
	 */
	public Caracteristicas_usuario() {
		setTitle("Caracteristicas Usuario");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 674, 433);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Nombre:");
		label.setBounds(50, 80, 54, 14);
		contentPane.add(label);
		
		textNombre_Cusuario = new JTextField();
		textNombre_Cusuario.setColumns(10);
		textNombre_Cusuario.setBounds(123, 77, 86, 20);
		contentPane.add(textNombre_Cusuario);
		
		JLabel label_1 = new JLabel("Apellidos:");
		label_1.setBounds(50, 148, 59, 14);
		contentPane.add(label_1);
		
		textApellidos_Cusuario = new JTextField();
		textApellidos_Cusuario.setColumns(10);
		textApellidos_Cusuario.setBounds(123, 145, 86, 20);
		contentPane.add(textApellidos_Cusuario);
		
		JLabel label_2 = new JLabel("Email:");
		label_2.setBounds(50, 214, 41, 14);
		contentPane.add(label_2);
		
		textEmail_Cusuario = new JTextField();
		textEmail_Cusuario.setColumns(10);
		textEmail_Cusuario.setBounds(101, 211, 86, 20);
		contentPane.add(textEmail_Cusuario);
		
		JRadioButton radioButtonAdministrador_Cusuario = new JRadioButton("Administrador");
		radioButtonAdministrador_Cusuario.setBackground(new Color(135, 206, 235));
		radioButtonAdministrador_Cusuario.setBounds(404, 57, 116, 23);
		contentPane.add(radioButtonAdministrador_Cusuario);
		
		JRadioButton radioButtonTecnico_Cusuario = new JRadioButton("T\u00E9cnico");
		radioButtonTecnico_Cusuario.setBackground(new Color(135, 206, 235));
		radioButtonTecnico_Cusuario.setBounds(404, 98, 86, 23);
		contentPane.add(radioButtonTecnico_Cusuario);
		
		ButtonGroup group1 = new ButtonGroup();
		group1.add(radioButtonAdministrador_Cusuario);
		group1.add(radioButtonTecnico_Cusuario);
		
		if(radioButtonAdministrador_Cusuario.isSelected()) {
			radioButtonTecnico_Cusuario.setEnabled(false);
		} else if(radioButtonAdministrador_Cusuario.isSelected()) {
			radioButtonTecnico_Cusuario.setEnabled(true);
		}
		
		JLabel label_3 = new JLabel("Tipo de Usuario:");
		label_3.setBounds(297, 80, 91, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Contrase\u00F1a:");
		label_4.setBounds(297, 159, 73, 14);
		contentPane.add(label_4);
		
		textContraseña_Cusuario = new JTextField();
		textContraseña_Cusuario.setColumns(10);
		textContraseña_Cusuario.setBounds(380, 156, 86, 20);
		contentPane.add(textContraseña_Cusuario);
		
		textReContraseña_Cusuario = new JTextField();
		textReContraseña_Cusuario.setColumns(10);
		textReContraseña_Cusuario.setBounds(434, 211, 86, 20);
		contentPane.add(textReContraseña_Cusuario);
		
		JLabel label_5 = new JLabel("Repetir Contrase\u00F1a:");
		label_5.setBounds(297, 214, 127, 14);
		contentPane.add(label_5);
		
		JButton btnModificar_Cusuario = new JButton("Modificar");
		btnModificar_Cusuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnModificar_Cusuario.setBounds(507, 305, 89, 23);
		contentPane.add(btnModificar_Cusuario);
		
		JButton btnDarDeBaja_Cusuario = new JButton("Dar de baja");
		btnDarDeBaja_Cusuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDarDeBaja_Cusuario.setBounds(240, 305, 104, 23);
		contentPane.add(btnDarDeBaja_Cusuario);
		
		JButton btnCancelar_Cusuario = new JButton("Cancelar");
		btnCancelar_Cusuario.setBounds(377, 305, 89, 23);
		btnCancelar_Cusuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				pantalla = new TbUsers();
				pantalla.setVisible(true);
			}
		});
		contentPane.add(btnCancelar_Cusuario);
	}
	
	public void setPantalla(TbUsers Pantalla){
		this.pantalla = Pantalla;
	}
	
}
