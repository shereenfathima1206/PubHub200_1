package com.pubhub.PubHub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pubhub.PubHub.repository.*; //orderitem
import com.pubhub.PubHub.model.*;

@Service

public class OrderItemService {
	
	@Autowired
	OrderItemRepository orderItemRepo;

}
