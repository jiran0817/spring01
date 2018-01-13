package com.neuedu.springioc01;

public class UserStaticFatory {
     public static IUser getUserImpl(){
		return new UserManagerImpl();
     }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IUser iu=UserStaticFatory.getUserImpl();
		iu.add();
	}

}
