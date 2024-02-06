package course.springboot.application.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import course.springboot.application.entity.orders;
import course.springboot.application.service.OrderServices;

@RestController
public class ordersController {

	@Autowired
	OrderServices orderServices;

	@GetMapping("/api/orders/getOrdersByID/{id}")
	public orders getOrdersById(@PathVariable int id) {
		return orderServices.getOrdersById(id);
	}

	@GetMapping("/api/orders/getAllOrders")
	public ArrayList<orders> getAllOrders() {
		return orderServices.getAllOrders();
	}
	
	@PostMapping("/api/orders/addNewOrders")
	public int addNewOrders(@RequestBody orders ord) {
		return orderServices.addNewOrders(ord);
	}
	
	@PutMapping("/api/orders/updateOrders")
	public int updateOrders(@RequestBody orders ord) {
		return orderServices.updateOrders(ord);
	}
	
	@DeleteMapping("/api/orders/deleteOrders/{id}")
	public String deleteOrdersById(@PathVariable int id) {
		return orderServices.deleteOrdersById(id);
	}
	
}