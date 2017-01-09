package com.demo.struts.action;

		import com.opensymphony.xwork2.ActionSupport;
		import org.apache.struts2.ServletActionContext;

		import javax.servlet.http.HttpServletRequest;

/**
 * Created by 7 on 2017/1/9.
 */
//获取servlet api  通过ServletActionContext获取
public class ServletValueAction3 extends ActionSupport {

	@Override
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		System.out.println("用户名："+request.getParameter("username"));
		return SUCCESS;
	}
}
