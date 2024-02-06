package course.springboot.application.repository;

import org.springframework.data.repository.CrudRepository;

import course.springboot.application.entity.customers;

public interface CustomerRepository extends CrudRepository<customers ,Integer> {

}
