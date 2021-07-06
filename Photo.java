package cst135;

import java.io.Serializable;

public class Photo implements Serializable {

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

	public String getPhotoname() {
		return photoname;
	}

	public void setPhotoname(String photoname) {
		this.photoname = photoname;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
}
