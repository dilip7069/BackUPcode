package com.pack.one;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import com.pack.two.Two;

public class HibernateTest {

	public static void main(String[] args) {
		HibernateTest test=new HibernateTest();
		test.run();
	}

	
	public void run()
	{
		SessionFactory sessionFactory=null;
		Session session=null;
		try
		{
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            session=sessionFactory.getCurrentSession();
            session.beginTransaction();
            Two t=new Two();
            t.setName("Dilip");
            t.setDepartment("Engineering");
            t.setRole("Software Engineer");
            session.save(t);
            session.getTransaction().commit();
            session.getSessionFactory().close();
        	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			
		}
		
	}
}