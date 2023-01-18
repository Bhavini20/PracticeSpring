package com.practice.hibernate.demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.practice.hibernate.demo.entity.Instructor;
import com.practice.hibernate.demo.entity.InstructorDetail;


public class CreateDemo {

	public static void main(String[] args) {
		

		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			
			//create the objects
      //      Instructor tempInstructor = new Instructor("Bhavini", "Singh", "bhav@gmail.com");
			
		//	InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.code.com/youtube", "Dancing");
			
            Instructor tempInstructor = new Instructor("Madhu", "Patel", "madhu@gmail.com");
			
			InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.codeyou.com/youtube", "guitar");
			//associate the objects
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			
			// start a transaction
			session.beginTransaction();
			
			//save the instructor
			// Note: this will ALSO save the details object
		    // because of CascadeType.ALL that saves associated 
			//objects too
			System.out.println("Saving instructor: " + tempInstructor);
			session.save(tempInstructor);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!!!");
			
		} catch (Exception e){
			e.printStackTrace();
		}
		finally {
			factory.close();
		}

	}

}
