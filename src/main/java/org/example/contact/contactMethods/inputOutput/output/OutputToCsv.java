package org.example.contact.contactMethods.inputOutput.output;

import org.example.contact.Contact;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class OutputToCsv implements OutputContact {

    @Override
    public void output(ArrayList<Contact> outputData) {
        try (FileOutputStream contactsOutput = new FileOutputStream("C:/Users/Кирилл/Desktop/1234.csv");
             OutputStreamWriter contactsWriter = new OutputStreamWriter(contactsOutput)) {

            contactsWriter.write("Name,Phone Number \n");
            for (Contact contact : outputData) {
                contactsWriter.write(contact.getName() + "," + contact.getPhoneNumber() + "\n");
            }

            System.out.println();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
