package com.dev.laptopmanf.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import com.dev.laptopmanf.model.ChipManf;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class LaptopDaoImplementation implements LaptopDao {
	
	private Connection conn;
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	public boolean testValidate(String uname,String pwd)
	{
	try 
	{
		System.out.println("Hello from LoginDao Implementation" + uname +" "+pwd);
		Class.forName("com.mysql.jdbc.Driver");

		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college",uname, pwd);
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage()+"Hello from LoginDao Exception");
		return false;
	}
	return true;
	}
	public void addManf(ChipManf c)
	{
		System.out.println("add Manf from Dao");

		Session session = this.sessionFactory.getCurrentSession();
		session.persist(c);
	}

}
