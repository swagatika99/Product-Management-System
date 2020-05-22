package com.capgemini.drinkanddelight.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.drinkanddelight.entity.ProductSpecs;

@Repository
public interface ProductSpecsDao extends JpaRepository<ProductSpecs, String>{

}
