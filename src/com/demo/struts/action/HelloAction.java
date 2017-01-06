package com.demo.struts.action;


/**
 * Created by 7 on 2017/1/5.
 */
//1、 运行流程
//		请求 ---- StrutsPrepareAndExecuteFilter 核心控制器 ----- Interceptors 拦截器（实现代码功能 ） ----- Action 的execuute --- 结果页面 Result
//		* 拦截器 在 struts-default.xml定义
//		* 执行拦截器 是 defaultStack 中引用拦截器



//	图形化界面-->config-browser-plugin
//	http://localhost:8080/Struts2Mirror/config-browser/actionNames.action

//	1.struts2配置文件加载顺序
//			struts2框架要能执行，必须先加载StrutsPrepareAndExecuteFilter.
//
//			在StrutsPrepareAndExecuteFilter的init方法中对Dispatcher进行了初始化.
//			在Dispatcher类中定义的init方法内就描述了struts2配置文件加载的顺序
//
//			init_DefaultProperties(); // [1]   ----------  org/apache/struts2/default.properties
//			init_TraditionalXmlConfigurations(); // [2]  --- struts-default.xml,struts-plugin.xml,struts.xml
//			init_LegacyStrutsProperties(); // [3] --- 自定义struts.properties
//			init_CustomConfigurationProviders(); // [5]  ----- 自定义配置提供
//			init_FilterInitParameters() ; // [6] ----- web.xml
//			init_AliasStandardObjects() ; // [7] ---- Bean加载
//
//			1.default.properties文件
//			作用:定义了struts2框架中所有常量
//			位置: org/apache/struts2/default.properties
//
//			2.struts-default.xml
//			作用:配置了bean,interceptor,result等。
//			位置:在struts的core核心jar包.
//
//			struts-plugin.xml
//			它是struts2框架中所使用的插件的配置文件。
//			struts.xml
//			我们使struts2所使用的配置文件。
//
//			3.自定义的struts.properties
//			就是可以自定义常量。
//
//			4.web.xml
//
//			在开发中，后加载文件中的配置会将先加载文件中的配置覆盖。
//
//			default.properties
//			struts-default.xml
//			struts.xml

//		2.关于Action的配置
//
//				1.<package>  作用:是用于声明一个包。用于管理action。
//		1.name     它用于声明一个包名，包名不能重复，也就是它是唯一的。
//		2.namespace  它与action标签的name属性合并确定了一个唯一访问action的路径。
//		3.extends  它代表继承的包名。
//		4.abstrace 它可以取值为true/false,如果为true,代表这个包是用于被继承的。
//		2<action>  用于声明 一个action
//		1.name  就是action的一个名称，它是唯一的(在同包内) 它与package中的namespace确定了访问action的路径。
//		2.class Action类的全名
//			3.method 要访问的Action类中的方法的名称,方法无参数 ，返回值为String.
//					3.<result> 用于确定返回结果类型
//		1.name  它与action中的方法返回值做对比，确定跳转路径。
//
//		关于action配置其它细节：
//		1.关于默认值问题
//		<package namespace="默认值"> namespace的默认值是""
//		<action class="默认值"  method="默认值">
//		class的默认值是  com.opensymphony.xwork2.ActionSupport
//
//		method的默认值是  execute
//		<result\d	X name="默认值"> name的默认值是 "success"
//
//		2.关于访问action的路径问题
//		现在的action的配置是:
//		<package name="default" namespace="/" extends="struts-default">
//		<action name="hello" class="cn.itcast.action.DefaultAction">
//		<result>/hello.jsp</result>
//		</action>
//		</package>
//
//		当我们输入:
//		http://localhost/Struts2Mirror/a/b/c/hello
//		也访问到了action。
//
//		原因:struts2中的action被访问时，它会首先查找
//		1.namespace="/a/b/c"  action的name=hello  没有.
//		2.namespace="/a/b     action的name=hello  没有
//		3.namespace="/a"      action的name=hello  没有
//		4.namespace="/"        action的name=hello  查找到了.
//
//		如果最后也查找不到，会报404错误.
//
//		3.默认的action。
//		作用:处理其它action处理不了的路径。
//
//		<default-action-ref name="action的名称" />
//		配置了这个，当访问的路径，其它的action处理不了时，就会执行name指定的名称的action。
//
//		4.action的默认处理类
//		在action配置时，如果class不写。默认情况下是 com.opensymphony.xwork2.ActionSupport。
//
//		<default-class-ref class="action.DefaultAction"/>
//		如果设置了，那么在当前包下，默认处理action请的的处理类就为class指定的类。
public class HelloAction {
	public String say() {
		System.out.println("hello action say method");
		return "good";
	}
}
