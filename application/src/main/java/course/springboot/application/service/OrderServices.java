package course.springboot.application.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import course.springboot.application.entity.orders;
import course.springboot.application.entity.product;
import course.springboot.application.repository.OrdersRepository;

@Service
public class OrderServices {

	@Autowired
	OrdersRepository ordersRepository;

	public orders getOrdersById(int id) {
		return ordersRepository.findById(id).get();
	}

	public ArrayList<orders> getAllOrders() {
		ArrayList<orders> AllOrders = new ArrayList<orders>();
		AllOrders = (ArrayList<orders>) ordersRepository.findAll();
		return AllOrders;
	}

	public int addNewOrders(orders Orders) {
		return ordersRepository.save(Orders).getOrderId();
	}

	public int updateOrders(orders Orders) {
		return ordersRepository.save(Orders).getOrderId();
	}

	public String deleteOrdersById(int id) {
		ordersRepository.deleteById(id);
		return "Delete Orders";
	}

}