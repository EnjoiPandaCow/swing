package swing_7;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

// Panel's are used so you can add other components into them 

public class TextPanel extends JPanel {
	
	private JTextArea textArea;
	
	// Constructor 
	public TextPanel() {
		
		textArea = new JTextArea();
		
		// Setting the layout on the TextPanel 
		setLayout(new BorderLayout());
		
		// Wrapping textArea in scroll pane and adding it to the layout
		add(new JScrollPane(textArea), BorderLayout.CENTER);
		
	}
	
	// Can accept a string called text
	public void appendText (String text) {
		
		textArea.append(text);
		
	}

}
