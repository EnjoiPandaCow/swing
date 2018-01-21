package swing_12;

import java.util.EventObject;

public class FormEvent extends EventObject {
	
	private String name;
	private String occupation;

	// EventObject constructor, accepts the source of the event or the object that raises the event, in this case FormPanel.
	public FormEvent(Object source) {
		super(source);
	}
	
	// Another constructor 
	public FormEvent(Object source, String name, String occupation) {
		super(source);
		
		this.name = name;
		this.occupation = occupation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
}
