package com.Project.creditCardRepo;

import com.Project.lastprojectcreditCardInfo.customers;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICreditCardCustomerRepo extends MongoRepository<customers,String> {

}
