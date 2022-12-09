package org.example.contact.contactMethods;

import org.example.contact.ConstructStringFromInputToContactsArray;
import org.example.contact.Contact;
import java.util.ArrayList;

public class Controller {
    ContactChange changeContact = new ContactChange();
    ContactRemove contactRemove = new ContactRemove();
    ContactCreate contactAdd = new ContactCreate();
    ContactsShowAll showAll = new ContactsShowAll();
    ConstructStringFromInputToContactsArray constructor = new ConstructStringFromInputToContactsArray();
    private final ArrayList<Contact> contacts = constructor.fromInputStringToContactArray();

    public void deleteContact(String name) {
        contactRemove.deleteContact(name, contacts);
    }

    public void createContact() {
        contactAdd.createContact(contacts);
    }
    public void changeContact(String oldName, String newName, String newPhoneNumber){
        changeContact.changeContact(oldName, newName, newPhoneNumber, contacts);
    }
    public void showAllContacts(){
        showAll.showAllContacts(contacts);
    }


}
