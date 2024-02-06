package course.springboot.application.repository;

import org.springframework.data.repository.CrudRepository;

import course.springboot.application.entity.product;

public interface ProductRepository extends CrudRepository<product,Integer> {

}
