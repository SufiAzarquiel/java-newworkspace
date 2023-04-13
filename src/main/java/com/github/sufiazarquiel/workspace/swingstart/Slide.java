package com.github.sufiazarquiel.workspace.swingstart;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Slide extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblValor;
	private JSlider slider;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Slide frame = new Slide();
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
	public Slide() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblValor = new JLabel("0");
		lblValor.setHorizontalAlignment(SwingConstants.CENTER);
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblValor.setBounds(113, 58, 200, 59);
		contentPane.add(lblValor);
		
		slider = new JSlider();
		updateSlider();
		
		slider.setBounds(113, 147, 200, 26);
		contentPane.add(slider);
	}
	
	private void updateSlider() {
		slider.addChangeListener(new ChangeListener() {
			String valor;
			public void stateChanged(ChangeEvent e) {
				valor = Integer.toString(slider.getValue());
				lblValor.setText(valor);
			}
		});
	}
}
