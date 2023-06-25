package com.spring.practice.Spring_Practice;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;

import com.spring.practice.Spring_Practice.student.Student;
import com.spring.practice.Spring_Practrice.Dao.Dao;
import com.spring.practice.Spring_Practrice.Dao.StudentDao;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Student student = new StudentDao().getStudent(3);
		System.out.println(student);
		
		
		System.out.println(new StudentDao().getStudents());
	}
}
