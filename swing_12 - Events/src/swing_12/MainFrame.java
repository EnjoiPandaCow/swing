package swing_12;

import java.awt.BorderLayout;
import javax.swing.JFrame;


// Main frame is the controller it's connecting all of the components and telling them what to do
public class MainFrame extends JFrame {
	
	private TextPanel textPanel;
	private Toolbar toolbar; 
	private FormPanel formPanel;
	
	public MainFrame() {
	
		super("Hello World");
		
		setLayout(new BorderLayout());
		
		toolbar = new Toolbar();
		textPanel = new TextPanel();
		formPanel = new FormPanel();
		
		toolbar.setStringListener(new StringListener() {
			public void textEmitted(String text) {
				textPanel.appendText(text);
			}
		});	
		
		formPanel.setFormListener(new FormListener() {
			
			public void formEventOccurred(FormEvent e) {
				String name = e.getName();
				String occupation = e.getOccupation();
				
				if(name.isEmpty() || occupation.isEmpty()) {
					textPanel.appendText("You have not entered all the fields. Please Try Again \n");
				} else {
					textPanel.appendText(name + ": " + occupation + "\n");
				}
			}
		});
		
		add(formPanel, BorderLayout.WEST);
		add(toolbar, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);
		
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

}
