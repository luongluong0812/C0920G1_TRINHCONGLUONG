package com.codegym.service;

import com.codegym.model.Customer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    private  static Map<Integer,Customer> customers;
    static {
        customers=new HashMap<>();
        customers.put(1,new Customer(1,"luong","avb@gamil.com","hn"));
        customers.put(2,new Customer(2,"luong","avb@gamil.com","hn"));
        customers.put(3,new Customer(3,"luong","avb@gamil.com","hn"));
        customers.put(4,new Customer(4,"luong","avb@gamil.com","hn"));




    }
    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public void save(Customer customer) {

    }

    @Override
    public Customer findById(int id) {
        return null;
    }

    @Override
    public void update(int id, Customer customer) {

    }

    @Override
    public void remove(int id) {

    }
}
