package com.neuedu.springioc02.pojo;
/**
 * ��ɫ��
 */
public class Role {
    private int roleId;
    private String roleName;
	public Role(int id,String name) {
		this.roleId=id;
		this.roleName=name;
	}
	public int getRoleId() {
		return roleId;
	}
	public String getRoleName() {
		return roleName;
	}

}
