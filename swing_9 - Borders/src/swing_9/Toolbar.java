package swing_9;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener {
	
	private JButton helloButton;
	private JButton goodbyeButton;
	
	private StringListener textListener;
	
	public Toolbar () {
		
		// Added border to the tool bar
		setBorder(BorderFactory.createEtchedBorder());
		
		helloButton = new JButton("Hello");
		goodbyeButton = new JButton("Goodbye");
		
		helloButton.addActionListener(this);
		goodbyeButton.addActionListener(this);
		
		// To get the buttons to move to the left we pass an argument like -- FlowLayout.LEFT -- below
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(helloButton);
		add(goodbyeButton);
		
	}
	
	// Accepts any object that implements the string listener, it saves a reference to listener above in textListener
	public void setStringListener(StringListener listener) {
		
		this.textListener = listener;
		
	}

	// The actionPerformed method receives an ActionEvent called "e"
	public void actionPerformed(ActionEvent e) {
		
		// Retrieves the actual source of the event 
		JButton clicked = (JButton)e.getSource();
		
		if(clicked == helloButton) {
			if(textListener != null) {
				textListener.textEmitted("Hello\n");
			}
		} 
		else if(clicked == goodbyeButton) {
			if(textListener != null) {
				textListener.textEmitted("Goodbye\n");
			}
		}
		
	}

}
