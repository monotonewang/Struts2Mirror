package com.demo.struts.action.convert;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by 7 on 2017/1/11.
 */
public class UserConverterAction extends ActionSupport {

	public String login(){
		System.out.println("login method");
		return SUCCESS;
	}

	public String register(){
		System.out.println("register method");
		return SUCCESS;
	}

}
