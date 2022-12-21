package org.example.contact.contactMethods.changeParameter;

import org.example.contact.Contact;
import org.example.contact.contactMethods.finder.FindContactByName;
import org.example.contact.contactMethods.finder.Findable;
import org.example.contact.contactMethods.inputOutput.output.OutputContact;
import org.example.contact.contactMethods.inputOutput.output.OutputToCsv;

import java.util.ArrayList;
import java.util.Comparator;

public class ChangeName implements Changeable<Contact> {
    OutputContact output = new OutputToCsv();
    Findable<Contact> find = new FindContactByName();
    @Override
    public void change(String oldName, String newName, ArrayList<Contact> contactsArray) {
        Contact foundContact = find.find(oldName, contactsArray);
        if (foundContact != null){
            int contactIndex = contactsArray.indexOf(foundContact);

            contactsArray.get(contactIndex).setName(newName);

            contactsArray.sort(Comparator.comparing(Contact::getName));
            output.output(contactsArray);

        }else System.out.println("Contact not found");
    }
}
