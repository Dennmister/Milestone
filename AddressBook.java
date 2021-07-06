package cst135;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

	List<BaseContact> baseContact = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public void open() {
		
		//items.add(new PersonalContact(602111, "Donnie", 112297));
		//items.add(new PersonalContact(602000, "Rob", 10190));
		//items.add(new PersonalContact(602111, "Taylor", 82599));
		//items.add(new BusinessContact(602222, "Walmart", 8002100, "Walmart.com"));
		//items.add(new BusinessContact(602333, "Frys", 8002100, "Frys.com"));
		//items.add(new BusinessContact(602444, "Safeway", 8002100, "Safeway.com"));
		
		baseContact = DataService.read();
		menu();
		DataService.write(baseContact);

	}

	public void menu() {
		do {
			System.out.println("===========");
			System.out.println(" Main Menu ");
			System.out.println("===========");
			System.out.println(" 1. Add a Personal Contact (C)");
			System.out.println(" 2. Add a Business Contact (C)");
			System.out.println(" 3. View All Contacts (R)");
			System.out.println(" 4. Show Details for one contact (R)");
			System.out.println(" 5. Update Contact (U)");
			System.out.println(" 6. Delete a Contact (D)");
			System.out.println(" 7. Search Contacts by Name (R)");
			System.out.println(" 8. Sort All Contacts by Name (R)");
			System.out.println(" 9. Exit ");
			System.out.println("===========");
			System.out.println("What option to perform? ");
			int option = sc.nextInt();
			sc.nextLine();

			switch (option) {
			case 1:
				addPersonalContact();
				break;
			case 2:
				addBusinessContact();
				break;
			case 3:
				viewAllContacts();
				break;
			case 4:
				showDetails();
				break;
			case 5:
				updateContact();
				break;
			case 6:
				deleteContact();
				break;
			case 7:
				searchConatact();
				break;
			case 8:
				sortContacts();
				break;
			case 9:
				System.out.println("Thank you.");
				DataService.write(baseContact);
				System.exit(0);
				break;

			default:
				System.out.println("Please enter different option");
			}
		} while (true);
	}

	private void showDetails() {
		System.out.println("===========");
		System.out.println(" Showing Details ");
		System.out.println("===========");
		viewAllContacts();
		int item = sc.nextInt();
		sc.nextLine();
		System.out.println("Name:  [" + baseContact.get(item - 1).getName() + "]");
		System.out.println("Phone Number: [" + baseContact.get(item - 1).getPhonenumber() + "]");
		if (baseContact.get(item - 1) instanceof BusinessContact) {
			System.out.println("Hours of Business. [ " + ((BusinessContact) baseContact.get(item - 1)).getHours() + "]");
			System.out.println("Website. [ " + ((BusinessContact) baseContact.get(item - 1)).getWebsite() + "]");
		}
		else if (baseContact.get(item - 1) instanceof PersonalContact) {
			System.out.println("Birthday. [" + ((PersonalContact) baseContact.get(item - 1)).getBirthday() + "]");
		}
		

	}

	private void sortContacts() {
		System.out.println("===========");
		System.out.println(" Sorting Contacts... ");
		System.out.println("===========");
		ComparatorName cn = new ComparatorName();
		baseContact.sort(cn);
		viewAllContacts();

	}

	private void searchConatact() {
		System.out.println("===========");
		System.out.println(" Searching For Contact ");
		System.out.println("===========");
		System.out.println("What do you want to search for?");
		String search = sc.nextLine();

		int counter = 1;

		for (BaseContact bc : baseContact) {
			if (bc.getName().toUpperCase().contains(search.toUpperCase()))
				System.out.println(counter++ + ". " + bc.toString());
		}

	}

	private void deleteContact() {
		System.out.println("===========");
		System.out.println(" Delete Menu ");
		System.out.println("===========");
		viewAllContacts();
		System.out.println("===========");
		System.out.println("Which Contact do you want to delete? ");
		int item = sc.nextInt();
		sc.nextLine();
		baseContact.remove(item - 1);

	}

	private void updateContact() {
		System.out.println("===========");
		System.out.println(" Update Menu ");
		System.out.println("===========");
		viewAllContacts();
		System.out.println("===========");
		System.out.println("Which Contact do you want to update? ");
		int item = sc.nextInt();
		sc.nextLine();

		if (baseContact.get(item) instanceof PersonalContact) {
			System.out.println("Updating Personal Contact");
			updatePersonalContact(item);
		} else if (baseContact.get(item) instanceof BusinessContact) {
			System.out.println("Updating Business Contact");
			updateBusinessContact(item);
		}

	}

	private void updatePersonalContact(int item) {
		System.out.println("===========");
		System.out.println(" Update Personal Contact ");
		System.out.println("===========");
		// public PersonalContact(int phonenumber, String name, int birthday)
		System.out.println("Enter Phone number. [ " + baseContact.get(item - 1).getPhonenumber() + "]");
		int phoneNumber = sc.nextInt();
		sc.nextLine();
		baseContact.get(item - 1).setPhonenumber(phoneNumber);

		System.out.println("Enter Name. [ " + baseContact.get(item - 1).getName() + "]");
		String name = sc.nextLine();
		sc.nextLine();
		baseContact.get(item - 1).setName(name);

		System.out.println("Enter Persons Birthday. [" + ((PersonalContact) baseContact.get(item - 1)).getBirthday() + "]");
		int birthday = sc.nextInt();
		sc.nextInt();
		((PersonalContact) baseContact.get(item - 1)).setBirthday(birthday);

	}

	private void updateBusinessContact(int item) {
		System.out.println("===========");
		System.out.println(" Update Business Contact ");
		System.out.println("===========");
		// BusinessContact(int phonenumber, String name, int hours, String website)
		System.out.println("Enter Phone number. [ " + baseContact.get(item - 1).getPhonenumber() + "]");
		int phoneNumber = sc.nextInt();
		sc.nextLine();
		baseContact.get(item - 1).setPhonenumber(phoneNumber);

		System.out.println("Enter Name. [ " + baseContact.get(item - 1).getName() + "]");
		String name = sc.nextLine();
		sc.nextLine();
		baseContact.get(item - 1).setName(name);

		System.out.println("Enter Hours of Business. [ " + ((BusinessContact) baseContact.get(item - 1)).getHours() + "]");
		int hours = sc.nextInt();
		sc.nextLine();
		((BusinessContact) baseContact.get(item - 1)).setHours(hours);

		System.out.println("Enter website. [ " + ((BusinessContact) baseContact.get(item - 1)).getWebsite() + "]");
		String website = sc.nextLine();
		sc.nextLine();
		((BusinessContact) baseContact.get(item - 1)).setWebsite(website);

	}

	private void addBusinessContact() {
		System.out.println("===========");
		System.out.println(" Create Business Contact ");
		System.out.println("===========");
		// BusinessContact(int phonenumber, String name, int hours, String website)
		System.out.println("Enter Phone Number.");
		int phoneNumber = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Name of Business.");
		String name = sc.nextLine();
		sc.nextLine();

		System.out.println("Enter Hours of Business.");
		int hours = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter website.");
		String website = sc.nextLine();
		sc.nextLine();

		System.out.println("Would you like to add a Location? [Yes, No]"); // yes
		String needLocation = sc.nextLine().toUpperCase();
		if (needLocation.equals("YES") || needLocation.equals("Y")) {

			System.out.println("Enter Street. ");
			String street = sc.nextLine();

			System.out.println("Enter City. ");
			String city = sc.nextLine();

			System.out.println("Enter State. ");
			String state = sc.nextLine();

			Location location = new Location(street, city, state);

			baseContact.add(new BusinessContact(phoneNumber, name, hours, website, location));
		} else {
			baseContact.add(new BusinessContact(phoneNumber, name, hours, website));
		}

	}

	private void addPersonalContact() {
		System.out.println("===========");
		System.out.println(" Create Personal Contact ");
		System.out.println("===========");
		// public PersonalContact(int phonenumber, String name, int birthday)
		System.out.println("Enter Phone number.");
		int phoneNumber = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Persons name.");
		String name = sc.nextLine();
		sc.nextLine();

		System.out.println("Enter Persons Birthday.");
		int birthday = sc.nextInt();
		sc.nextLine();

		System.out.println("Would you like to add a Photo? [Yes, No]"); // yes
		String needPhoto = sc.nextLine().toUpperCase();
		if (needPhoto.equals("YES") || needPhoto.equals("Y")) {

			System.out.println("Enter Photo Name. ");
			String photoname = sc.nextLine();

			System.out.println("Enter Date of Photo. ");
			int date = sc.nextInt();

			System.out.println("Enter Description. ");
			String description = sc.nextLine();

			Photo photo = new Photo(photoname, date, description);

			baseContact.add(new PersonalContact(phoneNumber, name, birthday, photo));
		} else {
			baseContact.add(new PersonalContact(phoneNumber, name, birthday));
		}
	}

	public void viewAllContacts() {
		System.out.println("===========");
		System.out.println(" View Menu ");
		System.out.println("===========");
		System.out.println(" Viewing all Contacts");

		int counter = 1;

		for (BaseContact bc : baseContact) {
			System.out.println(counter++ + ". " + bc.toString());
		}

	}

}
