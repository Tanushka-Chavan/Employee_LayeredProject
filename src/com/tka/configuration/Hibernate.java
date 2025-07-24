package com.tka.configuration;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Employee;

public class Hibernate {
	
	
	public static final  SessionFactory gethibernateconfiguration()
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory factory=cfg.buildSessionFactory();
		return factory;
	}

}
