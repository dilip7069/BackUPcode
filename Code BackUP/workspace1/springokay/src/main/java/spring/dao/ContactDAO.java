package spring.dao;

import org.springframework.stereotype.Component;

import spring.model.User;

@Component
public interface ContactDAO {
	
	public void addContact(User user);

}
