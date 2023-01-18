package com.mkj.emphrapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkj.emphrapp.entity.Employee;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext spring = new ClassPathXmlApplicationContext("spring.xml");
		
		Employee e = (Employee) spring.getBean("emp");
		System.out.println(e);
		
	}
}
