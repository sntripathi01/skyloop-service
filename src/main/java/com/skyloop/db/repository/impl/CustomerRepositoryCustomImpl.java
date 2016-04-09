package com.skyloop.db.repository.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.skyloop.db.model.Customer;
import com.skyloop.db.repository.CustomerRepositoryCustom;

@Repository
public class CustomerRepositoryCustomImpl implements CustomerRepositoryCustom {
	@Autowired
	private EntityManager entityManager;

	private  NamedParameterJdbcTemplate jdbcTemplate;

	@Autowired
	private JdbcTemplate jdbcTemplate2;
	//@Autowired
	//CustomerRepositoryCustomImpl(NamedParameterJdbcTemplate jdbcTemplate) {
	//	this.jdbcTemplate = jdbcTemplate;
	//}

	private static final String SEARCH_TODO_ENTRIES = "SELECT id, title FROM todos t WHERE "
			+ "LOWER(t.title) LIKE LOWER(CONCAT('%',:searchTerm, '%')) OR "
			+ "LOWER(t.description) LIKE LOWER(CONCAT('%',:searchTerm, '%')) " + "ORDER BY t.title ASC";
	private static final String SEARCH_QUERY = "SELECT  * FROM customer";

	public List<com.skyloop.db.model.Customer> findByColum(String columName, String columValue) {

		Map<String, String> queryParams = new HashMap<String, String>();
		queryParams.put("columValue", columValue);
		queryParams.put("columName", columName);
		List<com.skyloop.db.model.Customer> searchResults = jdbcTemplate.query(SEARCH_QUERY,
				new BeanPropertyRowMapper<Customer>(Customer.class));

		return searchResults;
	}

}
