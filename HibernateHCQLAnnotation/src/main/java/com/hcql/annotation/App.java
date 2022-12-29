package com.hcql.annotation;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cgf.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Employee employee = new Employee("izhar", 1000.0, "IT");
		Employee employee1 = new Employee("dilshad", 2000.0, "Market");
		Employee employee2 = new Employee("rukshar", 3000.0, "Medical");
		Employee employee3 = new Employee("sajid", 4000.0, "Architect");
		Employee employee4 = new Employee("anas", 5000.0, "Manager");
		Employee employee5 = new Employee("shahbaj", 6000.0, "Film");
		Employee employee6 = new Employee("arkam", 7000.0, "BUIlder");
		Employee employee7 = new Employee("gufran", 8000.0, "Buness");
		Employee employee8 = new Employee("sohel", 9000.0, "ITI");
		Employee employee9 = new Employee("zaid", 10000.0, "IIT");

		Serializable save = session.save(employee);
		System.out.println(save);

		Serializable save2 = session.save(employee1);
		System.out.println(save2);

		Serializable save3 = session.save(employee2);
		System.out.println(save3);

		Serializable save4 = session.save(employee3);
		System.out.println(save4);

		Serializable save5 = session.save(employee4);
		System.out.println(save5);

		Serializable save6 = session.save(employee5);
		System.out.println(save6);

		Serializable save7 = session.save(employee6);
		System.out.println(save7);

		Serializable save8 = session.save(employee7);
		System.out.println(save8);

		Serializable save9 = session.save(employee8);
		System.out.println(save9);

		Serializable save10 = session.save(employee9);
		System.out.println(save9);

		transaction.commit();

		System.out.println("Hello World!");

		session.close();
		factory.close();
	}
}
