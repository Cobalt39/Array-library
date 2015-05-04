
public class Customer implements People {

	private long ID;
	private String fName;
	private String lName;
	
	@Override
	public void Customer() {

		
	}

	@Override
	public long getID() {
		return 0;
	}

	@Override
	public void setID(long id) {
		
	}

	@Override
	public String setFName(String fname) {
		return fName = fname;
	}

	@Override
	public String getFName() {
		return null;
	}

	@Override
	public String setLName(String lname) {
			lName = lname;
	}

	@Override
	public String getLName() {
		return null;
	}

}
