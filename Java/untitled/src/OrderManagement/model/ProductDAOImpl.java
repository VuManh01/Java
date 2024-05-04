package OrderManagement.model;

import OrderManagement.entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDAOImpl implements ProductDAO {
    private final Connection conn = MySqlConnect.getMySQLConnection();
    private final String SQL_CREATE_PRODUCT = "INSERT INTO Products VALUES(?,?,?,?)";
    private final String SQL_GET_PRODUCT_BY_ID = "SELECT * FROM Products WHERE product_id = ?";
    private final String SQL_DELETE_PRODUCT = "DELETE  FROM Products WHERE product_id = ?";
    private final String SQL_GET_ALL_PRODUCT = "SELECT * FROM Products";
    private final String SQL_UPDATE_PRODUCT = "UPDATE Products SET product_name = ? WHERE product_id = ?";
    PreparedStatement pstm = null;
    public ProductDAOImpl() throws SQLException {
    }

    @Override
    public void createProduct(Product product) throws SQLException {
        pstm = conn.prepareStatement(SQL_CREATE_PRODUCT);
        pstm.setInt(1,product.getProductId());
        pstm.setString(2,product.getProductName());
        pstm.setDouble(3,product.getProductPrice());
        pstm.setInt(4,product.getProductQuantity());
        pstm.executeUpdate();
        System.out.println("Insert success");

    }

    @Override
    public Product getProductById(int proId) throws SQLException {
        return null;
    }

    @Override
    public ArrayList<Product> getAllProduct() throws SQLException {
        ArrayList<Product> allProducts = new ArrayList<>();
        pstm= conn.prepareStatement(SQL_GET_ALL_PRODUCT);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()){
            Product product = new Product();
            product.setProductId(rs.getInt(1));
            product.setProductName(rs.getString(2));
            product.setProductPrice(rs.getDouble(3));
            product.setProductQuantity(rs.getInt(4));
            allProducts.add(product);
        }
        return allProducts;
    }

    @Override
    public void updateProduct(Product product) throws SQLException {

    }

    @Override
    public boolean deleteProduct(int proId) throws SQLException {
        return false;
    }

    @Override
    public ArrayList<Product> findProductByName(String name) throws SQLException {
        return null;
    }
}
