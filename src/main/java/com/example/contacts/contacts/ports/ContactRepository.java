package com.example.contacts.contacts.ports;

import com.example.contacts.contacts.domain.Contact;

import java.util.List;

public interface ContactRepository {

    Contact save(Contact contact);

    List<Contact> getAll();

}
