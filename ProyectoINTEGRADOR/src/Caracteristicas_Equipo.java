

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JRadioButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextArea;

public class Caracteristicas_Equipo extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldMarcaCarac;
	private JTextField textFieldModeloCarac;
	private JTextField textFieldTipodeusoCarac;
	private JTextField textFieldssoocarac;
	private JTextField textFieldrosetacarac;
	private JTextField textFieldpulgadascarac;
	private JTextField textFieldresolucioncarac;
	private JTextField textFieldmodeloprocecarac;
	private JTextField textFieldvelocidadcarac;
	private JTextField textFieldcapacidadcarac;
	private JTextField textFieldVelocidadcarac;
	private JTextField textFieldresolucioncamaracarac;
	private JTextField textFieldtiposdeconexioncarac;
	private JTextField textFieldalmacenamientocarac;
	private JTextField textFieldestadocarac;
	private JTextField textFieldedificiocarac;
	private JTextField textFieldsalacarac;
	private JTextField textFieldalmacenamiento2carac;
	private JTextField textFieldMarcacarac;
	private JTextField textFieldmodelograficacarac;
	private JTextField textFieldalmacenamientograficacarac;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_21;
	private JRadioButton radioButtondisponibilidadsicarac;
	private JRadioButton radioButtonprestablesicarac;
	private JRadioButton radioButtonprestablenocarac;
	private JRadioButton radioButtonDisponibilidadnocarac;
	private JLabel label_22;
	private JLabel label_20;
	private JLabel label_19;
	private JLabel label_18;
	private JLabel label_17;
	private JRadioButton radioButtongiroscopiosicarac;
	private JRadioButton radioButtongiroscopionocarac;
	private JRadioButton radioButtonnfcsicarac;
	private JRadioButton radioButtonnfcnocarac;
	private JButton btnDarDeBajacarac;
	private JButton btnDescartarCambioscarac;
	private JButton btnGuardarCambioscarac;
	private JLabel label_25;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel label_12;
	private JLabel label_28;
	private JLabel label_13;
	private JLabel label_14;
	private JLabel label_27;
	private JLabel label_15;
	private JLabel label_16;
	private JLabel label_26;
	private TbEquipos pantalla;
	private JLabel label_29;
	private JLabel label_30;
	private JTextField textField;
	private JTextField textField_1;
	private JTextArea textAreaNotas;
	

	/**
	 * Create the frame.
	 */
	public Caracteristicas_Equipo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 514);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textFieldMarcaCarac = new JTextField();
		textFieldMarcaCarac.setColumns(10);
		textFieldMarcaCarac.setBounds(153, 80, 86, 20);
		contentPane.add(textFieldMarcaCarac);

		textFieldModeloCarac = new JTextField();
		textFieldModeloCarac.setColumns(10);
		textFieldModeloCarac.setBounds(153, 110, 86, 20);
		contentPane.add(textFieldModeloCarac);

		textFieldTipodeusoCarac = new JTextField();
		textFieldTipodeusoCarac.setColumns(10);
		textFieldTipodeusoCarac.setBounds(153, 225, 86, 20);
		contentPane.add(textFieldTipodeusoCarac);

		textFieldssoocarac = new JTextField();
		textFieldssoocarac.setColumns(10);
		textFieldssoocarac.setBounds(365, 19, 86, 20);
		contentPane.add(textFieldssoocarac);

		textFieldrosetacarac = new JTextField();
		textFieldrosetacarac.setColumns(10);
		textFieldrosetacarac.setBounds(365, 49, 86, 20);
		contentPane.add(textFieldrosetacarac);

		textFieldpulgadascarac = new JTextField();
		textFieldpulgadascarac.setColumns(10);
		textFieldpulgadascarac.setBounds(365, 80, 86, 20);
		contentPane.add(textFieldpulgadascarac);

		textFieldresolucioncarac = new JTextField();
		textFieldresolucioncarac.setColumns(10);
		textFieldresolucioncarac.setBounds(365, 111, 86, 20);
		contentPane.add(textFieldresolucioncarac);

		textFieldmodeloprocecarac = new JTextField();
		textFieldmodeloprocecarac.setColumns(10);
		textFieldmodeloprocecarac.setBounds(560, 49, 86, 20);
		contentPane.add(textFieldmodeloprocecarac);

		textFieldvelocidadcarac = new JTextField();
		textFieldvelocidadcarac.setColumns(10);
		textFieldvelocidadcarac.setBounds(560, 80, 86, 20);
		contentPane.add(textFieldvelocidadcarac);

		textFieldcapacidadcarac = new JTextField();
		textFieldcapacidadcarac.setColumns(10);
		textFieldcapacidadcarac.setBounds(560, 173, 86, 20);
		contentPane.add(textFieldcapacidadcarac);

		textFieldVelocidadcarac = new JTextField();
		textFieldVelocidadcarac.setColumns(10);
		textFieldVelocidadcarac.setBounds(560, 206, 86, 20);
		contentPane.add(textFieldVelocidadcarac);

		textFieldresolucioncamaracarac = new JTextField();
		textFieldresolucioncamaracarac.setColumns(10);
		textFieldresolucioncamaracarac.setBounds(365, 225, 86, 20);
		contentPane.add(textFieldresolucioncamaracarac);

		textFieldtiposdeconexioncarac = new JTextField();
		textFieldtiposdeconexioncarac.setColumns(10);
		textFieldtiposdeconexioncarac.setBounds(365, 256, 86, 20);
		contentPane.add(textFieldtiposdeconexioncarac);

		textFieldalmacenamientocarac = new JTextField();
		textFieldalmacenamientocarac.setColumns(10);
		textFieldalmacenamientocarac.setBounds(365, 287, 86, 20);
		contentPane.add(textFieldalmacenamientocarac);

		textFieldestadocarac = new JTextField();
		textFieldestadocarac.setColumns(10);
		textFieldestadocarac.setBounds(153, 256, 86, 20);
		contentPane.add(textFieldestadocarac);

		textFieldedificiocarac = new JTextField();
		textFieldedificiocarac.setColumns(10);
		textFieldedificiocarac.setBounds(153, 287, 86, 20);
		contentPane.add(textFieldedificiocarac);

		textFieldsalacarac = new JTextField();
		textFieldsalacarac.setColumns(10);
		textFieldsalacarac.setBounds(153, 318, 86, 20);
		contentPane.add(textFieldsalacarac);

		textFieldalmacenamiento2carac = new JTextField();
		textFieldalmacenamiento2carac.setColumns(10);
		textFieldalmacenamiento2carac.setBounds(365, 314, 86, 20);
		contentPane.add(textFieldalmacenamiento2carac);

		textFieldMarcacarac = new JTextField();
		textFieldMarcacarac.setColumns(10);
		textFieldMarcacarac.setBounds(560, 292, 86, 20);
		contentPane.add(textFieldMarcacarac);

		textFieldmodelograficacarac = new JTextField();
		textFieldmodelograficacarac.setColumns(10);
		textFieldmodelograficacarac.setBounds(560, 333, 86, 20);
		contentPane.add(textFieldmodelograficacarac);

		textFieldalmacenamientograficacarac = new JTextField();
		textFieldalmacenamientograficacarac.setColumns(10);
		textFieldalmacenamientograficacarac.setBounds(560, 370, 86, 20);
		contentPane.add(textFieldalmacenamientograficacarac);

		label_1 = new JLabel("Marca");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_1.setBounds(107, 83, 46, 14);
		contentPane.add(label_1);

		label_2 = new JLabel("Modelo");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_2.setBounds(107, 113, 46, 14);
		contentPane.add(label_2);

		label_3 = new JLabel("Tipo de uso");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_3.setBounds(75, 227, 65, 14);
		contentPane.add(label_3);

		label_4 = new JLabel("Estado");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_4.setBounds(107, 258, 46, 14);
		contentPane.add(label_4);

		label_5 = new JLabel("Edificio");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_5.setBounds(107, 287, 46, 14);
		contentPane.add(label_5);

		label_6 = new JLabel("Sala");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_6.setBounds(114, 320, 29, 14);
		contentPane.add(label_6);

		JLabel label_7 = new JLabel("Resoluci\u00F3n c\u00E1mara");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_7.setBounds(254, 227, 110, 14);
		contentPane.add(label_7);

		JLabel label_8 = new JLabel("Tipos de conexi\u00F3n");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_8.setBounds(254, 258, 106, 14);
		contentPane.add(label_8);

		label_9 = new JLabel("Almacenamiento");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_9.setBounds(264, 292, 100, 30);
		contentPane.add(label_9);

		label_10 = new JLabel("Almacenamiento");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_10.setBounds(459, 373, 91, 14);
		contentPane.add(label_10);

		label_11 = new JLabel("Modelo");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_11.setBounds(518, 336, 46, 14);
		contentPane.add(label_11);

		label_12 = new JLabel("Marca");
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_12.setBounds(521, 294, 43, 14);
		contentPane.add(label_12);

		label_13 = new JLabel("Velocidad");
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_13.setBounds(489, 208, 60, 14);
		contentPane.add(label_13);

		label_14 = new JLabel("Capacidad");
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_14.setBounds(489, 175, 60, 14);
		contentPane.add(label_14);

		label_15 = new JLabel("Velocidad");
		label_15.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_15.setBounds(489, 83, 65, 14);
		contentPane.add(label_15);

		label_16 = new JLabel("Modelo");
		label_16.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_16.setBounds(504, 52, 60, 14);
		contentPane.add(label_16);

		label_17 = new JLabel("Resoluci\u00F3n");
		label_17.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_17.setBounds(304, 114, 60, 14);
		contentPane.add(label_17);

		label_18 = new JLabel("Pulgadas");
		label_18.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_18.setBounds(303, 82, 52, 14);
		contentPane.add(label_18);

		label_19 = new JLabel("Roseta");
		label_19.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_19.setBounds(319, 53, 46, 14);
		contentPane.add(label_19);

		label_20 = new JLabel("SSOO");
		label_20.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_20.setBounds(326, 22, 39, 14);
		contentPane.add(label_20);

		label_21 = new JLabel("Disponibilidad");
		label_21.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_21.setBounds(59, 157, 79, 14);
		contentPane.add(label_21);

		label_22 = new JLabel("Prestable");
		label_22.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_22.setBounds(88, 189, 55, 14);
		contentPane.add(label_22);

		JLabel label_23 = new JLabel("Giroscopio");
		label_23.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_23.setBounds(292, 157, 69, 14);
		contentPane.add(label_23);

		JLabel label_24 = new JLabel("NFC");
		label_24.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_24.setBounds(322, 189, 29, 14);
		contentPane.add(label_24);

		btnDarDeBajacarac = new JButton("Dar de baja equipo");
		btnDarDeBajacarac.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnDarDeBajacarac.setBounds(228, 416, 130, 32);
		contentPane.add(btnDarDeBajacarac);

		label_25 = new JLabel("Notas");
		label_25.setBounds(125, 375, 29, 25);
		contentPane.add(label_25);

		radioButtondisponibilidadsicarac = new JRadioButton("Si");
		radioButtondisponibilidadsicarac.setBackground(new Color(135, 206, 235));
		radioButtondisponibilidadsicarac.setBounds(143, 154, 46, 20);
		contentPane.add(radioButtondisponibilidadsicarac);

		radioButtonprestablesicarac = new JRadioButton("Si");
		radioButtonprestablesicarac.setBackground(new Color(135, 206, 235));
		radioButtonprestablesicarac.setBounds(143, 186, 46, 20);
		contentPane.add(radioButtonprestablesicarac);

		radioButtongiroscopiosicarac = new JRadioButton("Si");
		radioButtongiroscopiosicarac.setBackground(new Color(135, 206, 235));
		radioButtongiroscopiosicarac.setBounds(357, 157, 46, 20);
		contentPane.add(radioButtongiroscopiosicarac);

		radioButtonnfcsicarac = new JRadioButton("Si");
		radioButtonnfcsicarac.setBackground(new Color(135, 206, 235));
		radioButtonnfcsicarac.setBounds(357, 186, 46, 20);
		contentPane.add(radioButtonnfcsicarac);

		radioButtonDisponibilidadnocarac = new JRadioButton("No");
		radioButtonDisponibilidadnocarac.setBackground(new Color(135, 206, 235));
		radioButtonDisponibilidadnocarac.setBounds(200, 154, 51, 20);
		contentPane.add(radioButtonDisponibilidadnocarac);

		radioButtonprestablenocarac = new JRadioButton("No");
		radioButtonprestablenocarac.setBackground(new Color(135, 206, 235));
		radioButtonprestablenocarac.setBounds(200, 186, 51, 20);
		contentPane.add(radioButtonprestablenocarac);

		radioButtongiroscopionocarac = new JRadioButton("No");
		radioButtongiroscopionocarac.setBackground(new Color(135, 206, 235));
		radioButtongiroscopionocarac.setBounds(409, 157, 52, 20);
		contentPane.add(radioButtongiroscopionocarac);

		radioButtonnfcnocarac = new JRadioButton("No");
		radioButtonnfcnocarac.setBackground(new Color(135, 206, 235));
		radioButtonnfcnocarac.setBounds(409, 186, 52, 20);
		contentPane.add(radioButtonnfcnocarac);
		
		ButtonGroup group1 = new ButtonGroup();
		group1.add(radioButtondisponibilidadsicarac);
		group1.add(radioButtonDisponibilidadnocarac);
		
		if(radioButtondisponibilidadsicarac.isSelected()) {
			radioButtonDisponibilidadnocarac.setEnabled(false);
		} else if(radioButtonDisponibilidadnocarac.isSelected()) {
			radioButtondisponibilidadsicarac.setEnabled(true);
		}
		
		ButtonGroup group2 = new ButtonGroup();
		group2.add(radioButtonprestablesicarac);
		group2.add(radioButtonprestablenocarac);
		
		if(radioButtonprestablesicarac.isSelected()) {
			radioButtonprestablenocarac.setEnabled(false);
		} else if(radioButtonprestablenocarac.isSelected()) {
			radioButtonprestablesicarac.setEnabled(true);
		}
		
		ButtonGroup group3 = new ButtonGroup();
		group3.add(radioButtongiroscopiosicarac);
		group3.add(radioButtongiroscopionocarac);
		
		if(radioButtongiroscopiosicarac.isSelected()) {
			radioButtongiroscopionocarac.setEnabled(false);
		} else if(radioButtongiroscopionocarac.isSelected()) {
			radioButtongiroscopiosicarac.setEnabled(true);
		}
		
		ButtonGroup group4 = new ButtonGroup();
		group4.add(radioButtonnfcsicarac);
		group4.add(radioButtonnfcnocarac);
		
		if(radioButtonnfcsicarac.isSelected()) {
			radioButtonnfcnocarac.setEnabled(false);
		} else if(radioButtonnfcnocarac.isSelected()) {
			radioButtonnfcsicarac.setEnabled(true);
		}

		label_26 = new JLabel("PROCESADOR");
		label_26.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_26.setBounds(536, 22, 94, 14);
		contentPane.add(label_26);

		label_27 = new JLabel("MEMORIA RAM ");
		label_27.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_27.setBounds(536, 148, 110, 14);
		contentPane.add(label_27);

		label_28 = new JLabel("TARJETA GR\u00C1FICA");
		label_28.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_28.setBounds(508, 264, 122, 14);
		contentPane.add(label_28);

		btnDescartarCambioscarac = new JButton("Descartar cambios");
		btnDescartarCambioscarac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				pantalla = new TbEquipos();
				pantalla.setVisible(true);
			}
		});
		btnDescartarCambioscarac.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnDescartarCambioscarac.setBounds(368, 416, 135, 32);
		contentPane.add(btnDescartarCambioscarac);

		btnGuardarCambioscarac = new JButton("Guardar cambios");
		btnGuardarCambioscarac.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnGuardarCambioscarac.setBounds(511, 416, 121, 32);
		contentPane.add(btnGuardarCambioscarac);
		
		JButton btnRealizarPrestamo = new JButton("Realizar Pr\u00E9stamo");
		btnRealizarPrestamo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRealizarPrestamo.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnRealizarPrestamo.setBounds(88, 416, 130, 32);
		contentPane.add(btnRealizarPrestamo);
		
		label_29 = new JLabel("ID");
		label_29.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_29.setBounds(107, 20, 36, 14);
		contentPane.add(label_29);
		
		label_30 = new JLabel("Tipo equipo");
		label_30.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_30.setBounds(64, 49, 79, 14);
		contentPane.add(label_30);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(153, 49, 86, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(153, 18, 86, 20);
		contentPane.add(textField_1);
		
		textAreaNotas = new JTextArea();
		textAreaNotas.setLineWrap(true);
		textAreaNotas.setBounds(164, 367, 253, 38);
		contentPane.add(textAreaNotas);
	}
}
