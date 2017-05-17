package com.fortune.webapp.model;

public class Fortune {
	
	private String idfcookies;
	private String des;
	
	public Fortune(String id, String des) {
		super();
		this.idfcookies = id;
		this.des = des;
	}
	
	public String getIdfcookies() {
		return idfcookies;
	}
	public void setIdfcookies(String id) {
		this.idfcookies = id;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	
	@Override
	public String toString() {
		return "Fortune [idfcookies=" + idfcookies + ", des=" + des + "]";
	}

}
