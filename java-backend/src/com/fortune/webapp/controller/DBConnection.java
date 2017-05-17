package com.fortune.webapp.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private String user;
	private String password;
	private String url;
	private String dbname;
	private Connection conn;
	
	
	public DBConnection(String user, String password, String url, String dbname) {
		super();
		this.user = user;
		this.password = password;
		this.url = url;
		this.dbname = dbname;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getDbname() {
		return dbname;
	}


	public void setDbname(String dbname) {
		this.dbname = dbname;
	}


	public Connection getConn() {
		return conn;
	}


	public void setConn(Connection conn) {
		this.conn = conn;
	}
	
	public boolean connect() throws SQLException{
		conn = DriverManager.getConnection(url,user,password);
		return false;
	};
	
}
