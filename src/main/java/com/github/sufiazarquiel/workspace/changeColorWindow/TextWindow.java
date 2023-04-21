package com.github.sufiazarquiel.workspace.changeColorWindow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class TextWindow extends JFrame {

	private JPanel contentPane;
    private final int WINDOW_WIDTH = 720;
    private final int WINDOW_HEIGHT = 480;
    private JLabel lblColoredText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					TextWindow frame = new TextWindow();
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
	public TextWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, WINDOW_WIDTH, WINDOW_HEIGHT);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnChangeColor = new JButton("Cambiar Color");
        btnChangeColor.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    changeColorPressed();
                }
            }
        );
		btnChangeColor.setBounds(120, 183, 160, 44);
		contentPane.add(btnChangeColor);
		
        lblColoredText = new JLabel("Texto de Color");
		lblColoredText.setHorizontalAlignment(SwingConstants.CENTER);
		lblColoredText.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblColoredText.setBounds(64, 51, 265, 72);
		contentPane.add(lblColoredText);
	}

    public JLabel getLblColoredText() {
        return lblColoredText;
    }

    protected void changeColorPressed() {
        // Open the color dialog when the button is pressed
        ColorDialog dialog = new ColorDialog(this, true);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }
}