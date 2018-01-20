package swing_6;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener {
	
	private JButton helloButton;
	private JButton goodbyeButton;
	
	private TextPanel textPanel;
	
	public Toolbar () {
		
		helloButton = new JButton("Hello");
		goodbyeButton = new JButton("Goodbye");
		
		helloButton.addActionListener(this);
		goodbyeButton.addActionListener(this);
		
		// To get the buttons to move to the left we pass an argument like -- FlowLayout.LEFT -- below
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(helloButton);
		add(goodbyeButton);
		
	}
	
	public void setTextPanel (TextPanel textPanel) {
		
		this.textPanel = textPanel;
		
	}

	// The actionPerformed method receives an ActionEvent called "e"
	public void actionPerformed(ActionEvent e) {
		
		// Retrieves the actual source of the event 
		JButton clicked = (JButton)e.getSource();
		
		if(clicked == helloButton) {
			textPanel.appendText("Hello\n");
		} 
		else if(clicked == goodbyeButton) {
			textPanel.appendText("Goodbye\n");
			
		}
		
	}

}
