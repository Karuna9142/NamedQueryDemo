package com.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Demo {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentdetails");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Query q = em.createNamedQuery("findname");
		List<Student> stud = q.getResultList();
		
		for(Student s1 : stud)
		{
			System.out.println("ID : "+s1.getId());
			System.out.println("Name : "+s1.getName());
			System.out.println("Age: "+s1.getAge());
		}
		
		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}