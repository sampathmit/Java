package com.sampath.springaop.work;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sampath.springaop.work.service.ShapeService;

public class AopMain {

	public static void main(String args[]) {
		ApplicationContext apc = new ClassPathXmlApplicationContext("spring-config.xml");
		ShapeService sp = apc.getBean("shapeService",ShapeService.class);
		sp.getCircle().setName("PAPA");
		System.out.println(sp.getCircle().getName());
		System.out.println("==========PROGRAM END============");
		System.out.println("==========PROGRAM END 1============");
		/*System.out.println("==========================================");
		System.out.println(sp.getTriangle().getName());*/
	}
	
}
