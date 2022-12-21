package org.example.contact.contactMethods.changeParameter;

import java.util.ArrayList;

public interface Changeable<T> {
    void change(String oldParameter, String newParameter, ArrayList<T> arrayWithChangeableObject);
}
