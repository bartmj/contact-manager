package com.example.contacts.contacts.adapters.persistence.jpa;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@EqualsAndHashCode(of = "id")
@Setter
@Getter
public class ContactEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String phone;

}

