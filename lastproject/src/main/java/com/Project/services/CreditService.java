package com.Project.services;

import com.Project.creditCardRepo.ICreditCardCustomerRepo;
import com.Project.lastprojectcreditCardInfo.customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CreditService implements ICreditService{

    @Autowired
    private ICreditCardCustomerRepo customerRepo;

//    @Autowired
//    private ICreditCardTransactionsRepo transactionsRepo;

    @Override
    public List<customers> getAllInfo(){
        return customerRepo.findAll();
    }

    @Override
    public customers addCustomer(String _first, String _last, String _dob, String _gender, String _job){
        int count = (int)this.customerRepo.count();
        int customerID = count+1;
        customers _newCoustomer = new customers(_first,_last,_gender,_job,_dob,customerID);

        return customerRepo.save(_newCoustomer);}
}
