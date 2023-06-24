package com.spring.practice.Spring_Practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.practice.Spring_Practice.student.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/practice/Spring_Practice/student/student_confug.xml");
		
		JdbcTemplate j = (JdbcTemplate)applicationContext.getBean("jdbc", JdbcTemplate.class);
		
		
		
		String q = "insert into student(id, name, address) values(?,?,?)";
		
		int res =   j.update(q, 1, "Md Toufique Husein", "Mohakhali, Dhala");
		
		System.out.println(res);
	}
}
