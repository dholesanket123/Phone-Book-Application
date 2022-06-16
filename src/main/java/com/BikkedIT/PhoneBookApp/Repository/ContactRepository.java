package com.BikkedIT.PhoneBookApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.BikkedIT.PhoneBookApp.Model.Contact;
@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
