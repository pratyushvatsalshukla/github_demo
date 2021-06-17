package com.employee;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class Main {
	public static void main(String[] args) {
		Resource res=new ClassPathResource("springconfig.xml");
		BeanFactory bf=new XmlBeanFactory(res);
		
		Emp empo=(Emp)bf.getBean("empo");
		System.out.println(empo);
		 
		
		/* 
		Address ad=(Emp)fac.getBean("add");
		System.out.println(ad);
		*/
		
		
	}
}
