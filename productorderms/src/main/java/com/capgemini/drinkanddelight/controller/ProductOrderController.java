package com.capgemini.drinkanddelight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.drinkanddelight.entity.DeliveryStatusDto;
import com.capgemini.drinkanddelight.entity.Distributor;
import com.capgemini.drinkanddelight.entity.ProductOrder;
import com.capgemini.drinkanddelight.exception.DistributorNotFoundException;
import com.capgemini.drinkanddelight.exception.ProductOrderNotFoundException;
import com.capgemini.drinkanddelight.service.ProductOrderServiceImpl;

@CrossOrigin(origins = "*")
@RestController
public class ProductOrderController {
	
	@Autowired
	private ProductOrderServiceImpl service;
	
	@PostMapping("/addProductOrder")

	public String addProductOrder(@RequestBody ProductOrder  productOrder)
	{
		 service.addProductOrder(productOrder);
		 return "Order Added Successfully";
		
	}

	@PostMapping("/place/{orderId}")
	public ProductOrder placeProductDetails(@PathVariable String orderId) throws ProductOrderNotFoundException{
			
           ProductOrder pro=service.placeProductDetails(orderId);
		
		if(pro==null || "".equals(pro))
    	{
    		 throw new ProductOrderNotFoundException("Product not found with id "+orderId+" Please try again!!!");
    	}
    	else
    	{
    		return service.placeProductDetails(orderId);
    		
		}
		}
		
	
	@PostMapping("/updateProductDeliveryStatus")
	public String updateDeliveryStatus (@RequestBody DeliveryStatusDto dto)
	{
		  
		return service.updateStatusProductOrder(dto.getOrderId(),dto.getDeliveryStatus());
	}
	@GetMapping("/displayProductOrders")

	public List<ProductOrder> displayProductOrders() throws ProductOrderNotFoundException
	{
			List<ProductOrder> list = service.displayProductOrders();
			if(list == null)
				throw new ProductOrderNotFoundException("Sry we not found any data in database");
			return list;
	}

	@GetMapping("/getDistributorDetails/{distributorId}")
	public  Distributor getDistributorDetails( @PathVariable String distributorId) throws ProductOrderNotFoundException
	{	Distributor dis=service.getDistributorDetails(distributorId);
		
		if(dis==null || "".equals(dis))
    	{
    		 throw new ProductOrderNotFoundException("Distributor details not found with id "+distributorId);
    	}
    	else
    	{
    		return service.getDistributorDetails(distributorId);
		}
	}
	
	@GetMapping("/getalldistributordetails")
	public List<Distributor> displayAllDistributorDetails() throws DistributorNotFoundException
	{
		List<Distributor> list = service.displayAllDistributorDetails();
		if(list == null)
			throw new DistributorNotFoundException("Sry we didn't not found any data in database");
		return list;
		
	}
	

	@GetMapping("/displaywithid/{distributorId}/{deliveryStatus}")
	public ProductOrder trackOrder(@PathVariable String distributorId,@PathVariable String  deliveryStatus)
	{
		ProductOrder p=service.trackOrder(distributorId,deliveryStatus);
		if(p==null || "".equals(p))
    	{
    		 throw new ProductOrderNotFoundException("Distributor Id or Delivery Status entered incorrectly!!");
    	}
    	else
    	{
    		return p;
		}
	}
	@GetMapping("/{orderId}")
	public String doesProductIdExists(@PathVariable String orderId)
	{
		String id= service.doesProductIdExists(orderId);
		if(id==null)
			throw new ProductOrderNotFoundException("Order ID not found with id "+orderId);
		else
			return service.doesProductIdExists(orderId);
		
	}
	
	 @GetMapping("/allDistributorIds") 
	 public List<String>fetchDistributorIds()
	 {
		 try 
		 {
		 List<String> list=service.fetchDistributorIds();
		 if (list.isEmpty()) 
		   {
				throw new ProductOrderNotFoundException("No Records found of Distributors");
		   }
		   else 
			{
				   return list; 
			}
		 }
		  catch (ProductOrderNotFoundException ex) 
			{
			  	
				throw new ProductOrderNotFoundException("No Records found of Distributor");
			}
		 
		  
	 }
	 
	 @GetMapping("/allWarehouseIds")
	 public List<String> warehouseIds()
	 {
		 try 
		 {
		 List<String> list=service.fetchWarehouseIds();
		 if (list.isEmpty()) 
		   {
				throw new ProductOrderNotFoundException("No Records found of WareHouse");
		   }
		   else 
			{
				   return list; 
			}
		 }
		  catch (ProductOrderNotFoundException ex) 
			{
			  	ex.printStackTrace();
				throw new ProductOrderNotFoundException("No Records found of WareHouse");
			}
	 }
	 
	
	  @GetMapping("/allProductNames") 
	  public List<String> productNames()
	  {
		  try 
			 {
		  List<String> list=service.fetchProductNames();
		  
		  if (list.isEmpty()) 
		   {
				throw new ProductOrderNotFoundException("No Records found of ProductName");
		   }
		   else 
			{
				   return list; 
			}
		 }
		  catch (ProductOrderNotFoundException ex) 
			{
			  	ex.printStackTrace();
				throw new ProductOrderNotFoundException("No Records found of ProductName");
			}
	  }
	  
	  @DeleteMapping("/product/{id}")
	    private String deleteProduct(@PathVariable(value = "id")String orderId)
	    {
		  String id=service.deleteProduct(orderId);
		  if(id==null)
			  throw new ProductOrderNotFoundException("Order ID not found with id "+orderId);
		  else
			  return id;
	    }
	  @DeleteMapping("/delete/{id}")
	    private ProductOrder delete(@PathVariable(value = "id")String orderId){
	        ProductOrder del=service.delete(orderId);
			return del;
	      
	    	
	    }
}
