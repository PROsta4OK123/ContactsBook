package org.example.contact.contactMethods;

import org.example.contact.Contact;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ContactCreate {
    Scanner scanner = new Scanner(System.in);
    InputOutput inputOutput = new InputOutput();

    protected void createContact(ArrayList<Contact> contactsArray) {
        contactsArray.add(createContact());
        contactsArray.sort(Comparator.comparing(Contact::getName));
        inputOutput.outputContacts(contactsArray);
    }

    private Contact createContact() {
        return new Contact(getNewName(), getNewPhoneNumber());
    }

    private String getNewName() {
        System.out.println("Write a name");
        return scanner.nextLine();
    }

    private String getNewPhoneNumber() {
        System.out.println("Write a phone number");
        return scanner.nextLine();
    }
}
