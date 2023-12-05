package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.AddressBean;
import com.bean.StudentBean;
import com.bean.UserBean;
import com.controller.UserController;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		// Polymorphic object --> Parent p = new Child();

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println(context);
		// UserController uController = new UserController();
		// uController.login();

		UserController uController = context.getBean("uc", UserController.class);//ioc 
		uController.login();
		// web.xml -> UserController -> path -> url -> user

		UserController uController2 = context.getBean("uc",UserController.class);//ioc 
		
		System.out.println(uController);
		System.out.println(uController2);

		
		
		
		UserBean userBean1 = context.getBean("uBean",UserBean.class);
		UserBean userBean2 = context.getBean("uBean",UserBean.class);
		
		System.out.println(userBean1);
		System.out.println(userBean2);
		
		System.out.println(userBean1.getEmail());
		System.out.println(userBean1.getPassword());
		
		System.out.println(userBean2.getEmail());
	
	
		
		
		//StudentBean 
		//AddressBean 
		AddressBean address  = context.getBean("addrBean",AddressBean.class);
		address.setResidentName("VasantVihar");
		
		StudentBean student =  context.getBean("studBean",StudentBean.class);
		student.setFirstName("rock");
		student.setLastName("patel");
		student.setAddress(address);
		
		
		//Signup.jsp -> fn em pass ->submit -
		//SignupController -> read , validtion , dao->insert { dbconnection }   
		
		//DI - dependency Injection 
		
			// 1) constructor Injection 
			// 2) setter Injection 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
