package com.github.sufiazarquiel.workspace.window;

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

public class DialogoElegirEdad extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JSlider slider;
	private JLabel lblValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoElegirEdad dialog = new DialogoElegirEdad();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
								//el dialogo recibe quien es su padre en el constructor
	public DialogoElegirEdad(JFrame padre) {
		super(padre); //lanzo el constructor para que guarde el padre
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
		
		lblValor = new JLabel("0");
		lblValor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblValor.setBounds(80, 35, 75, 37);
		contentPanel.add(lblValor);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				actualizarValor();
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
						pulsadoOK();
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
						pulsadoCancel();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	private void actualizarValor() {
		this.lblValor.setText( String.valueOf(this.slider.getValue()) );
	}
	
	private void pulsadoCancel() {
//		this.setVisible(false);//oculta el dialogo pero no desaparece, sigue consumiendo recursos
		this.dispose(); //esto elimina el dialogo
	}
	
	private void pulsadoOK() {
		//pasar la edad a la ventana padre
		
		//cierro el dialogo
		this.dispose();
	}
}



