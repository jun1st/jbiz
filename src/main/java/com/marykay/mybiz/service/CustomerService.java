package com.marykay.mybiz.service;

import com.marykay.mybiz.helper.DatabaseHelper;
import com.marykay.mybiz.model.Customer;
import com.marykay.mybiz.util.PropsUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.crypto.Data;
import java.sql.Connection;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class CustomerService {

    public List<Customer> getCustomerList(String keyword) {
        try {
            String sql = "SELECT * FROM customer";

            return DatabaseHelper.queryEntityList(Customer.class, sql);
        } finally {

        }
    }

    public Customer getCustomer(long id) {
        try {
            String sql = "SELECT * FROM customer where id = ?";
            return DatabaseHelper.queryEntity(Customer.class, sql, id);
        } finally {

        }
    }

    public boolean createCustomer(Map<String, Object> fieldMap) {

        return DatabaseHelper.insertEntity(Customer.class, fieldMap);
    }

    public boolean updateCustomer(long id, Map<String, Object> fieldMap) {

        return DatabaseHelper.updateEntity(Customer.class, id, fieldMap);
    }

    public boolean deleteCustomer(long id) {
        return DatabaseHelper.deleteEntity(Customer.class, id);
    }
}
