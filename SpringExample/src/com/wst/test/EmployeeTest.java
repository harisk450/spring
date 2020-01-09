package com.wst.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.wst.bean.Employee;

public class EmployeeTest {
	public static void main(String[]args) {
		ClassPathResource resource = new ClassPathResource("com/config/MyxmlCi.xml");
		XmlBeanFactory factory = new XmlBeanFactory(resource);
				
		Employee emp = (Employee) factory.getBean("emp");
		System.out.println(emp);
		
		ClassPathResource resource1 = new ClassPathResource("com/config/MyxmlCi.xml");
		XmlBeanFactory factory1= new XmlBeanFactory(resource1);
				
		Employee emp1 = (Employee) factory1.getBean("emp");
		
		
		if(emp==emp1) {
			
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
	}

}
