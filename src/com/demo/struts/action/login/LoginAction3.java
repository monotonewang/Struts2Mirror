package com.demo.struts.action.login;

import com.demo.struts.action.login.domain.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 7 on 2017/1/10.
 */
//缺点一次只能封装一个model
public class LoginAction3 extends ActionSupport implements ModelDriven<User>{

	private User user=new User();

	@Override
	public User getModel() {
		return user;
	}

	@Override
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		// 2.判断用户名与密码是否正确
		if ("tom".equals(user.getUsername()) && "12345".equals(user.getPassword())) {

			request.getSession().setAttribute("username", user.getUsername());

			return SUCCESS;
		} else {
			request.setAttribute("login.message", "用户名或密码错误");
			return "failer";
		}
	}


}
