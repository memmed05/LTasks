package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        Contact contact1 = new Contact("Imran", "0556454546", 25);
        Contact contact2 = new Contact("Firat", "0555555555", 18);
        Contact contact3 = new Contact("Elvin", "0557898565", 35);
        Contact contact4 = new Contact("Xezer", "0557987564", 30);
        Contact contact5 = new Contact("Ali", "0556987745", 40);
        List<Contact> contactList = new ArrayList<>();
        contactList.add(contact1);
        contactList.add(contact2);
        contactList.add(contact3);
        contactList.add(contact4);
        contactList.add(contact5);
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < contactList.size(); i++) {
            numList.add(contactList.get(i).getAge());
        }
        Collections.sort(numList);
        for (int i = 0; i < numList.size(); i++) {
            for (int k = 0; k < numList.size(); k++)
                if (numList.get(i) == contactList.get(k).getAge()) {
                    System.out.print("Name: " + contactList.get(k).getName() + ", ");
                    System.out.print("Phone number: " + contactList.get(k).getPhoneNumber() + ", ");
                    System.out.println("Age: " + contactList.get(k).getAge());
                }
        }


    }
}



