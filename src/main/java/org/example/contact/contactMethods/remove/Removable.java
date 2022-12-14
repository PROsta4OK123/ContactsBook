package org.example.contact.contactMethods.remove;

import java.util.ArrayList;

public interface Removable<T> {
    void remove(String firstParameter, ArrayList<T> arrayForRemove);
}
