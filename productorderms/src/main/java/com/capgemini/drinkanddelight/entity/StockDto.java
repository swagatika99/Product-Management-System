package com.capgemini.drinkanddelight.entity;

import java.time.LocalDate;
import java.util.Date;

public class StockDto {
	private String stockId;
	private Date manufactureDate;
	private Date expiryDate;
	private String qualityCheck;
	public StockDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StockDto(String stockId, Date manufactureDate, Date expiryDate, String qualityCheck) {
		super();
		this.stockId = stockId;
		this.manufactureDate = manufactureDate;
		this.expiryDate = expiryDate;
		this.qualityCheck = qualityCheck;
	}
	@Override
	public String toString() {
		return "StockDto [stockId=" + stockId + ", qualityCheck=" + qualityCheck + "]";
	}
	public String getStockId() {
		return stockId;
	}
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}
	public Date getManufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getQualityCheck() {
		return qualityCheck;
	}
	public void setQualityCheck(String qualityCheck) {
		this.qualityCheck = qualityCheck;
	}
}