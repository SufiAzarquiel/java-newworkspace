package com.github.sufiazarquiel.workspace.basicFormWindow;

import java.awt.Desktop;
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
import java.io.File;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Form extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldName;
	private JTextField textFieldAge;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					Form frame = new Form();
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
	public Form() {
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

		JLabel lblAge = new JLabel("Edad:");
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAge.setBounds(47, 81, 72, 26);
		contentPane.add(lblAge);

		textFieldName = new JTextField();
		textFieldName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldName.setBounds(129, 32, 253, 26);
		contentPane.add(textFieldName);
		textFieldName.setColumns(10);

		textFieldAge = new JTextField();
		textFieldAge.setEditable(false);
		textFieldAge.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldAge.setBounds(129, 81, 46, 26);
		contentPane.add(textFieldAge);
		textFieldAge.setColumns(10);

		JButton btnSend = new JButton("Enviar");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				send();
			}
		});
		btnSend.setBounds(172, 227, 89, 23);
		contentPane.add(btnSend);

		JButton btnThreeDots = new JButton("...");
		btnThreeDots.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				threeDotsPressed();
			}
		});
		btnThreeDots.setBounds(188, 81, 32, 27);
		contentPane.add(btnThreeDots);
	}

	public JTextField getTextFieldAge() {
		return textFieldAge;
	}

	private void send() {
		try {
			if (textFieldName.getText().isBlank()) {
				JOptionPane.showMessageDialog(this, "Rellena el campo nombre", "Error", JOptionPane.WARNING_MESSAGE);
			} else if (textFieldAge.getText().isBlank()) {
				JOptionPane.showMessageDialog(this, "Rellena el campo edad", "Error", JOptionPane.WARNING_MESSAGE);
			} else {
				sendDataToFormWriter();
				// If data is correct, close the window
				this.dispose();
			}
		} catch (HeadlessException e) {
			JOptionPane.showMessageDialog(this, "El dialogo se siente huerfano", "Error", JOptionPane.WARNING_MESSAGE);
		}
	}

	private void sendDataToFormWriter() {
		// This is the path of the file at home, at work it its the one below
		// String path = "C:\\Users\\sufia\\Desktop\\form.txt";
		String path = "C:\\Users\\diurno\\Desktop\\form.txt";
		ArrayList<String> data = new ArrayList<String>();
		data.add(textFieldName.getText());
		data.add(textFieldAge.getText());
		FormWriter formWriter = new FormWriter(path);
		formWriter.saveFormData(data);

		// Open the file
		try {
			Desktop.getDesktop().open(new File(path));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "No se ha podido abrir el archivo", "Error", JOptionPane.WARNING_MESSAGE);
		}
	}

	protected void threeDotsPressed() {
		// -------------------JOptionPane-------------------
		// String resultado = JOptionPane.showInputDialog(this, "Teclea tu edad:" ,
		// "Edad" , JOptionPane.PLAIN_MESSAGE);
		// textFieldAge.setText(resultado);

		// -------------------DialogoElegirEdad-------------------
		// Like a modal window but with a custom layout
		AgeSliderDialog myDialog = new AgeSliderDialog(this, true);
		myDialog.setLocationRelativeTo(this);
		myDialog.setVisible(true);
	}
}
