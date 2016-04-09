package com.skyloop.db.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.skyloop.db.model.Customer;
import com.skyloop.service.common.util.QueryConstant;

@Repository
@Transactional
public interface CustomerRepository extends CrudRepository<Customer, Long> {
public static String QUERY = " and  b.email IS NOT NULL";
	//@Query("SELECT t FROM customer t where t.coulmName = coulmValue ")
	//List<com.skyloop.db.model.Customer> findCustomer(String coulmName, String coulmValue);
	com.skyloop.db.model.Customer findByFirstName(String firstName);
	//@Query("SELECT p FROM customer p ")
	  //@Query("select t from Customer t where t.:columName  = :columValue")
	//  @Query("select t from Customer t where ?")
  //  public List<com.skyloop.db.model.Customer> find( @Param("cond")String cond);
	  
	 // @Query(value = "select * from skyloop.customer  where ?", nativeQuery = true)
	  
	  @Query(value = "select * from #{#entityName} b where 1 = 1  "+QueryConstant.CUSTOMER_QUERY_COND,nativeQuery = true)

	  List<com.skyloop.db.model.Customer> find1(String cond);
	  
	 public List<com.skyloop.db.model.Customer> findAll();
	 
		
}
