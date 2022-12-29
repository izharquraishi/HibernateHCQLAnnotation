package com.hcql.annotation;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class Test {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cgf.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();

		/*
		 * fetching all data from database using hcql Criteria criteria =
		 * session.createCriteria(Employee.class); List list = criteria.list();
		 * System.out.println(list);
		 */

		/*
		 * fetching data from database using hcql start and end Criteria criteria =
		 * session.createCriteria(Employee.class); criteria.setFirstResult(5);
		 * criteria.setMaxResults(10); List list = criteria.list();
		 * System.out.println(list);
		 */

		/*
		 * fetching highest salary using hcql Criteria criteria =
		 * session.createCriteria(Employee.class);
		 * criteria.add(Restrictions.gt("salary",(Integer) 1000)); List list =
		 * criteria.list(); System.out.println(list);
		 */

		/*
		 * Sorting Data Using hcql Criteria criteria =
		 * session.createCriteria(Employee.class);
		 * criteria.addOrder(Order.desc("salary")); List list = criteria.list();
		 * System.out.println(list);
		 */

		/*
		 * Only fetching the data from database using hcql Criteria criteria =
		 * session.createCriteria(Employee.class);
		 * criteria.setProjection(Projections.property("name")); List list =
		 * criteria.list(); System.out.println(list);
		 */

	}

}
