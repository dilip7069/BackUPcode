package spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import spring.model.Address;
import spring.model.User;

@Component
public class ContactDAOImpl implements ContactDAO{
	
	@Autowired
	public SessionFactory sessionFactory;
	
	public ContactDAOImpl(){
		System.out.println("ContactDAOImpl");
	}
	
	@Transactional
	public void addContact(User user){
		
		User contact=new User();
		contact.setId(30);
		contact.setPassword("one");
		contact.setUsername("java");
		contact.setEmail("satya@cgi.com");
		
		Address c1=new Address();
		  c1.setId(contact.getId());
	      c1.setHno("1");
	      c1.setState("tg");
          c1.setStreet("teachers colony");
          Address c2=new Address();
		  c2.setId(56);
	      c2.setHno("1");
	      c2.setState("tg");
          c2.setStreet("teachers colony");
          
          List s=new ArrayList();
	      s.add(c1);
	      s.add(c2);
	      
		contact.setAddress(s);
//		sessionFactory.getCurrentSession().save(contact);
//		query();
	}
	
	public void query(){
	
	List qry =sessionFactory.getCurrentSession().createQuery("from User u").list();
	System.out.println("at");
	
	}

}
