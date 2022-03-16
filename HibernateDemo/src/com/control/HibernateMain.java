package com.control;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.to.player;

public class HibernateMain {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(com.to.player.class);
		StandardServiceRegistryBuilder builder = 
				new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory factory= configuration.buildSessionFactory(builder.build());
		
		Session session= factory.openSession();
		Transaction transaction = session.beginTransaction();
		player p1 = new player(20, "Dhanraj","India",40);
		session.save(p1);
		transaction.commit();
		session.close();
		

	}

}
