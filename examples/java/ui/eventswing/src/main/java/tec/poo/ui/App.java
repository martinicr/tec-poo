package tec.poo.ui;

import tec.poo.ui.controllers.*;
import tec.poo.ui.views.*;   
import tec.poo.ui.models.*;
import javax.swing.*;      

/**
 * Hello world in swing!
 *
 */
public class App 
{

    private static void simpleSwingApp() {
        HelloWorldView view = new HelloWorldView();
        HelloWorldModel model = new HelloWorldModel();
        HelloWorldController controller = new HelloWorldController(model, view);

        //Create and set up the content pane.
        JFrame frame = createWindowForApp();
        frame.setContentPane(view);
        view.setController(controller);
        frame.pack();
    }

    private static JFrame createWindowForApp() {
        //Create and set up the window.
        JFrame frame = new JFrame("Events!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Display the window.
        frame.setVisible(true);

        return frame;
    }

    public static void main( String[] args )
    {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                simpleSwingApp();
            }
        });
    }
}
