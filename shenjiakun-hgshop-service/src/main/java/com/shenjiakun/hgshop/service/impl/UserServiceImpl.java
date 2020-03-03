package com.shenjiakun.hgshop.service.impl;

import org.apache.dubbo.config.annotation.Service;

import com.shenjiakun.hgshop.service.UserService;
@Service(interfaceClass = UserService.class,version ="1.0.0" )
public class UserServiceImpl implements UserService {

	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		return "admin".equals(username)&&"123456".equals(password);
	}

}
