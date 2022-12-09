package org.example.contact.contactMethods.auxiliaryMethods;

import org.example.contact.Contact;
import java.util.ArrayList;

public class FindContact {
    public Contact findContact(String name, ArrayList<Contact> arrayToSearch) {
        return arrayToSearch.stream()
                .filter(contact -> contact.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
}
