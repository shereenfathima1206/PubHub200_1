package com.pubhub.PubHub.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pubhub.PubHub.model.*; //imports all model class, saves hassle. no need to give all import all time
//import com.pubhub.PubHub.model.Book;


public interface OrderRepository extends JpaRepository<Order,Long> {

	List<Order> findByUserIdOrderByIdDesc(Integer userId);

	



	
	
}