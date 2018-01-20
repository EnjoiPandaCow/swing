package swing_3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

// This class is a custom extension of JFrame
public class MainFrame extends JFrame {
	
	private JTextArea textArea;
	private JButton btn;
	

	public MainFrame() {
	
		super("Hello World");
		
		setLayout(new BorderLayout());
		
		textArea = new JTextArea();
		btn = new JButton("Click Me!");
		
		// Adding listener to the button
		btn.addActionListener(new ActionListener() {

			// Run whenever the button is clicked
			public void actionPerformed(ActionEvent arg0) {
				
				// Adding hello to the text area when the button is clicked
				textArea.append("Hello\n");
				
			}
			
		});		
		
		add(textArea, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
		
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

}
