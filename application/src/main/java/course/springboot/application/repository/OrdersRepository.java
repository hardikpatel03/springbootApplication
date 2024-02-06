package course.springboot.application.repository;

import org.springframework.data.repository.CrudRepository;
import course.springboot.application.entity.orders;

public interface OrdersRepository extends CrudRepository<orders,Integer> {

}
