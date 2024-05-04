package session8;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

public class PreparedStatementExample {
    public static void main(String[] args) throws SQLException {
        //Get connection
        Connection connection = MySQLConnectionDB.getMyConnection();
        //Create Query(sql engine)
        String query = "SELECT * FROM customers WHERE customer_id = ? AND first_name LIKE ?";
        //Create PrepareStatement
        PreparedStatement pstm = connection.prepareStatement(query);
        //Gan gia tri cho tham so theo thu tu: 1,2 (?,?)
        pstm.setInt(1,1);
        pstm.setString(2,"TRUONG");

        ResultSet rs = pstm.executeQuery();
        while (rs.next()){
            System.out.println("=================");
            System.out.println("Customer id: " + rs.getInt("customer_id"));
            System.out.println("First name: " + rs.getString("first_name"));
            System.out.println("Last name: " + rs.getString("last_name"));
            System.out.println("Email: " + rs.getString("email"));
        }
        connection.close();
    }
}
