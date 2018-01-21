package swing_12;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class FormPanel extends JPanel {
	
	private JLabel nameLabel;
	private JLabel occupationLabel;
	private JTextField nameField;
	private JTextField occupationField;
	private JButton okBtn;
	private FormListener formListener;
	
	// Constructor 
	public FormPanel() {
		
		// Method called getPreferredSize returns and object called a dimension 
		Dimension dim = getPreferredSize();
		dim.width = 250;
		setPreferredSize(dim);
		
		nameLabel = new JLabel("Name: ");
		occupationLabel = new JLabel("Occupation: ");
		nameField = new JTextField(10);
		occupationField = new JTextField(10);
		
		okBtn = new JButton("OK");
		
		// new ActionListener() is an anonymous class
		okBtn.addActionListener(new ActionListener() {
			// Going to be called when ever the OK button is clicked
			public void actionPerformed(ActionEvent e) {
				
				/*
				 *  Need to pass this information to the main frame,
				 *  do this by raising an event that the main frame is going to listen to. 
				 *  actionPerformed receives an ActionEvent which is used to pass information from the control that raises the event to the listening class.
				 *  We are going to define an event, which is going to temporarily store name and occupation and bring that information to the main frame.
				 */
				String name = nameField.getText();
				String occupation = occupationField.getText();
				
				// Passing information to FormEvent
				FormEvent ev = new FormEvent(this, name, occupation);
				
				if(formListener != null) {
					formListener.formEventOccurred(ev);
				}
			}
		});
		
		// Two borders that will be combined to create one
		Border innerBorder = BorderFactory.createTitledBorder("Add Person");
		Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
		
		// Combining the borders 
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
		
		setLayout (new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		
		
		
		//////////***** First Row *****\\\\\\\\\\
		
		// Controls how much space a given cell takes up relative to the other cells
		gc.weightx = 1;
		gc.weighty = 0.1;
		
		// Position of the component from left to right and top to bottom
		gc.gridx = 0;
		gc.gridy = 0;
		// Tells the component to take up all the space in the cell or not
		gc.fill = GridBagConstraints.NONE;
		// Positioning at the end of the line
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0, 0, 0, 5);
		add(nameLabel, gc);
		
		gc.gridx = 1;
		gc.gridy = 0;
		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.LINE_START;
		add(nameField, gc);
		
		//////////***** Second Row *****\\\\\\\\\\
		
		gc.weightx = 1;
		gc.weighty = 0.1;
		
		gc.gridx = 0;
		gc.gridy = 1;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0, 0, 0, 5);
		add(occupationLabel, gc);
		
		gc.gridx = 1;
		gc.gridy = 1;
		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.LINE_START;
		add(occupationField, gc);
		
		//////////***** Third Row *****\\\\\\\\\\
		
		gc.weightx = 1;
		gc.weighty = 2.0;
		
		gc.gridx = 1;
		gc.gridy = 2;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);
		add(okBtn, gc);
	}
	
	public void setFormListener(FormListener listener) {
		this.formListener = listener;
	}

}
