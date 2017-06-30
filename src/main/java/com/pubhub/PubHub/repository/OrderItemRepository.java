package com.pubhub.PubHub.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.pubhub.PubHub.model.OrderItem;


	
	public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {



}