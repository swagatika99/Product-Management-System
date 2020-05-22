package com.capgemini.drinkanddelight.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pspecs")
public class ProductSpecs
{
	@Id
	private String pmsId;
	private String name;
	private double pricePerUnit;
	private  int duration;
    private String description;
    
	public ProductSpecs() {
		
	}

	public ProductSpecs(String pmsId, String name, double pricePerUnit, int duration, String description) {
		super();
		this.pmsId = pmsId;
		this.name = name;
		this.pricePerUnit = pricePerUnit;
		this.duration = duration;
		this.description = description;
	}

	public String getPmsId() {
		return pmsId;
	}

	public void setPmsId(String pmsId) {
		this.pmsId = pmsId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ProductSpecs [pmsId=" + pmsId + ", name=" + name + ", pricePerUnit=" + pricePerUnit + ", duration="
				+ duration + ", description=" + description + "]";
	}
    
	
    
}
