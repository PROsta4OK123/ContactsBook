package org.example.contact.contactMethods.remove;

import org.example.contact.Contact;
import org.example.contact.contactMethods.finder.FindContactByPhoneNumber;
import org.example.contact.contactMethods.finder.Findable;
import org.example.contact.contactMethods.inputOutput.output.OutputContact;
import org.example.contact.contactMethods.inputOutput.output.OutputToCsv;

import java.util.ArrayList;

public class RemoveContactByPhone implements Removable<Contact> {
    @Override
    public void remove(String phone, ArrayList<Contact> arrayForRemove) {
        OutputContact output = new OutputToCsv();
        Findable<Contact> findContactByPhone = new FindContactByPhoneNumber();
        Contact foundContact = findContactByPhone.find(phone, arrayForRemove);
        if (foundContact != null) {
            arrayForRemove.remove(foundContact);
            output.output(arrayForRemove);
        } else System.out.println("Contact not found");
    }
}
