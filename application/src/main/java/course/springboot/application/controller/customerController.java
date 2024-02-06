package course.springboot.application.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import course.springboot.application.entity.customers;
import course.springboot.application.service.CustomerService;

@RestController
public class customerController {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value="/getName",method=RequestMethod.GET)
	public String getName() {
		return customerService.getName();
	}
	@GetMapping("/api/customers/getGreetings")
	public String getGreetings() {
		return "Hello World!!";
		
	}
	@GetMapping("/api/customers/getArea/{radius}")
	public double getAreaOfCircle(@PathVariable() int radius) {
		return customerService.calculateArea(radius);
	}
	@GetMapping("/api/customers/getCustomersById/{id}")
	public customers getCustomerById(@PathVariable() int id) {
		return customerService.getCustomer(id);
	}
	@GetMapping("/api/customers/getAllCustomers")
	public ArrayList<customers> getAllCustomers(){
		return customerService.getAllCustomers();
		
	}
	@PostMapping("/api/customers/addNewCustomer")
	public int addNewCustomer(@RequestBody() customers cust) {
		return customerService.addCustomers(cust);
	}
	@PutMapping("/api/customers/updateCustomer")
	public int updateCustomer(@RequestBody() customers cust) {
		return customerService.updateCustomers(cust);
	}
	@DeleteMapping("/api/customers/deleteCustomer/{id}")
	public String deleteCustomers(@PathVariable()int id) {
		return customerService.deleteCustomers(id);	
	}
}
