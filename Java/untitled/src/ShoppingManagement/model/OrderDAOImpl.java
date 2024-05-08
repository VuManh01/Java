package ShoppingManagement.model;

import ShoppingManagement.entity.Order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class OrderDAOImpl implements OrderDAO{
    private final Connection conn = MySqlConnect.getMySQLConnection();
    private final String SQL_GET_ALL_ORDER = "SELECT * FROM Orders";
    private final String SQL_CREATE_ORDER = "INSERT INTO Orders VALUES (?,?,?)";
    private final String SQL_UPDATE_ORDER_STATUS = "UPDATE Orders SET order_status = ? WHERE order_id = ?";
    private final String SQL_GET_CUSTOMER_BY_ID = "SELECT * FROM Customers WHERE customer_id = ?";
    PreparedStatement pstm = null;
    public OrderDAOImpl() throws SQLException {
    }

    @Override
    public ArrayList<Order> getAllOrders() throws SQLException {
        ArrayList<Order> allOrders = new ArrayList<>();
        pstm = conn.prepareStatement(SQL_GET_ALL_ORDER);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()){
            Order order = new Order();
            order.setOrderId(rs.getInt(1));
            order.setCustomerId(rs.getInt(2));
            order.setOrderStatus(rs.getString(3));
            allOrders.add(order);
        }

        return allOrders;
    }

    @Override
    public void updateOrderStatus(Order order) throws SQLException {
        pstm = conn.prepareStatement(SQL_UPDATE_ORDER_STATUS);
        pstm.setString(1,order.getOrderStatus());
        pstm.setInt(2,order.getOrderId());
        pstm.executeUpdate();
        System.out.println("Update successfully");
    }

    @Override
    public void createOrder(Order order) throws SQLException {
        pstm = conn.prepareStatement(SQL_GET_CUSTOMER_BY_ID);
        ResultSet rs = pstm.executeQuery();
        if (rs != null){
            pstm = conn.prepareStatement(SQL_CREATE_ORDER);
            pstm.setInt(1,order.getOrderId());
            pstm.setInt(2, order.getCustomerId());
            pstm.setString(3,order.getOrderStatus());
            pstm.executeUpdate();
            System.out.println("Create successfully");
        } else {
            System.out.println("Customer not found");
        }
    }
}
