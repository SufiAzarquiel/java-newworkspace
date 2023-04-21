package com.github.sufiazarquiel.workspace.basicFormWindow;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/*
 * Class that creates a dialog to select an age
 */
public class AgeSliderDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JSlider slider;
	private JLabel lblValue;
	
	/**
	 * Create the dialog.
	 */
	// Dialog recieves the parent frame
	public AgeSliderDialog(JFrame parent, boolean modal) {
		super(parent, modal); // super() calls the constructor of the parent class
		setTitle("Selecciona la edad");
		setBounds(100, 100, 260, 238);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		slider = new JSlider();

		slider.setValue(0);
		slider.setMaximum(120);
		slider.setBounds(21, 104, 200, 26);
		contentPanel.add(slider);

		lblValue = new JLabel("0");
		lblValue.setHorizontalAlignment(SwingConstants.RIGHT);
		lblValue.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblValue.setBounds(80, 35, 75, 37);
		contentPanel.add(lblValue);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				updateValue();
			}
		});

		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						okPressed();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						cancelPressed();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	private void updateValue() {
		// Update the label with the value of the slider
		this.lblValue.setText(String.valueOf(this.slider.getValue()));
	}

	private void cancelPressed() {
		// The following commented line only hides the dialog, but doesn't destroy it
		// this.setVisible(false);
		// Instead, do the following:
		this.dispose();
	}

	private void okPressed() {
		// Change the parent's text field with the value of the slider
		((Form) this.getParent()).getTextFieldAge().setText(String.valueOf(this.slider.getValue()));

		this.dispose();
	}
}
