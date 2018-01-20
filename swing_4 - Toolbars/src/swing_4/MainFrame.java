package swing_4;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {
	
	private JButton btn;
	// Initializing custom textPanel Class
	private TextPanel textPanel;
	
	
	public MainFrame() {
	
		super("Hello World");
		
		setLayout(new BorderLayout());
		
		btn = new JButton("Click Me!");
		textPanel = new TextPanel();
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Using appendText method in TextPanel
				textPanel.appendText("Hello\n");
				
			}
		});		
		
		add(textPanel, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
		
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

}
