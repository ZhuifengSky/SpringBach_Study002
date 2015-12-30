package com.main;


import java.text.SimpleDateFormat;
import java.util.Date;
 
public class Report {
 
	 private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	private int id;
	private Date date;
 
	public int getId() {
		return id;
	}
 
	public void setId(int id) {
		this.id = id;
	}
 
	public Date getDate() {
		return date;
	}
 
	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Report [id=" + id + ", date=" + dateFormat.format(date) + "]";
	}
 
}
