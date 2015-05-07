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
