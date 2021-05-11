package com.gec.demo;

public interface UserDao {
	
	//用户登录
	public void login(String name,String password);
	
	
	//用户注册
	public void register(String name,String password);
	
	//添加用户
	public void addUser();
}
