package com.groupchallenge.co2tracker.service;

import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.groupchallenge.co2tracker.bean.CustomerBean;

@SpringBootApplication
public interface CustomerService {
	List<CustomerBean> getCustomers();
	void save(CustomerBean customerBean);
}
