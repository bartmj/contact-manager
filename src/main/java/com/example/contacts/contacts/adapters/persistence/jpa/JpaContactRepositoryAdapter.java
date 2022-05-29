package com.example.contacts.contacts.adapters.persistence.jpa;


import com.example.contacts.contacts.domain.Contact;
import com.example.contacts.contacts.ports.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Component
@Transactional
public class JpaContactRepositoryAdapter implements ContactRepository {

    private final JpaContactRepository jpaContactRepository;
    private final JpaPersistenceContactMapper mapper;

    @Override
    public Contact save(Contact contact) {
        var contactEntity = mapper.toEntity(contact);
        var savedEntity = jpaContactRepository.save(contactEntity);
        return mapper.toDomain(savedEntity);
    }

    @Override
    public List<Contact> getAll() {
        var contactEntities = jpaContactRepository.findAll();
        return mapper.toDomain(contactEntities);
    }
}
