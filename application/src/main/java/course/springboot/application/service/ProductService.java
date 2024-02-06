package course.springboot.application.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import course.springboot.application.entity.customers;
import course.springboot.application.entity.product;
import course.springboot.application.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	
	public product getProductById(int id) {
		return productRepository.findById(id).get();
	}
	
	public ArrayList<product> getAllProduct(){
		ArrayList<product> allProduct=new ArrayList<product>();
		allProduct=(ArrayList<product>)productRepository.findAll();
		return allProduct;
	}
	
	public int addNewProduct(product Product) {
		return productRepository.save(Product).getProductId();
	}
	public int updateProduct(product Product) {
		return productRepository.save(Product).getProductId();
	}
	public String deleteProduct(int id) {
		productRepository.deleteById(id);
		return "delete Customers";
	}
}