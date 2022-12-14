package org.example.contact.contactMethods.finder;

import org.example.contact.Contact;
import org.example.contact.contactMethods.finder.Findable;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class FindContactByName implements Findable<Contact> {
    @Override
    public Contact find(String name, @NotNull ArrayList<Contact> arrayToSearch) {
        return arrayToSearch.stream()
                .filter(findContact -> findContact.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
}
