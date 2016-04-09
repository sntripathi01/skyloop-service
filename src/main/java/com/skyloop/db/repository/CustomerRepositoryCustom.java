package com.skyloop.db.repository;

import java.util.List;

public interface CustomerRepositoryCustom{

	  List<com.skyloop.db.model.Customer> findByColum(String columName, String columValue);
	  
	
}
