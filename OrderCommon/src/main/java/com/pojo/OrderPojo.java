package com.pojo;

import java.io.Serializable;

public class OrderPojo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4461992134326471862L;
	
	
	private int id;
	private String customer;
	private String comment;
	
	public OrderPojo(){
		
	}	
	
	public OrderPojo(int id, String customer, String comment) {
		super();
		this.id = id;
		this.customer = customer;
		this.comment = comment;
	}	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "OrderPojo [id=" + id + ", customer=" + customer + ", comment=" + comment + "]";
	}
}
