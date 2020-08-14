package com.groupchallenge.co2tracker.repository;

import java.util.List;

import com.groupchallenge.co2tracker.model.Customer;

public interface CustomerRepository {
	List<Customer> findAll();

}
