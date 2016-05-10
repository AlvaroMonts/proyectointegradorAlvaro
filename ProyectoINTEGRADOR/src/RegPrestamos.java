import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class RegPrestamos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegPrestamos frame = new RegPrestamos();
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
	public RegPrestamos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 892, 470);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFechaDePrestamo = new JLabel("Fecha inicio");
		lblFechaDePrestamo.setBounds(123, 110, 101, 14);
		contentPane.add(lblFechaDePrestamo);
		
		JLabel lblNewLabel = new JLabel("Fecha devolucion");
		lblNewLabel.setBounds(123, 156, 84, 14);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("Equipo Prestado");
		label.setBounds(123, 203, 114, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("C\u00F3digo del Equipo");
		label_1.setBounds(445, 110, 122, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Destino del pr\u00E9stamo");
		label_2.setBounds(445, 156, 122, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Responsable");
		label_3.setBounds(445, 203, 86, 14);
		contentPane.add(label_3);
		
		textField = new JTextField();
		textField.setBounds(182, 107, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(217, 153, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(234, 200, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(568, 107, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(580, 153, 86, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(580, 200, 86, 20);
		contentPane.add(textField_5);
		
		JButton btnRegistrarPrestamo = new JButton("Registrar prestamo");
		btnRegistrarPrestamo.setBounds(707, 397, 125, 23);
		contentPane.add(btnRegistrarPrestamo);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(542, 385, 89, 23);
		contentPane.add(btnCancelar);
	}
}
