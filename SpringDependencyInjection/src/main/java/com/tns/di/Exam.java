package com.tns.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		//Students s=c.getBean("s",Students.class);
		//s.print();//
		Students s1=c.getBean("s1",Students.class);
		s1.print();

		
	}

}
