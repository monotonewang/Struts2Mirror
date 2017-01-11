package com.demo.struts.action.login;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 7 on 2017/1/10.
 */
//UserBean --> login0.jsp
//获取请求参数  属性驱动  第一种，直接将action做为model-struts2 默认是多实例的。所以不存在线程安全问题。
//缺点:需要单独定义javaBean,将action中属性copy到javaBean中。
public class LoginAction1 extends ActionSupport  {
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		// 2.判断用户名与密码是否正确
		if ("tom".equals(username) && "1234".equals(password)) {

			request.getSession().setAttribute("username", username);

			return SUCCESS;
		} else {
			request.setAttribute("login.message", "用户名或密码错误");
			return "failer";
		}
	}
}
