package com.practice.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.practice.hibernate.demo.entity.Student;

public class QueryStudentDemo {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		

		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {

			// start a transaction
			session.beginTransaction();

			// query student
			List<Student> theStudents = session.createQuery("from Student").getResultList();

			// display the students
		    displayStudents(theStudents);

			// query students: lastname = 'Doe'
			theStudents = session.createQuery("from Student s where s.lastName = 'Doe'").getResultList();

			// display the students
			System.out.println("\nStudents who have last name of Doe");
			displayStudents(theStudents);

			// query students: lastName = 'Doe' OR firstName = 'Daffy'

			theStudents = session.createQuery("from Student s where s.lastName = 'Doe' OR s.firstName = 'Daffy'")
					.getResultList();

			System.out.println("\nStudents who have last name of Doe or first name of Daffy");
			displayStudents(theStudents);

			// query students where email LIKE '%gmail.com'

			theStudents = session.createQuery("from Student s where s.email LIKE '%gmail.com'").getResultList();

			System.out.println("\nStudents whose emails end with gmail.com");
			displayStudents(theStudents);

			// commit the transaction
			session.getTransaction().commit();
			
		} catch (Exception e){
			e.printStackTrace();
		}
		finally {
			factory.close();
		}

	}

	private static void displayStudents(List<Student> theStudents) {
		for (Student tempStudent: theStudents) {
			System.out.println(tempStudent);
		}
	}

}
