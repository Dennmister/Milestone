package cst135;

public class Location {

	private String street;
	private String city;
	private String state;

	public Location(String street, String city, String state) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Location [street=" + street + ", city=" + city + ", state=" + state + "]";
	}

	
}
