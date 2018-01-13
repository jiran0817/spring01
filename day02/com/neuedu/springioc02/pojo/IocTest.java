package com.neuedu.springioc02.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {

	public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean1.xml");
//        User user1=ac.getBean("user1", User.class);
        //System.out.println(user1.getUserName());
        
        /*Role role=ac.getBean("role1",Role.class);
        System.out.println(role.getRoleName());*/
        UserService us=ac.getBean("userService", UserService.class);
        us.add();
	}

}
