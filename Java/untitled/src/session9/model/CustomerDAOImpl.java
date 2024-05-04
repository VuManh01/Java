package session9.model;

import session9.entity.Customers;
import java.sql.*;
import java.util.ArrayList;

public class CustomerDAOImpl implements CustomerDAO {
    private static final Connection conn;

    static {
        try {
            conn = MySQLConnectionDB.getMyConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private PreparedStatement pstm = null;

    @Override
    public ArrayList<Customers> getAllCustomer() throws SQLException {
        String query = "SELECT * FROM customers";
        pstm = (PreparedStatement) conn.createStatement();
        ResultSet rs = pstm.executeQuery(query);
        while (rs.next()) {
            System.out.println("==================================================");
            System.out.println("Customer Id : " + rs.getString("customer_id"));
            System.out.println("First name : " + rs.getString("first_name"));
            System.out.println("Last name : " + rs.getString("last_name"));
            System.out.println("Email name : " + rs.getString("email"));

        }
        return null;
    }

    @Override
    public Customers findCustomerById(int id) throws SQLException {
        String query = "SELECT * FROM customers WHERE customer_id = ?";
        pstm = (PreparedStatement) conn.createStatement();
        ResultSet rs = pstm.executeQuery(query);
        while (rs.next()) {
            System.out.println("==================================================");
            System.out.println("Customer Id : " + rs.getString("customer_id"));
            System.out.println("First name : " + rs.getString("first_name"));
            System.out.println("Last name : " + rs.getString("last_name"));
            System.out.println("Email name : " + rs.getString("email"));
        }
        return null;
    }
}