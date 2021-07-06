package cst135;

import java.io.Serializable;

public class BusinessContact extends BaseContact implements Serializable {

	private int hours;
	private String website;
	
	private Location location;

	public BusinessContact(int phonenumber, String name, int hours, String website) {
		super(phonenumber, name);
		this.hours = hours;
		this.website = website;
	}
	
	public BusinessContact(int phonenumber, String name, int hours, String website, Location location) {
		super(phonenumber, name);
		this.setLocation(location);
		
	}

	@Override
	public String toString() {
		return "BusinessContact [hours=" + hours + ", website=" + website + ", toString()=" + super.toString() + "]";
	}
	
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}


}
