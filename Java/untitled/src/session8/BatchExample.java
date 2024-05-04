package session8;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchExample {
    public static void main(String[] args) throws SQLException {
        Connection connection = MySQLConnectionDB.getMyConnection();
        //Xu ly the Batch, cung 1 luc chay nhieu cau lenh update, insert
        Statement stm = connection.createStatement();
        //query1
        String query1 = "UPDATE customers SET first_name = 'TRAN' WHERE customer_id = 1";
        stm.addBatch(query1);
        //query2
        String query2 = "UPDATE customers SET first_name = 'NGO' WHERE customer_id = 2";
        stm.addBatch(query2);

        int[]counts = stm.executeBatch();
        System.out.println("Query 1: " + counts[0]);
        System.out.println("Query 2: " + counts[1]);
    }
}
