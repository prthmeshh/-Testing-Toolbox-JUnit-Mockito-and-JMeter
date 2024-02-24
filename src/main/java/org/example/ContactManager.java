package org.example;

import java.util.ArrayList;
import java.util.List;

public class ContactManager {
    private List<Contact> contacts;

    public ContactManager() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(String firstName, String lastName, String phoneNumber) {
        if (firstName == null) {
            throw new RuntimeException("First name cannot be null");
        }
        if (lastName == null) {
            throw new RuntimeException("Last name cannot be null");
        }
        if (phoneNumber == null) {
            throw new RuntimeException("Number cannot be null");
        }
        Contact contact = new Contact(firstName, lastName, phoneNumber);
        contacts.add(contact);
    }

    public List<Contact> getAllContacts() {
        return contacts;
    }
}

