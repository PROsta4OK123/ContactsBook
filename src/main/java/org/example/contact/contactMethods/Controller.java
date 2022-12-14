package org.example.contact.contactMethods;

import org.example.contact.Contact;
import org.example.contact.contactMethods.construct.InputStringToContactsArray;
import org.example.contact.contactMethods.remove.RemoveContactByName;
import org.example.contact.contactMethods.showAllObjects.ContactsShowAll;
import org.example.contact.contactMethods.showAllObjects.ShowAll;

import java.util.ArrayList;

public class Controller {
    RemoveContactByName contactRemove = new RemoveContactByName();
    ShowAll<Contact> showAll = new ContactsShowAll();
    InputStringToContactsArray constructor = new InputStringToContactsArray();
    private final ArrayList<Contact> contacts = constructor.InputStringToContactArray();
    public void deleteContact(String name) {
        contactRemove.remove(name, contacts);
    }
    public void showAllContacts(){ showAll.showAll(contacts); }


}
