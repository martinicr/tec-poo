package tec.poo.ui.views;

import tec.poo.ui.controllers.HelloWorldController;
import java.awt.event.*;  
import java.awt.*;  
import javax.swing.*;   

public class HelloWorldView {

    private HelloWorldController helloWorldController;

    private JFrame frame;

    private JLabel label;

    private JButton button;

    public HelloWorldView() {
        this.frame = new JFrame("HelloWorldSwing");
        this.frame.setSize(600,600);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        this.label = new JLabel();
        label = new JLabel("Nothing to say!");
        label.setBounds(10,10,300, 50);  
        label.setVerticalAlignment(JLabel.TOP);
        label.setFont(new Font("Verdana", Font.PLAIN, 20));
        
        this.button = new JButton("Say Hi!");
        button.setBounds(130,100,100, 50);  
        this.button.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                DisplayHelloWorld();  
            }  
        });  
        
        panel.add(this.label);
        panel.add(this.button);

        this.frame.add(panel);
        this.frame.setVisible(true);
    }

    public void setController(HelloWorldController helloWorldController) {
        this.helloWorldController = helloWorldController;
    }

    public void DisplayHelloWorld() {
        this.label.setText(this.helloWorldController.GetHelloWorld());
    }

}