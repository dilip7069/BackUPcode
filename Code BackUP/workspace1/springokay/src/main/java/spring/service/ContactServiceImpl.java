package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import spring.dao.ContactDAO;
import spring.model.User;

@Component
public class ContactServiceImpl implements ContactService{
	
	 @Autowired
	   private ContactDAO contactDAO;
	
	@Transactional
	public void addContact(User user){
		contactDAO.addContact(user);
		
	}

}
