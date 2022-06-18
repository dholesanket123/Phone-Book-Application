package com.BikkedIT.PhoneBookApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkedIT.PhoneBookApp.Excepation.DataNotFoundExcepation;
import com.BikkedIT.PhoneBookApp.Model.Contact;
import com.BikkedIT.PhoneBookApp.Service.ContactServiceI;

import net.bytebuddy.implementation.bytecode.Throw;

@RestController
// create Application in RestAPI
public class ContactController {
	@Autowired
	private ContactServiceI contactServiceI;
@PostMapping(value="/saveData",produces = "Application/json")
 public ResponseEntity<String> saveContact(@RequestBody Contact contact){
	 boolean saveContact = contactServiceI.saveContact(contact);
	 if(saveContact!=false) {
		 String msg="User data save successfuly";
			return new ResponseEntity<String>(msg, HttpStatus.CREATED);
	 }else {
		 String msg= "User data not Save Successfuly";
		 return new ResponseEntity<String>(msg,HttpStatus.BAD_REQUEST); 
	 }
 }
@GetMapping(value = "/getAllData", consumes = "Application/json")
public ResponseEntity<List<Contact>> getAll(){
	
	List<Contact> list = contactServiceI.getAllData();
	
	if(list !=null) {
		
		return new ResponseEntity<List<Contact>>(list,HttpStatus.OK);
	} else {
		
		throw new DataNotFoundExcepation("Data Not found Excepation");
	}	
}
@GetMapping("/edit{contactId}")
public ResponseEntity< Contact> getByID(@PathVariable Integer contactId ){
	Contact contact = contactServiceI.getById(contactId);
	if(contact !=null) {
		return new ResponseEntity<Contact>(contact, HttpStatus.OK);
	}
	else {
		String msg ="Record not Found ";
		
		return new ResponseEntity(msg,HttpStatus.BAD_REQUEST);	
	}	
}

@GetMapping("/deleteAll")
public ResponseEntity<String> deleteAllData(){
	contactServiceI.deleteAllData();
	String msg="Record Delete successfully";
	return new ResponseEntity<String>(msg,HttpStatus.OK);	
}

@PutMapping("/update")
public ResponseEntity<String> updateRecord(Contact contact){
	boolean updateContact = contactServiceI.updateContact(contact);
	if(updateContact == true) {
		String msg="Record Update Sucessfully";
		 return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	else {
		String msg1="Given id not match pl insert correct id ";
		return new ResponseEntity<String>(msg1, HttpStatus.BAD_GATEWAY);
	}
	
}
@DeleteMapping("/deleteRecordById{contactId}")
public ResponseEntity<String> deleteById(@PathVariable Integer contactId){
	
	boolean deleteById = contactServiceI.deleteById(contactId);
	if(deleteById==true){
		String msg="Record delete successfully";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	else {
		String msg="Given Id record not present Pl check Id";
		return new ResponseEntity<String> (msg, HttpStatus.BAD_GATEWAY)) ;
	}
	
	
}
}

