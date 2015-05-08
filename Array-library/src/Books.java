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
	public int Searchup(int index) {
		return 0;

	}

	@Override
	public boolean setavailabilty(boolean avail) {
		return false;
	}

	@Override
	public boolean getavailabilty() {
		return false;
	}

	@Override
	public String setName(String name) {
		return null;
	}

	@Override
	public String getName() {
		return null;
	}
}
