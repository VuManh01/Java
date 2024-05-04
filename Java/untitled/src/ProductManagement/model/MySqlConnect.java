package ProductManagement.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnect {
    //create method tra ve 1 doi tuong Connection
    public static Connection getMySQLConnection() throws SQLException {
        Connection conn = null;
        String hostName = "localhost";
        String dbName = "ProductManagement";
        String userName = "root";
        String password = "";

        //Chuoi ket noi
        String connectionURL = "jdbc:mysql://"+hostName+":3306/"+dbName;
        conn = DriverManager.getConnection(connectionURL,userName,password);
        return conn;
    }

    public static void main(String[] args) throws SQLException {
        Connection cn = getMySQLConnection();
        if (cn!=null){
            System.out.println("Ket noi thanh cong");
        }
    }
}
