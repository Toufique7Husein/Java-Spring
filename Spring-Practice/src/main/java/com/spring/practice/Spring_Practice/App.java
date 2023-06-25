package com.spring.practice.Spring_Practice;

import java.util.Arrays;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;

import com.spring.practice.Spring_Practice.student.Student;
import com.spring.practice.Spring_Practrice.Dao.Dao;
import com.spring.practice.Spring_Practrice.Dao.StudentDao;
import com.spring.practice.Spring_Practrice.withouthxml.JdbcConfigure;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfigure.class);
		StudentDao student = context.getBean("dao", StudentDao.class);
		debug(student.getStudents());
		
	}
	
	static void debug(Object...obj) {
		System.err.println(Arrays.deepToString(obj));
	}
}
