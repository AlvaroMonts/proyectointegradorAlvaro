package Vista;
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
import javax.swing.JTabbedPane;

public class Caracteristicas_Equipo extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
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
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextArea textAreaNotas;
	private JPanel panel_2;
	private JTabbedPane tPSobremesa;
	private JPanel panel;
	private JPanel panel_1;
	private JRadioButton radioButton_3;
	private JRadioButton radioButton;
	private JRadioButton radioButton_1;
	private JRadioButton radioButton_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_48;
	private JButton btnDarDeBajacarac;
	private JButton btnDescartarCambioscarac;
	private JButton btnGuardarCambioscarac;
	private TbEquipos pantalla;
	private RegPrestamos pantalla1;

	/**
	 * Create the frame.
	 */
	public Caracteristicas_Equipo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 531);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label_1 = new JLabel("ID");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_1.setBounds(133, 48, 29, 14);
		contentPane.add(label_1);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(178, 46, 86, 20);
		contentPane.add(textField);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(178, 74, 86, 20);
		contentPane.add(textField_2);

		JLabel label_2 = new JLabel("Marca");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_2.setBounds(122, 75, 46, 14);
		contentPane.add(label_2);

		JLabel label_3 = new JLabel("Modelo");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_3.setBounds(118, 106, 46, 14);
		contentPane.add(label_3);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(178, 104, 86, 20);
		contentPane.add(textField_3);

		radioButton = new JRadioButton("Si");
		radioButton.setBackground(new Color(135, 206, 235));
		radioButton.setBounds(169, 131, 46, 20);
		contentPane.add(radioButton);

		radioButton_1 = new JRadioButton("No");
		radioButton_1.setBackground(new Color(135, 206, 235));
		radioButton_1.setBounds(226, 131, 55, 20);
		contentPane.add(radioButton_1);

		ButtonGroup group1 = new ButtonGroup();
		group1.add(radioButton);
		group1.add(radioButton_1);

		if (radioButton.isSelected()) {
			radioButton_1.setEnabled(false);
		} else if (radioButton_1.isSelected()) {
			radioButton.setEnabled(true);
		}

		JLabel label_4 = new JLabel("Disponibilidad");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_4.setBounds(85, 134, 79, 14);
		contentPane.add(label_4);

		radioButton_2 = new JRadioButton("No");
		radioButton_2.setBackground(new Color(135, 206, 235));
		radioButton_2.setBounds(226, 163, 55, 20);
		contentPane.add(radioButton_2);

		radioButton_3 = new JRadioButton("Si");
		radioButton_3.setBackground(new Color(135, 206, 235));
		radioButton_3.setBounds(169, 163, 46, 20);
		contentPane.add(radioButton_3);

		ButtonGroup group2 = new ButtonGroup();
		group2.add(radioButton_2);
		group2.add(radioButton_3);

		if (radioButton_2.isSelected()) {
			radioButton_3.setEnabled(false);
		} else if (radioButton_3.isSelected()) {
			radioButton_2.setEnabled(true);
		}

		JLabel label_5 = new JLabel("Prestable");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_5.setBounds(114, 166, 55, 14);
		contentPane.add(label_5);

		textAreaNotas = new JTextArea();
		textAreaNotas.setLineWrap(true);
		textAreaNotas.setBounds(532, 129, 214, 53);
		contentPane.add(textAreaNotas);

		JLabel label_28 = new JLabel("Notas");
		label_28.setBounds(611, 107, 29, 25);
		contentPane.add(label_28);

		JLabel label_27 = new JLabel("Tipo de uso");
		label_27.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_27.setBounds(532, 60, 65, 14);
		contentPane.add(label_27);

		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(631, 58, 86, 20);
		contentPane.add(textField_23);

		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(631, 86, 86, 20);
		contentPane.add(textField_24);

		JLabel label_29 = new JLabel("Estado");
		label_29.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_29.setBounds(551, 88, 46, 14);
		contentPane.add(label_29);

		JLabel label_30 = new JLabel("Edificio");
		label_30.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_30.setBounds(345, 60, 46, 14);
		contentPane.add(label_30);

		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(401, 58, 86, 20);
		contentPane.add(textField_25);

		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(404, 95, 86, 20);
		contentPane.add(textField_26);

		JLabel label_31 = new JLabel("Sala");
		label_31.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_31.setBounds(355, 98, 29, 14);
		contentPane.add(label_31);

		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(404, 133, 86, 20);
		contentPane.add(textField_29);

		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(404, 160, 86, 20);
		contentPane.add(textField_30);

		JLabel label_34 = new JLabel("Almacenamiento");
		label_34.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_34.setBounds(304, 139, 100, 30);
		contentPane.add(label_34);

		tPSobremesa = new JTabbedPane(JTabbedPane.TOP);
		tPSobremesa.setBackground(new Color(135, 206, 235));
		tPSobremesa.setBounds(45, 200, 709, 244);
		contentPane.add(tPSobremesa);

		panel = new JPanel();
		panel.setBackground(new Color(135, 206, 235));
		tPSobremesa.addTab("Sobremesa", null, panel, null);

		JLabel label_20 = new JLabel("TARJETA GR\u00C1FICA");
		label_20.setBounds(59, 36, 122, 14);
		label_20.setFont(new Font("Tahoma", Font.BOLD, 13));

		JLabel label_19 = new JLabel("Marca");
		label_19.setBounds(55, 66, 43, 14);
		label_19.setFont(new Font("Tahoma", Font.PLAIN, 12));

		textField_18 = new JTextField();
		textField_18.setBounds(111, 64, 86, 20);
		textField_18.setColumns(10);

		JLabel label_18 = new JLabel("Modelo");
		label_18.setBounds(55, 107, 46, 14);
		label_18.setFont(new Font("Tahoma", Font.PLAIN, 12));

		textField_17 = new JTextField();
		textField_17.setBounds(111, 105, 86, 20);
		textField_17.setColumns(10);

		textField_16 = new JTextField();
		textField_16.setBounds(111, 142, 86, 20);
		textField_16.setColumns(10);

		JLabel label_17 = new JLabel("Almacenamiento");
		label_17.setBounds(10, 145, 91, 14);
		label_17.setFont(new Font("Tahoma", Font.PLAIN, 12));

		textField_13 = new JTextField();
		textField_13.setBounds(331, 45, 86, 20);
		textField_13.setColumns(10);

		JLabel label_15 = new JLabel("Roseta");
		label_15.setBounds(275, 47, 46, 14);
		label_15.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.setLayout(null);
		panel.add(label_20);
		panel.add(label_19);
		panel.add(textField_18);
		panel.add(label_18);
		panel.add(textField_17);
		panel.add(label_17);
		panel.add(textField_16);
		panel.add(textField_13);
		panel.add(label_15);

		JLabel label_25 = new JLabel("PROCESADOR");
		label_25.setBounds(552, 72, 94, 14);
		panel.add(label_25);
		label_25.setFont(new Font("Tahoma", Font.BOLD, 13));

		JLabel label_24 = new JLabel("Modelo");
		label_24.setBounds(520, 102, 60, 14);
		panel.add(label_24);
		label_24.setFont(new Font("Tahoma", Font.PLAIN, 12));

		textField_22 = new JTextField();
		textField_22.setBounds(576, 99, 86, 20);
		panel.add(textField_22);
		textField_22.setColumns(10);

		textField_21 = new JTextField();
		textField_21.setBounds(576, 130, 86, 20);
		panel.add(textField_21);
		textField_21.setColumns(10);

		JLabel label_23 = new JLabel("Velocidad");
		label_23.setBounds(505, 133, 65, 14);
		panel.add(label_23);
		label_23.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JLabel label_26 = new JLabel("MEMORIA RAM ");
		label_26.setBounds(307, 81, 110, 14);
		panel.add(label_26);
		label_26.setFont(new Font("Tahoma", Font.BOLD, 13));

		JLabel label_22 = new JLabel("Capacidad");
		label_22.setBounds(260, 108, 60, 14);
		panel.add(label_22);
		label_22.setFont(new Font("Tahoma", Font.PLAIN, 12));

		textField_20 = new JTextField();
		textField_20.setBounds(331, 106, 86, 20);
		panel.add(textField_20);
		textField_20.setColumns(10);

		textField_19 = new JTextField();
		textField_19.setBounds(331, 139, 86, 20);
		panel.add(textField_19);
		textField_19.setColumns(10);

		JLabel label_21 = new JLabel("Velocidad");
		label_21.setBounds(260, 141, 60, 14);
		panel.add(label_21);
		label_21.setFont(new Font("Tahoma", Font.PLAIN, 12));

		textField_12 = new JTextField();
		textField_12.setBounds(576, 36, 86, 20);
		panel.add(textField_12);
		textField_12.setColumns(10);

		JLabel label_16 = new JLabel("SSOO");
		label_16.setBounds(527, 38, 39, 14);
		panel.add(label_16);
		label_16.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JButton button_26 = new JButton("Dar de baja equipo");
		button_26.setFont(new Font("Times New Roman", Font.BOLD, 11));
		button_26.setBounds(195, 173, 130, 32);
		panel.add(button_26);

		JButton button_27 = new JButton("Descartar cambios");
		button_27.setFont(new Font("Times New Roman", Font.BOLD, 11));
		button_27.setBounds(384, 173, 135, 32);
		panel.add(button_27);

		JButton button_28 = new JButton("Guardar cambios");
		button_28.setFont(new Font("Times New Roman", Font.BOLD, 11));
		button_28.setBounds(573, 173, 121, 32);
		panel.add(button_28);

		panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 235));
		tPSobremesa.addTab("Portatil", null, panel_1, null);
		panel_1.setLayout(null);

		JLabel label_8 = new JLabel("Almacenamiento");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_8.setBounds(10, 145, 91, 14);
		panel_1.add(label_8);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(111, 142, 86, 20);
		panel_1.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(111, 105, 86, 20);
		panel_1.add(textField_5);

		JLabel label_9 = new JLabel("Modelo");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_9.setBounds(55, 107, 46, 14);
		panel_1.add(label_9);

		JLabel label_10 = new JLabel("Marca");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_10.setBounds(55, 66, 43, 14);
		panel_1.add(label_10);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(111, 64, 86, 20);
		panel_1.add(textField_6);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(561, 34, 86, 20);
		panel_1.add(textField_7);

		JLabel label_11 = new JLabel("SSOO");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_11.setBounds(512, 36, 39, 14);
		panel_1.add(label_11);

		JLabel label_12 = new JLabel("MEMORIA RAM ");
		label_12.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_12.setBounds(318, 89, 110, 14);
		panel_1.add(label_12);

		JLabel label_35 = new JLabel("Capacidad");
		label_35.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_35.setBounds(271, 116, 60, 14);
		panel_1.add(label_35);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(342, 114, 86, 20);
		panel_1.add(textField_8);

		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(342, 147, 86, 20);
		panel_1.add(textField_9);

		JLabel label_36 = new JLabel("Velocidad");
		label_36.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_36.setBounds(271, 149, 60, 14);
		panel_1.add(label_36);

		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(568, 97, 86, 20);
		panel_1.add(textField_10);

		JLabel label_37 = new JLabel("Modelo");
		label_37.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_37.setBounds(512, 100, 60, 14);
		panel_1.add(label_37);

		JLabel label_38 = new JLabel("Velocidad");
		label_38.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_38.setBounds(497, 131, 65, 14);
		panel_1.add(label_38);

		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(568, 128, 86, 20);
		panel_1.add(textField_11);

		JLabel label_39 = new JLabel("PROCESADOR");
		label_39.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_39.setBounds(544, 70, 94, 14);
		panel_1.add(label_39);

		JLabel label_40 = new JLabel("TARJETA GR\u00C1FICA");
		label_40.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_40.setBounds(55, 36, 122, 14);
		panel_1.add(label_40);

		JLabel label_41 = new JLabel("Resoluci\u00F3n");
		label_41.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_41.setBounds(261, 64, 60, 14);
		panel_1.add(label_41);

		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(332, 62, 86, 20);
		panel_1.add(textField_31);

		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(332, 34, 86, 20);
		panel_1.add(textField_32);

		JLabel label_42 = new JLabel("Pulgadas");
		label_42.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_42.setBounds(270, 39, 52, 14);
		panel_1.add(label_42);

		JButton button_22 = new JButton("Dar de baja equipo");
		button_22.setFont(new Font("Times New Roman", Font.BOLD, 11));
		button_22.setBounds(195, 173, 130, 32);
		panel_1.add(button_22);

		JButton button_23 = new JButton("Descartar cambios");
		button_23.setFont(new Font("Times New Roman", Font.BOLD, 11));
		button_23.setBounds(384, 173, 135, 32);
		panel_1.add(button_23);

		JButton button_24 = new JButton("Guardar cambios");
		button_24.setFont(new Font("Times New Roman", Font.BOLD, 11));
		button_24.setBounds(573, 173, 121, 32);
		panel_1.add(button_24);

		panel_2 = new JPanel();
		panel_2.setBackground(new Color(135, 206, 235));
		tPSobremesa.addTab("Smartphone / Tablet", null, panel_2, null);
		panel_2.setLayout(null);

		JLabel label_32 = new JLabel("Resoluci\u00F3n c\u00E1mara");
		label_32.setBounds(90, 65, 110, 14);
		panel_2.add(label_32);
		label_32.setFont(new Font("Tahoma", Font.PLAIN, 12));

		textField_27 = new JTextField();
		textField_27.setBounds(201, 63, 86, 20);
		panel_2.add(textField_27);
		textField_27.setColumns(10);

		JLabel label_14 = new JLabel("Pulgadas");
		label_14.setBounds(355, 65, 52, 14);
		panel_2.add(label_14);
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 12));

		textField_14 = new JTextField();
		textField_14.setBounds(422, 63, 86, 20);
		panel_2.add(textField_14);
		textField_14.setColumns(10);

		JRadioButton radioButton_8 = new JRadioButton("No");
		radioButton_8.setBackground(new Color(135, 206, 235));
		radioButton_8.setBounds(477, 129, 55, 20);
		panel_2.add(radioButton_8);

		JRadioButton radioButton_9 = new JRadioButton("Si");
		radioButton_9.setBackground(new Color(135, 206, 235));
		radioButton_9.setBounds(425, 129, 46, 20);
		panel_2.add(radioButton_9);

		ButtonGroup group7 = new ButtonGroup();
		group7.add(radioButton_8);
		group7.add(radioButton_9);

		if (radioButton_8.isSelected()) {
			radioButton_9.setEnabled(false);
		} else if (radioButton_9.isSelected()) {
			radioButton_8.setEnabled(true);
		}

		JLabel label_43 = new JLabel("NFC");
		label_43.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_43.setBounds(379, 132, 29, 14);
		panel_2.add(label_43);

		JLabel label_44 = new JLabel("Giroscopio");
		label_44.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_44.setBounds(355, 102, 69, 14);
		panel_2.add(label_44);

		JRadioButton radioButton_10 = new JRadioButton("Si");
		radioButton_10.setBackground(new Color(135, 206, 235));
		radioButton_10.setBounds(425, 100, 46, 20);
		panel_2.add(radioButton_10);

		JRadioButton radioButton_11 = new JRadioButton("No");
		radioButton_11.setBackground(new Color(135, 206, 235));
		radioButton_11.setBounds(477, 100, 55, 20);
		panel_2.add(radioButton_11);

		ButtonGroup group6 = new ButtonGroup();
		group6.add(radioButton_11);
		group6.add(radioButton_10);

		if (radioButton_11.isSelected()) {
			radioButton_10.setEnabled(false);
		} else if (radioButton_10.isSelected()) {
			radioButton_11.setEnabled(true);
		}

		JLabel lblTipo_1 = new JLabel("Tipo");
		lblTipo_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTipo_1.setBounds(154, 119, 46, 14);
		panel_2.add(lblTipo_1);

		JRadioButton rdbtnSmartphone = new JRadioButton("Smartphone");
		rdbtnSmartphone.setBackground(new Color(135, 206, 235));
		rdbtnSmartphone.setBounds(201, 101, 86, 20);
		panel_2.add(rdbtnSmartphone);

		JRadioButton rdbtnTablet = new JRadioButton("Tablet");
		rdbtnTablet.setBackground(new Color(135, 206, 235));
		rdbtnTablet.setBounds(201, 129, 55, 20);
		panel_2.add(rdbtnTablet);

		ButtonGroup group3 = new ButtonGroup();
		group3.add(rdbtnTablet);
		group3.add(rdbtnSmartphone);

		JButton button_18 = new JButton("Dar de baja equipo");
		button_18.setFont(new Font("Times New Roman", Font.BOLD, 11));
		button_18.setBounds(195, 173, 130, 32);
		panel_2.add(button_18);

		JButton button_19 = new JButton("Descartar cambios");
		button_19.setFont(new Font("Times New Roman", Font.BOLD, 11));
		button_19.setBounds(384, 173, 135, 32);
		panel_2.add(button_19);

		JButton button_20 = new JButton("Guardar cambios");
		button_20.setFont(new Font("Times New Roman", Font.BOLD, 11));
		button_20.setBounds(573, 173, 121, 32);
		panel_2.add(button_20);

		if (rdbtnTablet.isSelected()) {
			rdbtnSmartphone.setEnabled(false);
		} else if (rdbtnSmartphone.isSelected()) {
			rdbtnTablet.setEnabled(true);
		}

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(135, 206, 235));
		tPSobremesa.addTab("Tableta Gr\u00E1fica", null, panel_3, null);
		panel_3.setLayout(null);

		JLabel lblTamao = new JLabel("Tama\u00F1o");
		lblTamao.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTamao.setBounds(232, 92, 59, 14);
		panel_3.add(lblTamao);

		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(306, 90, 86, 20);
		panel_3.add(textField_35);

		JButton button_14 = new JButton("Dar de baja equipo");
		button_14.setFont(new Font("Times New Roman", Font.BOLD, 11));
		button_14.setBounds(195, 173, 130, 32);
		panel_3.add(button_14);

		JButton button_15 = new JButton("Descartar cambios");
		button_15.setFont(new Font("Times New Roman", Font.BOLD, 11));
		button_15.setBounds(384, 173, 135, 32);
		panel_3.add(button_15);

		JButton button_16 = new JButton("Guardar cambios");
		button_16.setFont(new Font("Times New Roman", Font.BOLD, 11));
		button_16.setBounds(573, 173, 121, 32);
		panel_3.add(button_16);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(135, 206, 235));
		tPSobremesa.addTab("Cintiq", null, panel_4, null);
		panel_4.setLayout(null);

		JLabel label_48 = new JLabel("TARJETA GR\u00C1FICA");
		label_48.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_48.setBounds(74, 30, 122, 14);
		panel_4.add(label_48);

		JLabel label_49 = new JLabel("Marca");
		label_49.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_49.setBounds(70, 60, 43, 14);
		panel_4.add(label_49);

		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(126, 58, 86, 20);
		panel_4.add(textField_37);

		JLabel label_50 = new JLabel("Modelo");
		label_50.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_50.setBounds(70, 101, 46, 14);
		panel_4.add(label_50);

		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(126, 99, 86, 20);
		panel_4.add(textField_38);

		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(126, 136, 86, 20);
		panel_4.add(textField_39);

		JLabel label_51 = new JLabel("Almacenamiento");
		label_51.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_51.setBounds(25, 139, 91, 14);
		panel_4.add(label_51);

		JLabel label_52 = new JLabel("MEMORIA RAM ");
		label_52.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_52.setBounds(322, 75, 110, 14);
		panel_4.add(label_52);

		JLabel label_53 = new JLabel("Capacidad");
		label_53.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_53.setBounds(275, 102, 60, 14);
		panel_4.add(label_53);

		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(346, 100, 86, 20);
		panel_4.add(textField_40);

		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(346, 133, 86, 20);
		panel_4.add(textField_41);

		JLabel label_54 = new JLabel("Velocidad");
		label_54.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_54.setBounds(275, 135, 60, 14);
		panel_4.add(label_54);

		JLabel label_55 = new JLabel("Modelo");
		label_55.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_55.setBounds(535, 96, 60, 14);
		panel_4.add(label_55);

		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(591, 93, 86, 20);
		panel_4.add(textField_42);

		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(591, 124, 86, 20);
		panel_4.add(textField_43);

		JLabel label_56 = new JLabel("Velocidad");
		label_56.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_56.setBounds(520, 127, 65, 14);
		panel_4.add(label_56);

		JLabel label_57 = new JLabel("PROCESADOR");
		label_57.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_57.setBounds(567, 66, 94, 14);
		panel_4.add(label_57);

		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBounds(346, 35, 86, 20);
		panel_4.add(textField_44);

		JLabel label_58 = new JLabel("Resoluci\u00F3n");
		label_58.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_58.setBounds(277, 37, 60, 14);
		panel_4.add(label_58);

		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBounds(589, 35, 86, 20);
		panel_4.add(textField_45);

		JLabel lblEquipoEnlazado = new JLabel("Equipo Asociado");
		lblEquipoEnlazado.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEquipoEnlazado.setBounds(489, 37, 91, 14);
		panel_4.add(lblEquipoEnlazado);

		JButton button_10 = new JButton("Dar de baja equipo");
		button_10.setFont(new Font("Times New Roman", Font.BOLD, 11));
		button_10.setBounds(195, 173, 130, 32);
		panel_4.add(button_10);

		JButton button_11 = new JButton("Descartar cambios");
		button_11.setFont(new Font("Times New Roman", Font.BOLD, 11));
		button_11.setBounds(384, 173, 135, 32);
		panel_4.add(button_11);

		JButton button_12 = new JButton("Guardar cambios");
		button_12.setFont(new Font("Times New Roman", Font.BOLD, 11));
		button_12.setBounds(573, 173, 121, 32);
		panel_4.add(button_12);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(135, 206, 235));
		tPSobremesa.addTab("Monitor / TV", null, panel_5, null);
		panel_5.setLayout(null);

		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBounds(120, 67, 86, 20);
		panel_5.add(textField_46);

		JLabel lblConexiones = new JLabel("Conexiones");
		lblConexiones.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblConexiones.setBounds(47, 69, 72, 14);
		panel_5.add(lblConexiones);

		JLabel label_60 = new JLabel("Resoluci\u00F3n");
		label_60.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_60.setBounds(59, 102, 60, 14);
		panel_5.add(label_60);

		textField_47 = new JTextField();
		textField_47.setColumns(10);
		textField_47.setBounds(120, 96, 86, 20);
		panel_5.add(textField_47);

		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTipo.setBounds(292, 69, 34, 14);
		panel_5.add(lblTipo);

		JLabel label_62 = new JLabel("Resoluci\u00F3n");
		label_62.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_62.setBounds(285, 102, 60, 14);
		panel_5.add(label_62);

		textField_49 = new JTextField();
		textField_49.setColumns(10);
		textField_49.setBounds(346, 96, 86, 20);
		panel_5.add(textField_49);

		textField_50 = new JTextField();
		textField_50.setColumns(10);
		textField_50.setBounds(587, 67, 86, 20);
		panel_5.add(textField_50);

		JLabel label_63 = new JLabel("Resoluci\u00F3n c\u00E1mara");
		label_63.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_63.setBounds(476, 69, 110, 14);
		panel_5.add(label_63);

		JLabel label_64 = new JLabel("Resoluci\u00F3n");
		label_64.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_64.setBounds(526, 102, 60, 14);
		panel_5.add(label_64);

		textField_51 = new JTextField();
		textField_51.setColumns(10);
		textField_51.setBounds(587, 96, 86, 20);
		panel_5.add(textField_51);

		JRadioButton rdbtnTv = new JRadioButton("TV");
		rdbtnTv.setBackground(new Color(135, 206, 235));
		rdbtnTv.setBounds(332, 67, 46, 20);
		panel_5.add(rdbtnTv);

		JRadioButton rdbtnMonitor = new JRadioButton("Monitor");
		rdbtnMonitor.setBackground(new Color(135, 206, 235));
		rdbtnMonitor.setBounds(380, 67, 72, 20);
		panel_5.add(rdbtnMonitor);

		ButtonGroup group4 = new ButtonGroup();
		group4.add(rdbtnTv);
		group4.add(rdbtnMonitor);

		JButton button_6 = new JButton("Dar de baja equipo");
		button_6.setFont(new Font("Times New Roman", Font.BOLD, 11));
		button_6.setBounds(195, 173, 130, 32);
		panel_5.add(button_6);

		JButton button_7 = new JButton("Descartar cambios");
		button_7.setFont(new Font("Times New Roman", Font.BOLD, 11));
		button_7.setBounds(384, 173, 135, 32);
		panel_5.add(button_7);

		JButton button_8 = new JButton("Guardar cambios");
		button_8.setFont(new Font("Times New Roman", Font.BOLD, 11));
		button_8.setBounds(573, 173, 121, 32);
		panel_5.add(button_8);

		if (rdbtnTv.isSelected()) {
			rdbtnMonitor.setEnabled(false);
		} else if (rdbtnMonitor.isSelected()) {
			rdbtnTv.setEnabled(true);
		}

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(135, 206, 235));
		tPSobremesa.addTab("Proyector", null, panel_6, null);
		panel_6.setLayout(null);

		JLabel label_47 = new JLabel("Resoluci\u00F3n");
		label_47.setBounds(144, 100, 57, 15);
		label_47.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_6.add(label_47);

		textField_36 = new JTextField();
		textField_36.setBounds(222, 98, 86, 20);
		textField_36.setColumns(10);
		panel_6.add(textField_36);

		JRadioButton radioButton_12 = new JRadioButton("Si");
		radioButton_12.setBackground(new Color(135, 206, 235));
		radioButton_12.setBounds(419, 98, 46, 20);
		panel_6.add(radioButton_12);

		JRadioButton radioButton_13 = new JRadioButton("No");
		radioButton_13.setBackground(new Color(135, 206, 235));
		radioButton_13.setBounds(467, 98, 55, 20);
		panel_6.add(radioButton_13);

		ButtonGroup group5 = new ButtonGroup();
		group5.add(radioButton_12);
		group5.add(radioButton_13);

		if (radioButton_12.isSelected()) {
			radioButton_13.setEnabled(false);
		} else if (radioButton_13.isSelected()) {
			radioButton_12.setEnabled(true);
		}

		JLabel lblHdmi = new JLabel("HDMI");
		lblHdmi.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHdmi.setBounds(363, 100, 46, 14);
		panel_6.add(lblHdmi);

		JButton button_2 = new JButton("Dar de baja equipo");
		button_2.setFont(new Font("Times New Roman", Font.BOLD, 11));
		button_2.setBounds(195, 173, 130, 32);
		panel_6.add(button_2);

		JButton button_3 = new JButton("Descartar cambios");
		button_3.setFont(new Font("Times New Roman", Font.BOLD, 11));
		button_3.setBounds(384, 173, 135, 32);
		panel_6.add(button_3);

		JButton button_4 = new JButton("Guardar cambios");
		button_4.setFont(new Font("Times New Roman", Font.BOLD, 11));
		button_4.setBounds(573, 173, 121, 32);
		panel_6.add(button_4);

		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(135, 206, 235));
		tPSobremesa.addTab("Consola", null, panel_7, null);
		panel_7.setLayout(null);

		JLabel lblHdd = new JLabel("HDD");
		lblHdd.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHdd.setBounds(236, 84, 60, 14);
		panel_7.add(lblHdd);

		textField_48 = new JTextField();
		textField_48.setColumns(10);
		textField_48.setBounds(297, 82, 86, 20);
		panel_7.add(textField_48);

		btnDescartarCambioscarac = new JButton("Descartar cambios");
		btnDescartarCambioscarac.setBounds(384, 173, 135, 32);
		panel_7.add(btnDescartarCambioscarac);
		btnDescartarCambioscarac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				pantalla = new TbEquipos();
				pantalla.setVisible(true);
			}
		});
		btnDescartarCambioscarac.setFont(new Font("Times New Roman", Font.BOLD,
				11));

		btnGuardarCambioscarac = new JButton("Guardar cambios");
		btnGuardarCambioscarac.setBounds(573, 173, 121, 32);
		panel_7.add(btnGuardarCambioscarac);
		btnGuardarCambioscarac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardarCambioscarac.setFont(new Font("Times New Roman", Font.BOLD,
				11));

		btnDarDeBajacarac = new JButton("Dar de baja equipo");
		btnDarDeBajacarac.setBounds(195, 173, 130, 32);
		panel_7.add(btnDarDeBajacarac);
		btnDarDeBajacarac.setFont(new Font("Times New Roman", Font.BOLD, 11));

		JButton button = new JButton("Cancelar");
		button.setBounds(45, 455, 89, 23);
		contentPane.add(button);

		JButton button_25 = new JButton("Realizar Pr\u00E9stamo");
		button_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				pantalla1 = new RegPrestamos();
				pantalla1.setVisible(true);
			}
		});
		button_25.setBounds(171, 450, 130, 32);
		contentPane.add(button_25);
		button_25.setFont(new Font("Times New Roman", Font.BOLD, 11));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				pantalla = new TbEquipos();
				pantalla.setVisible(true);
			}
		});
	}

	public void setPantalla(TbEquipos Pantalla) {
		this.pantalla = Pantalla;
	}

	public void setPantalla1(RegPrestamos Pantalla1) {
		this.pantalla1 = Pantalla1;
	}
}