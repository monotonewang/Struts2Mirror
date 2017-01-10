package com.demo.struts.action.login;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 7 on 2017/1/10.
 */
public class LoginAction0 extends ActionSupport {
	@Override
	public String execute() throws Exception {
		// 1.获取请求参数
		HttpServletRequest request = ServletActionContext.getRequest();

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		// 2.判断用户名与密码是否正确
		if ("tom".equals(username) && "123".equals(password)) {

			request.getSession().setAttribute("username", username);

			return SUCCESS;
		} else {
			request.setAttribute("login.message", "用户名或密码错误");
			return "failer";
		}
	}
}
