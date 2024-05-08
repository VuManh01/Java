package ShoppingManagement.controller;

import ShoppingManagement.entity.Customer;
import ShoppingManagement.model.CustomerDAOImpl;

import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerController {
    CustomerDAOImpl customerDAOImpl = new CustomerDAOImpl();

    public CustomerController() throws SQLException {
    }

    public ArrayList<Customer> getAllCustomerController() throws SQLException{
        ArrayList<Customer> customers = customerDAOImpl.getAllCustomers();
        return customers;
    }

    public void addCustomerController(Customer customer) throws SQLException{
        customerDAOImpl.addCustomer(customer);
    }

    public Customer getCustomerByIdController(int cusId) throws SQLException{
        return customerDAOImpl.getCustomerById(cusId);
    }

    public void updateCustomerController(Customer customer) throws SQLException{
        customerDAOImpl.updateCustomer(customer);
    }
    public boolean deleteCustomerController(int cusId) throws SQLException{
        return customerDAOImpl.deleteCustomer(cusId);
    }
}
