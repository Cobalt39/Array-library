import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
public class Books implements Items {

	
	
	
	
	@Override
	public void Turninorout() {
		JFrame Turninorout = new JFrame();
		Turninorout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 Turninorout.setVisible(true);
	        Turninorout.setSize(1000, 800);
	    JPanel one = new JPanel();
	    JLabel lable = new JLabel("Are you turning in a book");
	    
	    
	    Turninorout.add(one);
	    one.add(lable);






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
