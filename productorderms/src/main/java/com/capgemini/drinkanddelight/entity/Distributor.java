package com.capgemini.drinkanddelight.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="distributordetails")
public class Distributor 
{
	@Id
	private String distributorId;
	private String name;
	private String Address;
	private Long phoneNumber;
	public Distributor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Distributor(String distributorId, String name, String address, long phoneNumber) {
		super();
		this.distributorId = distributorId;
		this.name = name;
		Address = address;
		this.phoneNumber = phoneNumber;
	}
	public String getDistributorId() {
		return distributorId;
	}
	public void setDistributorId(String distributorId) {
		this.distributorId = distributorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Distributor [distributorId=" + distributorId + ", name=" + name + ", Address=" + Address
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	
	
}
