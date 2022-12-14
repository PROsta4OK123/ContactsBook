package org.example.contact.contactMethods.finder;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public interface Findable<T> {
    T find(String searchField, @NotNull ArrayList<T> arrayToSearch);
}
