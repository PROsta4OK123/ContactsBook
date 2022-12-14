package org.example.contact.contactMethods.construct;

import java.util.List;

public class FromStringToStringArray implements Constructor<String, String[]> {
    public void construct(List<String> contactDataLines, List<String[]> contactsData) {
        String[] nameAndPhone;
        for (String contactDatum : contactDataLines) {
            nameAndPhone = contactDatum.split(",");
            contactsData.add(nameAndPhone);
        }
    }
}
