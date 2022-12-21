package org.example.contact.contactMethods.changeParameter;

import org.example.contact.Contact;
import org.example.contact.contactMethods.finder.FindContactByPhoneNumber;
import org.example.contact.contactMethods.finder.Findable;
import org.example.contact.contactMethods.inputOutput.output.OutputContact;
import org.example.contact.contactMethods.inputOutput.output.OutputToCsv;

import java.util.ArrayList;

public class ChangePhone implements Changeable<Contact> {
    OutputContact output = new OutputToCsv();
    Findable<Contact> find = new FindContactByPhoneNumber();

    @Override
    public void change(String oldPhone, String newPhone, ArrayList<Contact> contactsArray) {
        Contact foundContact = find.find(oldPhone, contactsArray);
        if (foundContact != null) {
            int contactIndex = contactsArray.indexOf(foundContact);

            contactsArray.get(contactIndex).setPhoneNumber(newPhone);

            output.output(contactsArray);
        } else System.out.println("Contact not found");
    }
}
