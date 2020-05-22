package com.capgemini.drinkanddelight.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.drinkanddelight.entity.ProductSpecs;
import com.capgemini.drinkanddelight.entity.ProductStock;

@Repository
public interface ProductStockDao extends  JpaRepository <ProductStock, String>{ 

}
