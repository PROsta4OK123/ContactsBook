package org.example.testClases.helpMethods;

import org.example.contact.Contact;
import org.example.contact.contactMethods.InputOutput;

import java.util.ArrayList;

public class RemoveAll {
    ArrayList<Contact> remove = new ArrayList<>();
    InputOutput inputOutput = new InputOutput();

    public void removeAllContacts() {
        inputOutput.outputContacts(remove);
    }
}
