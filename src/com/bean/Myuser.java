package com.bean;

/**
 * 实体bean与表为包含关系
 * 
 * @author Administrator
 *
 */
public class Myuser {
	private Integer id;

	private String username;

	private String userpass;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	public String getUserpass() {
		return userpass;
	}

	public void setUserpass(String userpass) {
		this.userpass = userpass == null ? null : userpass.trim();
	}

	@Override
	public String toString() {
		return "Myuser [id=" + id + ", username=" + username + ", userpass="
				+ userpass + "]";
	}
}