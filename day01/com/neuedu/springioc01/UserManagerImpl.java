package com.neuedu.springioc01;

public class UserManagerImpl implements IUser {
    public UserManagerImpl(){
    	System.out.println("构造方法被调用");
    }
	@Override
	public void add() {
		// TODO Auto-generated method stub
        System.out.println("UserManagerImpl的add方法被调用");
        
	}
    public static void main(String[] args) {
    	IUser umi=new UserManagerImpl();
    	umi.add();
	}
}
