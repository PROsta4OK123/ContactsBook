package org.example.contact.contactMethods;

import org.example.contact.Contact;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InputOutput {
    public void outputContacts(ArrayList<Contact> contacts) {
        try (FileOutputStream contactsOutput = new FileOutputStream("C:/Users/Кирилл/Desktop/1234.csv");
             OutputStreamWriter contactsWriter = new OutputStreamWriter(contactsOutput)) {
            contactsWriter.write("Name,Phone Number \n");
            for (Contact contact : contacts) {
                contactsWriter.write(contact.getName() + "," + contact.getPhoneNumber() + "\n");
            }
            System.out.println();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<String[]> inputContact() {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:/Users/Кирилл/Desktop/1234.csv"))) {
            ArrayList<String[]> contactsData = new ArrayList<>();
            List<String> contactDataLines =  reader.lines().skip(1).collect(Collectors.toList());;

            fromStringToStringArray(contactDataLines, contactsData);

            return contactsData;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void fromStringToStringArray(List<String> contactDataLines, ArrayList<String[]> contactsData) {
        String[] nameAndPhone;
        for (String contactDatum : contactDataLines) {
            nameAndPhone = contactDatum.split(",");
            contactsData.add(nameAndPhone);
        }
    }

}

