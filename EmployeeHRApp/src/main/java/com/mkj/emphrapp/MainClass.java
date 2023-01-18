package com.mkj.emphrapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkj.emphrapp.entity.Employee;

public class MainClass {

	public static void main(String[] args) {
		                             // ClassPathXmlApplicationContext 
		ApplicationContext spring = new ClassPathXmlApplicationContext("spring.xml");
		
		Employee e = (Employee) spring.getBean("employee");
		System.out.println(e);
		System.out.println(e.getEmpId()+" "+e.getEmpName()+" "+e.getSalary());
		System.out.println(e.getProject().getProjectName());
		
	}
}
