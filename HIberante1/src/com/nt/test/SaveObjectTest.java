package com.nt.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.domain.Employee;

public class SaveObjectTest {
public static void main(String[] args)
{
	Transaction tx=null;
	Employee emp=null;
	Configuration cfg=null;
			cfg=new Configuration();
	cfg=cfg.configure("com/nt/cfg/hibernate.cfg.xml");
	
	SessionFactory factory=null;
	factory=cfg.buildSessionFactory();
	Session ses=null;
	ses=factory.openSession();
	emp=new Employee();
	emp.setEid(505);
	emp.setFirstName("suneel");
	emp.setLastName("Bodagala");
	emp.setEmail("suneelsai05@gmail.com");
			try {
				tx=ses.beginTransaction();
				ses.save(emp);
				tx.commit();
				System.out.println("object saved");
			}catch(Exception E){
				tx.rollback();
			}
				ses.close();
				factory.close();
				
			}
	
}

