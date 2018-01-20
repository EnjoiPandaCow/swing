package swing_1;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) {
		
		//
		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				
				// This is a constructor. 
				JFrame frame = new JFrame("Hello World");
				
				// Setting frame size.
				frame.setSize(1100, 1000);
				
				// Tells application to quit when you close the JFrame.
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				// Setting the frame to be visible.
				frame.setVisible(true);
				
			}
		});
		
	}

}
