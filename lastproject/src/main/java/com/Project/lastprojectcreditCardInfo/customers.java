package com.Project.lastprojectcreditCardInfo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "customers")
public class customers {
    @Id
    private String _id;
    private String first;
    private String last;
    private String gender;
    private String job;
    private String dob;

    @Field("customer_id")
    private int customerID;

    //Getters and Setters

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomer_id(int customer_id) {
        this.customerID = customer_id;
    }

    //Constructors


    public customers() {
    }

    public customers(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public customers(String first, String last, String dob, int customer_id) {
        this.first = first;
        this.last = last;
        this.dob = dob;
        this.customerID = customer_id;
    }

    public customers(String first, String last, String gender, String job, String dob,int _customerID) {
        this.first = first;
        this.last = last;
        this.gender = gender;
        this.job = job;
        this.dob = dob;
        this.customerID = _customerID;
    }

    public customers(String _id, String first, String last, String gender, String job, String dob, int customer_id) {
        this._id = _id;
        this.first = first;
        this.last = last;
        this.gender = gender;
        this.job = job;
        this.dob = dob;
        this.customerID = customer_id;
    }


}


