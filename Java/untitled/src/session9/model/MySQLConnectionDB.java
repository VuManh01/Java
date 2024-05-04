package session9.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionDB {
    //create method tra ve 1 doi tuong Connection
    public static Connection getMyConnection() throws SQLException {
        Connection conn = null;
        String hostName = "localhost";
        String dbName = "ecommerceFPT";
        String userName = "root";
        String password = "";

        //Chuoi ket noi
        String connectionURL = "jdbc:mysql://"+hostName+":3306/"+dbName;
        conn = DriverManager.getConnection(connectionURL,userName,password);
        return conn;
    }

    public static void main(String[] args) throws SQLException {
        Connection cn = getMyConnection();
        if (cn!=null){
            System.out.println("Ket noi thanh cong");
        }
    }
}
