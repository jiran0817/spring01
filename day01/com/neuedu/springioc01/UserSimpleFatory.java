package com.neuedu.springioc01;

public class UserSimpleFatory {
     public IUser getUserImpl(){
		return new UserManagerImpl();
     }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Step1ʵ���������ࣨ��ͨ�����࣬�����Ǿ�̬��
		UserSimpleFatory userSimpleFatory=new UserSimpleFatory();
		//Step2���ù�����Ķ�Ӧ������ʵ�������ǵ�ʵ��
		IUser iu= userSimpleFatory.getUserImpl();
		iu.add();
	}

}
