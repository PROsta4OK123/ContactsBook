package org.example.contact.contactMethods.create;

import org.example.contact.Contact;
import org.example.contact.contactMethods.inputOutput.output.OutputContact;
import org.example.contact.contactMethods.inputOutput.output.OutputToCsv;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class CreateContact implements Creator<Contact> {
    Scanner scanner = new Scanner(System.in);
    OutputContact outputContacts = new OutputToCsv();
    @Override
    public void create(ArrayList<Contact> arrayToCreate) {
        arrayToCreate.add(createContact());
        arrayToCreate.sort(Comparator.comparing(Contact::getName));
        outputContacts.output(arrayToCreate);
    }
    private Contact createContact() {
        return new Contact(getNewName(), getNewPhoneNumber());
    }

    private String getNewName() {
        System.out.println("Write a name");
        return scanner.nextLine();
    }

    private String getNewPhoneNumber() {
        System.out.println("Write a phone number");
        return scanner.nextLine();
    }

}
