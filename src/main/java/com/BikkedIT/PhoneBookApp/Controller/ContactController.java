package com.BikkedIT.PhoneBookApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkedIT.PhoneBookApp.Model.Contact;
import com.BikkedIT.PhoneBookApp.Service.ContactServiceI;

@RestController
// create Application in RestAPI
public class ContactController {
	@Autowired
	private ContactServiceI contactServiceI;
@PostMapping(value="/saveData",produces = "Application/json")
 public ResponseEntity<String> saveContact(@RequestBody Contact contact){
	 boolean saveContact = contactServiceI.saveContact(contact);
	 if(saveContact !=false) {
		 String msg="User data save successfuly";
			return new ResponseEntity<String>(msg, HttpStatus.CREATED);
	 }else {
		 String msg= "User data not Save Successfuly";
		 return new ResponseEntity<String>(msg,HttpStatus.BAD_REQUEST); 
	 }
	 
	
	 
	 
 }
}

