package org.example.contact.contactMethods;

import org.example.contact.Contact;
import org.example.contact.contactMethods.auxiliaryMethods.FindContact;
import java.util.ArrayList;

public class ContactRemove {
    InputOutput inputOutput = new InputOutput();
    FindContact findContact = new FindContact();

    protected void deleteContact(String name, ArrayList<Contact> arrayForRemove) {
        Contact foundContact = findContact.findContact(name, arrayForRemove);
        if (foundContact != null) {
            arrayForRemove.remove(foundContact);
            inputOutput.outputContacts(arrayForRemove);
        } else System.out.println("Contact not found");
    }
}
