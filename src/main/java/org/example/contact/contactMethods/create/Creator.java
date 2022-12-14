package org.example.contact.contactMethods.create;

import java.util.ArrayList;

public interface Creator<T> {
    void create(ArrayList<T> arrayToCreate);
}
