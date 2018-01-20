/*
 * Create own custom child version of JFrame,  
 * so can put code in constructor that will add components.
 */

package swing_2;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) {
		
		// Explanation in Section 1 Lecture 2 
		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				
				new MainFrame();
				
			}
		});
		
	}

}
