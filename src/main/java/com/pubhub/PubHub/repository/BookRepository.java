package com.pubhub.PubHub.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pubhub.PubHub.model.*;


public interface BookRepository extends JpaRepository<Book,Long> {

	List<Book> findByOrderByPriceDesc();

	List<Book> findByOrderByPriceAsc();

	List<Book> findByName(String name);

	
	
}
