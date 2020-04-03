package com.maul.hibernate_library.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {
	public static SessionFactory sessionFactory; //yang membuat session untuk login atau yang sedang berjalan

	public static SessionFactory builSessionFactory(){
		Configuration configuration= new Configuration();
		sessionFactory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
		return sessionFactory;
	}
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory==null) return builSessionFactory();
		return sessionFactory;//method untuk cek jika sessionf belum ada isi maka akan diisi jika belum maka aka return sessionF.
	}
}
