package com.ims.supplier.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Suppliers {
	
	@Id
	private Integer suppId;
	private String suppName;
	private String suppAddr;
	private Integer suppContact;
	
	public Integer getSuppId() {
		return suppId;
	}
	public void setSuppId(Integer suppId) {
		this.suppId = suppId;
	}
	public String getSuppName() {
		return suppName;
	}
	public void setSuppName(String suppName) {
		this.suppName = suppName;
	}
	public String getSuppAddr() {
		return suppAddr;
	}
	public void setSuppAddr(String suppAddr) {
		this.suppAddr = suppAddr;
	}
	public Integer getSuppContact() {
		return suppContact;
	}
	public void setSuppContact(Integer suppContact) {
		this.suppContact = suppContact;
	}
	
	
	

}
