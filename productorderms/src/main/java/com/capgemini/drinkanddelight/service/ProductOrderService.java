package com.capgemini.drinkanddelight.service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import com.capgemini.drinkanddelight.entity.Distributor;
import com.capgemini.drinkanddelight.entity.ProductOrder;
import com.capgemini.drinkanddelight.entity.ProductStock;


public interface ProductOrderService 
{
	//update status of an order
	String  updateStatusProductOrder(String orderId, String deliveryStatus);
	
	//add an order
	String addProductOrder(ProductOrder productOrder);
	
	//place order
	public ProductOrder placeProductDetails(String orderId);

	
	//display all orders placed
	List<ProductOrder> displayProductOrders();
	
	//delete a product
	public String deleteProduct(String orderId);
	
	//display  distributors details based on id
	Distributor getDistributorDetails(String distributorId);
	
	//display all distributors details
	List<Distributor> displayAllDistributorDetails();
	
	//display order details
	ProductOrder trackOrder(String distributorId,String deliveryStatus);
	
	//check orderid exists or not
	public String doesProductIdExists(String orderId);
	
	//fetch only distributors id
	public List<String> fetchDistributorIds();
	
	//fetch only warehouse id
	public List<String> fetchWarehouseIds();
	
	//fetch only product names
	public List<String> fetchProductNames();
	
	//delete a product
	public ProductOrder delete(String orderId);
	
	

   
}
