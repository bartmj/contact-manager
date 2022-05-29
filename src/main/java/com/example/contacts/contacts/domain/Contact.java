package com.example.contacts.contacts.domain;

import lombok.*;

@Builder
@Value
public class Contact {

    Long id;
    String name;
    String phone;

}
