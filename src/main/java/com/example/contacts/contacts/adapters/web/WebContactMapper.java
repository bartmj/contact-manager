package com.example.contacts.contacts.adapters.web;

import com.example.contacts.contacts.domain.Contact;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring")
public interface WebContactMapper {

    Contact toDomain(ContactViewModel viewModel);

    ContactViewModel toViewModel(Contact contact);

    List<ContactViewModel> toViewModel(List<Contact> contacts);
}
