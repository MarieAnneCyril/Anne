package com.dao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pojo.Emp_Pojo;

public class EmpViewMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory=new Configuration().configure("cts_hibernate.cfg.xml").buildSessionFactory();
		Session session=sessionFactory.openSession();
		/*
		 * hql uses class name */
//		String query1="select Empno1,Empname1,salary1 from Emp_Pojo";//valid
		//no table name only pojo class name 
		String query1="From Emp_Pojo";//valid
Query query4=session.createQuery(query1);
List<Emp_Pojo> list4=(List<Emp_Pojo>)query4.list();//resuletset
for(Emp_Pojo e:list4){
	System.out.println(e.getEmpno1()+" "+e.getEmpname()+" "+e.getSalary1());
}
String SQL_QUERY="select max(e1.salary1)from Emp_Pojo e1";
query4=session.createQuery(SQL_QUERY);
List l1=query4.list();
System.out.println("MAX SALARY:"+l1.get(0));

Query query5=session.createQuery("from Emp_Pojo where Empname='anne'");
List list3=query5.list();
Emp_Pojo obj1=(Emp_Pojo)list3.get(0);
System.out.println("anne salary"+obj1.getSalary1());



//parameterized
//positional parametr
String q="from Emp_Pojo where Empno1=:a";
query4=session.createQuery(q);
System.out.println("Enter the eno");
Scanner s1=new Scanner(System.in);
int eno11=s1.nextInt();
query4.setInteger("a",eno11);
List l2=query4.list();
Emp_Pojo obj21=(Emp_Pojo)l2.get(0);
System.out.println("Name and Salary:"+obj21.getEmpname()+" "+obj21.getSalary1());
session.close();

	}

}
