package org.example;

import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;
import org.example.models.Grocery;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Grocery grocery = new Grocery();
        //grocery.startGrocery();

        System.out.println("****************************************************");

        MobilePhone mobilePhone = new MobilePhone("23456789", new ArrayList<>());
        mobilePhone.addNewContact(new Contact("Bob", "31415926"));
        mobilePhone.addNewContact(new Contact("Alice", "16180339"));
        mobilePhone.addNewContact(new Contact("Tom", "11235813"));
        mobilePhone.addNewContact(new Contact("Jane", "23571113"));
        mobilePhone.printContacts();

    }
}
