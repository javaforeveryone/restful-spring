package org.lucky.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.lucky.spring.model.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerDAO {

	private static List<Customer> customers;
	{
		customers = new ArrayList<Customer>();
		customers.add(new Customer(100, "Subhrajit", "Pattanaik", "sp@gmail.com", "1234567897"));
		customers.add(new Customer(200, "Lucky", "Pattanaik", "lp@gmail.com", "6756456767"));
		customers.add(new Customer(300, "Mitansh", "Pattanaik", "mp@gmail.com", "9856456765"));
		customers.add(new Customer(400, "Akshaya", "Pattanaik", "ak@gmail.com", "8745634567"));
	}

	public List<Customer> list() {
		return customers;
	}

	public Customer get(Long id) {

		for (Customer c : customers) {
			if (c.getId().equals(id)) {
				return c;
			}
		}
		return null;
	}

	public Customer create(Customer customer) {
		customer.setId(System.currentTimeMillis());
		customers.add(customer);
		return customer;
	}

	public Long delete(Long id) {

		for (Customer c : customers) {
			if (c.getId().equals(id)) {
				customers.remove(c);
				return id;
			}
		}

		return null;
	}

	public Customer update(Long id, Customer customer) {

		for (Customer c : customers) {
			if (c.getId().equals(id)) {
				customer.setId(c.getId());
				customers.remove(c);
				customers.add(customer);
				return customer;
			}
		}

		return null;
	}

}