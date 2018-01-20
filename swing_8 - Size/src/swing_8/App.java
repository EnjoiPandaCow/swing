package swing_8;

import javax.swing.SwingUtilities;

import swing_8.MainFrame;

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