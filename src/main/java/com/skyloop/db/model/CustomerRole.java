package com.skyloop.db.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customerRole")
public class CustomerRole {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String customerRole;
	@OneToMany(mappedBy = "customerRole", cascade = CascadeType.ALL)
	private Set<Customer> customers;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCustomerRole() {
		return customerRole;
	}

	public void setCustomerRole(String customerRole) {
		this.customerRole = customerRole;
	}

	public Set<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}

}
