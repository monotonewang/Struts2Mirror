package com.demo.struts.action.login;

import com.demo.struts.action.login.domain.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Created by 7 on 2017/1/10.
 */
//UserBean --> login0.jsp
public class LoginAction1 extends ActionSupport implements ModelDriven<User> {
	private User user = new User();

	@Override
	public User getModel() {

		return user;
	}

	public String say() {
		System.out.println("username=" + user.getUsername() + "password=" + user.getPassword());
		return "good";
	}
}
