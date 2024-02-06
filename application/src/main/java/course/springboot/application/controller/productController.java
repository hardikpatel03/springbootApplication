package course.springboot.application.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import course.springboot.application.entity.customers;
import course.springboot.application.entity.product;
import course.springboot.application.service.ProductService;

@RestController
public class productController {

	@Autowired
	ProductService productService;
	
	@GetMapping("/api/Product/getProductById/{id}")
	public ResponseEntity<product> getProductById(@PathVariable int id) {
		product product=productService.getProductById(id);
		if(product==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(product));
	}
	
	@GetMapping("/api/Product/getAllProduct")
	public ResponseEntity<ArrayList<product>> getAllProduct(){
		ArrayList<product> listproduct= productService.getAllProduct();
		if(listproduct.size() <=1) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(listproduct));
	}
	@PostMapping("/api/Product/addNewProduct")
	public int addNewProduct(@RequestBody product pro) {
		return productService.addNewProduct(pro);
	}
	@PutMapping("/api/Product/updateProduct")
	public int updateProduct(@RequestBody product pro) {
		return productService.updateProduct(pro);
	}
	@DeleteMapping("/api/customers/deleteProduct/{id}")
	public String deleteProduct(@PathVariable()int id) {
		return productService.deleteProduct(id);
	}
}
