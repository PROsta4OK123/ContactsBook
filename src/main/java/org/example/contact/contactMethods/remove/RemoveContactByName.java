package org.example.contact.contactMethods.remove;

import org.example.contact.Contact;
import org.example.contact.contactMethods.finder.FindContactByName;
import org.example.contact.contactMethods.inputOutput.output.OutputContact;
import org.example.contact.contactMethods.inputOutput.output.OutputToCsv;

import java.util.ArrayList;

public class RemoveContactByName implements Removable<Contact> {
    OutputContact output = new OutputToCsv();
    FindContactByName findContactByName = new FindContactByName();

    public void remove(String name, ArrayList<Contact> arrayForRemove) {
        Contact foundContact = findContactByName.find(name, arrayForRemove);
        if (foundContact != null) {
            arrayForRemove.remove(foundContact);
            output.output(arrayForRemove);
        } else System.out.println("Contact not found");
    }
}
