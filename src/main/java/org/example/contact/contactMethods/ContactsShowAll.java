package org.example.contact.contactMethods;

import org.example.contact.Contact;
import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;

public class ContactsShowAll {
    protected void showAllContacts(@NotNull ArrayList<Contact> contacts) {
        for (Contact contact : contacts) {
            System.out.println("[name: " + contact.getName() + ", phone number: " + contact.getPhoneNumber() + "]");
        }
    }

}
