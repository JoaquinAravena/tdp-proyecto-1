package launcher;

import entities.Student;
import gui.SimplePresentationScreen;


public class Launcher {

	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	Student Joaquin_Aravena = new Student(134447, "Aravena", "Joaquin", "joaco.aravena02@gmail.com", "https://github.com/joaquinaravena", "https://argentinaestudia.com/wp-content/uploads/2021/06/Logo_UNS.png");
            	new SimplePresentationScreen(Joaquin_Aravena);
            }
        });
    }
}