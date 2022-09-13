package tec.poo.ui;

import tec.poo.ui.controllers.*;
import tec.poo.ui.views.*;   
import tec.poo.ui.models.*;

/**
 * Hello world in swing!
 *
 */
public class App 
{

    public static void simpleSwingApp() {
        HelloWorldView view = new HelloWorldView();
        HelloWorldModel model = new HelloWorldModel();
        HelloWorldController controller = new HelloWorldController(model, view);
        view.setController(controller);
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
