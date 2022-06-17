package com.BikkedIT.PhoneBookApp.Service;

import java.util.List;

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
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
