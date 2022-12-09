package org.example.contact.contactMethods;

import org.example.contact.Contact;
import org.example.contact.contactMethods.auxiliaryMethods.FindContact;
import java.util.ArrayList;
import java.util.Comparator;

public class ContactChange {
    InputOutput inputOutput = new InputOutput();
    FindContact findContact = new FindContact();

    public void changeContact(String oldName, String newName, String newPhoneNumber, ArrayList<Contact> contacts) {
        Contact foundContact = findContact.findContact(oldName, contacts);
        if (foundContact != null){
            int contactIndex = contacts.indexOf(foundContact);

            contacts.get(contactIndex).setName(newName);
            contacts.get(contactIndex).setPhoneNumber(newPhoneNumber);

            contacts.sort(Comparator.comparing(Contact::getName));
            inputOutput.outputContacts(contacts);

        }else System.out.println("Contact not found");
    }
}
