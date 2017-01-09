package com.demo.struts.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 7 on 2017/1/9.
 */
//注入方式获取-真正获取到Servlet api
public class ServletValueAction2 extends ActionSupport implements ServletRequestAware {

	private HttpServletRequest request;

	@Override
	public String execute() throws Exception {
		System.out.println("注入方式获取="+request.getParameter("username"));
		return null;
	}

	@Override
	public void setServletRequest(HttpServletRequest httpServletRequest) {
		this.request=httpServletRequest;
	}
}
