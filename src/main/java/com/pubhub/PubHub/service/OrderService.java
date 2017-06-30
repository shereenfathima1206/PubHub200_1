package com.pubhub.PubHub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pubhub.PubHub.repository.*;
import com.pubhub.PubHub.model.*;

@Service

public class OrderService {

	@Autowired
	OrderRepository orderRepository;
	

	public Order insertToTable(Order order) {
		return orderRepository.save(order);
		
		
	}
	public List<Order> findAllOrderList( Integer userId){
		System.out.println("Service Reached");
       return 	orderRepository.findByUserIdOrderByIdDesc(userId);
	}

}
