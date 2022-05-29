package com.example.contacts.contacts.adapters.persistence.jpa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JpaContactRepository extends JpaRepository<ContactEntity, Long> {

//    List<ContactEntity> findAll(Sort sort);

}
