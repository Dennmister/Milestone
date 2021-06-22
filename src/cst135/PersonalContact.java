package cst135;

public class PersonalContact extends BaseContact {

	private int birthday;

	public PersonalContact(int phonenumber, String name, String location, int birthday) {
		super(phonenumber, name, location);
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "PersonalContact [birthday=" + birthday + ", toString()=" + super.toString() + "]";
	}

	
	
}
