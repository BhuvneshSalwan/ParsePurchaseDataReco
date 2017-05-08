package com.hibernate.factory;

import java.io.File;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BuildFactory {

	private static SessionFactory factory = null;
	
	public static SessionFactory getFactory(){
		
		if(null == factory){
			
		//	String hibernatePropsFilePath = "src//main//resources//hibernate.cfg.xml";
			
		//	File hibernatePropsFile = new File(hibernatePropsFilePath);

		//	factory = new Configuration().configure(hibernatePropsFile).buildSessionFactory();
			
			factory = new Configuration().configure().buildSessionFactory();
			
			return factory;
		}
		else{
			return factory;
		}
		
	}
	
}
