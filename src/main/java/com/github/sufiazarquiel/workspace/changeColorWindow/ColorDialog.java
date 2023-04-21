package com.github.sufiazarquiel.workspace.changeColorWindow;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;

public class ColorDialog extends JDialog {

    private final JPanel contentPanel = new JPanel();
    private final ButtonGroup buttonGroup = new ButtonGroup();
    private Color selectedColor = new Color(0, 0, 255);

    /**
     * Create the dialog.
     */
    public ColorDialog(JFrame parent, boolean modal) {
        super(parent, true);
        setBounds(100, 100, 450, 300);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);

        JRadioButton rdbtnBotonBlue = new JRadioButton("Azul");
        rdbtnBotonBlue.setSelected(true);
        buttonGroup.add(rdbtnBotonBlue);
        rdbtnBotonBlue.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        selectedColor = new Color(0, 0, 255);
                    }
                });
        rdbtnBotonBlue.setBounds(6, 18, 109, 23);
        contentPanel.add(rdbtnBotonBlue);

        JRadioButton rdbtnBotonRed = new JRadioButton("Rojo");
        buttonGroup.add(rdbtnBotonRed);
        rdbtnBotonRed.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        selectedColor = new Color(255, 0, 0);
                    }
                });
        rdbtnBotonRed.setBounds(6, 66, 109, 23);
        contentPanel.add(rdbtnBotonRed);

        JRadioButton rdbtnBotonGreen = new JRadioButton("Verde");
        buttonGroup.add(rdbtnBotonGreen);
        rdbtnBotonGreen.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        selectedColor = new Color(0, 255, 0);
                    }
                });
        rdbtnBotonGreen.setBounds(6, 115, 109, 23);
        contentPanel.add(rdbtnBotonGreen);

        JRadioButton rdbtnBotonBlack = new JRadioButton("Negro");
        buttonGroup.add(rdbtnBotonBlack);
        rdbtnBotonBlack.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        selectedColor = new Color(0, 0, 0);
                    }
                });
        rdbtnBotonBlack.setBounds(6, 167, 109, 23);
        contentPanel.add(rdbtnBotonBlack);
        {
            JPanel buttonPane = new JPanel();
            buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
            getContentPane().add(buttonPane, BorderLayout.SOUTH);
            {
                JButton okButton = new JButton("OK");
                okButton.addActionListener(
                        new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                btnOkPressed();
                            }
                        });
                okButton.setActionCommand("OK");
                buttonPane.add(okButton);
                getRootPane().setDefaultButton(okButton);
            }
            {
                JButton cancelButton = new JButton("Cancel");
                cancelButton.addActionListener(
                        new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                btnCancelPressed();
                            }
                        });
                cancelButton.setActionCommand("Cancel");
                buttonPane.add(cancelButton);
            }
        }
    }

    protected void btnCancelPressed() {
        this.dispose();
    }

    protected void btnOkPressed() {
        ((TextWindow) this.getParent()).getLblColoredText().setForeground(selectedColor);
        this.dispose();
    }
}
