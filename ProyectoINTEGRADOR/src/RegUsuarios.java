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

public class RegUsuarios extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton btnCancelar;
	private JButton button;
	private TbUsers pantalla;


	/**
	 * Create the frame.
	 */
	public RegUsuarios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 788, 436);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Nombre:");
		label.setBounds(113, 117, 61, 14);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(184, 114, 86, 20);
		contentPane.add(textField);
		
		JLabel label_1 = new JLabel("Apellidos:");
		label_1.setBounds(113, 171, 66, 14);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(184, 168, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(170, 223, 86, 20);
		contentPane.add(textField_2);
		
		JLabel label_2 = new JLabel("Email:");
		label_2.setBounds(113, 226, 48, 14);
		contentPane.add(label_2);
		
		JRadioButton radioButton = new JRadioButton("Administrador");
		radioButton.setBackground(new Color(135, 206, 235));
		radioButton.setBounds(465, 113, 115, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("T\u00E9cnico");
		radioButton_1.setBackground(new Color(135, 206, 235));
		radioButton_1.setBounds(465, 149, 77, 23);
		contentPane.add(radioButton_1);
		
		ButtonGroup group1 = new ButtonGroup();
		group1.add(radioButton);
		group1.add(radioButton_1);
		
		if(radioButton.isSelected()) {
			radioButton_1.setEnabled(false);
		} else if(radioButton_1.isSelected()) {
			radioButton.setEnabled(true);
		}
		
		JLabel label_3 = new JLabel("Tipo de Usuario:");
		label_3.setBounds(349, 136, 95, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Contrase\u00F1a:");
		label_4.setBounds(349, 197, 77, 14);
		contentPane.add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(440, 194, 86, 20);
		contentPane.add(textField_3);
		
		JLabel label_5 = new JLabel("Repetir Contrase\u00F1a:");
		label_5.setBounds(349, 239, 115, 14);
		contentPane.add(label_5);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(476, 236, 86, 20);
		contentPane.add(textField_4);
		
		button = new JButton("Registrar");
		button.setBounds(673, 356, 89, 23);
		contentPane.add(button);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(507, 356, 89, 23);
		contentPane.add(btnCancelar);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				pantalla=new TbUsers();
				pantalla.setVisible(true);
			}
		});
	}
	public void setPantalla(TbUsers user){
		this.pantalla = user;
	}
}
