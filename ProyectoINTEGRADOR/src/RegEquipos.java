import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

import java.awt.Color;

import javax.swing.JTextArea;
import javax.swing.JTabbedPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

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
	private JPanel panel_2;
	private JTabbedPane tPSobremesa;
	private JPanel panel;
	private JPanel panel_1;
	private JRadioButton radioButton_3;
	private JRadioButton radioButton;
	private JRadioButton radioButton_1;
	private JRadioButton radioButton_2;
	private JRadioButton radioButton_5;
	private JRadioButton radioButton_6;
	private JRadioButton radioButton_4;
	private JRadioButton radioButton_7;
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
	private JButton btnCintiq;
	private JButton btnAltaSmartTablet;
	private JButton btnAltaPortatil;
	private JButton btnAltaSobremesa;
	private JTextField textField_33;
	private JTextField textField_34;

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
		label.setBounds(103, 58, 65, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("ID");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_1.setBounds(134, 27, 29, 14);
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
		label_3.setBounds(118, 118, 46, 14);
		contentPane.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(178, 116, 86, 20);
		contentPane.add(textField_3);
		
		radioButton = new JRadioButton("Si");
		radioButton.setBackground(new Color(135, 206, 235));
		radioButton.setBounds(169, 143, 46, 20);
		contentPane.add(radioButton);
		
		radioButton_1 = new JRadioButton("No");
		radioButton_1.setBackground(new Color(135, 206, 235));
		radioButton_1.setBounds(226, 143, 55, 20);
		contentPane.add(radioButton_1);
		
		ButtonGroup group1 = new ButtonGroup();
		group1.add(radioButton);
		group1.add(radioButton_1);
		
		if(radioButton.isSelected()) {
			radioButton_1.setEnabled(false);
		} else if(radioButton_1.isSelected()) {
			radioButton.setEnabled(true);
		}
		
		JLabel label_4 = new JLabel("Disponibilidad");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_4.setBounds(85, 146, 79, 14);
		contentPane.add(label_4);
		
		radioButton_2 = new JRadioButton("No");
		radioButton_2.setBackground(new Color(135, 206, 235));
		radioButton_2.setBounds(226, 175, 55, 20);
		contentPane.add(radioButton_2);
		
		radioButton_3 = new JRadioButton("Si");
		radioButton_3.setBackground(new Color(135, 206, 235));
		radioButton_3.setBounds(169, 175, 46, 20);
		contentPane.add(radioButton_3);
		
		ButtonGroup group2 = new ButtonGroup();
		group2.add(radioButton_2);
		group2.add(radioButton_3);
		
		if(radioButton_2.isSelected()) {
			radioButton_3.setEnabled(false);
		} else if(radioButton_3.isSelected()) {
			radioButton_2.setEnabled(true);
		}
		
		JLabel label_5 = new JLabel("Prestable");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_5.setBounds(114, 178, 55, 14);
		contentPane.add(label_5);
		
		radioButton_4 = new JRadioButton("Si");
		radioButton_4.setBackground(new Color(135, 206, 235));
		radioButton_4.setBounds(647, 203, 46, 20);
		contentPane.add(radioButton_4);
		
		radioButton_7 = new JRadioButton("No");
		radioButton_7.setBackground(new Color(135, 206, 235));
		radioButton_7.setBounds(699, 203, 55, 20);
		contentPane.add(radioButton_7);
		
		ButtonGroup group3 = new ButtonGroup();
		group3.add(radioButton_4);
		group3.add(radioButton_7);
		
		if(radioButton_4.isSelected()) {
			radioButton_7.setEnabled(false);
		} else if(radioButton_7.isSelected()) {
			radioButton_4.setEnabled(true);
		}
		
		radioButton_5 = new JRadioButton("Si");
		radioButton_5.setBackground(new Color(135, 206, 235));
		radioButton_5.setBounds(647, 174, 46, 20);
		contentPane.add(radioButton_5);
		
		radioButton_6 = new JRadioButton("No");
		radioButton_6.setBackground(new Color(135, 206, 235));
		radioButton_6.setBounds(699, 174, 55, 20);
		contentPane.add(radioButton_6);
		
		ButtonGroup group4 = new ButtonGroup();
		group4.add(radioButton_5);
		group4.add(radioButton_6);
		
		if(radioButton_5.isSelected()) {
			radioButton_6.setEnabled(false);
		} else if(radioButton_6.isSelected()) {
			radioButton_5.setEnabled(true);
		}
		
		JLabel label_13 = new JLabel("Resoluci\u00F3n");
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_13.setBounds(586, 153, 60, 14);
		contentPane.add(label_13);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(647, 147, 86, 20);
		contentPane.add(textField_15);
		
		textAreaNotas = new JTextArea();
		textAreaNotas.setLineWrap(true);
		textAreaNotas.setBounds(7, 113, 46, 37);
		contentPane.add(textAreaNotas);
		
		JLabel label_28 = new JLabel("Notas");
		label_28.setBounds(24, 84, 29, 25);
		contentPane.add(label_28);
		
		JLabel label_27 = new JLabel("Tipo de uso");
		label_27.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_27.setBounds(326, 40, 65, 14);
		contentPane.add(label_27);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(404, 38, 86, 20);
		contentPane.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(513, 25, 86, 20);
		contentPane.add(textField_24);
		
		JLabel label_29 = new JLabel("Estado");
		label_29.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_29.setBounds(523, 14, 46, 14);
		contentPane.add(label_29);
		
		JLabel label_30 = new JLabel("Edificio");
		label_30.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_30.setBounds(345, 80, 46, 14);
		contentPane.add(label_30);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(401, 78, 86, 20);
		contentPane.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(404, 115, 86, 20);
		contentPane.add(textField_26);
		
		JLabel label_31 = new JLabel("Sala");
		label_31.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_31.setBounds(355, 118, 29, 14);
		contentPane.add(label_31);
		
		JLabel label_33 = new JLabel("Tipos de conexi\u00F3n");
		label_33.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_33.setBounds(557, 88, 106, 14);
		contentPane.add(label_33);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(668, 86, 86, 20);
		contentPane.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(404, 153, 86, 20);
		contentPane.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(404, 180, 86, 20);
		contentPane.add(textField_30);
		
		JLabel label_34 = new JLabel("Almacenamiento");
		label_34.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_34.setBounds(304, 159, 100, 30);
		contentPane.add(label_34);
		
		JLabel label_6 = new JLabel("Giroscopio");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_6.setBounds(577, 176, 69, 14);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("NFC");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_7.setBounds(601, 206, 29, 14);
		contentPane.add(label_7);
		
		tPSobremesa = new JTabbedPane(JTabbedPane.TOP);
		tPSobremesa.setBackground(new Color(135, 206, 235));
		tPSobremesa.setBounds(40, 218, 709, 244);
		contentPane.add(tPSobremesa);
		
		panel = new JPanel();
		panel.setBackground(new Color(135, 206, 235));
		tPSobremesa.addTab("Sobremesa", null, panel, null);
		
		btnAltaSobremesa = new JButton("Dar de alta equipo");
		btnAltaSobremesa.setBounds(565, 180, 129, 25);
		btnAltaSobremesa.setFont(new Font("Times New Roman", Font.BOLD, 13));
		
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
		panel.add(btnAltaSobremesa);
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
		label_12.setBounds(308, 107, 110, 14);
		panel_1.add(label_12);
		
		JLabel label_35 = new JLabel("Capacidad");
		label_35.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_35.setBounds(261, 134, 60, 14);
		panel_1.add(label_35);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(332, 132, 86, 20);
		panel_1.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(332, 165, 86, 20);
		panel_1.add(textField_9);
		
		JLabel label_36 = new JLabel("Velocidad");
		label_36.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_36.setBounds(261, 167, 60, 14);
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
		
		btnAltaPortatil = new JButton("Dar de alta equipo");
		btnAltaPortatil.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnAltaPortatil.setBounds(565, 180, 129, 25);
		panel_1.add(btnAltaPortatil);
		
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
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(135, 206, 235));
		tPSobremesa.addTab("Smartphone / Tablet", null, panel_2, null);
		panel_2.setLayout(null);
		
		btnAltaSmartTablet = new JButton("Dar de alta equipo");
		btnAltaSmartTablet.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnAltaSmartTablet.setBounds(565, 180, 129, 25);
		panel_2.add(btnAltaSmartTablet);
		
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
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(135, 206, 235));
		tPSobremesa.addTab("Tableta Gr\u00E1fica", null, panel_3, null);
		panel_3.setLayout(null);
		
		JButton btnAltaTabletaGrafica = new JButton("Dar de alta equipo");
		btnAltaTabletaGrafica.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnAltaTabletaGrafica.setBounds(565, 180, 129, 25);
		panel_3.add(btnAltaTabletaGrafica);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(135, 206, 235));
		tPSobremesa.addTab("Cintiq", null, panel_4, null);
		panel_4.setLayout(null);
		
		btnCintiq = new JButton("Dar de alta equipo");
		btnCintiq.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnCintiq.setBounds(565, 180, 129, 25);
		panel_4.add(btnCintiq);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(135, 206, 235));
		tPSobremesa.addTab("Monitor / TV", null, panel_5, null);
		panel_5.setLayout(null);
		
		JButton button_3 = new JButton("Dar de alta equipo");
		button_3.setFont(new Font("Times New Roman", Font.BOLD, 13));
		button_3.setBounds(565, 180, 129, 25);
		panel_5.add(button_3);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(135, 206, 235));
		tPSobremesa.addTab("New tab", null, panel_6, null);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(10, 24, 89, 23);
		contentPane.add(btnCancelar);
		
		JLabel label_45 = new JLabel("Pulgadas");
		label_45.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_45.setBounds(601, 60, 52, 14);
		contentPane.add(label_45);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(668, 58, 86, 20);
		contentPane.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(668, 118, 86, 20);
		contentPane.add(textField_34);
		
		JLabel label_46 = new JLabel("Resoluci\u00F3n c\u00E1mara");
		label_46.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_46.setBounds(557, 120, 110, 14);
		contentPane.add(label_46);
	}
}
