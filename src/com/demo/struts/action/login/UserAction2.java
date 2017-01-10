package com.demo.struts.action.login;

import com.demo.struts.domain.User;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 7 on 2017/1/10.
 */
public class UserAction2 extends ActionSupport {
	private User user;
	public User getUser(){
		return user;
	}
	public void setUser(User user){
		this.user=user;
	}
	@Override
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		// 2.判断用户名与密码是否正确
		if ("tom".equals(user.getUsername()) && "123".equals(user.getPassword())) {

			request.getSession().setAttribute("username", user.getUsername());

			return SUCCESS;
		} else {
			request.setAttribute("login.message", "用户名或密码错误");
			return "failer";
		}
	}
}
