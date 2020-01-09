package com.wst.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.wst.bean.EmployeeAddress;

public class EmployeeAddressTest {
	public static void main(String[]args) {
		ClassPathResource resource = new ClassPathResource("com/config/MyxmlCi.xml");
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		
		EmployeeAddress empAdd = (EmployeeAddress) factory.getBean("empAdd");
		System.out.println(empAdd);
		
	}

}
