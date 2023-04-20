package com.github.sufiazarquiel.workspace.window;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario2 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldEdad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					Formulario2 frame = new Formulario2();
					frame.setLocationRelativeTo(null);
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
	public Formulario2() {
		setTitle("Formulario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(47, 32, 72, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEdad.setBounds(47, 81, 72, 26);
		contentPane.add(lblEdad);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldNombre.setBounds(129, 32, 253, 26);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldEdad = new JTextField();
		textFieldEdad.setEditable(false);
		textFieldEdad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldEdad.setBounds(129, 81, 46, 26);
		contentPane.add(textFieldEdad);
		textFieldEdad.setColumns(10);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enviar();
			}
		});
		btnNewButton.setBounds(172, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("...");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pulsadoTresPuntos();
			}
		});
		btnNewButton_1.setBounds(188, 81, 32, 27);
		contentPane.add(btnNewButton_1);
	}
	
	private void enviar() {
		try {
			if (textFieldNombre.getText().isBlank()) {
				JOptionPane.showMessageDialog(this, "Rellena el campo nombre", "Error", JOptionPane.WARNING_MESSAGE);
			} else if (textFieldEdad.getText().isBlank()) {
				JOptionPane.showMessageDialog(this, "Rellena el campo edad", "Error", JOptionPane.WARNING_MESSAGE);
			} else if (Integer.parseInt(textFieldEdad.getText()) < 0 || Integer.parseInt(textFieldEdad.getText()) > 120){
				JOptionPane.showMessageDialog(this, "Revisa la edad", "Edad un poco rara", JOptionPane.WARNING_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(this, "Datos enviados", "Correcto", JOptionPane.PLAIN_MESSAGE);
			}
		} catch (HeadlessException e) {
			JOptionPane.showMessageDialog(this, "El dialogo se siente huerfano", "Error", JOptionPane.WARNING_MESSAGE);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Revisa la edad", "Error", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	private void pulsadoTresPuntos() {
//		String resultado = JOptionPane.showInputDialog(this, "Teclea tu edad:" , "Edad" , JOptionPane.PLAIN_MESSAGE);
//		textFieldEdad.setText(resultado);
		
		DialogoElegirEdad miDialogo = new DialogoElegirEdad(this);
		miDialogo.setLocationRelativeTo(this); //que salga donde estemos
		miDialogo.setVisible(true);
	}
	
}







