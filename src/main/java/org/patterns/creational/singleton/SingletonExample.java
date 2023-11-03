package org.patterns.creational.singleton;

public class SingletonExample {
    public static void main(String[] args) {
        PhoneBook phoneBook = PhoneBook.getPhoneBook();
        phoneBook.addNewContact("John", "123-456-789");
        phoneBook.addNewContact("James", "333-456-777");
        phoneBook.addNewContact("Alice", "999-999-999");

        phoneBook.removeContact("James");
        phoneBook.showContacts();
    }
}
