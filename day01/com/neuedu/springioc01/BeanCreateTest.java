package com.neuedu.springioc01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class BeanCreateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BeanFactory bf=new XmlBeanFactory(new ClassPathResource("bean1.xml"));
				//BeanFactory bf=new XmlBeanFactory(new FileSystemResource("C:/workspace/spring01/day01/bean1.xml"));
				//IUser iu1=(IUser) bf.getBean("userManagerImpl");
				//iu1.add();
		//ͨ����ȡ��·����xml��������
		ApplicationContext ac=new ClassPathXmlApplicationContext("bean1.xml");
		//ApplicationContext ac=new FileSystemXmlApplicationContext("C:/workspace/spring01/day01/bean1.xml");
		//���췽��ʵ��������ȡ
//		IUser iu=(IUser) ac.getBean("userManagerImpl");
		//iu.add();
		//��̬��������ʵ���������ȡ
//		IUser iu2= ac.getBean("userManagerImpl2",IUser.class);
		//iu2.add();
		//��ʵ����������ʵ��������
		
		IUser iu3= ac.getBean("userManagerImpl3",IUser.class);
		iu3.add();
		
	}

}
