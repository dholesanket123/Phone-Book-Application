package com.BikkedIT.PhoneBookApp.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkedIT.PhoneBookApp.Model.Contact;
import com.BikkedIT.PhoneBookApp.Repository.ContactRepository;


@Service
public class ContactServiceImpl  implements ContactServiceI{
	@Autowired
	private ContactRepository contactRepository;
	
	@Override
	public boolean saveContact(Contact contact) {
		Contact save = contactRepository.save(contact);
		if(save!=null) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public List<Contact> getAllData() {
		List<Contact> allContact = contactRepository.findAll();
		
		if(allContact !=null) {
			return allContact;
		}
		else {
			return null;	
		}
	}
	@Override
	public Contact getById(Integer contactId) {
		Optional<Contact> findById = contactRepository.findById(contactId);
		Contact contact = findById.get();
		if(findById.isPresent()) {
		return contact;
		}
		else {
			return null;	
		}
		
	}
	@Override
	public void deleteAllData() {

		contactRepository.deleteAll();
		
	}
}
