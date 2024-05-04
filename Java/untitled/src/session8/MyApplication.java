package session8;

import java.sql.*;

public class MyApplication {
    public static void main(String[] args) throws SQLException {
        //createCustomer();
        getAllCustomers();
        getCustomerVsPrepareStatement();
    }
    public static void getAllCustomers() throws SQLException {
        //Goi doi tuong Connection
        Connection connection = MySQLConnectionDB.getMyConnection();
        //Tao Statement(Lenh thuc thi voi sql)
        Statement stm = connection.createStatement();
        //Truy van trong CSDL
        String query = "SELECT * FROM customers";
        //Thuc thi truy van, tra ket qua ve cho ResultSet
        //ResultSet chua ket qua tra ve tu CSDL
        ResultSet rs = stm.executeQuery(query);
        //Doc ban ghi tren ResultSet
        while (rs.next()){
             //Doc customer_id co kieu int
            int cusId = rs.getInt(1);
            //int cusId = rs.getInt("customer_id");
            String first_name = rs.getString(2);
            String last_name = rs.getString(3);
            String email = rs.getString(4);
            System.out.println("===========================");
            System.out.println("Customer id: " + cusId);
            System.out.println("First name: " + first_name);
            System.out.println("Last name: " + last_name);
            System.out.println("Email: " + email);

        }
        connection.close();
    }
    public static void createCustomer() throws SQLException{
        Connection connection = MySQLConnectionDB.getMyConnection();
        Statement stm = connection.createStatement();
        String query = "INSERT INTO customers (customer_id, first_name, last_name, email) VALUES (3,'NGUYEN','THANH NAM','nam@fpt.com.vn')";
        // Ham executeUpdate() dung khi insert, update, delete
        int count = stm.executeUpdate(query);
        System.out.println(count);
    }

    public static void getCustomerVsPrepareStatement() throws SQLException{
        Connection connection = MySQLConnectionDB.getMyConnection();
        //Truy van
        String query = "SELECT * FROM customers WHERE customer_id = ? AND last_name LIKE ?";
        //Tao doi tuong PrepareStatement
        PreparedStatement pstm = connection.prepareStatement(query);
        //Thiet lap tham so cho dau ? dau tien
        pstm.setInt(1,3);
        //Thiet lap tham so cho dau ? thu 2
        pstm.setString(2,"THANH NAM");
        //Ket qua tra ve doi tuong ResultSet
        ResultSet rs = pstm.executeQuery();
        while (rs.next()){
            System.out.println("==========Use PreparedStatement============");
            System.out.println("Customer id: " + rs.getInt("customer_id"));
            System.out.println("First name: " + rs.getString("first_name"));
            System.out.println("Last name: " + rs.getString("last_name"));
            System.out.println("Email: " + rs.getString("email"));
        }
        connection.close();
    }
}
