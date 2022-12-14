package org.example.contact.contactMethods.inputOutput.input;

import org.example.contact.contactMethods.construct.FromStringToStringArray;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class InputFromCsv implements InputContact<LinkedList<String[]>> {

    @Override
    public LinkedList<String[]> input() {
        FromStringToStringArray constructor = new FromStringToStringArray();
        try (BufferedReader reader = new BufferedReader(new FileReader("C:/Users/Кирилл/Desktop/1234.csv"))) {
            LinkedList<String[]> contactsData = new LinkedList<>();
            List<String> contactDataLines = reader.lines().skip(1).toList();

            constructor.construct(contactDataLines, contactsData);

            return contactsData;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
