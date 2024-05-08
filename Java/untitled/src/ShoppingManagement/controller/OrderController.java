package ShoppingManagement.controller;

import ShoppingManagement.entity.Order;
import ShoppingManagement.model.OrderDAOImpl;

import java.sql.SQLException;
import java.util.ArrayList;

public class OrderController {
    OrderDAOImpl orderDAOImpl = new OrderDAOImpl();

    public OrderController() throws SQLException {
    }

    public ArrayList<Order> getAllOrderController() throws SQLException{
        ArrayList<Order> orders = orderDAOImpl.getAllOrders();
        return orders;
    }

    public void updateOrderStatusController(Order order) throws SQLException{
        orderDAOImpl.updateOrderStatus(order);
    }

    public void addOrderController(Order order) throws SQLException{
        orderDAOImpl.createOrder(order);
    }
}
