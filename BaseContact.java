package cst135;

import java.io.Serializable;

public class BaseContact implements Serializable{

	private int phonenumber;
	private String name;
	
	

	

	public int getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public BaseContact(int phonenumber, String name) {
		super();
		this.phonenumber = phonenumber;
		this.name = name;
	}


	@Override
	public String toString() {
		return "BaseContact [phonenumber=" + phonenumber + ", name=" + name + "]";
	}

	
	
}
