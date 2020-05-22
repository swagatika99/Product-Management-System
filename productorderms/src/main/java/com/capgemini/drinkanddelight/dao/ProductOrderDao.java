package com.capgemini.drinkanddelight.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.drinkanddelight.entity.ProductOrder;

@Repository
public interface ProductOrderDao extends JpaRepository<ProductOrder, String>{
	
	@Query("SELECT p FROM ProductOrder p where p.distributorId=:distributorId and p.deliveryStatus=:deliveryStatus")
	public ProductOrder trackOrder(String distributorId,String deliveryStatus);

	 @Query("Select distinct distributorId from ProductOrder") 
	 List<String> fetchDistributorId();

	 @Query("Select distinct warehouseId from ProductOrder")
	public List<String> fetchWarehousesId();

	 @Query("Select name from ProductOrder")
	public List<String> fetchNames();

	
	

	
	
	
}
