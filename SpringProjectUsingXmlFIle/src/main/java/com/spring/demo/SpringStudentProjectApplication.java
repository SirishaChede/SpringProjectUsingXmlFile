package com.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringStudentProjectApplication {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("com/spring/demo/beans.xml");
		Student stud=(Student) con.getBean("stu");
	    stud.DisplayInfo();//we can create all the accessing elements in the student class 
	    //only we can call that method only then it can print the values.
	}

}
