package com.neuedu.springioc02.pojo;

public class UserService {
    private UserDao userDao;
    
    public void add(){
    	System.out.println("执行UserService的add方法");
    	userDao.add();
    	   
    }
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
    
}
