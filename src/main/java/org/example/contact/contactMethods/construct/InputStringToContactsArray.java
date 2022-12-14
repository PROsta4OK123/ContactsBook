package org.example.contact.contactMethods.construct;

import org.example.contact.Contact;
import org.example.contact.contactMethods.inputOutput.input.InputFromCsv;
import java.util.ArrayList;
import java.util.LinkedList;

public class InputStringToContactsArray {
    private final InputFromCsv input = new InputFromCsv();

    public ArrayList<Contact> InputStringToContactArray() {
        return createContacts(input.input());
    }

    private ArrayList<Contact> createContacts(LinkedList<String[]> contactsData) {
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

