package course.springboot.application.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import course.springboot.application.entity.customers;
import course.springboot.application.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	public String getName() {
		return "Hardik Patel";
	}

	public double calculateArea(int radius) {
		double area = 0;
		final float PI = 3.14f;
		area = PI * radius * radius;
		return area;
	}

	public customers getCustomer(int id) {
		customers c = customerRepository.findById(id).get();
		return c;
	}

	public ArrayList<customers> getAllCustomers() {
		ArrayList<customers> allCustomers = new ArrayList<customers>();
		allCustomers = (ArrayList<customers>) customerRepository.findAll();
		return allCustomers;
	}

	public int addCustomers(customers Customers) {
		customers cust = new customers();
		cust = customerRepository.save(Customers);
		if (cust != null) {
			return cust.getCustomerId();
		} else {
			return 0;
		}
	}

	public int updateCustomers(customers Customers) {
		customers cust = new customers();
		cust = customerRepository.save(Customers);
		if (cust != null) {
			return cust.getCustomerId();
		} else {
			return 0;
		}
	}

	public String deleteCustomers(int id) {
		customerRepository.deleteById(id);
		return "delete Customers";
	}
}
