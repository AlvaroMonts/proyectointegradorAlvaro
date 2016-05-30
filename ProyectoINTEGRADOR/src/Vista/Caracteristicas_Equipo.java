package Vista;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JToggleButton.ToggleButtonModel;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.TextArea;

import javax.swing.JButton;
import javax.swing.JRadioButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextArea;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import Controlador.Caracteristicas_EquipoControlador;

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
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextArea textAreaNotas;
	private JTabbedPane tPSobremesa;
	private JPanel panelSobremesa;
	private JPanel panelPortatil;
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
	private JTextField textField_51;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private ButtonGroup group1;
	private ButtonGroup group2;
	private ButtonGroup group3;
	private ButtonGroup group4;
	private ButtonGroup group5;
	private ButtonGroup group6;
	private ButtonGroup group7;
	private TbEquipos pantalla;
	private RegPrestamos pantalla1;
	private JButton btnCancelar;
	private JButton btnRealizarPrestamo;
	private JButton btnBajaEquipo;
	private JButton btnGuardarCambios;
	private JButton btnDescartarCambios;
	private int idEquipo;
	private Caracteristicas_EquipoControlador equipoControlador;
	private JTextField textField_15;
	private JRadioButton rdbtnSmartphone;
	private JRadioButton rdbtnTablet;
	private JRadioButton rdbtnSi;
	private JRadioButton rdbtnSi_1;
	private JRadioButton rdbtnNo;
	private JRadioButton rdbtnNo_1;
	private JRadioButton rdbtnTv;
	private JRadioButton rdbtnMonitor;
	private JRadioButton radioButton_8;
	private JRadioButton radioButton_9;
	private JPanel panelProyector;
	private JPanel panelTvMonitor;
	private JPanel panelCintiq;
	private JPanel panelTabletaGrafica;
	private JPanel panelSmartTablet;

	/**
	 * Create the frame.
	 */
	public Caracteristicas_Equipo() {
		setTitle("Caracteristicas Equipo");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 531);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label_1 = new JLabel("ID");
		label_1.setBounds(133, 48, 29, 14);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(label_1);

		textField = new JTextField(idEquipo);
		textField.setBounds(178, 46, 86, 20);
		textField.setColumns(10);
		contentPane.add(textField);

		textField_2 = new JTextField();
		textField_2.setBounds(178, 74, 86, 20);
		textField_2.setColumns(10);
		contentPane.add(textField_2);

		JLabel label_2 = new JLabel("Marca");
		label_2.setBounds(122, 75, 46, 14);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(label_2);

		JLabel label_3 = new JLabel("Modelo");
		label_3.setBounds(118, 106, 46, 14);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(label_3);

		textField_3 = new JTextField();
		textField_3.setBounds(178, 104, 86, 20);
		textField_3.setColumns(10);
		contentPane.add(textField_3);

		radioButton = new JRadioButton("si");
		radioButton.setActionCommand(radioButton.getText());
		radioButton.setBounds(169, 131, 46, 20);
		radioButton.setBackground(new Color(135, 206, 235));
		contentPane.add(radioButton);

		radioButton_1 = new JRadioButton("no");
		radioButton_1.setActionCommand(radioButton_1.getText());
		radioButton_1.setBounds(226, 131, 55, 20);
		radioButton_1.setBackground(new Color(135, 206, 235));
		contentPane.add(radioButton_1);

		group1 = new ButtonGroup();
		group1.add(radioButton);
		group1.add(radioButton_1);

		if (radioButton.isSelected()) {
			radioButton_1.setEnabled(false);
		} else if (radioButton_1.isSelected()) {
			radioButton.setEnabled(true);
		}

		JLabel label_4 = new JLabel("Disponibilidad");
		label_4.setBounds(85, 134, 79, 14);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(label_4);

		radioButton_2 = new JRadioButton("no");
		radioButton_2.setActionCommand(radioButton_2.getText());
		radioButton_2.setBounds(226, 163, 55, 20);
		radioButton_2.setBackground(new Color(135, 206, 235));
		contentPane.add(radioButton_2);

		radioButton_3 = new JRadioButton("si");
		radioButton_3.setActionCommand(radioButton_3.getText());
		radioButton_3.setBounds(169, 163, 46, 20);
		radioButton_3.setBackground(new Color(135, 206, 235));
		contentPane.add(radioButton_3);

		group2 = new ButtonGroup();
		group2.add(radioButton_2);
		group2.add(radioButton_3);

		if (radioButton_2.isSelected()) {
			radioButton_3.setEnabled(false);
		} else if (radioButton_3.isSelected()) {
			radioButton_2.setEnabled(true);
		}

		JLabel label_5 = new JLabel("Prestable");
		label_5.setBounds(114, 166, 55, 14);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(label_5);

		textAreaNotas = new JTextArea();
		textAreaNotas.setBounds(532, 129, 214, 53);
		textAreaNotas.setLineWrap(true);
		contentPane.add(textAreaNotas);

		JLabel label_28 = new JLabel("Notas");
		label_28.setBounds(611, 107, 29, 25);
		contentPane.add(label_28);

		JLabel label_27 = new JLabel("Tipo de uso");
		label_27.setBounds(558, 76, 65, 14);
		label_27.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(label_27);

		JLabel label_30 = new JLabel("Edificio");
		label_30.setBounds(345, 60, 46, 14);
		label_30.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(label_30);

		textField_26 = new JTextField();
		textField_26.setBounds(404, 95, 86, 20);
		textField_26.setColumns(10);
		contentPane.add(textField_26);

		JLabel label_31 = new JLabel("Sala");
		label_31.setBounds(355, 98, 29, 14);
		label_31.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(label_31);

		textField_29 = new JTextField();
		textField_29.setBounds(404, 133, 86, 20);
		textField_29.setColumns(10);
		contentPane.add(textField_29);

		textField_30 = new JTextField();
		textField_30.setBounds(404, 160, 86, 20);
		textField_30.setColumns(10);
		contentPane.add(textField_30);

		JLabel lblAlmacenamiento = new JLabel("Almacenamiento1");
		lblAlmacenamiento.setBounds(304, 125, 100, 30);
		lblAlmacenamiento.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblAlmacenamiento);

		tPSobremesa = new JTabbedPane(JTabbedPane.TOP);
		tPSobremesa.setBounds(45, 200, 709, 244);
		tPSobremesa.setBackground(new Color(135, 206, 235));
		contentPane.add(tPSobremesa);

		panelSobremesa = new JPanel();
		panelSobremesa.setBackground(new Color(135, 206, 235));
		tPSobremesa.addTab("Sobremesa", null, panelSobremesa, null);

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
		panelSobremesa.setLayout(null);
		panelSobremesa.add(label_20);
		panelSobremesa.add(label_19);
		panelSobremesa.add(textField_18);
		panelSobremesa.add(label_18);
		panelSobremesa.add(textField_17);
		panelSobremesa.add(label_17);
		panelSobremesa.add(textField_16);
		panelSobremesa.add(textField_13);
		panelSobremesa.add(label_15);

		JLabel label_25 = new JLabel("PROCESADOR");
		label_25.setBounds(552, 72, 94, 14);
		panelSobremesa.add(label_25);
		label_25.setFont(new Font("Tahoma", Font.BOLD, 13));

		JLabel label_24 = new JLabel("Modelo");
		label_24.setBounds(520, 102, 60, 14);
		panelSobremesa.add(label_24);
		label_24.setFont(new Font("Tahoma", Font.PLAIN, 12));

		textField_22 = new JTextField();
		textField_22.setBounds(576, 99, 86, 20);
		panelSobremesa.add(textField_22);
		textField_22.setColumns(10);

		textField_21 = new JTextField();
		textField_21.setBounds(576, 130, 86, 20);
		panelSobremesa.add(textField_21);
		textField_21.setColumns(10);

		JLabel label_23 = new JLabel("Velocidad");
		label_23.setBounds(505, 133, 65, 14);
		panelSobremesa.add(label_23);
		label_23.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JLabel label_26 = new JLabel("MEMORIA RAM ");
		label_26.setBounds(307, 81, 110, 14);
		panelSobremesa.add(label_26);
		label_26.setFont(new Font("Tahoma", Font.BOLD, 13));

		JLabel label_22 = new JLabel("Capacidad");
		label_22.setBounds(260, 108, 60, 14);
		panelSobremesa.add(label_22);
		label_22.setFont(new Font("Tahoma", Font.PLAIN, 12));

		textField_20 = new JTextField();
		textField_20.setBounds(331, 106, 86, 20);
		panelSobremesa.add(textField_20);
		textField_20.setColumns(10);

		textField_19 = new JTextField();
		textField_19.setBounds(331, 139, 86, 20);
		panelSobremesa.add(textField_19);
		textField_19.setColumns(10);

		JLabel label_21 = new JLabel("Velocidad");
		label_21.setBounds(260, 141, 60, 14);
		panelSobremesa.add(label_21);
		label_21.setFont(new Font("Tahoma", Font.PLAIN, 12));

		textField_12 = new JTextField();
		textField_12.setBounds(576, 36, 86, 20);
		panelSobremesa.add(textField_12);
		textField_12.setColumns(10);

		JLabel label_16 = new JLabel("SSOO");
		label_16.setBounds(527, 38, 39, 14);
		panelSobremesa.add(label_16);
		label_16.setFont(new Font("Tahoma", Font.PLAIN, 12));

		panelPortatil = new JPanel();
		panelPortatil.setBackground(new Color(135, 206, 235));
		tPSobremesa.addTab("Portatil", null, panelPortatil, null);
		panelPortatil.setLayout(null);

		JLabel label_8 = new JLabel("Almacenamiento");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_8.setBounds(10, 145, 91, 14);
		panelPortatil.add(label_8);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(111, 142, 86, 20);
		panelPortatil.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(111, 105, 86, 20);
		panelPortatil.add(textField_5);

		JLabel label_9 = new JLabel("Modelo");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_9.setBounds(55, 107, 46, 14);
		panelPortatil.add(label_9);

		JLabel label_10 = new JLabel("Marca");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_10.setBounds(55, 66, 43, 14);
		panelPortatil.add(label_10);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(111, 64, 86, 20);
		panelPortatil.add(textField_6);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(561, 34, 86, 20);
		panelPortatil.add(textField_7);

		JLabel label_11 = new JLabel("SSOO");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_11.setBounds(512, 36, 39, 14);
		panelPortatil.add(label_11);

		JLabel label_12 = new JLabel("MEMORIA RAM");
		label_12.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_12.setBounds(318, 89, 110, 14);
		panelPortatil.add(label_12);

		JLabel label_35 = new JLabel("Capacidad");
		label_35.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_35.setBounds(271, 116, 60, 14);
		panelPortatil.add(label_35);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(342, 114, 86, 20);
		panelPortatil.add(textField_8);

		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(342, 147, 86, 20);
		panelPortatil.add(textField_9);

		JLabel label_36 = new JLabel("Velocidad");
		label_36.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_36.setBounds(271, 149, 60, 14);
		panelPortatil.add(label_36);

		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(568, 97, 86, 20);
		panelPortatil.add(textField_10);

		JLabel label_37 = new JLabel("Modelo");
		label_37.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_37.setBounds(512, 100, 60, 14);
		panelPortatil.add(label_37);

		JLabel label_38 = new JLabel("Velocidad");
		label_38.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_38.setBounds(497, 131, 65, 14);
		panelPortatil.add(label_38);

		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(568, 128, 86, 20);
		panelPortatil.add(textField_11);

		JLabel label_39 = new JLabel("PROCESADOR");
		label_39.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_39.setBounds(544, 70, 94, 14);
		panelPortatil.add(label_39);

		JLabel label_40 = new JLabel("TARJETA GR\u00C1FICA");
		label_40.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_40.setBounds(55, 36, 122, 14);
		panelPortatil.add(label_40);

		JLabel label_41 = new JLabel("Resoluci\u00F3n");
		label_41.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_41.setBounds(261, 64, 60, 14);
		panelPortatil.add(label_41);

		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(332, 62, 86, 20);
		panelPortatil.add(textField_31);

		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(332, 34, 86, 20);
		panelPortatil.add(textField_32);

		JLabel label_42 = new JLabel("Pulgadas");
		label_42.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_42.setBounds(270, 39, 52, 14);
		panelPortatil.add(label_42);

		panelSmartTablet = new JPanel();
		panelSmartTablet.setBackground(new Color(135, 206, 235));
		tPSobremesa.addTab("Smartphone / Tablet", null, panelSmartTablet, null);
		panelSmartTablet.setLayout(null);

		JLabel label_32 = new JLabel("Resoluci\u00F3n c\u00E1mara");
		label_32.setBounds(99, 82, 110, 14);
		panelSmartTablet.add(label_32);
		label_32.setFont(new Font("Tahoma", Font.PLAIN, 12));

		textField_27 = new JTextField();
		textField_27.setBounds(210, 80, 86, 20);
		panelSmartTablet.add(textField_27);
		textField_27.setColumns(10);

		JLabel label_14 = new JLabel("Pulgadas");
		label_14.setBounds(355, 65, 52, 14);
		panelSmartTablet.add(label_14);
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 12));

		textField_14 = new JTextField();
		textField_14.setBounds(422, 63, 86, 20);
		panelSmartTablet.add(textField_14);
		textField_14.setColumns(10);

		rdbtnNo_1 = new JRadioButton("No");
		rdbtnNo_1.setActionCommand(rdbtnNo_1.getText());
		rdbtnNo_1.setBackground(new Color(135, 206, 235));
		rdbtnNo_1.setBounds(477, 129, 55, 20);
		panelSmartTablet.add(rdbtnNo_1);

		rdbtnSi_1 = new JRadioButton("Si");
		rdbtnSi_1.setActionCommand(rdbtnSi_1.getText());
		rdbtnSi_1.setBackground(new Color(135, 206, 235));
		rdbtnSi_1.setBounds(425, 129, 46, 20);
		panelSmartTablet.add(rdbtnSi_1);

		group7 = new ButtonGroup();
		group7.add(rdbtnNo_1);
		group7.add(rdbtnSi_1);

		if (rdbtnNo_1.isSelected()) {
			rdbtnSi_1.setEnabled(false);
		} else if (rdbtnSi_1.isSelected()) {
			rdbtnNo_1.setEnabled(true);
		}

		JLabel label_43 = new JLabel("NFC");
		label_43.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_43.setBounds(379, 132, 29, 14);
		panelSmartTablet.add(label_43);

		JLabel label_44 = new JLabel("Giroscopio");
		label_44.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_44.setBounds(355, 102, 69, 14);
		panelSmartTablet.add(label_44);

		rdbtnSi = new JRadioButton("Si");
		rdbtnSi.setActionCommand(rdbtnSi.getText());
		rdbtnSi.setBackground(new Color(135, 206, 235));
		rdbtnSi.setBounds(425, 100, 46, 20);
		panelSmartTablet.add(rdbtnSi);

		rdbtnNo = new JRadioButton("No");
		rdbtnNo.setActionCommand(rdbtnNo.getText());
		rdbtnNo.setBackground(new Color(135, 206, 235));
		rdbtnNo.setBounds(477, 100, 55, 20);
		panelSmartTablet.add(rdbtnNo);

		group6 = new ButtonGroup();
		group6.add(rdbtnNo);
		group6.add(rdbtnSi);

		if (rdbtnNo.isSelected()) {
			rdbtnSi.setEnabled(false);
		} else if (rdbtnSi.isSelected()) {
			rdbtnNo.setEnabled(true);
		}

		JLabel lblTipo_1 = new JLabel("Tipo");
		lblTipo_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTipo_1.setBounds(163, 136, 46, 14);
		panelSmartTablet.add(lblTipo_1);

		rdbtnSmartphone = new JRadioButton("Smartphone");
		rdbtnSmartphone.setActionCommand(rdbtnSmartphone.getText());
		rdbtnSmartphone.setBackground(new Color(135, 206, 235));
		rdbtnSmartphone.setBounds(210, 118, 86, 20);
		panelSmartTablet.add(rdbtnSmartphone);

		rdbtnTablet = new JRadioButton("Tablet");
		rdbtnTablet.setActionCommand(rdbtnTablet.getText());
		rdbtnTablet.setBackground(new Color(135, 206, 235));
		rdbtnTablet.setBounds(210, 146, 55, 20);
		panelSmartTablet.add(rdbtnTablet);

		group3 = new ButtonGroup();
		group3.add(rdbtnTablet);
		group3.add(rdbtnSmartphone);

		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(210, 49, 86, 20);
		panelSmartTablet.add(textField_15);

		JLabel label = new JLabel("Resoluci\u00F3n");
		label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label.setBounds(143, 49, 57, 14);
		panelSmartTablet.add(label);

		if (rdbtnTablet.isSelected()) {
			rdbtnSmartphone.setEnabled(false);
		} else if (rdbtnSmartphone.isSelected()) {
			rdbtnTablet.setEnabled(true);
		}

		panelTabletaGrafica = new JPanel();
		panelTabletaGrafica.setBackground(new Color(135, 206, 235));
		tPSobremesa.addTab("Tableta Gr\u00E1fica", null, panelTabletaGrafica, null);
		panelTabletaGrafica.setLayout(null);

		JLabel lblTamao = new JLabel("Tama\u00F1o");
		lblTamao.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTamao.setBounds(232, 92, 59, 14);
		panelTabletaGrafica.add(lblTamao);

		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(306, 90, 86, 20);
		panelTabletaGrafica.add(textField_35);

		panelCintiq = new JPanel();
		panelCintiq.setBackground(new Color(135, 206, 235));
		tPSobremesa.addTab("Cintiq", null, panelCintiq, null);
		panelCintiq.setLayout(null);

		JLabel label_48 = new JLabel("TARJETA GR\u00C1FICA");
		label_48.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_48.setBounds(74, 30, 122, 14);
		panelCintiq.add(label_48);

		JLabel label_49 = new JLabel("Marca");
		label_49.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_49.setBounds(70, 60, 43, 14);
		panelCintiq.add(label_49);

		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(126, 58, 86, 20);
		panelCintiq.add(textField_37);

		JLabel label_50 = new JLabel("Modelo");
		label_50.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_50.setBounds(70, 101, 46, 14);
		panelCintiq.add(label_50);

		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(126, 99, 86, 20);
		panelCintiq.add(textField_38);

		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(126, 136, 86, 20);
		panelCintiq.add(textField_39);

		JLabel label_51 = new JLabel("Almacenamiento");
		label_51.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_51.setBounds(25, 139, 91, 14);
		panelCintiq.add(label_51);

		JLabel label_52 = new JLabel("MEMORIA RAM ");
		label_52.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_52.setBounds(322, 75, 110, 14);
		panelCintiq.add(label_52);

		JLabel label_53 = new JLabel("Capacidad");
		label_53.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_53.setBounds(275, 102, 60, 14);
		panelCintiq.add(label_53);

		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(346, 100, 86, 20);
		panelCintiq.add(textField_40);

		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(346, 133, 86, 20);
		panelCintiq.add(textField_41);

		JLabel label_54 = new JLabel("Velocidad");
		label_54.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_54.setBounds(275, 135, 60, 14);
		panelCintiq.add(label_54);

		JLabel label_55 = new JLabel("Modelo");
		label_55.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_55.setBounds(535, 96, 60, 14);
		panelCintiq.add(label_55);

		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(591, 93, 86, 20);
		panelCintiq.add(textField_42);

		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(591, 124, 86, 20);
		panelCintiq.add(textField_43);

		JLabel label_56 = new JLabel("Velocidad");
		label_56.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_56.setBounds(520, 127, 65, 14);
		panelCintiq.add(label_56);

		JLabel label_57 = new JLabel("PROCESADOR");
		label_57.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_57.setBounds(567, 66, 94, 14);
		panelCintiq.add(label_57);

		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBounds(346, 35, 86, 20);
		panelCintiq.add(textField_44);

		JLabel label_58 = new JLabel("Resoluci\u00F3n");
		label_58.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_58.setBounds(277, 37, 60, 14);
		panelCintiq.add(label_58);

		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBounds(589, 35, 86, 20);
		panelCintiq.add(textField_45);

		JLabel lblEquipoEnlazado = new JLabel("Equipo Asociado");
		lblEquipoEnlazado.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEquipoEnlazado.setBounds(489, 37, 91, 14);
		panelCintiq.add(lblEquipoEnlazado);

		panelTvMonitor = new JPanel();
		panelTvMonitor.setBackground(new Color(135, 206, 235));
		tPSobremesa.addTab("Monitor / TV", null, panelTvMonitor, null);
		panelTvMonitor.setLayout(null);

		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBounds(120, 67, 86, 20);
		panelTvMonitor.add(textField_46);

		JLabel lblConexiones = new JLabel("Conexiones");
		lblConexiones.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblConexiones.setBounds(36, 69, 72, 14);
		panelTvMonitor.add(lblConexiones);

		JLabel lblEquipoAsociado = new JLabel("Equipo Asociado");
		lblEquipoAsociado.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEquipoAsociado.setBounds(21, 98, 89, 14);
		panelTvMonitor.add(lblEquipoAsociado);

		textField_47 = new JTextField();
		textField_47.setColumns(10);
		textField_47.setBounds(120, 96, 86, 20);
		panelTvMonitor.add(textField_47);

		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTipo.setBounds(271, 69, 34, 14);
		panelTvMonitor.add(lblTipo);

		JLabel label_62 = new JLabel("Resoluci\u00F3n");
		label_62.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_62.setBounds(281, 98, 60, 14);
		panelTvMonitor.add(label_62);

		textField_49 = new JTextField();
		textField_49.setColumns(10);
		textField_49.setBounds(346, 96, 86, 20);
		panelTvMonitor.add(textField_49);

		JLabel lblTamao_1 = new JLabel("Tama\u00F1o");
		lblTamao_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTamao_1.setBounds(496, 82, 60, 14);
		panelTvMonitor.add(lblTamao_1);

		textField_51 = new JTextField();
		textField_51.setColumns(10);
		textField_51.setBounds(578, 80, 86, 20);
		panelTvMonitor.add(textField_51);

		rdbtnTv = new JRadioButton("Television");
		rdbtnTv.setActionCommand(rdbtnTv.getText());
		rdbtnTv.setBackground(new Color(135, 206, 235));
		rdbtnTv.setBounds(311, 67, 81, 20);
		panelTvMonitor.add(rdbtnTv);

		rdbtnMonitor = new JRadioButton("Monitor");
		rdbtnMonitor.setActionCommand(rdbtnMonitor.getText());
		rdbtnMonitor.setBackground(new Color(135, 206, 235));
		rdbtnMonitor.setBounds(394, 67, 72, 20);
		panelTvMonitor.add(rdbtnMonitor);

		group4 = new ButtonGroup();
		group4.add(rdbtnTv);
		group4.add(rdbtnMonitor);

		if (rdbtnTv.isSelected()) {
			rdbtnMonitor.setEnabled(false);
		} else if (rdbtnMonitor.isSelected()) {
			rdbtnTv.setEnabled(true);
		}

		panelProyector = new JPanel();
		panelProyector.setBackground(new Color(135, 206, 235));
		tPSobremesa.addTab("Proyector", null, panelProyector, null);
		panelProyector.setLayout(null);

		JLabel lblResolucion = new JLabel("Resolucion");
		lblResolucion.setBounds(144, 100, 57, 15);
		lblResolucion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelProyector.add(lblResolucion);

		textField_36 = new JTextField();
		textField_36.setBounds(222, 98, 86, 20);
		textField_36.setColumns(10);
		panelProyector.add(textField_36);

		radioButton_8 = new JRadioButton("Si");
		radioButton_8.setActionCommand(radioButton_8.getText());
		radioButton_8.setBackground(new Color(135, 206, 235));
		radioButton_8.setBounds(419, 98, 46, 20);
		panelProyector.add(radioButton_8);

		radioButton_9 = new JRadioButton("No");
		radioButton_9.setActionCommand(radioButton_9.getText());
		radioButton_9.setBackground(new Color(135, 206, 235));
		radioButton_9.setBounds(467, 98, 55, 20);
		panelProyector.add(radioButton_9);

		group5 = new ButtonGroup();
		group5.add(radioButton_8);
		group5.add(radioButton_9);

		if (radioButton_8.isSelected()) {
			radioButton_9.setEnabled(false);
		} else if (radioButton_9.isSelected()) {
			radioButton_8.setEnabled(true);
		}

		JLabel lblHdmi = new JLabel("HDMI");
		lblHdmi.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHdmi.setBounds(363, 100, 46, 14);
		panelProyector.add(lblHdmi);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnCancelar.setBounds(45, 455, 130, 32);
		contentPane.add(btnCancelar);

		btnRealizarPrestamo = new JButton("Realizar Pr\u00E9stamo");
		btnRealizarPrestamo.setBounds(195, 455, 130, 32);
		btnRealizarPrestamo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				pantalla1.setVisible(true);
			}
		});
		contentPane.add(btnRealizarPrestamo);
		btnRealizarPrestamo.setFont(new Font("Times New Roman", Font.BOLD, 11));

		btnBajaEquipo = new JButton("Dar de baja equipo");
		btnBajaEquipo.setBounds(341, 455, 130, 32);
		contentPane.add(btnBajaEquipo);
		btnBajaEquipo.setFont(new Font("Times New Roman", Font.BOLD, 11));

		btnDescartarCambios = new JButton("Descartar cambios");
		btnDescartarCambios.setBounds(481, 455, 130, 32);
		contentPane.add(btnDescartarCambios);
		btnDescartarCambios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idEquipo = Integer.parseInt(pantalla.getSelectedRowID());
				equipoControlador.actualizarTfs(idEquipo);
			}
		});
		btnDescartarCambios.setFont(new Font("Times New Roman", Font.BOLD, 11));

		btnGuardarCambios = new JButton("Guardar cambios");
		btnGuardarCambios.setBounds(621, 456, 130, 32);
		contentPane.add(btnGuardarCambios);
		btnGuardarCambios.setFont(new Font("Times New Roman", Font.BOLD, 11));

		JLabel lblAlmacenamiento_1 = new JLabel("Almacenamiento2");
		lblAlmacenamiento_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAlmacenamiento_1.setBounds(304, 157, 100, 30);
		contentPane.add(lblAlmacenamiento_1);

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Paris", "Madrid", "Berlin" }));
		comboBox.setBounds(401, 58, 89, 20);
		contentPane.add(comboBox);

		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(
				new String[] { "docencia", "investigacion", "taller", "secretaria", "administrativo" }));
		comboBox_1.setBounds(657, 74, 69, 20);
		contentPane.add(comboBox_1);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				pantalla.setVisible(true);
			}
		});
	}

	public void setTextField(String textField) {
		this.textField.setText(textField);
	}

	public void setTextField_2(String textField_2) {
		this.textField_2.setText(textField_2);
	}

	public void setTextField_3(String textField_3) {
		this.textField_3.setText(textField_3);
	}

	public void setTextField_12(String textField_12) {
		this.textField_12.setText(textField_12);
	}

	public void setTextField_13(String textField_13) {
		this.textField_13.setText(textField_13);
	}

	public void setTextField_14(String textField_14) {
		this.textField_14.setText(textField_14);
	}

	public void setTextField_16(String textField_16) {
		this.textField_16.setText(textField_16);
	}

	public void setTextField_17(String textField_17) {
		this.textField_17.setText(textField_17);
	}

	public void setTextField_18(String textField_18) {
		this.textField_18.setText(textField_18);
	}

	public void setTextField_19(String textField_19) {
		this.textField_19.setText(textField_19);
	}

	public void setTextField_20(String textField_20) {
		this.textField_20.setText(textField_20);
	}

	public void setTextField_21(String textField_21) {
		this.textField_21.setText(textField_21);
	}

	public void setTextField_22(String textField_22) {
		this.textField_22.setText(textField_22);
	}

	public void setTextField_26(String textField_26) {
		this.textField_26.setText(textField_26);
	}

	public void setTextField_27(String textField_27) {
		this.textField_27.setText(textField_27);
	}

	public void setTextField_29(String textField_29) {
		this.textField_29.setText(textField_29);
	}

	public void setTextField_30(String textField_30) {
		this.textField_30.setText(textField_30);
	}

	public void setTextNotas(String textArea) {
		this.textAreaNotas.setText(textArea);
	}

	public void setTextField_4(String textField_4) {
		this.textField_4.setText(textField_4);
	}

	public void setTextField_5(String textField_5) {
		this.textField_5.setText(textField_5);
	}

	public void setTextField_6(String textField_6) {
		this.textField_6.setText(textField_6);
	}

	public void setTextField_7(String textField_7) {
		this.textField_7.setText(textField_7);
	}

	public void setTextField_8(String textField_8) {
		this.textField_8.setText(textField_8);
	}

	public void setTextField_9(String textField_9) {
		this.textField_9.setText(textField_9);
	}

	public void setTextField_10(String textField_10) {
		this.textField_10.setText(textField_10);
	}

	public void setTextField_11(String textField_11) {
		this.textField_11.setText(textField_11);
	}

	public void setTextField_31(String textField_31) {
		this.textField_31.setText(textField_31);
	}

	public void setTextField_32(String textField_32) {
		this.textField_32.setText(textField_32);
	}

	public void setTextField_35(String textField_35) {
		this.textField_35.setText(textField_35);
	}

	public void setTextField_36(String textField_36) {
		this.textField_36.setText(textField_36);
	}

	public void setTextField_37(String textField_37) {
		this.textField_37.setText(textField_37);
	}

	public void setTextField_38(String textField_38) {
		this.textField_38.setText(textField_38);
	}

	public void setTextField_39(String textField_39) {
		this.textField_39.setText(textField_39);
	}

	public void setTextField_40(String textField_40) {
		this.textField_40.setText(textField_40);
	}

	public void setTextField_41(String textField_41) {
		this.textField_41.setText(textField_41);
	}

	public void setTextField_42(String textField_42) {
		this.textField_42.setText(textField_42);
	}

	public void setTextField_43(String textField_43) {
		this.textField_43.setText(textField_43);
	}

	public void setTextField_44(String textField_44) {
		this.textField_44.setText(textField_44);
	}

	public void setTextField_45(String textField_45) {
		this.textField_45.setText(textField_45);
	}

	public void setTextField_46(String textField_46) {
		this.textField_46.setText(textField_46);
	}

	public void setTextField_47(String textField_47) {
		this.textField_47.setText(textField_47);
	}

	public void setTextField_49(String textField_49) {
		this.textField_49.setText(textField_49);
	}

	public JTextArea getTextAreaNotas() {
		return textAreaNotas;
	}

	public void setTextAreaNotas(JTextArea textAreaNotas) {
		this.textAreaNotas = textAreaNotas;
	}

	public void setTextField_51(String textField_51) {
		this.textField_51.setText(textField_51);
	}

	public void setTextField_15(String textField_15) {
		this.textField_15.setText(textField_15);
	}

	public void setEdificio(String edificio) {
		comboBox.setSelectedItem(edificio);
	}

	public void setTipoUso(String tipoUso) {
		comboBox_1.setSelectedItem(tipoUso);
	}

	public void setGrupo1RB(String rb) {
		if (rb.equals("si")) {
			radioButton.setSelected(true);
		} else if (rb.equals("no")) {
			radioButton_1.setSelected(true);
		}
	}

	public void setGrupo2RB(String rb) {
		if (rb.equals("si")) {
			radioButton_3.setSelected(true);
		} else if (rb.equals("no")) {
			radioButton_2.setSelected(true);
		}
	}

	public void setGrupo3RB(String rb) {
		if (rb.equals("Tablet")) {
			rdbtnTablet.setSelected(true);
		} else if (rb.equals("Movil")) {
			rdbtnSmartphone.setSelected(true);
		}
	}

	public void setGrupo4RB(String rb) {
		if (rb.equals("Television")) {
			rdbtnTv.setSelected(true);
		} else if (rb.equals("Monitor")) {
			rdbtnMonitor.setSelected(true);
		}
	}

	public void setGrupo5RB(String rb) {
		if (rb.equals("Si")) {
			radioButton_8.setSelected(true);
		} else if (rb.equals("No")) {
			radioButton_9.setSelected(true);
		}
	}

	public void setGrupo6RB(String rb) {
		if (rb.equals("Si")) {
			rdbtnSi.setSelected(true);
		} else if (rb.equals("No")) {
			rdbtnNo.setSelected(true);
		}
	}

	public void setGrupo7RB(String rb) {
		if (rb.equals("Si")) {
			rdbtnSi_1.setSelected(true);
		} else if (rb.equals("No")) {
			rdbtnNo_1.setSelected(true);
		}
	}

	/*
	 * public String getTextField() { return textField.getText(); }
	 *
	 * public String getTextField_2() { return textField_2; }
	 * 
	 * public String getTextField_3() { return textField_3; }
	 * 
	 * public String getTextField_12() { return textField_12.text; }
	 * 
	 * public String getTextField_13() { return textField_13; }
	 * 
	 * public String getTextField_14() { return textField_14; }
	 * 
	 * public String getTextField_16() { return textField_16; }
	 * 
	 * public String getTextField_17() { return textField_17; }
	 * 
	 * public String getTextField_18() { return textField_18; }
	 * 
	 * public String getTextField_19() { return textField_19; }
	 * 
	 * public String getTextField_20() { return textField_20; }
	 * 
	 * public String getTextField_21() { return textField_21; }
	 * 
	 * public String getTextField_22() { return textField_22; }
	 * 
	 * public String getTextField_26() { return textField_26; }
	 * 
	 * public String getTextField_27() { return textField_27; }
	 * 
	 * public String getTextField_29() { return textField_29; }
	 * 
	 * public String getTextField_30() { return textField_30; }
	 * 
	 * public String getTextField_4() { return textField_4; }
	 * 
	 * public String getTextField_5() { return textField_5; }
	 * 
	 * public String getTextField_6() { return textField_6; }
	 * 
	 * public String getTextField_7() { return textField_7; }
	 * 
	 * public String getTextField_8() { return textField_8; }
	 * 
	 * public String getTextField_9() { return textField_9; }
	 * 
	 * public String getTextField_10() { return textField_10; }
	 * 
	 * public String getTextField_11() { return textField_11; }
	 * 
	 * public String getTextField_31() { return textField_31; }
	 * 
	 * public String getTextField_32() { return textField_32; }
	 * 
	 * public String getTextField_35() { return textField_35; }
	 * 
	 * public String getTextField_36() { return textField_36; }
	 * 
	 * public String getTextField_37() { return textField_37; }
	 * 
	 * public String getTextField_38() { return textField_38; }
	 * 
	 * public String getTextField_39() { return textField_39; }
	 * 
	 * public String getTextField_40() { return textField_40; }
	 * 
	 * public String getTextField_41() { return textField_41; }
	 * 
	 * public String getTextField_42() { return textField_42; }
	 * 
	 * public String getTextField_43() { return textField_43; }
	 * 
	 * public String getTextField_44() { return textField_44; }
	 * 
	 * public String getTextField_45() { return textField_45; }
	 * 
	 * public String getTextField_46() { return textField_46; }
	 * 
	 * public String getTextField_47() { return textField_47; }
	 * 
	 * public String getTextField_49() { return textField_49; }
	 * 
	 * public String getTextField_50() { return textField_50; }
	 * 
	 * public String getTextField_51() { return textField_51; }
	 * 
	 * public String getTextField_48() { return textField_48; }
	 * 
	 * public ButtonGroup getGroup1() { return group1; }
	 * 
	 * public ButtonGroup getGroup2() { return group2; }
	 * 
	 * public ButtonGroup getGroup3() { return group3; }
	 * 
	 * public ButtonGroup getGroup4() { return group4; }
	 * 
	 * public ButtonGroup getGroup5() { return group5; }
	 * 
	 * public ButtonGroup getGroup6() { return group6; }
	 * 
	 * public ButtonGroup getGroup7() { return group7; }
	 * 
	 * public JTextField getTextField_15() { return textField_15; }
	 */

	public void setCaracEqCont(Caracteristicas_EquipoControlador equipoControlador) {
		this.equipoControlador = equipoControlador;
	}

	public void setPantalla(TbEquipos Pantalla) {
		this.pantalla = Pantalla;
	}

	public void setPantalla1(RegPrestamos Pantalla1) {
		this.pantalla1 = Pantalla1;
	}
}
