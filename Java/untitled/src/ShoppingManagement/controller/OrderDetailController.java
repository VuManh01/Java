package ShoppingManagement.controller;

import ShoppingManagement.entity.OrderDetail;
import ShoppingManagement.model.OrderDetailDAOImpl;

import java.sql.SQLException;
import java.util.ArrayList;

public class OrderDetailController {

    OrderDetailDAOImpl orderDetailDAOImpl = new OrderDetailDAOImpl();


    public OrderDetailController() throws SQLException {
    }


    public ArrayList<OrderDetail> getAllOrderDetailController() throws SQLException {
        return orderDetailDAOImpl.getAllOrderDetail();
    }
}
