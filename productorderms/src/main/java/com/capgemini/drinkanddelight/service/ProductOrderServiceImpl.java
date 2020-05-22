package com.capgemini.drinkanddelight.service;


import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.drinkanddelight.dao.DistributorDao;
import com.capgemini.drinkanddelight.dao.ProductOrderDao;
import com.capgemini.drinkanddelight.dao.ProductStockDao;
import com.capgemini.drinkanddelight.entity.Distributor;
import com.capgemini.drinkanddelight.entity.ProductOrder;
import com.capgemini.drinkanddelight.entity.ProductStock;

@Service
@Transactional
public class ProductOrderServiceImpl implements ProductOrderService{
	
	@Autowired
	private ProductOrderDao orderDao;
	
	@Autowired
	private DistributorDao distDao;
	
	
	@Override
	public ProductOrder placeProductDetails(String orderId) {
		 Optional<ProductOrder> optional= orderDao.findById(orderId);
		 if(optional.isPresent())
		 {
			 return optional.get();
		 }
		 return null;
		 	
	}

	@Override
	public String updateStatusProductOrder(String orderId, String deliveryStatus) {
		 Optional<ProductOrder> optional= orderDao.findById(orderId);
		
		 if(optional.isPresent())
		 {
			 ProductOrder	order = optional.get();
			 order.setDeliveryStatus(deliveryStatus);
			 return "Delivery status updated successfully";
		 }
		 return "Missing Details";
	}

	@Override
	public String addProductOrder(ProductOrder productOrder) {
		productOrder = 	orderDao.save(productOrder);
		   return "Order added successfully";
	}

	@Override
	public List<ProductOrder> displayProductOrders() {
		List<ProductOrder> orders=  orderDao.findAll();
        return orders;
	}

	@Override
	public Distributor getDistributorDetails(String distributorId) {
		 Optional<Distributor> optional= distDao.findById(distributorId);
		 if(optional.isPresent())
		 {
			 return optional.get();
		 }
		 return null;
		 	
	}

	@Override
	public List<Distributor> displayAllDistributorDetails() {
		
		List<Distributor> details=distDao.findAll();
		return details;
	}

	@Override
	public ProductOrder trackOrder(String distributorId, String deliveryStatus) {
		
		return orderDao.trackOrder(distributorId,deliveryStatus);
	}

	@Override
	public String doesProductIdExists(String orderId) {
		if(orderDao.existsById(orderId))
		{
			return "Order Id exist";
		}
		return null;
		
	}

	 @Override 
	   public List<String> fetchDistributorIds()
	   { 
		
		   List<String>ids =orderDao.fetchDistributorId();
		return ids; 
		   
	   }

	@Override
	public List<String> fetchWarehouseIds() {
		
			List<String> ids =orderDao.fetchWarehousesId();
			return ids;
	}

	@Override
	public List<String> fetchProductNames() {
		
			List<String> ids =orderDao.fetchNames();
			return ids;
		   
		  
	}

	@Override
	public String deleteProduct(String orderId) {
		if(orderDao.findById(orderId).isPresent()){
			orderDao.deleteById(orderId);
			return "Product with given OrderId deleted";
		}
		return null;
		
	}
	

	@Override
	public ProductOrder delete(String orderId) {
		  if(orderDao.findById(orderId).isPresent()){
			   orderDao.deleteById(orderId);
			   
	        }
		return null;
	}

	

	

	
	

	

	
	

	

	
	



}
