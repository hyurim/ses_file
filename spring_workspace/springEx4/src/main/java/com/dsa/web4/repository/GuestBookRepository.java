package com.dsa.web4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsa.web4.entity.GuestBookEntity;


public interface GuestBookRepository extends JpaRepository<GuestBookEntity, Integer>{

}
