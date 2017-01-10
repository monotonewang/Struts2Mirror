package com.demo.struts.action.requestvalue;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * Created by 7 on 2017/1/6.
 */
//第一种：通过Struts2 api获取application session
public class ServletValueAction1 extends ActionSupport {

	public String execute() {
		// 1.获取ActionContext
		ActionContext context = ActionContext.getContext();
		//获取application数据
		Map<String, Object> application = context.getApplication();
		String aname = (String) application.get("aname");
		System.out.println("aname=" + aname);
		// session里面取值
		Map<String, Object> session = context.getSession();
		String sname = (String) session.get("sname");
		System.out.println("sname=" + sname);

		// 2.3 获取请求参数
//		 Map<String, Object> paramMap = context.getParameters();
//		 requestvalue.getParameterMap();
//		 System.out.println(((String[])paramMap.get("username"))[0]);

		// 2.4 向request范围存储数据
		context.put("username", "tom");
		System.out.println("已经存入用户名");
		return SUCCESS;
	}

}
