package com.BikkedIT.PhoneBookApp.Service;

import java.util.List;

import com.BikkedIT.PhoneBookApp.Model.Contact;

public interface ContactServiceI {
	boolean saveContact(Contact contact);
	
public 	List<Contact> getAllData();
public 	Contact getById(Integer contactId);
public void deleteAllData();
 public boolean updateContact(Contact contact);
 
 public boolean deleteById(Integer contactId);
	

}
