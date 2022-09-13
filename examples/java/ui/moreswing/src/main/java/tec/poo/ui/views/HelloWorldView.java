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
        this.frame = new JFrame("Hello World Swing - Complex");
        this.frame.setSize(600,600);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.label = new JLabel("Nothing to say!");
        this.label.setBounds(10,10,300, 50);  
        this.label.setVerticalAlignment(JLabel.TOP);
        this.label.setFont(new Font("Verdana", Font.PLAIN, 20));
        
        this.button = new JButton("Say Hi!", new ImageIcon("test.gif"));
        this.button.setBounds(130,100,100, 50);  
        this.button.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                DisplayHelloWorld();  
            }  
        });  

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.LINE_AXIS));
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