package tec.poo.ui.views;

import tec.poo.ui.controllers.HelloWorldController;
import tec.poo.ui.views.events.HelloWorldViewAction;
import java.awt.event.*;  
import java.awt.*;  
import javax.swing.*;   

public class HelloWorldView extends JPanel implements ActionListener  {

    private HelloWorldController helloWorldController;

    private JTextArea topTextArea;

    private JButton button1;

    private JButton button2;

    public HelloWorldView() {
        super(new GridBagLayout());

        GridBagLayout gridbag = (GridBagLayout)getLayout();
        GridBagConstraints c = new GridBagConstraints();

        JLabel l = null;

        c.fill = GridBagConstraints.BOTH;
        c.gridwidth = GridBagConstraints.REMAINDER;
        l = new JLabel("Hello what?");
        gridbag.setConstraints(l, c);
        add(l);

        c.weighty = 1.0;
        topTextArea = new JTextArea();
        topTextArea.setEditable(false);
        JScrollPane topScrollPane = new JScrollPane(topTextArea);
        Dimension preferredSize = new Dimension(200, 75);
        topScrollPane.setPreferredSize(preferredSize);
        gridbag.setConstraints(topScrollPane, c);
        add(topScrollPane);

        c.weightx = 1.0;
        c.weighty = 0.0;
        c.gridwidth = 1;
        c.insets = new Insets(10, 10, 0, 10);
        button1 = new JButton("world!");
        gridbag.setConstraints(button1, c);
        add(button1);
 
        c.gridwidth = GridBagConstraints.REMAINDER;
        button2 = new JButton("you!");
        gridbag.setConstraints(button2, c);
        add(button2);
 
        button1.addActionListener(this);
        button2.addActionListener(this);
        button2.addActionListener(new HelloWorldViewAction(topTextArea));

        setPreferredSize(new Dimension(450, 450));
        setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createMatteBorder(
                            1,1,2,2,Color.black),
            BorderFactory.createEmptyBorder(5,5,5,5)));
        this.setOpaque(true);
    }

    public void setController(HelloWorldController helloWorldController) {
        this.helloWorldController = helloWorldController;
    }

    public void actionPerformed(ActionEvent e) {
        topTextArea.append(e.getActionCommand() + "\n");
        topTextArea.setCaretPosition(topTextArea.getDocument().getLength());
    }

}