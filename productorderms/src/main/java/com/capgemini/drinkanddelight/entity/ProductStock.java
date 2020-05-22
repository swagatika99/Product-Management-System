package com.capgemini.drinkanddelight.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



//import com.fasterxml.jackson.annotation.JsonFormat;
@Entity

@Table(name = "Stock_Details")
public class ProductStock {
	
	
		
		@Id
		private String stockId;
		private String name;
		private String DistrbuterId;
		private double quantityValue;
		private double quantityUnit;
		private double pricePerUnit;
		private String warehouseId;
		private Date exitDate;
		private Date manufactureDate;
		private Date expiryDate;
		private String qualityCheck;
		public ProductStock() {
			super();
			// TODO Auto-generated constructor stub
		}
		public ProductStock(String stockId, String name, String distrbuterId, double quantityValue, double quantityUnit,
				double pricePerUnit, String warehouseId, Date exitDate, Date manufactureDate, Date expiryDate,
				String qualityCheck) {
			super();
			this.stockId = stockId;
			this.name = name;
			DistrbuterId = distrbuterId;
			this.quantityValue = quantityValue;
			this.quantityUnit = quantityUnit;
			this.pricePerUnit = pricePerUnit;
			this.warehouseId = warehouseId;
			this.exitDate = exitDate;
			this.manufactureDate = manufactureDate;
			this.expiryDate = expiryDate;
			this.qualityCheck = qualityCheck;
		}
		@Override
		public String toString() {
			return "ProductStock [stockId=" + stockId + ", name=" + name + ", DistrbuterId=" + DistrbuterId
					+ ", quantityValue=" + quantityValue + ", quantityUnit=" + quantityUnit + ", pricePerUnit="
					+ pricePerUnit + ", warehouseId=" + warehouseId + ", exitDate=" + exitDate + ", manufactureDate="
					+ manufactureDate + ", expiryDate=" + expiryDate + ", qualityCheck=" + qualityCheck + "]";
		}
		public String getStockId() {
			return stockId;
		}
		public void setStockId(String stockId) {
			this.stockId = stockId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDistrbuterId() {
			return DistrbuterId;
		}
		public void setDistrbuterId(String distrbuterId) {
			DistrbuterId = distrbuterId;
		}
		public double getQuantityValue() {
			return quantityValue;
		}
		public void setQuantityValue(double quantityValue) {
			this.quantityValue = quantityValue;
		}
		public double getQuantityUnit() {
			return quantityUnit;
		}
		public void setQuantityUnit(double quantityUnit) {
			this.quantityUnit = quantityUnit;
		}
		public double getPricePerUnit() {
			return pricePerUnit;
		}
		public void setPricePerUnit(double pricePerUnit) {
			this.pricePerUnit = pricePerUnit;
		}
		public String getWarehouseId() {
			return warehouseId;
		}
		public void setWarehouseId(String warehouseId) {
			this.warehouseId = warehouseId;
		}
		public Date getExitDate() {
			return exitDate;
		}
		public void setExitDate(Date exitDate) {
			this.exitDate = exitDate;
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
		