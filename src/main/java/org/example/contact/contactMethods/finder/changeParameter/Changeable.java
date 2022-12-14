package org.example.contact.contactMethods.finder.changeParameter;

import java.util.ArrayList;

public interface Changeable<T> {
    void change(String oldParameter, String newParameter, ArrayList<T> arrayWithChangeableObject);
}
