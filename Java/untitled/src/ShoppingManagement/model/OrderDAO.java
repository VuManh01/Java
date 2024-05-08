package ShoppingManagement.model;

import ShoppingManagement.entity.Order;

import java.sql.SQLException;
import java.util.ArrayList;

public interface OrderDAO {
    ArrayList<Order> getAllOrders() throws SQLException;
    void updateOrderStatus(Order order) throws SQLException;
    public void createOrder(Order order) throws SQLException;
}
