package com.tejas.nimap.model;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class Category {
    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int c_id;

    private String c_name;
    private String description;
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "category")
    @JsonBackReference
    private List<Product> products;

    @PrePersist
    public void prePersist() {
        createdAt = LocalDateTime.now();
    }

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(int c_id, String c_name, String description, LocalDateTime createdAt, List<Product> products) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.description = description;
		this.createdAt = createdAt;
		this.products = products;
	}
    
    
    
    
    
}

