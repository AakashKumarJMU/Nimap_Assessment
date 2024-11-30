package com.aakash.nimap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tejas.nimap.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{
	
	
	

}



