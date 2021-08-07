package lk.ijse.spring.repo;

import lk.ijse.spring.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author : Isuri Disanayaka
 * @date:08/08/2021
 * @since : 0.0.1
 **/
public interface CustomerRepo  extends MongoRepository<Customer,String> {
}
