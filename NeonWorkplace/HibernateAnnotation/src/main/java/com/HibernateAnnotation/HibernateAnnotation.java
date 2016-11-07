package com.HibernateAnnotation;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import java.util.Scanner;

public class HibernateAnnotation {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Details, Fname, Lname, Marks");
		Student s=new Student();
		s.setfName(sc.nextLine());
		s.setlName(sc.nextLine());
		s.setMarks(sc.nextInt());
		try {
            // Create the SessionFactory from hibernate.cfg.xml
        	Configuration configuration = new Configuration();
        	configuration.configure("Hibernateannotation.xml");
        	System.out.println("Hibernate Annotation Configuration loaded");
        	
        	ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        	System.out.println("Hibernate Annotation serviceRegistry created");
        	
        	SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        	Session session = sessionFactory.getCurrentSession();
        	session.beginTransaction();
        	session.save(s);
        	session.getTransaction().commit();
        	sessionFactory.close();
        	sc.close();
	  }
		catch(Exception E)
		{
			System.out.println(E);
		}
		finally
		{
			
		}
	
}
	
}
