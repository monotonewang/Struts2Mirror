package com.demo.struts.action.login;

import com.demo.struts.action.login.domain.User;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

/**
 * Created by 7 on 2017/1/11.
 */
public class ListLoginAction extends ActionSupport {
	private List<User> users;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String execute() throws Exception {

		System.out.println(users);

		return null;
	}
}
