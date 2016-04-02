package com.skyloop.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skyloop.db.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
