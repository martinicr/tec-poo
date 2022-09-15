package tec.poo.ui.views.events;

import javax.swing.*;
 
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Dimension;
import java.awt.Color;
 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelloWorldViewAction implements ActionListener {
    
    private JTextArea textArea;

    public HelloWorldViewAction(JTextArea textArea) {
        this.textArea = textArea;
    }

    public void actionPerformed(ActionEvent e) {
        textArea.append("other event " + e.getActionCommand()
                        + "\n");
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }
}
