import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextArea;

public class RegEquipos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextArea textAreaNotas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegEquipos frame = new RegEquipos();
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
	public RegEquipos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 519);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Tipo equipo");
		label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label.setBounds(84, 56, 84, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("ID");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_1.setBounds(122, 27, 46, 14);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(178, 25, 86, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(178, 56, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(178, 86, 86, 20);
		contentPane.add(textField_2);
		
		JLabel label_2 = new JLabel("Marca");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_2.setBounds(122, 87, 46, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Modelo");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_3.setBounds(122, 117, 46, 14);
		contentPane.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(178, 116, 86, 20);
		contentPane.add(textField_3);
		
		JRadioButton radioButton = new JRadioButton("Si");
		radioButton.setBackground(new Color(135, 206, 235));
		radioButton.setBounds(168, 159, 46, 20);
		contentPane.add(radioButton);
		
		JLabel label_4 = new JLabel("Disponibilidad");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_4.setBounds(84, 162, 79, 14);
		contentPane.add(label_4);
		
		JRadioButton radioButton_1 = new JRadioButton("No");
		radioButton_1.setBackground(new Color(135, 206, 235));
		radioButton_1.setBounds(225, 159, 55, 20);
		contentPane.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("No");
		radioButton_2.setBackground(new Color(135, 206, 235));
		radioButton_2.setBounds(225, 191, 55, 20);
		contentPane.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("Si");
		radioButton_3.setBackground(new Color(135, 206, 235));
		radioButton_3.setBounds(168, 191, 46, 20);
		contentPane.add(radioButton_3);
		
		JLabel label_5 = new JLabel("Prestable");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_5.setBounds(113, 194, 55, 14);
		contentPane.add(label_5);
		
		JRadioButton radioButton_4 = new JRadioButton("Si");
		radioButton_4.setBackground(new Color(135, 206, 235));
		radioButton_4.setBounds(369, 188, 46, 20);
		contentPane.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("Si");
		radioButton_5.setBackground(new Color(135, 206, 235));
		radioButton_5.setBounds(369, 159, 46, 20);
		contentPane.add(radioButton_5);
		
		JLabel label_13 = new JLabel("Resoluci\u00F3n");
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_13.setBounds(329, 119, 60, 14);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("Pulgadas");
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_14.setBounds(323, 87, 52, 14);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("Roseta");
		label_15.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_15.setBounds(344, 58, 46, 14);
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("SSOO");
		label_16.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_16.setBounds(351, 27, 39, 14);
		contentPane.add(label_16);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(390, 24, 86, 20);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(390, 54, 86, 20);
		contentPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(390, 85, 86, 20);
		contentPane.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(390, 116, 86, 20);
		contentPane.add(textField_15);
		
		JRadioButton radioButton_6 = new JRadioButton("No");
		radioButton_6.setBackground(new Color(135, 206, 235));
		radioButton_6.setBounds(421, 159, 55, 20);
		contentPane.add(radioButton_6);
		
		JRadioButton radioButton_7 = new JRadioButton("No");
		radioButton_7.setBackground(new Color(135, 206, 235));
		radioButton_7.setBounds(421, 188, 55, 20);
		contentPane.add(radioButton_7);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(585, 375, 86, 20);
		contentPane.add(textField_16);
		
		JLabel label_17 = new JLabel("Almacenamiento");
		label_17.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_17.setBounds(484, 378, 91, 14);
		contentPane.add(label_17);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(585, 338, 86, 20);
		contentPane.add(textField_17);
		
		JLabel label_18 = new JLabel("Modelo");
		label_18.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_18.setBounds(543, 341, 46, 14);
		contentPane.add(label_18);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(585, 297, 86, 20);
		contentPane.add(textField_18);
		
		JLabel label_19 = new JLabel("Marca");
		label_19.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_19.setBounds(546, 299, 43, 14);
		contentPane.add(label_19);
		
		JLabel label_20 = new JLabel("TARJETA GR\u00C1FICA");
		label_20.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_20.setBounds(533, 269, 122, 14);
		contentPane.add(label_20);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(585, 211, 86, 20);
		contentPane.add(textField_19);
		
		JLabel label_21 = new JLabel("Velocidad");
		label_21.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_21.setBounds(514, 213, 60, 14);
		contentPane.add(label_21);
		
		JLabel label_22 = new JLabel("Capacidad");
		label_22.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_22.setBounds(514, 180, 60, 14);
		contentPane.add(label_22);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(585, 178, 86, 20);
		contentPane.add(textField_20);
		
		JLabel label_23 = new JLabel("Velocidad");
		label_23.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_23.setBounds(514, 88, 65, 14);
		contentPane.add(label_23);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(585, 85, 86, 20);
		contentPane.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(585, 54, 86, 20);
		contentPane.add(textField_22);
		
		JLabel label_24 = new JLabel("Modelo");
		label_24.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_24.setBounds(529, 57, 60, 14);
		contentPane.add(label_24);
		
		JLabel label_25 = new JLabel("PROCESADOR");
		label_25.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_25.setBounds(561, 27, 94, 14);
		contentPane.add(label_25);
		
		JLabel label_26 = new JLabel("MEMORIA RAM ");
		label_26.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_26.setBounds(561, 153, 110, 14);
		contentPane.add(label_26);
		
		JButton button = new JButton("Dar de alta equipo");
		button.setFont(new Font("Times New Roman", Font.BOLD, 13));
		button.setBounds(484, 420, 171, 37);
		contentPane.add(button);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(364, 427, 89, 23);
		contentPane.add(btnCancelar);
		
		textAreaNotas = new JTextArea();
		textAreaNotas.setLineWrap(true);
		textAreaNotas.setBounds(138, 370, 183, 80);
		contentPane.add(textAreaNotas);
		
		JLabel label_28 = new JLabel("Notas");
		label_28.setBounds(99, 399, 29, 25);
		contentPane.add(label_28);
		
		JLabel label_27 = new JLabel("Tipo de uso");
		label_27.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_27.setBounds(100, 220, 65, 14);
		contentPane.add(label_27);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(178, 218, 86, 20);
		contentPane.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(178, 249, 86, 20);
		contentPane.add(textField_24);
		
		JLabel label_29 = new JLabel("Estado");
		label_29.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_29.setBounds(132, 251, 46, 14);
		contentPane.add(label_29);
		
		JLabel label_30 = new JLabel("Edificio");
		label_30.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_30.setBounds(132, 280, 46, 14);
		contentPane.add(label_30);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(178, 280, 86, 20);
		contentPane.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(178, 311, 86, 20);
		contentPane.add(textField_26);
		
		JLabel label_31 = new JLabel("Sala");
		label_31.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_31.setBounds(139, 313, 29, 14);
		contentPane.add(label_31);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(390, 218, 86, 20);
		contentPane.add(textField_27);
		
		JLabel label_32 = new JLabel("Resoluci\u00F3n c\u00E1mara");
		label_32.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_32.setBounds(279, 220, 110, 14);
		contentPane.add(label_32);
		
		JLabel label_33 = new JLabel("Tipos de conexi\u00F3n");
		label_33.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_33.setBounds(279, 251, 106, 14);
		contentPane.add(label_33);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(390, 249, 86, 20);
		contentPane.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(390, 280, 86, 20);
		contentPane.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(390, 307, 86, 20);
		contentPane.add(textField_30);
		
		JLabel label_34 = new JLabel("Almacenamiento");
		label_34.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_34.setBounds(289, 285, 100, 30);
		contentPane.add(label_34);
		
		JLabel label_6 = new JLabel("Giroscopio");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_6.setBounds(299, 161, 69, 14);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("NFC");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_7.setBounds(323, 191, 29, 14);
		contentPane.add(label_7);
	}
}
