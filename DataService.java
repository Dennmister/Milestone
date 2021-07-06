package cst135;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DataService {
	
	@SuppressWarnings("unchecked")
	public static List<BaseContact> read() {
		
		ArrayList<BaseContact> items = new ArrayList<>();
		
		//items.add(new PersonalContact(602111, "Donnie", 112297));
		//items.add(new PersonalContact(602000, "Rob", 10190));
		//items.add(new PersonalContact(602111, "Taylor", 82599));
		//items.add(new BusinessContact(602222, "Walmart", 8002100, "Walmart.com"));
		//items.add(new BusinessContact(602333, "Frys", 8002100, "Frys.com"));
		//items.add(new BusinessContact(602444, "Safeway", 8002100, "Safeway.com"));
		
		try {
			FileInputStream fis = new FileInputStream("contacts.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			items =(ArrayList<BaseContact>) ois.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return items;
	}
	
	public static void write(List<BaseContact> items) {
		
		try {
			FileOutputStream fos = new FileOutputStream("contacts.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(items);
			oos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
