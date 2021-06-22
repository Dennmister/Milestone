package cst135;

public class BusinessContact extends BaseContact {

	private int hours;
	private String website;
	

	public BusinessContact(int phonenumber, String name, String location, int hours, String website) {
		super(phonenumber, name, location);
		this.hours = hours;
		this.website = website;
	}


	@Override
	public String toString() {
		return "BusinessContact [hours=" + hours + ", website=" + website + ", toString()=" + super.toString() + "]";
	}




	
	
}
