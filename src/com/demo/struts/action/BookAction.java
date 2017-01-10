package com.demo.struts.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by 7 on 2017/1/6.
 */
public class BookAction extends ActionSupport {

	public String add() {
		System.out.println("book_add");
		return NONE;
	}

	public String update() {
		System.out.println("book_update");
		return NONE;
	}

	public String delete() {
		System.out.println("book_delete");
		return NONE;
	}

	public String search() {
		System.out.println("book_search");
		return NONE;
	}

}
