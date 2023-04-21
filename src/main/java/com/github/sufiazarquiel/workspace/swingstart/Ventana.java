package com.github.sufiazarquiel.workspace.swingstart;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// Set the look and feel to that of the current platform
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					Ventana frame = new Ventana();
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
	public Ventana() {
		setTitle("MiVentana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(230, 99, 213, 76);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnRed = new JButton("Red");
		btnRed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setForeground(Color.RED);
				textField.setText("Rojo");
			}
		});
		btnRed.setBounds(102, 265, 89, 23);
		contentPane.add(btnRed);
		
		JButton btnGreen = new JButton("Green");
		btnGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setForeground(Color.GREEN);
				textField.setText("Verde");
			}
		});
		btnGreen.setBounds(284, 265, 89, 23);
		contentPane.add(btnGreen);
		
		JButton btnBlue = new JButton("Blue");
		btnBlue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setForeground(Color.BLUE);
				textField.setText("Azul");
			}
		});
		btnBlue.setBounds(458, 265, 89, 23);
		contentPane.add(btnBlue);
	}

}
