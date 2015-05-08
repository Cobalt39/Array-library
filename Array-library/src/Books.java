import java.awt.Component;

import javax.swing.JOptionPane;


 
public class Books implements Items {

	
	
	
	
	@Override
	public void Turninorout() {
		
		Object[] options = {"Turning in ",
                "Checking out"};
Component frame = null;
int n = JOptionPane.showOptionDialog(frame,
"Are you..., "
+ "",
"Hello",
JOptionPane.YES_NO_CANCEL_OPTION,
JOptionPane.QUESTION_MESSAGE,
null,
options,
options[2]);

	       
	}

	@Override
	public void Searchup() {
		
	}

	@Override
	public boolean availabilty() {
		return false;
	}

	@Override
	public String Name() {
		return null;
	}

}
