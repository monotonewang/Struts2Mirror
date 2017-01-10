package com.demo.struts.action.requestvalue;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by 7 on 2017/1/9.
 */
//注入方式获取-真正获取到Servlet api
public class ServletValueAction2 extends ActionSupport implements ServletRequestAware {

	private HttpServletRequest request;

	@Override
	public String execute() throws Exception {
		//获取application对象
		ServletContext servletContext = ServletActionContext.getServletContext();
		System.out.println("注入方式获取=" + request.getParameter("username"));
		String aname = (String) servletContext.getAttribute("aname");
		System.out.println("aname=" + aname);
		return null;
	}

	@Override
	public void setServletRequest(HttpServletRequest httpServletRequest) {
		this.request = httpServletRequest;
	}
}
