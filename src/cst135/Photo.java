package cst135;

public class Photo {

	private String photoname;
	private int date;
	private String description;

	public Photo(String photoname, int date, String description) {
		super();
		this.photoname = photoname;
		this.date = date;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Photo [photoname=" + photoname + ", date=" + date + ", description=" + description + "]";
	}

	
	
}
