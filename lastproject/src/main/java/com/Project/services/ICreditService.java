package com.Project.services;

import com.Project.lastprojectcreditCardInfo.customers;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ICreditService {

    public List<customers> getAllInfo();

    customers addCustomer(String _first, String _last, String _dob, String _gender, String _job);
}
