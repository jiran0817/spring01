package com.neuedu.springioc01;

public class UserSpringFactory {
	public static IUser getUserImpl(){
		IUser iu=null;
		try {
			Class c=Class.forName("com.neuedu.springioc01.UserManagerImpl2");
			try {
				iu=(IUser) c.newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return iu;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserSpringFactory.getUserImpl().add();

	}

}
