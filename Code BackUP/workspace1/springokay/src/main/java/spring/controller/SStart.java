package spring.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.model.User;
import spring.service.ContactService;

@Controller
public class SStart {
	
	@Autowired
	public ContactService contactService;
	
	@RequestMapping("/")    
	  public String sayHello(Map<String , Object> map) {  
		
		User contact = new User();
		contact.setEmail("satya@gmail.com");
		contact.setId(1);
		contact.setPassword("jjj");
		contact.setUsername("satya");
		
		
		
		contactService.addContact(contact);
	   return "okay";   
	  }  

}
