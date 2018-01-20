package swing_10;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class FormPanel extends JPanel {
	
	// Constructor 
	public FormPanel() {
		
		// Method called getPreferredSize returns and object called a dimension 
		Dimension dim = getPreferredSize();
		dim.width = 250;
		setPreferredSize(dim);
		
		// Two borders that will be combined to create one
		Border innerBorder = BorderFactory.createTitledBorder("Add Person");
		Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
		
		// Combining the borders 
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
		
	}

}
