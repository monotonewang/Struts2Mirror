package com.demo.struts.action;


/**
 * Created by 7 on 2017/1/5.
 */
//1、 运行流程
//		请求 ---- StrutsPrepareAndExecuteFilter 核心控制器 ----- Interceptors 拦截器（实现代码功能 ） ----- Action 的execuute --- 结果页面 Result
//		* 拦截器 在 struts-default.xml定义
//		* 执行拦截器 是 defaultStack 中引用拦截器
public class HelloAction {
	public String say() {
		System.out.println("hello action say method");
		return "good";
	}
}
