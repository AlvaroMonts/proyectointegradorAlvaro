package Vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Controlador.Caracteristicas_PrestamoControlador;

import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.Rectangle;

public class Caracteristicas_Prestamo extends JFrame {
	private JTextField textFieldEquipoPrestado;
	private JTextField textFieldResponsable;
	private JTextField textFieldDestinodelprestamo;
	private JTextField textFieldCodigoEQuipo;
	private JButton buttonCancelar;
	private JButton btndescartarcambios;
	private JButton btnGuardarCambios;
	private JButton btneliminar;
	private JFormattedTextField TextFieldFechadevolucion;
	private JFormattedTextField TextFieldFechainicio;
	private Caracteristicas_PrestamoControlador CPresCont;
	private TbPrestamos prestamo;
	private int idEquipo;

	public Caracteristicas_Prestamo() {
		setBounds(new Rectangle(100, 100, 700, 450));
		setTitle("Caracteristicas Prestamo");
		getContentPane().setBackground(new Color(135, 206, 235));
		getContentPane().setForeground(SystemColor.textHighlight);
		getContentPane().setLayout(null);

		JLabel Fechainiciolbl = new JLabel("Fecha inicio");
		Fechainiciolbl.setFont(new Font("SansSerif", Font.PLAIN, 13));
		Fechainiciolbl.setBounds(123, 100, 71, 14);
		getContentPane().add(Fechainiciolbl);

		TextFieldFechainicio = new JFormattedTextField();
		TextFieldFechainicio.setBounds(197, 98, 93, 20);
		getContentPane().add(TextFieldFechainicio);

		JLabel lablfechadevolucion = new JLabel("Fecha devolucion");
		lablfechadevolucion.setFont(new Font("SansSerif", Font.PLAIN, 13));
		lablfechadevolucion.setBounds(93, 146, 107, 14);
		getContentPane().add(lablfechadevolucion);

		TextFieldFechadevolucion = new JFormattedTextField();
		TextFieldFechadevolucion.setBounds(197, 144, 93, 20);
		getContentPane().add(TextFieldFechadevolucion);

		JLabel lblequipoPrestado = new JLabel("Equipo Prestado");
		lblequipoPrestado.setFont(new Font("SansSerif", Font.PLAIN, 13));
		lblequipoPrestado.setBounds(93, 196, 107, 14);
		getContentPane().add(lblequipoPrestado);

		textFieldEquipoPrestado = new JTextField();
		textFieldEquipoPrestado.setColumns(10);
		textFieldEquipoPrestado.setBounds(197, 194, 93, 20);
		getContentPane().add(textFieldEquipoPrestado);

		JLabel lblResponsable = new JLabel("Responsable");
		lblResponsable.setFont(new Font("SansSerif", Font.PLAIN, 13));
		lblResponsable.setBounds(376, 196, 79, 14);
		getContentPane().add(lblResponsable);

		JLabel lblDestinodelPrestamo = new JLabel("Destino del pr\u00E9stamo");
		lblDestinodelPrestamo.setFont(new Font("SansSerif", Font.PLAIN, 13));
		lblDestinodelPrestamo.setBounds(330, 146, 125, 14);
		getContentPane().add(lblDestinodelPrestamo);

		JLabel lblCodigoEquipo = new JLabel("C\u00F3digo del Equipo");
		lblCodigoEquipo.setFont(new Font("SansSerif", Font.PLAIN, 13));
		lblCodigoEquipo.setBounds(344, 100, 122, 14);
		getContentPane().add(lblCodigoEquipo);

		textFieldResponsable = new JTextField();
		textFieldResponsable.setColumns(10);
		textFieldResponsable.setBounds(456, 194, 86, 20);
		getContentPane().add(textFieldResponsable);

		textFieldDestinodelprestamo = new JTextField();
		textFieldDestinodelprestamo.setColumns(10);
		textFieldDestinodelprestamo.setBounds(456, 144, 86, 20);
		getContentPane().add(textFieldDestinodelprestamo);

		textFieldCodigoEQuipo = new JTextField();
		textFieldCodigoEQuipo.setEditable(false);
		textFieldCodigoEQuipo.setColumns(10);
		textFieldCodigoEQuipo.setBounds(456, 98, 86, 20);
		getContentPane().add(textFieldCodigoEQuipo);

		btndescartarcambios = new JButton("Descartar Cambios");
		btndescartarcambios.setFont(new Font("SansSerif", Font.BOLD, 13));
		btndescartarcambios.setBounds(142, 333, 156, 25);
		getContentPane().add(btndescartarcambios);

		buttonCancelar = new JButton("Cancelar");
		buttonCancelar.setFont(new Font("SansSerif", Font.BOLD, 13));
		buttonCancelar.setBounds(43, 333, 89, 25);
		buttonCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				prestamo.setVisible(true);
			}
		});
		getContentPane().add(buttonCancelar);

		btneliminar = new JButton("Eliminar");
		btneliminar.setFont(new Font("SansSerif", Font.BOLD, 13));
		btneliminar.setBounds(472, 333, 143, 25);
		getContentPane().add(btneliminar);

		btnGuardarCambios = new JButton("GuardarCambios");
		btnGuardarCambios.setFont(new Font("SansSerif", Font.BOLD, 13));
		btnGuardarCambios.setBounds(312, 333, 143, 25);
		getContentPane().add(btnGuardarCambios);
	}

	public String getTextFieldEquipoPrestado() {
		return textFieldEquipoPrestado.getText();
	}

	public String getTextFieldResponsable() {
		return textFieldResponsable.getText();
	}

	public String getTextFieldDestinodelprestamo() {
		return textFieldDestinodelprestamo.getText();
	}

	public String getTextFieldCodigoEQuipo() {
		return textFieldCodigoEQuipo.getText();
	}

	public String getTextFieldFechadevolucion() {
		return TextFieldFechadevolucion.getText();
	}

	public String getTextFieldFechainicio() {
		return TextFieldFechainicio.getText();
	}

	public void setTextFieldFechainicio(String textFieldFechainicio) {
		TextFieldFechainicio.setText(textFieldFechainicio);
	}

	public void setTextFieldEquipoPrestado(String textFieldEquipoPrestado) {
		this.textFieldEquipoPrestado.setText(textFieldEquipoPrestado);
	}

	public void setTextFieldResponsable(String textFieldResponsable) {
		this.textFieldResponsable.setText(textFieldResponsable);
	}

	public void setTextFieldDestinodelprestamo(String textFieldDestinodelprestamo) {
		this.textFieldDestinodelprestamo.setText(textFieldDestinodelprestamo);
	}

	public void setTextFieldCodigoEQuipo(String textFieldCodigoEQuipo) {
		this.textFieldCodigoEQuipo.setText(textFieldCodigoEQuipo);
	}

	public void setTextFieldFechadevolucion(String textFieldFechadevolucion) {
		TextFieldFechadevolucion.setText(textFieldFechadevolucion);
	}

	public void setCPresCont(Caracteristicas_PrestamoControlador cprescont) {
		this.CPresCont = cprescont;
	}

	public void setTbPrestamos(TbPrestamos prestamos) {
		this.prestamo = prestamos;
	}

	public void setID() {
		if (prestamo != null) {
			idEquipo = Integer.parseInt(prestamo.getSelectedRowID());
			CPresCont.actualizarTfs(idEquipo);
		}
	}
}