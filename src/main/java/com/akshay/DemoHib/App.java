package com.akshay.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	AlienName an=new AlienName();
    	an.setFname("Akshay");
    	an.setLname("Chidre");
    	an.setMname("Rajkumar");
    	
       Alien akshay =new Alien();
 
      akshay.setAid(101);
      akshay.setAname(an);
      akshay.setColor("Orange");
       
       Configuration con =new Configuration().configure().addAnnotatedClass(Alien.class);
      
      ServiceRegistry reg =new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry(); 
       SessionFactory sf= con.buildSessionFactory(reg); 
       Session session=sf.openSession();
       
       Transaction tx=session.beginTransaction();
    //   akshay =(Alien) session.get(Alien.class, 105);
       session.save(akshay);
       tx.commit();
       
      // System.out.println(akshay);
    }
} 
