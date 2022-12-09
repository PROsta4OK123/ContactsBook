package org.example.testClases;

import org.example.contact.Contact;
import org.example.contact.contactMethods.Controller;

import java.util.ArrayList;

public class TestContactDelete implements Test {
    Controller controller = new Controller();
    private ArrayList<Contact> contacts = new ArrayList<>();
    public void test() {
        createContacts();
        contacts = contactsArray.fromInputStringToContactArray();
        controller.deleteContact(getContactDeleteName());
        isComplete();
        remove.removeAllContacts();
    }

    private String getContactDeleteName() {
        System.out.println("Choose contact's name, what you want to delete:");
        controller.showAllContacts();
        scanner.nextLine();
        return scanner.nextLine();
    }

    private void isComplete() {
        if (contacts.size() == contactsArray.fromInputStringToContactArray().size() + 1) {
            System.out.println("Test is complete successful");
        } else System.out.println("Here is a problem");
    }
    private void createContacts() {
        System.out.println("please write how many contacts you want to create:");
        int amountOFContacts = scanner.nextInt();

        for (int i = 0; i < amountOFContacts; i++) {
            controller.createContact();
        }
    }
}
