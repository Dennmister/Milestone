package cst135;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

	List<BaseContact> baseContact = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public void open() {
		baseContact.add(new PersonalContact(602111, "Donnie", "Phoenix AZ", 112297));
		baseContact.add(new PersonalContact(602000, "Rob", "Scottsdale AZ", 10190));
		baseContact.add(new PersonalContact(602111, "Taylor", "Peoria AZ", 82599));
		baseContact.add(new BusinessContact(602222, "Walmart", "Scottsdale AZ", 8002100, "Walmart.com"));
		baseContact.add(new BusinessContact(602333, "Frys", "Glendale AZ", 8002100, "Frys.com"));
		baseContact.add(new BusinessContact(602444, "Safeway", "Flagstaff AZ", 8002100, "Safeway.com"));

		menu();

	}

	public void menu() {
		System.out.println("===========");
		System.out.println(" Main Menu ");
		System.out.println("===========");
		System.out.println(" 1. Add a Personal Contact (C)");
		System.out.println(" 2. Add a Business Contact (C)");
		System.out.println(" 3. View All Contacts (R)");
		System.out.println(" 4. Update a Contact (U)");
		System.out.println(" 5. Delete a Contact (D)");
		System.out.println(" 6. Exit ");
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
			updateContact();
			break;
		case 5:
			deleteContact();
			break;
		case 6:
			System.out.println("Thank you.");
			System.exit(0);
			break;
		default:
			System.out.println("Please enter different option");
		}while (true);
	}

	private void deleteContact() {
		System.out.println("===========");
		System.out.println(" Delete Menu ");
		System.out.println("===========");
		System.out.println("Deleting a contact");

	}

	private void updateContact() {
		System.out.println("===========");
		System.out.println(" Update Menu ");
		System.out.println("===========");
		System.out.println("Updating a contact");

	}

	private void addBusinessContact() {
		System.out.println("===========");
		System.out.println(" Create Menu ");
		System.out.println("===========");
		System.out.println("Create a Business contact");

	}

	private void addPersonalContact() {
		System.out.println("===========");
		System.out.println(" Create Menu ");
		System.out.println("===========");
		System.out.println("Create a Personal contact");

	}

	public void viewAllContacts() {
		System.out.println("===========");
		System.out.println(" View Menu ");
		System.out.println("===========");
		System.out.println(" Viewing all Contacts");
		for (BaseContact bc : baseContact)
			System.out.println(bc.toString());

	}

}
