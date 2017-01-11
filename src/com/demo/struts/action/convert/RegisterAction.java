package com.demo.struts.action.convert;

import com.demo.struts.action.convert.domain.UserConvert;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Created by 7 on 2017/1/11.
 */
public class RegisterAction extends ActionSupport implements ModelDriven<UserConvert>{
	private UserConvert userConvert=new UserConvert();

	@Override
	public UserConvert getModel() {
		return userConvert;
	}

	@Override
	public String execute() throws Exception {

		System.out.println(userConvert);

		return null;
	}
}
