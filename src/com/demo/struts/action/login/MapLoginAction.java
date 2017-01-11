package com.demo.struts.action.login;

import com.demo.struts.action.login.domain.User;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * Created by 7 on 2017/1/11.
 */
public class MapLoginAction extends ActionSupport{

	private Map<String, User> map;

	public Map<String, User> getMap() {
		return map;
	}

	public void setMap(Map<String, User> map) {
		this.map = map;
	}

	@Override
	public String execute() throws Exception {

		System.out.println(map);

		return null;
	}
}
