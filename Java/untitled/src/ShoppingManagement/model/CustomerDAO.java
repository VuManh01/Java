package ShoppingManagement.model;

import ShoppingManagement.entity.Customer;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerDAO {
    public void addCustomer(Customer customer) throws SQLException;
    Customer getCustomerById(int cusId) throws SQLException;
    ArrayList<Customer> getAllCustomers() throws SQLException;
    void updateCustomer(Customer customer) throws SQLException;
    boolean deleteCustomer(int cusId) throws SQLException;
}
