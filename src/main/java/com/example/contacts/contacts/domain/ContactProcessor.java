package com.example.contacts.contacts.domain;

import com.example.contacts.commons.Page;
import com.example.contacts.commons.ResultPage;
import com.example.contacts.contacts.ports.ContactRepository;
import com.example.contacts.contacts.ports.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ContactProcessor implements ContactService {

    private final ContactRepository contactRepository;

    @Override
    public Contact addContact(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public List<Contact> getAll() {
        return contactRepository.getAll();
    }
}
