package com.demo.struts.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by 7 on 2017/1/6.
 */
public class DefaultAction extends ActionSupport{

	@Override
	public String execute() {//方法是没有参数，并且返回值是String。
		System.out.println("hello action default method");
//		return NONE;
		return SUCCESS;
	}
}
