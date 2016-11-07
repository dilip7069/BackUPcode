package spring.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import spring.model.User;
import spring.service.ContactService;

@Controller
public class HelloWorldController {
	
	
	
	/*@Autowired
	public User one;*/
	@Autowired
	public ContactService contactService;
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)    
	  public String sayHello(Map<String , Object> map) {    
		map.put("contact", new User());
//		map.put("contactList", contactService.listContact());
//		one.just();
	   return "contact";   
	  }    
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addContact(@Valid @ModelAttribute("contact") User contact,
    		BindingResult result, Map<String, Object> model) {
 
		 if (result.hasErrors()) {
		        System.out.println("Entered into the result");
		        return "contact";
		    }
		contactService.addContact(contact);
		return "okay";
        
        
    
    }
	
	@RequestMapping(value = "/list")
	public @ResponseBody User getList() {  
		System.out.println("entered into the loop");
	  User stobj = new User();
	  stobj.setId(8);
	  
	  return stobj;
	  
	 }

}
