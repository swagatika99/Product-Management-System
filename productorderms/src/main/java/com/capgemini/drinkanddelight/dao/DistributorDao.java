package com.capgemini.drinkanddelight.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.drinkanddelight.entity.Distributor;

@Repository
public interface DistributorDao extends JpaRepository<Distributor, String>{

}
