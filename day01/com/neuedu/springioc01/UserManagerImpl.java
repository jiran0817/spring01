package com.neuedu.springioc01;

public class UserManagerImpl implements IUser {
    public UserManagerImpl(){
    	System.out.println("���췽��������");
    }
	@Override
	public void add() {
		// TODO Auto-generated method stub
        System.out.println("UserManagerImpl��add����������");
        
	}
    public static void main(String[] args) {
    	IUser umi=new UserManagerImpl();
    	umi.add();
	}
}
