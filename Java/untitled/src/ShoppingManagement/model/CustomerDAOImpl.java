package ShoppingManagement.model;

import ShoppingManagement.entity.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerDAOImpl implements CustomerDAO {
    private final Connection conn = MySqlConnect.getMySQLConnection();
    private final String SQL_ADD_CUSTOMER = "INSERT INTO Customers VALUES(?,?,?,?,?)";
    private final String SQL_GET_CUSTOMER_BY_ID = "SELECT * FROM Customers WHERE customer_id = ?";
    private final String SQL_GET_ALL_CUSTOMER = "SELECT * FROM Customers";
    private final String SQL_UPDATE_CUSTOMER = "UPDATE Customers SET customer_name = ?,  customer_address = ?, customer_phone = ?, customer_email = ? WHERE customer_id = ?";
    private final String SQL_DELETE_CUSTOMER = "DELETE FROM Customers WHERE customer_id = ?";

    PreparedStatement pstm = null;
    public CustomerDAOImpl() throws SQLException {
    }

    @Override
    public void addCustomer(Customer customer) throws SQLException {
        pstm = conn.prepareStatement(SQL_ADD_CUSTOMER);
        pstm.setInt(1,customer.getCustomerId());
        pstm.setString(2,customer.getName());
        pstm.setString(3,customer.getAddress());
        pstm.setInt(4,customer.getPhone());
        pstm.setString(5,customer.getEmail());
        pstm.executeUpdate();
        System.out.println("Add successfully");
    }

    @Override
    public Customer getCustomerById(int cusId) throws SQLException {
        Customer customer = new Customer();
        pstm = conn.prepareStatement(SQL_GET_CUSTOMER_BY_ID);
        pstm.setInt(1,cusId);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()) {
            System.out.println("====Customer Information====");
            System.out.println("Customer Id: " + rs.getInt(1));
            System.out.println("Customer Name: " + rs.getString(2));
            System.out.println("Customer Address: " + rs.getString(3));
            System.out.println("Customer Phone: " + rs.getInt(4));
            System.out.println("Customer Email: " + rs.getString(5));
        }
        return customer;
    }

    @Override
    public ArrayList<Customer> getAllCustomers() throws SQLException {
        ArrayList<Customer> allCustomers = new ArrayList<>();
        pstm = conn.prepareStatement(SQL_GET_ALL_CUSTOMER);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()){
            Customer customer = new Customer();
            customer.setCustomerId(rs.getInt(1));
            customer.setName(rs.getString(2));
            customer.setAddress(rs.getString(3));
            customer.setPhone(rs.getInt(4));
            customer.setEmail(rs.getString(5));
            allCustomers.add(customer);
        }
        return allCustomers;
    }

    @Override
    public void updateCustomer(Customer customer) throws SQLException {
        pstm = conn.prepareStatement(SQL_UPDATE_CUSTOMER);
        pstm.setString(1,customer.getName());
        pstm.setString(2,customer.getAddress());
        pstm.setInt(3,customer.getPhone());
        pstm.setString(4,customer.getEmail());
        pstm.setInt(5,customer.getCustomerId());
        pstm.executeUpdate();
        System.out.println("Update successfully");
    }

    @Override
    public boolean deleteCustomer(int cusId) throws SQLException {
        pstm = conn.prepareStatement(SQL_DELETE_CUSTOMER);
        pstm.setInt(1,cusId);
        int result = pstm.executeUpdate();
        if (result == 1) {
            System.out.println("Delete successfully");
            return true;
        } else {
            System.out.println("Delete failed");
            return false;
        }
    }
}
