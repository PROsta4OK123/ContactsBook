package org.example.testClases;

import org.example.contact.Contact;

import java.util.ArrayList;

public class TestContactChange implements Test {
    public void test(){
        createContacts();
        scanner.nextLine();
        controller.changeContact(selectContactToChange(),setNewName(),setNewPhone());
        isComplete();
    }
    private String selectContactToChange(){
        System.out.println("Choose contact's name, what you want to change:");
        controller.showAllContacts();
        return  scanner.nextLine();
    }
    private void createContacts() {
        System.out.println("please write how many contacts you want to create:");
        int amountOFContacts = scanner.nextInt();

        for (int i = 0; i < amountOFContacts; i++) {
            controller.createContact();
        }
    }
    private void isComplete(){
        controller.showAllContacts();
        System.out.println("Is changed& Y/N");
        String result = scanner.nextLine().toUpperCase();
        if (result.equals("Y")){
            System.out.println("test complete successful");
        }else if (result.equals("N")){
            System.out.println("Here is a problem");
        }else System.out.println("Invalid syntax");
    }
    private String setNewName(){
        System.out.println("Write new name");
        return scanner.nextLine();
    }
    private String setNewPhone(){
        System.out.println("Write new phone number");
        return scanner.nextLine();
    }
}
