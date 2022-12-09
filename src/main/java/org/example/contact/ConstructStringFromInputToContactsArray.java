package org.example.contact;

import org.example.contact.contactMethods.InputOutput;

import java.util.ArrayList;

public class ConstructStringFromInputToContactsArray {
    private final InputOutput inputOutput = new InputOutput();

    public ArrayList<Contact> fromInputStringToContactArray() {
        return createContacts(inputOutput.inputContact());
    }

    private ArrayList<Contact> createContacts(ArrayList<String[]> contactsData) {
        if (contactsData != null) {
            String[] nameAndPhone;
            ArrayList<Contact> contacts = new ArrayList<>();
            for (String[] contactsDatum : contactsData) {
                nameAndPhone = contactsDatum;
                contacts.add(new Contact(nameAndPhone[0], nameAndPhone[1]));
            }
            return contacts;
        } else return null;
    }
}

