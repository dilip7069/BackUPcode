package spring.service;

import org.springframework.stereotype.Component;

import spring.model.User;

@Component
public interface ContactService {
	
	
	
	public void addContact(User user);

}
