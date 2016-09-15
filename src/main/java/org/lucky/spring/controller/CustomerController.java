package org.lucky.spring.controller;

import java.util.List;

import org.lucky.spring.dao.CustomerDAO;
import org.lucky.spring.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomerController {
	@Autowired
	private CustomerDAO customerDAO;

	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public @ResponseBody List<Customer> getCostomers() {
		return customerDAO.list();
	}

	@RequestMapping(value = "/createCustomer", method = RequestMethod.POST)
	public @ResponseBody void createCustomer(@RequestBody Customer customer) {
		System.out.println(customer);
	}

	@RequestMapping(value = "/createBulkCustomers", method = RequestMethod.POST)
	public @ResponseBody void createBulkCustomers(@RequestBody List<Customer> customers) {
		System.out.println(customers);
	}

	@RequestMapping(value = "/deleteCustomer", method = RequestMethod.DELETE)
	public @ResponseBody void deleteCustomer(@PathVariable("cusId") Long customerID) {
		System.out.println(customerID);
	}

	@RequestMapping(value = "/updateCustomer", method = RequestMethod.PUT)
	public @ResponseBody void deleteCustomer(@PathVariable("cusId") Long customerID, @RequestBody Customer customer) {
		System.out.println(customerID);
		System.out.println(customer);
	}

}
