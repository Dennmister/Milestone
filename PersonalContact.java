package cst135;

import java.io.Serializable;

public class PersonalContact extends BaseContact implements Serializable {

	private int birthday;
	private Photo photo;

	public PersonalContact(int phonenumber, String name, int birthday) {
		super(phonenumber, name);
		this.birthday = birthday;
	}
	
	public PersonalContact(int phonenumber, String name, int birthday, Photo photo) {
		super(phonenumber, name);
		this.setPhoto(photo);
	}

	@Override
	public String toString() {
		return "PersonalContact [birthday=" + birthday + ", toString()=" + super.toString() + "]";
	}

	public Photo getPhoto() {
		return photo;
	}

	public void setPhoto(Photo photo) {
		this.photo = photo;
	}

	public int getBirthday() {
		return birthday;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}

}
