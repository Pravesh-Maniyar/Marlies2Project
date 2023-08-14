package com.Project.creditCardRepo;

import com.Project.lastprojectcreditCardInfo.transactions;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ICreditCardTransactionsRepo extends MongoRepository<transactions,String>{


}
