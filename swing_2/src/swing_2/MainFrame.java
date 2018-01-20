package swing_2;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

// This class is a custom extension of JFrame
public class MainFrame extends JFrame {
	
	private JTextArea textArea;
	private JButton btn;
	
	// Constructor 
	public MainFrame() {
		
		// Calls super class constructor
		super("Hello World");
		
		// Setting the layout manager 
		setLayout(new BorderLayout());
		
		// Creating the instances of each component
		textArea = new JTextArea();
		btn = new JButton("Click Me!");
		
		// Adding the components to the layout manager
		add(textArea, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
		
		
		// Don't need frame.setSize for example because call methods of parent class directly 
		setSize(1100, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

}
