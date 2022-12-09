package org.example.testClases;

import org.example.contact.Contact;
import java.util.ArrayList;

public class TestCreateContact implements Test {
    ArrayList<Contact> testContacts;
    public void test() {
        remove.removeAllContacts();
        testContacts = contactsArray.fromInputStringToContactArray();
        System.out.println("Ok, we test adding contacts to array and output it \nfirst, please write how many contacts you want to create:");
        int amountOfContact = getAmountOfContacts();
        createContacts(amountOfContact);
        checkCompleteTest(amountOfContact);
    }
    private void createContacts(int amount){
        for (int i = 0; i < amount; i++) {
            controller.createContact();
        }
    }

    private void checkCompleteTest(int amountOfContacts) {
        if (testContacts.size() == contactsArray.fromInputStringToContactArray().size() - amountOfContacts) {
            System.out.println("Test is successful complete");
        } else
            System.out.println("Here is a problem, in file aren't created contacts");
    }
    private int getAmountOfContacts(){
        System.out.println("first, please write how many contacts you want to create:");
        return  scanner.nextInt();
    }
}
