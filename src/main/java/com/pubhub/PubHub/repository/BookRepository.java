package com.pubhub.PubHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pubhub.PubHub.model.*;


public interface BookRepository extends JpaRepository<Book,Long> {

}
