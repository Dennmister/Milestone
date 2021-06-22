package cst135;

public class BaseContact {

	private int phonenumber;
	private String name;
	private String location;

	

	public BaseContact(int phonenumber, String name, String location) {
		super();
		this.phonenumber = phonenumber;
		this.name = name;
		this.location = location;
	}


	@Override
	public String toString() {
		return "BaseContact [phonenumber=" + phonenumber + ", name=" + name + ", location=" + location + "]";
	}

	
	
}
