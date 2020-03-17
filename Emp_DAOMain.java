package com.dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.Emp_Pojo;

public class Emp_DAOMain {
	public static void main(String[] args){
		SessionFactory sessionFactory=new Configuration().configure("cts_hibernate.cfg.xml").buildSessionFactory();
		Session session=sessionFactory.openSession();
		//start a transaction
		Transaction tx=session.beginTransaction();
		Emp_Pojo e1=new Emp_Pojo();
		Scanner scan=new Scanner(System.in);
		System.out.println("Eno");
		int eno1=scan.nextInt();
		System.out.println("Name");
		String name1=scan.next();
		System.out.println("Salary");
		float salary1=scan.nextFloat();
		
		e1.setEmpno1(eno1);
		e1.setEmpname(name1);
		e1.setSalary1(salary1);
		//upto emp_pojo is transient state
		
		session.persist(e1);
		System.out.println("**********inserted*********");
		//without commit not refletced in db
		tx.commit();
	}

}
