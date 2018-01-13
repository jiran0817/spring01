package com.neuedu.springioc01;

public class UserSimpleFatory {
     public IUser getUserImpl(){
		return new UserManagerImpl();
     }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Step1实例化工厂类（普通工厂类，方法非静态）
		UserSimpleFatory userSimpleFatory=new UserSimpleFatory();
		//Step2调用工厂类的对应方法来实例化我们的实现
		IUser iu= userSimpleFatory.getUserImpl();
		iu.add();
	}

}
