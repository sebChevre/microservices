package domain.customer.repository;


import org.springframework.data.repository.*;

import domain.customer.entity.CustomerDB;


public interface CustomerRepository extends CrudRepository<CustomerDB,Long>{

	CustomerDB findById(Long id);
}
