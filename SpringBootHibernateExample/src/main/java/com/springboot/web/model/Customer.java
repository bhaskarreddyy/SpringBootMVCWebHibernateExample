package com.springboot.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.cache.annotation.Cacheable;
 
/*
 * This is our model class and it corresponds to Customer table in database
 * 
 * @Entity is used for making a persistent pojo class.For this java class,you will have corresponding table in database.
 * @Column is used to map annotated attribute to corresponding column in table.
 * 
 * CREATE TABLE `CUSTOMER` (
	`id` int(11) NOT NULL AUTO_INCREMENT,
	`customerName` varchar(255) DEFAULT NULL,
	`email` varchar(255) DEFAULT NULL,
	PRIMARY KEY (`id`)
	);
 */


@Entity
//@javax.persistence.Cacheable
//@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name="CUSTOMER")
public class Customer{
 
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
 
	@Column(name="customerName")
	String customerName; 
 
	@Column(name="email")
	String email;
 
	public Customer() {
		super();
	}
	public Customer(String customerName,String email) {
		super();
		this.customerName=customerName;
		this.email=email;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
 
