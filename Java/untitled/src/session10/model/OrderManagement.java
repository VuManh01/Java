package session10.model;

import connectDatabase.MySqlConnect;
import session10.entity.OrderDetail;

import java.sql.*;
import java.util.Date;
import java.util.List;

public class OrderManagement {
    public void createOrder(int customer_id, String payment_type, List<OrderDetail> orderDetails) throws SQLException {
        Connection conn = MySqlConnect.getMySQLConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        conn.setAutoCommit(false);// Danh dau diem bat dau cua transaction
        String orderQuery = "insert into orders(customer_id, create_at,update_at,payment_type) values(?,?,?,?)"; // id auto_increment
        String orderDetailQuery = "insert into order_details(order_id, create_at,update_at,product_id, price) values(?,?,?,?,?)";
        pstm = conn.prepareStatement(orderQuery, PreparedStatement.RETURN_GENERATED_KEYS); // insert voi bang co key tang tu dong
        pstm.setInt(1,1);
        pstm.setTimestamp(2,new java.sql.Timestamp(new Date().getTime()));
        pstm.setTimestamp(3,new java.sql.Timestamp(new Date().getTime()));
        pstm.setString(4,"Credit Card");
        pstm.executeUpdate();
        //Lay ra key moi generated tu insert order o tren
        rs = pstm.getGeneratedKeys();
        int orderId = -1;
        if (rs.next()){
            orderId = rs.getInt(1);
        }
        if (orderId != -1){
            //insert orderDetails
            pstm = conn.prepareStatement(orderDetailQuery);
            for (OrderDetail orderDetail: orderDetails){
                pstm.setInt(1,orderId);
                pstm.setTimestamp(2,new java.sql.Timestamp(new Date().getTime()));
                pstm.setTimestamp(3,new java.sql.Timestamp(new Date().getTime()));
                //...
                pstm.addBatch();
            }
            pstm.executeBatch();
        }
        conn.commit();// Danh dau diem ket thuc cua transaction
    }
}
