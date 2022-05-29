package com.example.contacts.contacts.adapters.persistence.jpa;

import com.example.contacts.contacts.domain.Contact;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface JpaPersistenceContactMapper {

    ContactEntity toEntity(Contact contact);

    Contact toDomain(ContactEntity contactEntity);

    @IterableMapping(elementTargetType = Contact.class)
    List<Contact> toDomain(List<ContactEntity> entities);

}
