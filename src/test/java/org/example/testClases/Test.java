package org.example.testClases;

import org.example.contact.ConstructStringFromInputToContactsArray;
import org.example.contact.contactMethods.Controller;
import org.example.testClases.helpMethods.RemoveAll;
import java.util.Scanner;
public interface Test {
    ConstructStringFromInputToContactsArray contactsArray = new ConstructStringFromInputToContactsArray();
    Scanner scanner = new Scanner(System.in);
    Controller controller = new Controller();
    RemoveAll remove = new RemoveAll();

    void test();
}
