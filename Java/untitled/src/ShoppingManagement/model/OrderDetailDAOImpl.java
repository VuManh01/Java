package ShoppingManagement.model;

import ShoppingManagement.entity.OrderDetail;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrderDetailDAOImpl implements OrderDetailDAO {
    private final Connection conn = MySqlConnect.getMySQLConnection();
    private final String SQL_GET_ALL_ORDER_DETAIL = "SELECT * FROM OrderDetail";
    PreparedStatement pstm = null;
    public OrderDetailDAOImpl() throws SQLException {
    }

    @Override
    public ArrayList<OrderDetail> getAllOrderDetail() throws SQLException {
        ArrayList<OrderDetail> allOrderDetails = new ArrayList<>();
        pstm = conn.prepareStatement(SQL_GET_ALL_ORDER_DETAIL);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()){
            OrderDetail orderDetail = new OrderDetail();
            orderDetail.setOrderDetailId(rs.getInt(1));
            orderDetail.setOrderId(rs.getInt(2));
            orderDetail.setProductId(rs.getInt(3));
            orderDetail.setQuantity(rs.getInt(4));
            orderDetail.setTotal_price(rs.getInt(5));
            allOrderDetails.add(orderDetail);
        }
        return allOrderDetails;
    }
}
