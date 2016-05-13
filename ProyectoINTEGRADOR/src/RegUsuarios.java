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
		
		JLabel label = new JLabel("Nombre:");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("Apellidos:");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel label_2 = new JLabel("Email:");
		
		JRadioButton radioButton = new JRadioButton("Administrador");
		radioButton.setBackground(new Color(135, 206, 235));
		
		JRadioButton radioButton_1 = new JRadioButton("T\u00E9cnico");
		radioButton_1.setBackground(new Color(135, 206, 235));
		
		ButtonGroup group1 = new ButtonGroup();
		group1.add(radioButton);
		group1.add(radioButton_1);
		
		if(radioButton.isSelected()) {
			radioButton_1.setEnabled(false);
		} else if(radioButton_1.isSelected()) {
			radioButton.setEnabled(true);
		}
		
		JLabel label_3 = new JLabel("Tipo de Usuario:");
		
		JLabel label_4 = new JLabel("Contrase\u00F1a:");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel label_5 = new JLabel("Repetir Contrase\u00F1a:");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		button = new JButton("Registrar");
		
		btnCancelar = new JButton("Cancelar");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(108)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(195)
					.addComponent(radioButton, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(108)
					.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(79)
					.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
					.addGap(21)
					.addComponent(radioButton_1, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(344)
					.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(108)
					.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(93)
					.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(502)
					.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGap(77)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(108)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(4)
							.addComponent(label))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(1)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(radioButton))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(35)
							.addComponent(label_1))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(32)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_3)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(13)
							.addComponent(radioButton_1)))
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(label_4))
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(9)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(label_2))
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(16)
							.addComponent(label_5))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(13)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(100)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnCancelar)
						.addComponent(button)))
		);
		contentPane.setLayout(gl_contentPane);
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
