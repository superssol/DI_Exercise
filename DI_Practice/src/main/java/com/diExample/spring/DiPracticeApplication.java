package com.diExample.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.diExample.spring.bean.Config;
import com.diExample.spring.bean.Member;
import com.diExample.spring.bean.Printer;


public class DiPracticeApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DiPracticeApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Member member1 = (Member)context.getBean("member1");
		member1.print();
		
		Member member2 = context.getBean("hello", Member.class);
		member2.print();
		
		Printer printer = context.getBean("printerB", Printer.class);
		member1.setPrinter(printer);
		member1.print();
		}
	
}
