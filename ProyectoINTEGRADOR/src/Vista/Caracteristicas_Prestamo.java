package Vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;

public class Caracteristicas_Prestamo extends JFrame{
	private JTextField textFieldEquipoPrestado;
	private JTextField textFieldResponsable;
	private JTextField textFieldDestinodelprestamo;
	private JTextField textFieldCodigoEQuipo;
	public Caracteristicas_Prestamo() {
		getContentPane().setBackground(new Color(135, 206, 235));
		getContentPane().setForeground(SystemColor.textHighlight);
		getContentPane().setLayout(null);
		
		JLabel Fechainiciolbl = new JLabel("Fecha inicio");
		Fechainiciolbl.setFont(new Font("SansSerif", Font.PLAIN, 13));
		Fechainiciolbl.setBounds(123, 100, 71, 14);
		getContentPane().add(Fechainiciolbl);
		
		JFormattedTextField TextFieldFechainicio = new JFormattedTextField();
		TextFieldFechainicio.setBounds(197, 98, 93, 20);
		getContentPane().add(TextFieldFechainicio);
		
		JLabel lablfechadevolucion = new JLabel("Fecha devolucion");
		lablfechadevolucion.setFont(new Font("SansSerif", Font.PLAIN, 13));
		lablfechadevolucion.setBounds(93, 146, 107, 14);
		getContentPane().add(lablfechadevolucion);
		
		JFormattedTextField TextFieldFechadevolucion = new JFormattedTextField();
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
		
		JButton btndescartarcambios = new JButton("Descartar Cambios");
		btndescartarcambios.setFont(new Font("SansSerif", Font.BOLD, 12));
		btndescartarcambios.setBounds(142, 333, 143, 25);
		getContentPane().add(btndescartarcambios);
		
		JButton buttonCancelar = new JButton("Cancelar");
		buttonCancelar.setFont(new Font("SansSerif", Font.BOLD, 12));
		buttonCancelar.setBounds(43, 333, 89, 25);
		getContentPane().add(buttonCancelar);
		
		JButton btneliminar = new JButton("Eliminar");
		btneliminar.setFont(new Font("SansSerif", Font.BOLD, 12));
		btneliminar.setBounds(456, 333, 143, 25);
		getContentPane().add(btneliminar);
		
		JButton btnGuardarCambios = new JButton("GuardarCambios");
		btnGuardarCambios.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnGuardarCambios.setBounds(295, 333, 143, 25);
		getContentPane().add(btnGuardarCambios);
	}
}
