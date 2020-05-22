package com.capgemini.drinkanddelight.service;

import java.util.Date;
import java.util.List;

import com.capgemini.drinkanddelight.entity.ProductStock;

public interface ProductStockService {
public ProductStock getProductSpecs(String stockId);

	
	public List<ProductStock> retrieve();
	/*
	 * it will display all the stock details
	 */
	public boolean updateProduct(String stockId,Date  manufactureDate,Date expiryDate,String qualityCheck );
	/*
	 * it will update the manufacturing date ,expire date and insert the quality of the product
	 */	
	public String   doesProductOrderIdExists(String stockId);
	/*
	 * it will check whether stock id present or not
	 */
	
	public boolean setExitDate(String stockId,Date exitDate);
	/*
	 * it will set the exit date of the product order
	 */
}
