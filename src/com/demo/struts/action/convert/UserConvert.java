package com.demo.struts.action.convert;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by 7 on 2017/1/11.
 */
public class UserConvert {
	private String username;
	private String password;
	private int age;
	private Date birthday;
	private String[] hobby;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "UserConvert{" +
				"username='" + username + '\'' +
				", password='" + password + '\'' +
				", age=" + age +
				", birthday=" + birthday +
				", hobby=" + Arrays.toString(hobby) +
				'}';
	}
}
