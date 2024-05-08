package ShoppingManagement.model;

import ShoppingManagement.entity.OrderDetail;

import java.sql.SQLException;
import java.util.ArrayList;

public interface OrderDetailDAO {
    public ArrayList<OrderDetail> getAllOrderDetail() throws SQLException;
}
