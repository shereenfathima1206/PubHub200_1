package com.pubhub.PubHub.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pubhub.PubHub.model.*;
import com.pubhub.PubHub.repository.*;

@Service

public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	
	public List<Book> findAll() {
		return bookRepository.findAll();
	}
	
public Book findOne(Long id) {
		return bookRepository.findOne(id);
	}

public List<Book> priceDesc() {
	return bookRepository.findByOrderByPriceDesc();
}

public List<Book> priceAsc() {
	return bookRepository.findByOrderByPriceAsc();
}
public List<Book> specificBook(String name){
	System.out.println("Service reached");
	return bookRepository.findByName(name);
}





}