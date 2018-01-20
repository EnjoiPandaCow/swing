package swing_5;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel {
	
	private JButton helloButton;
	private JButton goodbyeButton;
	
	public Toolbar () {
		
		helloButton = new JButton("Hello");
		goodbyeButton = new JButton("Goodbye");
		
		// To get the buttons to move to the left we pass an argument like -- FlowLayout.LEFT -- below
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(helloButton);
		add(goodbyeButton);
		
	}

}
