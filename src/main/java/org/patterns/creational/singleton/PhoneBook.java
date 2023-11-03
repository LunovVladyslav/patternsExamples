package org.patterns.creational.singleton;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private static PhoneBook phoneBook;
    private Map<String, String> contacts = new HashMap<>();

    private PhoneBook() {}

    public static PhoneBook getPhoneBook() {
        if (phoneBook == null) {
            return new PhoneBook();
        }
        return phoneBook;
    }

    public void addNewContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
        System.out.println(String.format(
                "%s with phone number %s added to the contacts list", name, phoneNumber
        ));
    }

    public void removeContact(String name) {
        contacts.remove(name);
        System.out.println(String.format(
                "%s removed from the contacts list", name
        ));
    }

    public void showContacts() {
        System.out.println(contacts.toString());
    }
}
