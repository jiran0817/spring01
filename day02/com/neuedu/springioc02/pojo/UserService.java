package com.neuedu.springioc02.pojo;

public class UserService {
    private UserDao userDao;
    
    public void add(){
    	System.out.println("ִ��UserService��add����");
    	userDao.add();
    	   
    }
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
    
}
