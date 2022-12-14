package org.example.contact.contactMethods.showAllObjects;

import org.example.contact.Contact;
import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;

public class ContactsShowAll implements ShowAll<Contact>{
    @Override
    public void showAll(@NotNull ArrayList<Contact> arrayToShow) {
        for (Contact contact : arrayToShow) {
            System.out.println("[name: " + contact.getName() + ", phone number: " + contact.getPhoneNumber() + "]");
        }
    }
}
