package com.abc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		
		System.out.println("1");
		
		Session hibernate = factory.openSession();
		
		
		System.out.println(" 2");
		
		// ------ Save Employee ---------------------------------------
		Employee e = new Employee(101, "Ramesh", 2000,1);   // 1. get Employee
		
		
		Transaction t = hibernate.beginTransaction(); // start the transaction
			hibernate.save(e);                            // save entity
		t.commit();                                   // commit the transaction  
		
		hibernate.close();                            // close hibernate ... if we want to end the application 
		System.out.println("All Done");
	}
}
