package swing_8;

import java.awt.Dimension;

import javax.swing.JPanel;

public class FormPanel extends JPanel {
	
	// Constructor 
	public FormPanel() {
		
		// Method called getPreferredSize returns and object called a dimension 
		Dimension dim = getPreferredSize();
		dim.width = 250;
		setPreferredSize(dim);
		
	}

}
